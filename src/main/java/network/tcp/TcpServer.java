package network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <B>Description:</B> tcp server <br>
 * <B>Create on:</B> 2020-06-17 15:00 <br>
 *
 * @author shengming.lin
 * @version 1.0
 */
public class TcpServer {
    private ServerSocket server;

    public TcpServer() {
        try {
            server = new ServerSocket(8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        System.out.println("waiting for client");
        Socket socket;
        try {
            socket = server.accept();
            InputStream in = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(isr);
            String message = br.readLine();
            System.out.println("message from client：" + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TcpServer server = new TcpServer();
        server.start();
    }
}
