import java.util.*;

public class String_Fun {
    public static void main(String[] args) {

        // Comcatemation (addition of String)
        String FirstName = "Diwaker";
        String LastName = "Negi";
         String FullName = FirstName + " "+LastName;
         System.out.println(FullName);


        //  lenght (find the String length)
        System.out.println(FullName.length());

        // charAt
        for(int i=0;i<FullName.length();i++){
            System.out.println(FullName.charAt(i));
        }

            //  checking following condition
            // 1st is: string 1>String 2 :: +ve value
            // 2nd is : String 1==String 2 :: 0 value
            //  3rd is : String 1<String 2:: -ve value




            // .compare
            if(FirstName.compareTo(LastName)==0){
                System.out.println("string are equal");
            }else{
                System.out.println("String are not equal");
            }

            if(new String ("Tony")==new String("Tony")){
                System.out.println("String are equal ");
            }else{
                System.out.println("String are not equal");
            }

    }
    
}
