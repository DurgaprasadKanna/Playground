import java.util.Scanner;
class Main{
	public static void main (String[] args){
       
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
        
            /*if number divides num, then print number
            Otherwise increment the number */
	    for(int factors = 1; factors <= num; factors++)
	    {
	        if(num % factors == 0)
	        {
	             System.out.println(factors);
	        }
	    }
	}
}
