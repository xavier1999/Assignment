package Week1;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter string string1: ");
        String string1 = in.nextLine();
        
        System.out.print("Enter string string2: ");
        String string2 = in.nextLine();
        
        if (string1.indexOf(string2) != -1) {
            System.out.printf("%s is a substring of %s%n", string2, string1);
        }
        else{
            System.out.printf("%s is not a substring of %s%n", string2, string1);
        }
    }
}