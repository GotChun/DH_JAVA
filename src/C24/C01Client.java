package C24;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class C01Client {

	public static void main(String[] args) throws IOException {

		Socket server = new Socket("192.168.5.21",7000);
		InputStream in = server.getInputStream();
		DataInputStream din = new DataInputStream(in);
		String recv = din.readUTF();
		System.out.println("서버메세지 : " + recv);


	}
}
