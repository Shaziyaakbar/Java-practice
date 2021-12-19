import java.util.*;
import java.io.*;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        Character ch= sc.next().charAt(0);
        int count=0;
        for(int i=0;i<st.length();i++) {
            if(st.charAt(i)==ch) {
                count++;
            }
        }
        
         System.out.println(count);   
        }
        
        }