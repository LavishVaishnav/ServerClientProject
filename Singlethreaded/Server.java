package Singlethreaded;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class Server {

    public void run() throws IOException, UnknownHostException {
        int port = 8010;
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(20000); // 20 SECs
        while (true) {
            System.out.println("Server is Listening o port: " + port);
            Socket acceptedConnection = socket.accept();
            System.out.println("Connection to" + acceptedConnection.getRemoteSocketAddress());
            PrintWriter toClient = new PrintWriter(acceptedConnection.getOutputStream(), true);
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream()));
            toClient.println("Hello from the Server.....");
            toClient.close();
            fromClient.close();
            acceptedConnection.close();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        try {
            server.run();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}