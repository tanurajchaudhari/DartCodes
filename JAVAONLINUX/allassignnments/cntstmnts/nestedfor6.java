/*
//Q1)write a code to print numbers divisible by 5 from 1 to 50 & print the number  is even also print the count of even numbers 

import java.io.*;
class one{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start number ");
		int start=Integer.parseInt(br.readLine());
		System.out.println("Enter the end number ");
		int end=Integer.parseInt(br.readLine());
                int count=0;
		for(int i=start;i<=end;i++){
		
			if(count==0){
				if(i%5==0&& i%2==0){
				
					System.out.print(i+"  ");

				
					count++;
				
				}
			
				
				
			

			
			
			
			}else{
			        i=i+4;

				if(i%5==0&&i%2==0){
				
					System.out.print(i+"  ");
				
				}

			

			
			}
		

		
		
		}

	

	
	
	}





 }
*/
/*
//Q2) write code ,take input from users and print composite numbers 
import java.io.*;
class two{

        public static void main(String [] args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter start number ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the end number ");
                int end=Integer.parseInt(br.readLine());
                for(int i=start;i<=end;i++){
		        int count =0;
			for(int j=1;j<=i;j++){
			
				if(i%j==0){
				
					count++;
				
				}
				
			
			
			}
			if(count>2){
			
			
				System.out.print(i+"  ");
			
			}
		}

        }
}
*/
/*
//Q3) write a code to print perfect square number , from user input range
import java.io.*;
class three{

        public static void main(String [] args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter start number ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the end number ");
                int end=Integer.parseInt(br.readLine());
                for(int i=start;i<=end;i++){
		
			for(int j=1;j*j<=i;j++){
			
				if(j*j==i)
					System.out.print(i+"  ");
			

			
			
			
			}
		
		
		
		
		}

    }

}

*/

/*
//Q4) write a code to print perfect cude root from given numbers 

import java.io.*;
class four{

        public static void main(String [] args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter start number ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the end number ");
                int end=Integer.parseInt(br.readLine());
                for(int i=start;i<=end;i++){

                        for(int j=1;j*j*j<=i;j++){

                                if(j*j*j==i)
                                        System.out.print(i+"  ");





                        }




                }
    }

}
*/

/*
//Q5) write a code to take a input  range from user and find out  the perfect numbers in between that range

import java.io.*;
class five{

        public static void main(String [] args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter start number ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the end number ");
                int end=Integer.parseInt(br.readLine());
                for(int i=start;i<=end;i++){
		
			int sum=0;

			for(int j=1;j<i;j++){
			
				if(i%j==0)
					sum=sum+j;
			
			}

			if(sum==i)
				System.out.print(i+"  ");
		      
		
		
		
		}

    }
}
*/

/*
//Q6)write a code to [rint the how many digits in the given number
import java.io.*;
class six{
          static void howmanydigits(int x){
                       int count=0;
                        while(x!=0){
                                count++;
                                x=x/10;

                        }
                        System.out.println("the count of digits is :"+count);


                } 

        public static void main(String [] args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter  the iteration ");
                int itr=Integer.parseInt(br.readLine());
   

                for(int i=1;i<=itr;i++){
		
			System.out.println("enter the "+i+"th number ");
			int num=Integer.parseInt(br.readLine());
			howmanydigits(num);
		
		
		}
	  
             

      }
}
*/
/*
//Q7) write a code ,take a input range  from ueser  and print out all palindrome numbers from that 
import java.io.*;
class Seven{

        public static void main(String [] args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter start number ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the end number ");
                int end=Integer.parseInt(br.readLine());
                
		for(int i=start;i<=end;i++){
		
			int rev=0;int N=i;

			while(N!=0){
			
				int digit=N%10;
				rev=rev*10+digit;
				N=N/10;
			}
			System.out.println(rev+"  ");
		
		
		
		}
       }

}

*/
/*
//Q8) write a code to take input from range from user and print all pallindrome number
import java.io.*;
class eight{

        public static void main(String [] args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter start number ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the end number ");
                int end=Integer.parseInt(br.readLine());

                for(int i=start;i<=end;i++){

                        int rev=0;int N=i;

                        while(N!=0){

                                int digit=N%10;
                                rev=rev*10+digit;
                                N=N/10;
				if(rev==i)
					System.out.print(i+"  ");
                        }
                        
                          


                }
       }

}
*/
/*
//Q9) write a program to print series of strong numbers from given range 
import java.io.*;
class nine{

	static int factorialn(int x){
	        int fact=1;     
		while(x!=0){
		
			fact=fact*x;
			x--;
		}
		return fact;
	
	}
        public static void main(String [] args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter start number ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the end number ");
                int end=Integer.parseInt(br.readLine());

                for(int i=start;i<=end;i++){
			int N=i;

			int sum=0;
			while(N!=0){
			
				int digit=N%10;
                                sum=sum+ factorialn(digit);
				N=N/10;
			}
			if(sum==i)
				System.out.print(i+"  ");



                }
       }

}
*/


//Q10) write a code ,to take input range from user and  print the armstrong number from the range
import java.io.*;


class ten{

	 int cubeof(int x,int n){
	   int cube=1;
	   for(int i=1;i<=n;i++){
	   
		   cube=cube*x;

	   }
	   return cube;



	
	}

	int lenof(int a){
	        int length=0;
		while(a!=0){
		
			length++;
			a=a/10;

		}
		return length;

	}
        public static void main(String [] args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter start number ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the end number ");
                int end=Integer.parseInt(br.readLine());
                ten t=new ten();
                for(int i=start;i<=end;i++){

                        int sum=0;int N=i;
                        int n  = t.lenof(N);
                        while(N!=0){

                                int digit=N%10;
                                sum=sum+t.cubeof(digit,n);
                                N=N/10;
                        }
                        if(sum==i)
				 System.out.print(i+"  ");
               



                }
       }

}
