interface InetworkProtocol {
    void broadcastMessage(Strinhg msg);
}

//Implementtation
class BluetoothMeshNetwork implements INetworkProtocol {
    public void broadcastMessage(String msg) {
        System.out.println("Broadcast:" + msg);
    }
}
// High-Level class
class DisasterAlertSystem {
    private INetworkprotocol network;
    public DisasteralertSystem(INetworkProtocol network) {
        this.network = network;
    }
    public void triggerAlert(String msg) {
        network.broadcastMessage(msg);
    }

}
public class Main7 {

    public static void main(String[] args) {

        DisasterAlertSystem alert =
                new DisasterAlertSystem(new BluetoothMeshNetwork());

        alert.triggerAlert("Flood Warning!");
    }
}
