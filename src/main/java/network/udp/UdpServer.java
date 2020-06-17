package network.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * <B>Description:</B> udp server <br>
 * <B>Create on:</B> 2020-06-17 14:59 <br>
 *
 * @author shengming.lin
 * @version 1.0
 */
public class UdpServer {
    private static final int PORT = 5000;
    private DatagramSocket dataSocket;
    private DatagramPacket dataPacket;
    private byte[] receiveByte;
    private String receiveStr;

    public UdpServer() {
        init();
    }

    public void init() {
        try {
            dataSocket = new DatagramSocket(PORT);
            receiveByte = new byte[1024];
            dataPacket = new DatagramPacket(receiveByte, receiveByte.length);
            receiveStr = "";
            while (true) {
                dataSocket.receive(dataPacket);
                int length = dataPacket.getLength();
                if (length > 0) {
                    receiveStr = new String(receiveByte, 0, length);
                    System.out.println(receiveStr);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new UdpServer();
    }
}