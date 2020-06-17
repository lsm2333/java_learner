package network.tcp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * <B>Description:</B> tcp client <br>
 * <B>Create on:</B> 2020-06-17 15:00 <br>
 *
 * @author shengming.lin
 * @version 1.0
 */
public class TcpClient {
    private Socket socket;

    public TcpClient() {
        try {
            socket = new Socket("localhost", 8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream())), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw.println("hello server, i am client！");
    }

    public static void main(String[] args) {
        TcpClient client = new TcpClient();
        client.start();
    }
}
