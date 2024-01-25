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
				String msg = dIn.readUTF();
				System.out.println("Message : " + msg );
				String rev = new StringBuilder(msg).reverse().toString();
				System.out.println("Message inversé : " + rev);
				DataOutputStream dOut2 = new DataOutputStream(socket.getOutputStream());
				dOut2.writeUTF( rev );		
			}
		}
		catch(Exception ex) 
		{
			System.out.println(" erreur ! ");
			ex.printStackTrace ();
		}
	}	
}
