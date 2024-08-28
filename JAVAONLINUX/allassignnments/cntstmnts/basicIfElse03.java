/*
//1)check whether the given number is positive or negative
import java.util.*;
import java.io.*;

class one{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number");
		int N=Integer.parseInt(br.readLine());
                if (N>=0){
		
			System.out.println("The number is positive ");
		} else{
		
			System.out.println("The number is negative ");

		}
	
	}

}
*/
/*
//2)write a program to check given number is even or odd
import java.util.*;
import java.io.*;
class two{

	public static void main(String[]args)throws IOException{ 

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number");
                int N=Integer.parseInt(br.readLine());
                if (N%2==0){

                        System.out.println("The number is EVEN ");
                } else{

                        System.out.println("The number is ODD ");

                }

        }
	
}
*/
/*
//3)write a program to check given number is even or odd and also checked whether the number is greater than 10 or not
import java.util.*;
import java.io.*;
class three{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number");
                int N=Integer.parseInt(br.readLine());
                if (N%2==0){
                       if(N>10){
		       
			       System.out.println("Thenumber is EVEN and Greater than 10");
		       } else if(N==10){
		       
			       System.out.println("The number is EVEN and equal to 10");

		       } else{
		       
			       System.out.println("The number is EVEN and Less Than 10");
		       }
                        
                } else{

                        if(N>10){

                               System.out.println("The number is ODD and Greater than 10");
                       } else if(N==10){

                               System.out.println("The number is ODD and equal to 10");

                       } else{

                               System.out.println("The number is ODD and Less Than 10");
                       }

                }

        }

}
*/
/*
//4)Write a program to check whether the given  character  is in UPPERCASE or in LOWERCASE
import java.util.*;
import java.io.*;

class four {

	public static void main(String[]args)throws IOException{   
   		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number");
                char N; 
	       	N=(char)br.read();

		if(65>=N && N<=90){
		
			System.out.println(N+" is UPPERCASE charactor ");		
		} else{
		
		
			System.out.println(N+" is LOWERCAS character  ");

		}


	
	
	}
}
*/
/*
//5) write a program to check whether the number is divisible by 7 or not 
import java.util.*;
import java.io.*;
class five{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number");
                int N=Integer.parseInt(br.readLine());
		if(N%7==0){
		
			System.out.println(N+" is DIVISIBLE by 7");
		
		}else{
		
			System.out.println(N+" is  NOT DIVISIBLE by 7");
		}
 }
}
*/
/*
//6)write a program to check whether the number is divisible by 3 or 7
import java.util.*;
import java.io.*;
class six{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number");
                int N=Integer.parseInt(br.readLine());
                if(N%7==0||N%3==0){
                        if (N%3==0){
			
				System.out.println(N+" is DIVISIBLE by 3 ");
			} else{
				System.out.println(N+" is DIVISIBLE by  7");
			
			}
                        

                }else{

                        System.out.println(N+" is  neither DIVISIBLE by 3 nor by 7");
                }
 }
}
*/
/*
//7)write a code to find a maximum number between two distinct number 
import java.util.*;
import java.io.*;

class seven{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the first  number");
                int N1=Integer.parseInt(br.readLine());
                System.out.println("Enter the second  number");
                int N2=Integer.parseInt(br.readLine());
		if (N1>N2){
		
			System.out.println(N1+" is greater than "+N2);
		
		}else{
		
			System.out.println(N2+" is greater number than "+ N1);

		}

	}
}
*/
/*
//8)write a program to check  if the given number  is divisible by 2,5,10 or not ,if not then print a mesage"Is not  divisible By 2,5,10"
import java.util.*;
import java.io.*;

class eight{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the first  number");
                int N=Integer.parseInt(br.readLine());
                if(N%2==0 && N%5==0 && N%10==0){
		
			System.out.println("The number is divisible by 2,5,10 ");
		
		}else{
		
			System.out.println("The number is not divisible by 2,5,10");
		}

        }
}
*/
/*
//9)Write aprogram to  check the day  number(1-7) and print the corresponding day of week .
import java.util.*;
import java.io.*;

class nine{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the first  number");
                int N=Integer.parseInt(br.readLine());

                if (N==1){

                        System.out.println("Monday");

                }else if(N==2){

                        System.out.println("Tuesday");

                }else if(N==3){
		
			System.out.println("Wednesday");
		} else if(N==4){
		
			System.out.println("Thursday");
		}else if(N==5){
		
			System.out.println("Friday");
		}else if(N==6){
		
			System.out.println("Saturday");
		}else if(N==7){
		
			System.out.println("Sunday");
		}else{
		
			System.out.println("Day number must be between 1 to 7");
		
		}

        }
}
*/
/*
 ////9)Write aprogram to  check the month  number(1-12) and print the corresponding month of year
import java.io.*;
import java.util.*;

class ten{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the first  number");
                int N=Integer.parseInt(br.readLine());

                if (N==1){

                        System.out.println("January");

                }else if(N==2){

                        System.out.println("february");

                }else if(N==3){

                        System.out.println("March");
                } else if(N==4){

                        System.out.println("April");
                }else if(N==5){

                        System.out.println("May");
                }else if(N==6){

                        System.out.println("June");
                }else if(N==7){

                        System.out.println("Jully");
                }else if(N==8) {
		
			System.out.println("August");
		
		}else if(N==9){
		
			System.out.println("September");
		}else if (N==10){
		
			System.out.println("October");
		
		}else if(N==11){
		
			System.out.println("November");
		}else if(N==12){
		
			System.out.println("December");
		}else{

                        System.out.println("Month number must be between 1 to 12");

                }

        }
}
*/


