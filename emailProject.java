import java.util.Scanner;

public class emailProject {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in); 
	    
	System.out.println("Please enter your first name");
        String fn = input.nextLine(); 
        
	    System.out.println("Please enter your middle name");
        String mn = input.nextLine(); 
	    
	    System.out.println("Please enter your last name");
        String ln = input.nextLine(); 
        
	    System.out.println("Please enter your birthday in the format (mmddyyyy)"); //This should be mm-dd-yyyy
        String bd = input.nextLine(); 
        
        ln = ln.toLowerCase();
        String fi = fn.substring(0,1);
        fi = fi.toUpperCase();
        String mi = mn.substring(0,1);
        mi = mi.toUpperCase();
        
        String email = (ln + fi + mi + "@sharkmail.com");
        String password = bd;
        
        System.out.println("Your email is: " + email);
        System.out.println("Your password is: " + password); //this should be mmddyyyy
        System.out.println("Your current password is weak. Please change immediately.");
	}

}
//Grade 90/100. Resubmit with proposed changes for a 100.
