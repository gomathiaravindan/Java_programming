public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //While loop
	    int num = 10;
	    
	    while(num < 20)
	    {
	    	System.out.println("Hi "+num);
	    	num+=3;
	    }
	    System.out.println(num);
	    
	    //For loop
	    
	    for(num = 1;num<=10;num++)
	    {
	    	System.out.println("Welcome");
	    }
	    num = 0;
	    //Do-while loop
	    do {
	    	System.out.printf("Hello Java : %d",num);
	    	System.out.println("\n");
	    	num++;
	    }while(num < 5);
	}

}
