
package encrypt.util;

import java.util.Arrays;

public class DEP7Crypto {

    public static String encrypt(String textToBeConverted, String key){

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////ENCRYPTION ALGORITHM/////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Divide the entire input text into two parts by getting the index of each character and comparing even or odd
        //get the even indexed part and at the end of that concatenate with the odd indexed part
        //get the relevent ASCII value for each character and add CONST value (10) and generate new characters


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
/////////////////////////////////////////////////////////////////////////

        int[] prefix = new int[key.length()];
        //char prefix;
        int[] sufix = new int[key.length()];
        //char sufix;
        //System.out.println((char) 151);
        for (int i = 0; i < key.length(); i++) {
            int code = key.charAt(i);
            prefix[i] = code / 10;
            sufix[i] = code % 10;
            //System.out.println(code);
        }
        //System.out.println(Arrays.toString(prefix)+" "+ Arrays.toString(sufix));


////////////////////////////////////////////////////////////////////////


        String ciperText = "";

        for (int i = 0; i < encryptedText.length(); i++) {
            int code = encryptedText.charAt(i);
            code +=10;
            char newChar = (char) code;
            ciperText += newChar;
        }

        /*String ciperkey = "";
        for (int i = 0; i < key.length(); i++) {
            int code = key.charAt(i);
            code +=10;
            char newChar = (char) code;
            ciperkey += newChar;
        }*/

        //ciperText += ciperkey;

        /////////////////////////////////////////////////////

        String endCiperText="";
       /* for (int i = 0; i < key.length(); i++) {
            endCiperText += prefix[i];
        }*/


        for (int i = 0; i < ciperText.length(); i++) {
            endCiperText += ciperText.charAt(i);
        }

        for (int i = 0; i < key.length(); i++) {
            endCiperText += sufix[i];
        }

       // System.out.println(endCiperText);

        //////////////////////////////////////////////////////

       // return endCiperText;
        return  endCiperText;

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////END OF ENCRYPTION ALGORITHM//////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }

    public static String decrypt(String textToBeConverted, String key){

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////DECRYPTION ALGORITHM/////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Divide the entire input text into two parts by getting the index of each character and comparing even or odd
        //get the even indexed part and at the end of that concatenate with the odd indexed part

        /////////////////////////////////////////////////////////////////////

        int[] prefix = new int[key.length()];
        //int[] sufix = new int[key.length()];
        String sufix = "";
        int index =0;

        for (int i = (textToBeConverted.length() - key.length()); i < textToBeConverted.length(); i++) {
            sufix += (char) textToBeConverted.charAt(i);
            index++;
        }
        //System.out.println(sufix);

        String encryptedText = "";

        for (int i = 0; i < textToBeConverted.length()- key.length(); i++) {
            encryptedText += textToBeConverted.charAt(i);
        }

       // System.out.println(encryptedText);



        ////////////////////////////////////////////////////////////////////


        char[] convertedText = new char[encryptedText.length()];
        String even = "";
        String odd = "";
        int firstEnd = 0;

        for (int i = 0; i < (encryptedText.length() + 1)/2; i++) {
            even += encryptedText.charAt(i);
            firstEnd = i;
        }

        for (int i = firstEnd +1 ; i < encryptedText.length() ; i++) {
            odd += encryptedText.charAt(i);
        }

        //System.out.println(even);
        //System.out.println(odd);

        int evenNode = 0;
        int oddNode = 0;
        String output = "";

        for (int i = 0; i < convertedText.length; i++) {
            if (i%2 == 0){
                convertedText[i] = even.charAt(evenNode);
                evenNode++;
            }else {
                convertedText[i] = odd.charAt(oddNode);
                oddNode++;
            }
            output = output + convertedText[i];
        }

        //System.out.println(output);

        String decryptedText = "";
        int code = 0;
        for (int i = 0; i < output.length(); i++) {
            code = output.charAt(i) - 10;
            //System.out.println(code);
            decryptedText = decryptedText + (char) code;
           // System.out.println((char) code);
        }
        //System.out.println(decryptedText);

        return decryptedText;

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////END OF DECRYPTION ALGORITHM//////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}
