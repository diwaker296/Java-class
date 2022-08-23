import java.util.*;
public class cpgpa {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);

        System.out.println("enter number of CND subject");
        int Cnd = sc.nextInt();

        System.out.println("enter number of CSOA subject");
        int Csoa = sc.nextInt();

        System.out.println("enter number of DSA subject");
        int Dsa= sc.nextInt();

        System.out.println("enter number of IWT subject");
        int Iwt= sc.nextInt();

        System.out.println("enter number of RDBMS subject");
        int Rdbms = sc.nextInt();

        System.out.println("enter number of  C++subject");
        int C_Plush = sc.nextInt();

        float avg = (Cnd+Csoa+Dsa+Iwt+Rdbms+C_Plush)/5;
        System.out.println("Total avg:"+" "+avg);

        float Cgpa = avg*9/5;
        System.out.println("your CGPA:"+" "+Cgpa);


    }
    
}
