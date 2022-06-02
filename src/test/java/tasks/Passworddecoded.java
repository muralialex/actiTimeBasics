package tasks;

import java.util.Base64;

public class Passworddecoded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="4hazdnWu";
String  enpass=Base64.getEncoder().encodeToString(str.getBytes()); 
System.out.println(enpass);
byte[] decpass=Base64.getDecoder().decode(enpass);
String passnew=new String(decpass);
System.out.println(decpass);
System.out.println(passnew);
	}}
