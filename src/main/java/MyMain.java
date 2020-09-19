import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (65<=ch && ch<=90) {
            ch = (char)(ch + 32); 
            return ch;
        }
        else {
            return ch;
        }      
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String newStr = "";
        for (int i = 0; i< str.length(); i++) {
            char strChar = str.charAt(i);
            if (65<= strChar && strChar<=90) {
                strChar = (char)( (strChar + 32) ); 
            }
            newStr = newStr + strChar;
        }
        return newStr;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (97<=ch && ch<=122) {
            ch = (char)(ch - 32); 
            return ch;
        }
        else {
            return ch;
        }      
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String newStr = "";
        for (int i = 0; i< str.length(); i++) {
            char strChar = str.charAt(i);
            if (97 <= strChar && strChar<=122) {
                strChar = (char)( (strChar - 32) ); 
            }
            newStr = newStr + strChar;
        }
        return newStr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.print("Char: ");
        String str_1 = scan.next();
        char ch_1 = str_1.charAt(0);
        System.out.println(toLower(ch_1));
        System.out.print("Str: ");
        String str_2 = scan.nextLine();
        System.out.println(myToLowerCase(str_2));
        System.out.print("Char: ");
        String str_3 = scan.next();
        char ch_2 = str_3.charAt(0);
        System.out.println(toUpper(ch_2));
        System.out.print("Str: ");
        String str_4 = scan.next();
		System.out.println(myToUpperCase(str_4));
		scan.close();
    }
}
