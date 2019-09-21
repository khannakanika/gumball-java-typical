import java.util.Scanner;

public class Machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine gm= new GumballMachine(5);
		String response=new String(" ");
        String s1=new String("y");
        String s2=new String("Y");
        Scanner myObj = new Scanner(System.in);
        int left;
		do {
			System.out.println("1. Machine1 takes 1 quarter for one Gumball.");
			System.out.println("2. Machine2 takes 2 quarters for one Gumball.");
			System.out.println("3. Machine3 takes 50 cents(nickles,dimes and quarters accepted) for one Gumball.");
			System.out.println("Which machine do you want to run?");
			  
	        int input = myObj.nextInt();  
	        
	        switch(input) {
	        case 1:
	        	    System.out.println("Enter quarters in the Machine1 :");
	        	    int quarters1=myObj.nextInt();
	        	    gm.machine1(quarters1);
	        	    break;
	        case 2:System.out.println("Enter quarters in the Machine2 :");
	    	        int quarters2=myObj.nextInt();
	    	        gm.machine2(quarters2);
	        	
	        	    break;
	        case 3:System.out.println("Enter nickles in the Machine3 :");
	               int nickles=myObj.nextInt();
	               System.out.println("Enter dimes in the Machine1 :");
	               int dimes=myObj.nextInt();
	               System.out.println("Enter quarters in the Machine1 :");
	               int quarters3=myObj.nextInt();
	               gm.machine3(nickles, dimes, quarters3);
	        	
	            	break;
	        default:System.out.println("Invalid Input");
	        }
	        left=gm.checkGumball();
	        if(left==0) {
	        	System.out.println("We are short of Gumballs. Need to reload!");
	        	break;
	        }
	        	
	        System.out.println("Do you want to continue?(Y/N)");
	        response=myObj.next();
	        
			
		}while(response.equals(s1) || response.equals(s2));
		System.out.println("Bye Bye!");
		
		myObj.close();
	}

}
