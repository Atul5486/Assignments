import java.util.*;

// ===== OUTER CLASS =====
class SmartHome {

    // ===== INNER CLASS: Device =====
    class Device {
        private String name;
        private String type;
        private boolean status; // true = ON, false = OFF

        // Constructor
        public Device(String name, String type) {
            this.name = name;
            this.type = type;
            this.status = false; // default OFF
        }

        // Toggle status
        public void toggleStatus() {
            this.status = !this.status;
        }

        // Getters
        public String getName() { return name; }
        public String getType() { return type; }
        public boolean isOn() { return status; }

        @Override
        public String toString() {
            return "Device{name='" + name + "', type='" + type + "', status=" + (status ? "ON" : "OFF") + "}";
        }
    }

    // ===== Outer class fields =====
    private Device[] devices;   // Array of devices
    private int count;          // Number of devices currently in SmartHome

    // Constructor (fixed capacity for devices)
    public SmartHome(int capacity) {
        this.devices = new Device[capacity];
        this.count = 0;
    }

    // Add a device
    public void addDevice(String name, String type) {
        if (count < devices.length) {
            devices[count++] = new Device(name, type);
            System.out.println("Added: " + name);
        } else {
            System.out.println("Cannot add more devices. Capacity full!");
        }
    }

    // Remove a device by name
    public void removeDevice(String name) {
        for (int i = 0; i < count; i++) {
            if (devices[i].getName().equalsIgnoreCase(name)) {
                // Shift elements left
                for (int j = i; j < count - 1; j++) {
                    devices[j] = devices[j + 1];
                }
                devices[count - 1] = null;
                count--;
                System.out.println("Removed: " + name);
                return;
            }
        }
        System.out.println("Device not found: " + name);
    }

    // Toggle a device by name
    public void toggleDevice(String name) {
        for (int i = 0; i < count; i++) {
            if (devices[i].getName().equalsIgnoreCase(name)) {
                devices[i].toggleStatus();
                System.out.println("Toggled: " + name + " -> " + (devices[i].isOn() ? "ON" : "OFF"));
                return;
            }
        }
        System.out.println("Device not found: " + name);
    }

    // Display all devices
    public void displayDevices() {
        System.out.println("All Devices:");
        for (int i = 0; i < count; i++) {
            System.out.println(devices[i]);
        }
    }

    // ===== STATIC NESTED CLASS: DeviceUtils =====
    public static class DeviceUtils {

        // Count active devices
        public static int countActiveDevices(Device[] devices, int count) {
            int active = 0;
            for (int i = 0; i < count; i++) {
                if (devices[i].isOn()) active++;
            }
            return active;
        }

        // Group devices by type
        public static Map<String, List<Device>> groupByType(Device[] devices, int count) {
            Map<String, List<Device>> map = new HashMap<>();
            for (int i = 0; i < count; i++) {
                Device d = devices[i];
                map.computeIfAbsent(d.getType(), k -> new ArrayList<>()).add(d);
            }
            return map;
        }
    }

    // ===== MAIN METHOD FOR DEMO =====
    public static void main(String[] args) {
        SmartHome home = new SmartHome(5); // max 5 devices

        // Add devices
        home.addDevice("Living Room Light", "Light");
        home.addDevice("Bedroom Light", "Light");
        home.addDevice("Bedroom Thermostat", "Thermostat");

        // Display all
        home.displayDevices();

        // Toggle some
        home.toggleDevice("Living Room Light");
        home.toggleDevice("Bedroom Thermostat");

        // Display again
        home.displayDevices();

        // Use DeviceUtils
        int activeCount = DeviceUtils.countActiveDevices(home.devices, home.count);
        System.out.println("Active devices: " + activeCount);

        Map<String, List<SmartHome.Device>> grouped = DeviceUtils.groupByType(home.devices, home.count);
        System.out.println("Grouped by type: " + grouped.keySet());
    }
}
