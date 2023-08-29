package in.laxmi;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Demo {

	public static void main(String[] args) throws Exception {
		String a = "abcd@1234";
		/*Encoder encoder =Base64.getEncoder();
		String encodeStr = encoder.encodeToString(a.getBytes());
		System.out.println(encodeStr);
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodeStr);
		System.out.println(new String(decode));*/
		
		
		MessageDigest msgDigest = MessageDigest.getInstance("SHA-256");
		msgDigest.reset();
		msgDigest.update(a.getBytes());
		byte[] encrptedText =msgDigest.digest();
		System.out.println(new String(encrptedText));
		String encoded = Base64.getEncoder().encodeToString(encrptedText);
		System.out.println(encoded);
	}
}
