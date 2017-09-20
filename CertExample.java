import java.io.*;
import java.security.cert.*;
import java.security.*;
import java.security.cert.Certificate;
public class CertExample
{	public static void main(String args[]) throws Exception
	{	// το συνθηματικό για την προστασία της ακεραιότητας
		// της αποθήκης
		char [] pswd = {'k', 'a', 't', 'e','2', '0', '0',
'5'};
		// δημιούργησε ένα αντικείμενο-αποθήκη τύπου JKS
		KeyStore k = KeyStore.getInstance ("JKS");
		// φόρτωσε την αποθήκη από το αρχείο .keystore
		k.load (new FileInputStream
("C:/Documents and settings/user/.keystore"), pswd);
		// εντόπισε την καταχώριση με το ψευδώνυμο JohnKey
		// και πάρε το κατάλληλο πιστοποιητικό που σχετίζεται
		// με αυτήν
		Certificate c = k.getCertificate ("JohnKey");
		// εμφάνισε το πιστοποιητικό
		System.out.println (c);
	} // main
} 
