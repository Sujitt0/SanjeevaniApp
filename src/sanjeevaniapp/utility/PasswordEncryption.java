
package sanjeevaniapp.utility;

import java.util.Base64;

public class PasswordEncryption {

    public static String getEncryptedPassword(String password) {
        
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(password.getBytes());
        
    }
//    public static void main(String[] args) {
//        System.out.println(getEncryptedPassword("sujit"));
//    }
}
