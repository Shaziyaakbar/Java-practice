import java.util.*;
public class Palindrome_1 {
public static void main(String[] args) {
    String str = "PoP";
    System.out.println("Original String :"+ str);
    String revStr = (new StringBuffer(str)).reverse().toString();
    System.out.println("Reversed String :"+ revStr);

    if(str.equals(revStr)) {
        System.out.println("Palindrome");
    }else{
        System.out.println("Not a Plaindrome!");
    }
}
}