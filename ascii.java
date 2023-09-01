import java.util.Scanner;  
public class AsciiValue {

    public static void main(String[] args) {
     Scanner d = new Scanner(System.in); 
        char ch ;
        ch=d.next().charAt(0);
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}