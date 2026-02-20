
import java.util.Scanner;
import java.io.IOException;

public class ThrowsDemo{
	public  void check(int num){
	    try{
    	    if(num<0){
    	        throw new IOException();
    	    }
    	    else{
    	        	   
	        System.out.println(num);
    	    }
	    }
	    catch(IOException  e){
	        System.out.println( "Caught: IO Exception");
	    }

	}
     public static void main (String[] args) {
        ThrowsDemo d1 = new ThrowsDemo();
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        d1.check(inp);
    }
}
		