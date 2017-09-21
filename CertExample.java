import java.io.*;
import java.security.cert.*;
import java.security.*;
import java.security.cert.Certificate;
public class CertExample
{	public static void main(String args[]) throws Exception
	{	
		char [] pswd = {'k', 'a', 't', 'e','2', '0', '0',
'5'};
		
		KeyStore k = KeyStore.getInstance ("JKS");
		
		k.load (new FileInputStream
("C:/Documents and settings/user/.keystore"), pswd);
				Certificate c = k.getCertificate ("JohnKey");
		
		System.out.println (c);
	}
} 
