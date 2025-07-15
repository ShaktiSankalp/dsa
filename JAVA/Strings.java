import java.util.*;
public class Strings {
   public static void main(String args[]) {

    // String name = "Tony";


Scanner sc = new Scanner(System.in);
       String name = sc.next();

//Concatenation (Joining 2 strings)
String firstName = "Tony";
       String secondName = "Stark";


       String fullName = firstName + " " + secondName;
       System.out.println(fullName);

//Print length of a String
String firstName1 = "Tony";
       String secondName1 = "Stark";


       String fullName1 = firstName1 + " " + secondName1;
       System.out.println(fullName1.length());

//Access characters of a string
String firstName2 = "Tony";
       String secondName2 = "Stark";


       String fullName2 = firstName2 + " " + secondName2;


       for(int i=0; i<fullName2.length(); i++) {
           System.out.println(fullName2.charAt(i));
       }



       //Compare 2 strings
       String name2 = "Tony";
       String name3 = "Tony";


       if(name3.equals(name2)) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }


       //DO NOT USE == to check for string equality
       //Gives correct answer here
    //    if(name3 == name2) {
    //        System.out.println("They are the same string");
    //    } else {
    //        System.out.println("They are different strings");
    //    }


       //Gives incorrect answer here
    //    if(new String("Tony") == new String("Tony")) {
    //        System.out.println("They are the same string");
    //    } else {
    //        System.out.println("They are different strings");
    //    }

       // Substring
// The substring of a string is a subpart of it.


       String name4 = "TonyStark";
     
       System.out.println(name4.substring(0, 4));


// ParseInt Method of Integer class
       String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);
      

// ToString Method of String class

      int number1 = 123;
      String str1 = Integer.toString(number1);
      System.out.println(str1.length());




// ALWAYS REMEMBER : Java Strings are Immutable.

sc.close();



      
   }
}




    

