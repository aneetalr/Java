import java.io.*;
import java.net.*;

class udpclient{
   public static void main(String args[]) throws Exception{
	System.out.println(" Enter information to send" );
	BufferedReader inFromUser =
	new BufferedReader(new InputStreamReader(System.in));
	String sentence = inFromUser.readLine();
	byte[] sendData = new byte[1024];
	sendData = sentence.getBytes();
	InetAddress IPAddress = InetAddress.getByName("localhost");
	DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,IPAddress,9876);
	DatagramSocket clientSocket = new DatagramSocket();
	clientSocket.send(sendPacket);//Information send to server
	byte[] receiveData = new byte[1024];
	DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
	clientSocket.receive(receivePacket);	
	String modifiedSentence = new String(receivePacket.getData());
	System.out.println("FROM SERVER:" + modifiedSentence);
	clientSocket.close();
   }
}
