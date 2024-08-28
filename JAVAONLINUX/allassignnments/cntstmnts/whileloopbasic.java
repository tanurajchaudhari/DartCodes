//simple while 1
////solve all the progrsm while loop
//again solve the Programs using for loop
/*
//Q. write a program to print a table of 2.
import java.util.Scanner;
class one{
    	public static void main(String[]args){
	int a=2;
	//for print table of any number 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number :- ");
	int b=sc.nextInt();
        
	int i=1;
	while(i<=10){
	System.out.println(b+"*"+i+"="+i*b);
	i++;
      	} 
        System.out.println("By using for loop");

          for(int j=1;j<=10;j++){
          System.out.println(b+"*"+j+"="+j*b);

        }
	
	
	}




}
*/
/*
//Q. write a program to calculate the factorial of th given number
//

//importing Scanner class  
import java.util.Scanner;  
  
class two {  
    public static void main(String[] args) {  
       Scanner sc=new Scanner(System.in);
       int i=1;
       int fact =1;
       System.out.println("Enter the number which you want to find the factorial ");
       int b=sc.nextInt();
       while(i<=b){
         fact=fact*i;
	 i++;

       
       }
       System.out.println("Factorial is : - "+fact);
       System.out.println("Using for loopbelow");
       int fact1=1;
       for (int j=1;j<=b;j++){
         fact1=fact1*j;



       }
       System.out.println("Factorial is :- "+ fact1);
       


  }
}
*/
/*
//Q. write a program to count the digits of the given number
import java.util.Scanner;
class three{
   public static void main(String[] args ){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number :- ");
   int num=sc.nextInt();
   int count=0;

   while(num!=0){
     int rem=num%10;
     //System.out.println(num);
     
     num=num/10;
     System.out.println(num);

     count++;



   }
  System.out.println("The count is   "+ count);

   }


}
*/

/*
//Q.write  aprogra to cpunt the odd digits of the given number
import java.util.Scanner;
class four{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number :- ");
      int N=sc.nextInt();
      int  N1=N;
      //System.out.println(N);
      int count=0;
      while(N!=0){
        int rem=N%10;
	if(rem%2==1){
	  count++;
	}
       
	N=N/10;
         
      } 
      System.out.println("the count is : "+ count);
      System.out.println("By using for loop ");
      /*
      System.out.println(N1);
      int count1=0;
      
      
      for(  ;N1>0;  ){
      int rem1=N1%10;
      if(rem1%2==1){
        count1++;
      }
      N1=N1/10;

      } 
       
    }

}
*/
/*
//write a program to  [rint  a square of even didgit in the given number 
import java.util.Scanner;
class five {
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number :- ");
      int N=sc.nextInt();
      int  N1=N;
      //System.out.println(N);
      int count=0;
      while(N!=0){
        int rem=N%10;
	if(rem%2==0){
           System.out.println("Sqaure of "+rem+" "+ rem*rem);
        }

        N=N/10;

      }
    
    }

}
*/

/*
//Q.write a code to print sum of all even numbers and multiplication of all od numbers 
import java.util.Scanner;
class six {
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number :- ");
      int N=sc.nextInt();
      int i=1;
      int sum=0;
      int mul=1;

      while (i<=N){
        if(i%2==0){
	  sum=sum+i;

	
	} else{
	mul=mul*i;
	}
      
       i++;
      }
      System.out.println("Sum of even numbers between 1 to 10 = "+sum);
      System.out.println("Multiplication  of even numbers between 1 to 10 = "+mul);



     int sum1=0;
    int mul1=1;

    System.out.println("By using for loop ");
    for(int j=1;j<=N;j++){
    if(j%2==0){
      sum1=sum1+j;
    } else{
      mul1=mul1*j;
    }

    }
     System.out.println("Sum of even numbers between 1 to 10 = "+sum1);
     System.out.println("Multiplication  of even numbers between 1 to 10 = "+mul1);
    } 
    
}
*/

/*
//Q.7)wrute s code which take a number from users if number is even  print that number iin reverse order or if number is odd print that number in reverse  irder by difference  two.
import java.util.Scanner;
class seven{
  public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number :- ");
      int N=sc.nextInt();
      if(N%2==0){
      
       while(N>0){
          System.out.print(N+" ");
	  N--;

       
       } 
      
      } else{
          while(N>0 ){
            System.out.print(N+" ");
            N=N-2;


          }
  }


      
  }
}

*/

/*
//Q.8) write a countdown to print the countdown  of days  to suubmit the asssignment
import java.util.Scanner;
class eight{
  public static void main(String[] args){
  
   Scanner sc=new Scanner(System.in);
   System.out.println(" Enter the  days remaining ");
   int N=sc.nextInt();
   if (N==0){
   System.out.println(N+" days assignment is overdue ");
   
   
   } else{
       while (N>=1){
       System.out.println(N+" day are reamining");
       N--;
       
       }
       if(N==0){
       System.out.println(N+" days assignment is overdue ");
       
       }
   
   }

  
  }

}
*/

/*
//Q.0write a program to reverse the given number.
import java.util.Scanner;
class nine{
    public static void main(String[] args ){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number:- ");
     int N=sc.nextInt();
     int temp=N;
     int rev=0;
     while(N!=0){
       int rem=N%10;
       rev=rev*10+rem;
       N=N/10;

     
     
     }
     System.out.println(temp+"after reverse:- "+rev);
    
    }

}
*/


//Q.10)wrute a program to check whether the number is palindrme number or not 
import java .util.Scanner;
class ten{

  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :- ");
    int N=sc.nextInt();
    int temp=N;
     int rev=0;
     while(N!=0){
       int rem=N%10;
       rev=rev*10+rem;
       N=N/10;



     }
    if (temp==rev){

    System.out.println(temp+" is pallindrome number");
    System.out.println(temp+"after reverse:- "+rev);
    
    }else{
    
    System.out.println(temp+" is not a pallindrome number");
    System.out.println(temp+"  after reverse:  "+rev);
    
    }

    }
  
  }


