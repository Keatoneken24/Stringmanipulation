
package string.manipulation;

import java.util.Scanner;




public class StringManipulation {
static Scanner fred= new Scanner(System.in);
private static String Userinput,ui2;
   public static void main(String[] args){
   Command();
   Enter(); 
    }
    
    
   
    
    public static void Command (){
    String s1 = "please enter Username & password: ";
    String s2 = s1.toUpperCase();
    System.out.println(s2); 
    }
    public static void Enter (){
    String Uname = "Nick27#";
    String Pword = "Yeet12345";
    Userinput = fred.nextLine();
    ui2 =fred.nextLine();
    if((Uname.equals(Userinput)) && (Pword.equals(ui2))){
        System.out.println("Login successful");
    } else{
        System.out.println("Login unsuccessful");
    }
    
    
    
    
    }
    
        
        
        
    


}
 


