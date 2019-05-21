
package Logic;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptClass {

    public EncryptClass() {
    }

    
    public String encryptString(String input) {
        StringBuffer sb = new StringBuffer();
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update(input.getBytes());

            byte[] digest = md.digest();

            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("No such algorithm.");
        }
        return sb.toString().toUpperCase();
    }
}

