import java.io.*;
import java.net.*;

public class client
	{
	public static void main (String [] args) throws IOException{
	Socket client=new Socket ("192.168.111.129",4444);
	DataOutStream outtoserver = new DataOutputStream (client.getOutStream());
	BufferedReader informuser = new BufferedReader (new InputSreamReader(System.in()));
	String sentence = informuser.readLine();
	outtoserver.writeBytes(sentence);
	myclient.close();
	}
}
