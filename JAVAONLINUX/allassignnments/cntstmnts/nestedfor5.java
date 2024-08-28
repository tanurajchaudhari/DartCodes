/*
//Q1)
//D4  C3  B2  A1
//A1  B2  C3  D4
//D4  C3  B2  A1
//A1  B2  C3  D4



import java.io.*;
class one{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of rows ");
		int row=Integer.parseInt(br.readLine());
		int ch=64+row;
		for(int i=1;i<=row;i++){
		
			if(i%2==1){
			        int ch1=ch;
                                int n=row;
				for (int j=1;j<=row;j++){
				
					System.out.print((char)ch1+""+n+"  ");
                                        ch1--;n--;
				        
				}
			
			}else{
				int ch2=65;
				for(int j=1;j<=row;j++){
					
			         	 System.out.print((char)ch2+""+j +"  ");
					 ch2++;
				
				}
			

			}
		System.out.println();
		}


	}
}
*/
/*
//Q2)
//    #   =  =  =  =
//    =   #  =  =  =
//    =   =  #  =  =
//    =   =  =  #  =
//    =   =  =  =  #
//
import java.io.*;
class two{

        public static void main(String[]args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the number of rows ");
 		int row=Integer.parseInt(br.readLine());
                for(int i=1;i<=row;i++){
		
			for(int j=1;j<=row;j++){
			
				if(i==j){
				
					System.out.print("#  ");
				
				}else{
				
					System.out.print("=  ");
				
				}
			
			
			}
		System.out.println();
		}
                 


	}
}
*/
/*
//Q3) 
// 5  4  3 2  1
// 8  6  4 2
// 9  6  3
// 8  4
// 5
import java.io.*;
class three{

        public static void main(String[]args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the number of rows ");
                int row=Integer.parseInt(br.readLine());
                for(int i=1;i<=row;i++){
		
			int x= row-i+1;
			for(int j=row;j>=i;j--){
			
				System.out.print(x*i+"  ");
				x--;
			
			}
			System.out.println();
		}
                         
                
                 



   }
}
*/
/*
//Q4)
//wap to print a evene numbers in reverse order  and odd number in standard way ,both print separately in given range from user
import java.io.*;
class four{

        public static void main(String[]args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the start number  ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter end number ");
		int end=Integer.parseInt(br.readLine());
                System.out.println("Even numbers ");
		for(int i=end;i>=start;i--){
		
			if(i%2==0){
			
				System.out.print(i+"  ");
			}
			
		
		}
		System.out.println("\n Odd Numbers ");
		for(int i=start;i<=end;i++){
		
			if(i%2==1){
			
				System.out.print(i+"  ");
			}
		}
		
              System.out.println();
  }
}
*/

/*
//Q5)
//  0 
//  1  1
//  2  3  5
//  8  13 21 34
import java.io.*;
class five{

        public static void main(String[]args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the row number  ");
                int row=Integer.parseInt(br.readLine());
                int a=0;int b=1;
		for(int i=1;i<=row;i++){
		
			for(int j=1;j<=i;j++){
			
				System.out.print(a+"  ");
				int c=a+b;
				a=b;b=c;

			
			}
			System.out.println();


		
		}
   


	}
}
*/

/*
//Q6)
//WAP  and take input from user take two character and print  if they are same  and if not then print their difference in between them

import java.io.*;
class six{

        public static void main(String[]args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter first character  ");
                char a=(char)br.read();
		System.out.println("Enter second  character  ");
		br.skip(2);
		char b=(char)br.read();
                

		if(a==b){
		
			System.out.println("both the characters are same ");
		}else {
		
			int D=a-b;
			if(D<0){
			
				D=D*(-1);
			}
		       System.out.println("The difference is "+ D);
		}
                
 }

}

*/
/*
//Q7)
//row=5
// O
// 14   13
// L    K   J
// 9    8   7   6
// E    D   C   B   A
//
// ROW =4
//
// 10
// I   H
// 7   6   5
// D   C   B  A
//
//
 import java.io.*;
class seven{

        public static void main(String[]args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter te number of rows ");
		int n=Integer.parseInt(br.readLine());
                int x=(n*(n+1))/2;

		for(int i=1;i<=n;i++){
		
			for(int j=1;j<=i;j++){
			
				if((i%2==1&&n%2==1)||(i%2==0&&n%2==0)){
				
					System.out.print((char)(64+x)+"  ");
					x--;
				
				}else{
				
					System.out.print(x+"  ");
					x--;
				
				}
			
			
			} 
			System.out.println();
		
		
		}
                

	}
}
*/
/*
//Q8)
//   $
//   @  @
//   &  &  &
//   #  #  #  #
//   $  4  $  $  $
//   @  @  @  @  @  @
//   &  &  &  &  &  &  &
//   #  #  #  #  #  #  #  #
//   take user input
//
import java.io.*;
class eight{

        public static void main(String[]args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter te number of rows ");
                int n=Integer.parseInt(br.readLine());
                for(int i=1;i<=n;i++){
		
			for(int j=1;j<=i;j++){
			
				if(i%4==1){
				
					System.out.print("$  ");
				}else if(i%4==2){
				
					System.out.print("@  ");
				
				}else if(i%4==3){
				
				
					System.out.print("&  ");
				
				}else {
					System.out.print("#  ");
				}
			
			} 
			System.out.println();

		
		}
	}
}
*/
/*
//Q9)
//write a code  take input from user and print addition of factorial of each digits   from that number

import java.io.*;
class nine{

        public static void main(String[]args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter te number of rows ");
                int n=Integer.parseInt(br.readLine());
                int sum=0;

		while(n!=0){
		
			int digit=n%10;
			int prod=1;

			while(digit!=0){
			
				prod=prod*digit;
				digit--;

			
			}
			sum=sum+prod;
			n=n/10;
		
		
		
		} 
	       	
               System.out.println("Sum is "+sum);



          }
}
*/
/*
//Q10 write a code to prit all prime numbers from given range ,take input from users 

import java.io.*;
class ten{

        public static void main(String[]args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter first number ");
                int n1=Integer.parseInt(br.readLine());
                System.out.println("Enter second number  ");
                int n2=Integer.parseInt(br.readLine());
		for(int i=n1;i<=n2;i++){
		          int count=0;
			for(int j=1;j<=i;j++){
			
				if(i%j==0){
				
					count++;
				
				} 
			
			}
			if(count==2){
                      
                                        System.out.print(i+"  ");
                                }
		
		
		}
           System.out.println();

 }
}
*/

