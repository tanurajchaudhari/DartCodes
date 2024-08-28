/*
//Q1)you are given the range start and end print the number leaving 2 numbers behind.(increment by 2)
import java.io.*;

class one {

	public static void main(String[]args)throws IOException{
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the starting number");
		int S=Integer.parseInt(br.readLine());
		System.out.println("Enter the ending number");
		int E=Integer.parseInt(br.readLine());

		//int S=1;
		while( S<=E ){
		
			System.out.print(S+"  ");
			S=S+2;

		
		}
	
	}

}

*/
/*
//Q2)write a code thats prints  the number whose square root is odd number in the given range
import java.io.*;

class two{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the starting number");
                int S=Integer.parseInt(br.readLine());
                System.out.println("Enter the ending number");
                int E=Integer.parseInt(br.readLine());

                //int S=1;
                while( S<=E ){
                         if( (S*S)%2==1 ){
                             System.out.print(S+"  ");
			 }
                      S=S+1;

                }

        }

}

*/
/*
//Q3)write a code to print  the character sequence givn below when the range given is
//start =1;
//end =6;
import java.io.*;

class three{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the starting number");
                int S=Integer.parseInt(br.readLine());
                System.out.println("Enter the ending number");
                int E=Integer.parseInt(br.readLine());

                int NS=64+S;int NE=64+E;
 		System.out.println(NS+" :"+NE);

		while(NS<=NE){
		
			System.out.print((char)NS+" ");
			NS=NS+1;

		}
		System.out.println();




        }

}
*/
/*
//Q4)write a code to print  the character sequence  given below where the input S=1 and E=6,(if num is odd print the character)
import java.io.*;

class four{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the starting number");
                int S=Integer.parseInt(br.readLine());
                System.out.println("Enter the ending number");
                int E=Integer.parseInt(br.readLine());

                int NS=64+S;int NE=64+E;
                System.out.println(NS+" :"+NE);

                while(NS<=NE){
                       if(NS%2==1){
                        System.out.print((char)NS+" ");
		       }else{
		       
			       System.out.print(S+" ");
		       }
                        NS=NS+1;
			S++;

                }
                System.out.println();




        }

}
*/
/*
//Q%) Row=4
//1  3  5  7
//9  11 13 15
//17 19 21 23
//25 27 29 31
import java.io.*;
class five{

	public static void main(String[]args)throws IOException{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter the number of rows ");
	  int N=Integer.parseInt(br.readLine());
	  int i=1;
	  int num=1;
	  while(i<=N){
	          int in=1;
		  while(in<=N){
		  
			  System.out.print(num+"  ");
		          num=num+2;in++;

		  }
		  i++;
		  System.out.println();

	  }

	
	}

}
*/
/*
//6)write a code  to print each digit on a new line of a given number using while loop
import java.io.*;
class six{

        public static void main(String[]args)throws IOException{
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the number  ");
          int N=Integer.parseInt(br.readLine());
         
          while(N!=0){
	  
		  System.out.println(N%10);
		  N=N/10;
	  
	  }


        }

}
*/
/*
//7)write a program to count the digit in the given number
import java.io.*;
class seven{

        public static void main(String[]args)throws IOException{
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the number  ");
          int N=Integer.parseInt(br.readLine());
          int count=0;

	  while(N!=0){
	  
		  N=N/10;
		  count++;
	  
	  }
	  System.out.println(count);


        }

}
*/
/*
//8)write a program to print a odd digits of given number
import java.io.*;
class eight{

        public static void main(String[]args)throws IOException{
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the number  ");
          int N=Integer.parseInt(br.readLine());
          

	  while(N!=0){
	  
		  int o=N%10;
		  if(o%2==1){
		  
			  System.out.println(o);

		  }
		  N=N/10;

	  
	  }


        }

}
*/
/*
//9) write a code to count the odd digit and even digit in the given number

import java.io.*;
class nine{

        public static void main(String[]args)throws IOException{
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the number ");
          int N=Integer.parseInt(br.readLine());
          int even=0;
	  int odd=0;


          while(N!=0){

                if((N%10)%2==0){
		
			even++;
		}else{
		
			odd++;

		}
                N=N/10;


          }
	  System.out.println("Even count :-"+even);
	  System.out.println("Odd count :-"+odd);



        }

}
*/

//10)write a code to print the sum of digits in the given numbers 

import java.io.*;
class ten{

        public static void main(String[]args)throws IOException,NumberFormatException{
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the number ");
          long  N=Long.parseLong(br.readLine());
	  
          long sum=0;


          while(N!=0){

                 sum=sum+N%10;

                 N=N/10;


          }
          System.out.println("sum :-"+sum);
         



        }

}





































