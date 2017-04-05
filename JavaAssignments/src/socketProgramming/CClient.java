
package socketProgramming;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class CClient {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter server ip address..:");
            String server_ip = sc.next();
            System.out.print("Enter server port number..:");
            int server_port = sc.nextInt();
            
            //connect to server
            System.out.println("connecting to server.....");
            Socket socket = new Socket(server_ip,server_port);
            System.out.println("Connection established.");
            System.out.println("to communicate with server,type your message "
                    + "and presee enter.. ");
            System.out.println("type bye to terminate the connection..");
            DataInputStream dis = null;
            DataOutputStream dout = null;
            BufferedReader br = null;
            
            try{
                dout = new DataOutputStream(socket.getOutputStream());
                dis = new DataInputStream(socket.getInputStream());
                br = new BufferedReader(new InputStreamReader(System.in));
                String msg = null;
                
                while(true){
                    System.out.print("your message: ");
                    msg = br.readLine();
                    dout.writeUTF(msg);
                    dout.flush();
                    
                    String str = dis.readUTF();
                    System.out.println("Server: "+str);
                    if(str.equalsIgnoreCase("goodbye"))
                        break;
                }
            }finally{
                if(dout != null)
                    dout.close();
                if(dis != null)
                    dis.close();
                if(br != null)
                    br.close();
            }
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error while connecting to server");
        }
    }
}
