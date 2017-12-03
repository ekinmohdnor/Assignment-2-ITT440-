
Server1

import java.io.*;
import java.net.*;

public class server1
	{
	public static void main (String [] args) throws IOException{
	ServerSocket s1=new ServerSocket (2222);
	while (true){
	Socket connetionsocket = s1.accept();
	BufferedReader messsagefromloadbalancer = new BufferedReader (new InputSreamReader (connectionsocket.getInputStream()));
	String sentence= messagefromloadbalancer.readLine();
	System.out.prinln ("Accept message from client : +sentence);
	}
}

.................................................................................

Server2


import java.io.*;
import java.net.*;

public class server2
	{
	public static void main (String [] args) throws IOException{
	ServerSocket s2=new ServerSocket (3333);
	while (true){
	Socket connetionsocket = s2.accept();
	BufferedReader messsagefromloadbalancer = new BufferedReader (new InputSreamReader (connectionsocket.getInputStream()));
	String sentences = messagefromloadbalancer.readLine();
	System.out.prinln ("Accept message from client : +sentences);
	}
}
