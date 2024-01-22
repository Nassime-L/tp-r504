// ServeurTCP3.java
import java.io.*;
import java.net.*;

public class ServeurTCP3
{
	public static void main ( String[] args )
	{
		try
		{
			ServerSocket socketserver = new ServerSocket(2016);
			while(true)
			{
				System.out.println("serveur en attente");
				Socket socket = socketserver.accept();
				System.out.println("Connection d'un client");
				DataInputStream dIn = new DataInputStream( socket.getInputStream() );
				System.out.println("Message : " + dIn.readUTF() );
				String rev = new StringBuilder(dIn.readUTF()).reverse().toString();
				System.out.println(rev);
//				DataOutputStream dOut2 = new DataOutputStream( socket.getOutputStream() );
//				dOut2.writeUTF( rev );		
			}
		}
		catch(Exception ex) 
		{
			System.out.println(" erreur ! ");
			ex.printStackTrace ();
		}
	}	
}
