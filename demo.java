import java.util.*;
public class demo
{
	public static void main(String[] args) {
	    System.out.println("Enter the number");
	    
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++){
	       
	    if(i%3==0 && i%5==0){
	            System.out.println("Fizzbuzz");
	        }
	        else if(i%3==0){
	            System.out.println("fizz");
	        }
	        else if( i%5==0){
	            System.out.println("buzz");
	        }
	        else{
	            System.out.println(i);
	        }
	    }
	  
	 
}
}