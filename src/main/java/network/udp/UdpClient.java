package network.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * <B>Description:</B> udp client <br>
 * <B>Create on:</B> 2020-06-17 14:59 <br>
 *
 * @author shengming.lin
 * @version 1.0
 */
public class UdpClient {
    private static final int PORT = 5000;
    private DatagramSocket dataSocket;
    private DatagramPacket dataPacket;
    private byte sendDataByte[];
    private String sendStr;

    public UdpClient() {
        init();
    }

    public void init() {
        try {
            dataSocket = new DatagramSocket(PORT + 1);
            sendDataByte = new byte[1024];
            sendStr = "hi server, i am client!";
            sendDataByte = sendStr.getBytes();
            dataPacket = new DatagramPacket(sendDataByte, sendDataByte.length,
                    InetAddress.getByName("localhost"), PORT);
            dataSocket.send(dataPacket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new UdpClient();
    }
}
