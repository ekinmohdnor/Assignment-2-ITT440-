import java.io.*;
import java.net.*;

public class loadbalancer
	{
	public static void main (String [] args) throws IOException{
	ServerSocket = new ServerSocket (5555);
	while(true){
	Socket connetionsocket = s1.accept();
	BufferedReader messsagefromloadbalancer = new BufferedReader (new InputSreamReader (connectionsocket.getInputStream()));
	String sentence= messagefromloadclient.readLine();

	if(clientsentence.containts("Hai"){
	Socket server1 =new Socket ("192.168.111.128",2222);
	DataOutStream outtoserver = new DataOutputStream (server.getOutStream());
	outtoserver.writeBytes(clientsentence+"\");
	server1.close();
	}

	else if(clientsentence.containts("Hello"){
	Socket server2 =new Socket ("192.168.111.130",3333);
	DataOutStream outtoserver = new DataOutputStream (server.getOutStream());
	outtoserver.writeBytes(clientsentence+"\");
	server2.close();
	}

	else {
	System.out.println ("Not Found");
	}
	}
	}
}
