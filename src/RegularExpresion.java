import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpresion {
    

 	public static boolean validate(String txt, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(txt);
        return matcher.matches();
    }
    
    public static void main(String[] args)
    {
        
        System.out.println("Enter regular expresion:");
        System.out.print("1) (0|1)+  \t 2) (a|b)*c \t 3) x(xy|yx)*y \t : ");
        Scanner in = new Scanner(System.in);
        int regexOption = Integer.parseInt(in.nextLine());
        System.out.println("");
        System.out.print("Enter the string to validate: ");
        Scanner in2 = new Scanner(System.in);
        String string = in2.nextLine();
        
        System.out.println("");

        switch (regexOption) {
        	case 1:
        		if (validate(string, "(0|1)+")) {
        			System.out.print("Valid String");
        		} else {
        			System.out.print("Invalid String");
        		}
        		break;
        	case 2:
        		if (validate(string, "(a|b)*c")) {
        			System.out.print("Valid String");
        		} else {
        			System.out.print("Invalid String");
        		}
        		break;
        	case 3:
        		if (validate(string, "x(xy|yx)*y")) {
        			System.out.print("Valid String");
        		} else {
        			System.out.print("Invalid String");
        		}
        		break;
        }
        
    }
}