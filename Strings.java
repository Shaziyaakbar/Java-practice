import java.util.*;
import java.io.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = "03:12:20 Sunday 19-dec-2021";
        System.out.println("Hour:" +str.substring(0,2));
        System.out.println("Mintues:" +str.substring(3,5));
        System.out.println("Seconds:" +str.substring(6,8));
        System.out.println("Day:" +str.substring(9));
        System.out.println("Date:" +str.substring(15,18));
        System.out.println("Month:" +str.substring(19,22));
        System.out.println("Year:" +str.substring(23));


    }
}