/*program to finding highest among the given 3 numbers*/

package Largestnumber;// here I have created a package as Largestnumber

	import java.util.Scanner;
	//import scanner class is in util folder inside the java folder
	//util contains utility classes
	//scanner is a predefined class for taking inputs from user
   public class Numbers{
		//declares a class called Numbers
		//classes are the basics of opps(object oriented programming)
	public static void main(String args[]){
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
		int j;//here we store or initialize the value j
		int k;//here we store or initialize the value k
		int l;//here we store or initialize the value l
		
		Scanner sc=new Scanner (System.in);//used for receive input from keyboard
		System.out.println("enter any three numbers:");
		//system is used to return code
		//Println is used to print text and gives output
		//entering three numbers
		j=sc.nextInt();//here nextInt() method are used for getinteger type value from keyboard
		k=sc.nextInt();//here nextInt() method are used for getinteger type value from keyboard
		l=sc.nextInt();//here nextInt() method are used for getinteger type value from keyboard
		
	        if (j>k && j>l)	
	        	//if statement executes a single statement or a block of statements if a boolean expresion evaluates to true
	        	//boolean expression a java expression that when evaluated,returns a boolean value true or false,conditional statements such as if,whileand switch
	        	//here checks both j>k.,j>l which one is false or true
			{		
			System.out.println("the highest number is :"+j);
			//gives output j value if its given value is highest among three numbers
			}
	       
		else if (k>j && k>l)//here if statement followed by an option else statement,which executes when the boolean expression is false
			                ////checks both k>j,k>l wheather which is false or true
		 {
			 System.out.println("the highest number is :" +k);
			 //gives output k value if its given value is highest among three numbers
		 }
		 else if (l>j && l>k)//here if statement followed by an option else statement,which executes when the boolean expression is false
			                 //checks both l>j,l>k wheather which is false or true
		 {
		System.out.println("the highest number is:" +l);
		//gives output l value if its given value is highest among three numbers
		 }
		else
			System.out.println("the numbers are not distinct");
	      //success
		 //system is used to return code
	     //out is a static number
		//Println is used to print text and gives output
		}
	}

