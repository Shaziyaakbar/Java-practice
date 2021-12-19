import java.util.*;
import java.io.*;
 class Employ {
    
        String Name;
        String Designation;
        int Id;
        public Employ(String Name,String Designation,int Id) {
            this.Id = Id;
            this.Name = Name;
            this.Designation = Designation;
        }
    }
    public class Employee {
        
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Employ list[] = new Employ[N];
        for(int i=0;i<N;i++) {
            System.out.println("Enter a EmployId :");
            int Id=sc.nextInt();
            System.out.println("Enter a Employ Name :");
            sc.nextLine();
            String Name=sc.nextLine();
            System.out.println("Enter a Designation :");
            String Designation=sc.nextLine();
            
            

            Employ e=new Employ(Name,Designation,Id);
            list[i] = e;

        }
        System.out.println("Id For Searching Purpose:");
            int search = sc.nextInt();
            for(Employ s: list) {
                if(s.Id == search){
                    System.out.println("Match Found!!");
                    System.out.println("Name" +s.Name);
                    System.out.println("Designation:"+s.Designation);
                    System.out.println("Employ Id:"+s.Id);

                
                }
            }
        }
    }

    