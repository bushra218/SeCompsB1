package BUSH_JAVA;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIpAddress {

	public static void main(String[] args) {
		
		String host="www.geekforgeeks.org";
		InetAddress address=null;
		try {
			address= InetAddress.getByName(host);
			
			
		}catch(UnknownHostException e) {
			throw new RuntimeException(e);
		}
   System.out.println("Ip Address is: "+address.getHostAddress());
	
	System.out.println("\nThank You \nName: Ansari Bushra \nUIN:231P046 \nRoll no:03 \n ");

	}
	

}
