package okoaOption;
import java.util.Scanner;
public class Okoaoption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 int goback=0;
		 do{
	        System.out.println("Menu:");
	        System.out.println("0: Sh20(30 mins, 3 hrs)");
	        System.out.println("1: Sh10(15 mins, 1 hr)");
	        System.out.println("2: Sh20(15 mins midnight)");
	        System.out.println("3: Okoa 50");
	        System.out.println("4: Okoa 20");
	        System.out.println("5: Okoa 10");
	        System.out.println("6: Okoa 5");
	        System.out.println("7: Okoa 20(900Mb, 1 hr)");
	        System.out.println("8: Okoa Internet");
	        System.out.println("0: More");

	        System.out.print("Please enter the option number: ");
	        int option = scanner.nextInt();

	
	        switch (option) {
	            case 1:
	                System.out.println(" option 1: Sh20(30 mins, 3 hrs)");
	                break;
	            case 2:
	                System.out.println(" option 2: Sh10(15 mins, 1 hr)");
	                break;
	            case 3:
	                System.out.println(" option 3: Sh20(15 mins midnight)");
	                break;
	            case 4:
	                System.out.println(" option 4: Okoa 50");
	                break;
	            case 5:
	                System.out.println(" option 5: Okoa 20");
	                break;
	            case 6:
	                System.out.println(" option 6: Okoa 10");
	                break;
	            case 7:
	                System.out.println(" option 7: Okoa 5");
	                break;
	            case 8:
	                System.out.println(" option 8: Okoa 20(900Mb, 1 hr)");
	                break;
	            case 9:
	                System.out.println(" option 9: Okoa Internet");
	                break;
	            case 0:
	                System.out.println("option 10:Okoa minutes ");
	                System.out.println("option 11:Okoa sms ");
	                System.out.println("option 12:Lipa Okoa ");
	                System.out.println("option #:Check Balance ");
	                System.out.println("option 0:Back ");
	                System.out.println("Please enter your option number: ");
	                int optionNumber = scanner.nextInt();

	                break;
	            
	            default:
	                System.out.println("Invalid option. Please choose a valid option.");
	                

	        }
	        

	        scanner.close();
	    }while(goback>=1);
		 goback++;
	
	}}
		
		
		

	


