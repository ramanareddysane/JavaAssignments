
package socketProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SServer {
    public static int PORT_NUMBER = 2015;
    public static void main(String[] args) {
        DataInputStream dis = null;
        DataOutputStream dout = null;
        try {
            ServerSocket server_socket = new ServerSocket(PORT_NUMBER);
            Socket socket = server_socket.accept();
            System.out.println("Client "+ socket.getLocalAddress().toString()+" connected..");
            dout = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());
            String msg = "";
            while(true){
                msg = dis.readUTF();
                if(msg.equalsIgnoreCase("bye")){
                    dout.writeUTF("Goodbye");
                    dout.flush();
                    break;
                }else{
                    dout.writeUTF("OK");
                    dout.flush();
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Server Error");
        }finally{
            try {
                if(dout != null)
                    dout.close();
                if(dis != null)
                    dis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                System.out.println("Error while closing the IO streams");
            }
            }
        
    }
}
