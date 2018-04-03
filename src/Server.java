import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static Socket socket;
    private static ServerSocket serverSocket;
    private static InputStreamReader reader;
    private static BufferedReader bufferedReader;
    private static DataOutputStream dout;
    private static String message;
    private static Integer message2 = 1;



    public static void main(String[] args) {
        try{
            serverSocket = new ServerSocket(5000);

            while (true) {

                socket = serverSocket.accept();
                dout = new DataOutputStream(socket.getOutputStream());
                dout.writeUTF(message2.toString());

                reader = new InputStreamReader(socket.getInputStream());
                bufferedReader = new BufferedReader(reader);
                message = bufferedReader.readLine();
                System.out.println(message);


            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
