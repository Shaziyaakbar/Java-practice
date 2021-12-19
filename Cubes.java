import java.util.*;
import java.io.*;
public class Cubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double  num=sc.nextDouble();
        double pow=sc.nextDouble();
        sc.close();
        double result=Math.pow(num,pow);

        System.out.println(Math.pow(num,pow));
    }
}