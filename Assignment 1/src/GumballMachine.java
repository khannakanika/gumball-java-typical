
public class GumballMachine {
	private int num_gumballs;
    private boolean has_quarter;

    

    public GumballMachine(int size) {
		// TODO Auto-generated constructor stub
    	 this.num_gumballs = size;
         this.has_quarter = false;
	}
    
    public int checkGumball() {
    	if(this.num_gumballs>0) {
    		return 1;
    	}
    	else {
    		return 0;
    	}
    }

	public int insertQuarter1(int coin)
    {
        if ( coin >=1 ) {
        	this.has_quarter = true ;
        	int number=coin;
        	return number;
        	
        }
        	
            
        else {
        	
        	 this.has_quarter = false ;
        	 return 0;
        }
           
		//return coin;
    }
	
	public int insertQuarter2(int coin)
    {
        if ( coin >=2 ) {
        	this.has_quarter = true ;
            int number=(int)(coin/2);
    	    return number;
        }
            
        else {
        	if(coin<2 && coin>0) {
        		System.out.println("Not enough money!");
        	}
        	
        	
        		this.has_quarter = false ;
              	 return 0;
        	
        	
       	 
       }
    }
    
    public void turnCrank1(int number)
    {
    	if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > number )
    		{
    			this.num_gumballs=this.num_gumballs-number ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your money. "+number+" Gumball Ejected!" ) ;
    		}
    		else {
    			if(this.num_gumballs > 0) {
    				
    				
        			System.out.println( "Only "+this.num_gumballs+" gumballs left. Ejected all. Thanks for your money!" ) ;
        			this.num_gumballs=0;
        			this.has_quarter = false ;
    				
    			}else
        		{
        			System.out.println( "No More Gumballs!  Sorry, can't return your money." ) ;
        		}
    		}
    		
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}        
    }
    
    
    
    public void turnCrank2(int number)
    {
    	if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > number )
    		{
    			this.num_gumballs=this.num_gumballs-number ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your money. "+number+" Gumball Ejected!" ) ;
    		}
    		else {	
    			if(this.num_gumballs > 0) {
    				System.out.println( "Only "+this.num_gumballs+" gumballs left. Ejected all. Thanks for your money!" ) ;
        			this.num_gumballs=0;
        			this.has_quarter = false ;
    				
    			}
    			else
        		{
        			System.out.println( "No More Gumballs!  Sorry, can't return your money." ) ;
        		}
    		}
    		
    	}
    	else 
    	{
    		System.out.println( "Please insert money" ) ;
    	}        
    }
    
    public void machine1(int quarters) {
    	int number= this.insertQuarter1(quarters);
    	this.turnCrank1(number);
    	
    	
    }
    
    public void machine2(int quarters) {
    	int number=this.insertQuarter2(quarters);
    	this.turnCrank2(number);
    }

    public void machine3(int nickel,int dime, int quarter) {
    	int n=nickel;
    	int d=dime;
    	int q=quarter;
    	int cents=(n*5)+(d*10)+(q*25);
    	int total=(int)(cents/25);
    	int number=this.insertQuarter2(total);
    	this.turnCrank2(number);
    	
	
}


}
