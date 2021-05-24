
package encrypt.util;

public class DEP7Crypto {

    public static String encrypt(String textToBeConverted, String key){

        String even = "";
        String odd = "";
        for (int i = 0; i < textToBeConverted.length(); i++) {
            if (i%2 == 0){
                even += textToBeConverted.charAt(i);
            }else {
                odd += textToBeConverted.charAt(i);
            }
        }

        String encryptedText = even + odd;
        String ciperText = "";

        for (int i = 0; i < encryptedText.length(); i++) {
            int code = encryptedText.charAt(i);
            code +=10;
            char newChar = (char) code;
            ciperText += newChar;
        }

        String ciperkey = "";
        for (int i = 0; i < key.length(); i++) {
            int code = key.charAt(i);
            code +=10;
            char newChar = (char) code;
            ciperkey += newChar;
        }

        ciperText += ciperkey;

        return ciperText;

    }

/*    public static String decrypt(String ciperText, String key){

    }*/
}
