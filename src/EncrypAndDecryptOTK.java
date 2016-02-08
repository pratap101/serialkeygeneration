/**
 * Created by pratap on 8/2/16.
 */
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


public class EncrypAndDecryptOTK {



    public void run() {

        try {

            SecretKeySpec key = new SecretKeySpec("MyKey".getBytes(), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");

            // initialize for encrypting
            cipher.init(Cipher.ENCRYPT_MODE, key);

            String toEncrypt = "Encrypt this";
            byte[] encrypted = cipher.doFinal(toEncrypt.getBytes());
            System.out.println(new String(encrypted));

            // initialize for decrypting
            cipher.init(Cipher.DECRYPT_MODE, key);

            byte[] decrypted = cipher.doFinal("ÓnßmÛj?E?žá>-d`".getBytes());
            String afterEncryption = new String(decrypted);
            System.out.println(afterEncryption);
	    	  /*String text = "XY12Q-PAT4A-GHD89";

	         String key = "Bar12345Bar12345"; // 128 bit key



	         // Create key and cipher

	         Key aesKey = new SecretKeySpec(key.getBytes(), "AES");

	         Cipher cipher = Cipher.getInstance("AES");



	         // encrypt the text

	       cipher.init(Cipher.ENCRYPT_MODE, aesKey);
	         byte[] encrypted = cipher.doFinal(text.getBytes());
	             System.out.println(new String(encrypted));





	         // decrypt the text

	         cipher.init(Cipher.DECRYPT_MODE, aesKey);
	        // byte[] p = cipher.doFinal(text.getBytes());
			 String decrypted = new String(cipher.doFinal(encrypted));
			 System.err.println(decrypted);

	         //System.out.println(new String(p));
	         */




        }catch(Exception e) {

            e.printStackTrace();

        }

    }
    public static void main(String args[]){
        new	EncrypAndDecryptOTK().run();

    }
}

