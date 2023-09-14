// Abstract class representing a Computer Network
abstract class ComputerNetwork {
    // Abstract method to get the network name
    abstract String getNetworkName();

    // Abstract method to start the network
    abstract void startNetwork();

    // Abstract method to stop the network
    abstract void stopNetwork();

    // Concrete method to display a message
    void displayMessage(String message) {
        System.out.println(message);
    }
}

// Concrete class representing an Ethernet Network
class EthernetNetwork extends ComputerNetwork {
    private String networkName;

    EthernetNetwork(String name) {
        this.networkName = name;
    }

    @Override
    String getNetworkName() {
        return networkName;
    }

    @Override
    void startNetwork() {
        displayMessage("Starting Ethernet network: " + networkName);
        // Implementation specific to starting an Ethernet network
    }

    @Override
    void stopNetwork() {
        displayMessage("Stopping Ethernet network: " + networkName);
        // Implementation specific to stopping an Ethernet network
    }

    // Concrete method to check network speed
    void checkSpeed() {
        displayMessage("Checking Ethernet network speed...");
        // Implementation specific to checking speed in an Ethernet network
    }
}

// Concrete class representing a Wi-Fi Network
class WifiNetwork extends ComputerNetwork {
    private String networkName;

    WifiNetwork(String name) {
        this.networkName = name;
    }

    @Override
    String getNetworkName() {
        return networkName;
    }

    @Override
    void startNetwork() {
        displayMessage("Starting Wi-Fi network: " + networkName);
        // Implementation specific to starting a Wi-Fi network
    }

    @Override
    void stopNetwork() {
        displayMessage("Stopping Wi-Fi network: " + networkName);
        // Implementation specific to stopping a Wi-Fi network
    }

    // Concrete method to change Wi-Fi password
    void changePassword(String newPassword) {
        displayMessage("Changing Wi-Fi password to: " + newPassword);
        // Implementation specific to changing the password in a Wi-Fi network
    }
}

public class Main {
    public static void main(String[] args) {
        EthernetNetwork ethernetNetwork = new EthernetNetwork("Office Ethernet");
        WifiNetwork wifiNetwork = new WifiNetwork("Home Wi-Fi");

        ethernetNetwork.startNetwork();
        ethernetNetwork.checkSpeed();
        ethernetNetwork.stopNetwork();

        wifiNetwork.startNetwork();
        wifiNetwork.changePassword("newPassword123");
        wifiNetwork.stopNetwork();
    }
}
