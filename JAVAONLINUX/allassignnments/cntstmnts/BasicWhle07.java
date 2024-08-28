/*
//Q1)write a code to print chharacter value for ascii  value in range of 90-65
class one{

	public static void main(String[]args){
	        int i=90;
		while(i>=65){
		
			System.out.print((char)i+"  ");
			
			
			i--;
		
		}
		System.out.println();

	
	}
}
*/
/*
//Q2) write a code to print a number s divisible by 5 in the range of 50 -10;
class two{

	public static void main(String[]args){
	
            int i=50;
            while(i>=10){
	    
		    if(i%5==0){
		    
			    System.out.println(i);

		    }
	         i--;
	    }



	}

}
*/
/*
//Q.3)write a code to print a numbers divisible by 4 and 7 in the range 50 -100


class three{

        public static void main(String[]args){

            int i=50;
            while(i<=100){

                    if(i%4==0 && i%7==0){

                            System.out.println(i);

                    }
                 i++;
            }



        }

}
*/
/*
//Q4)write s code to print a square of first ten natural numbers in reverse order
class four{

	public static void main(String[]args){
	
		int i=10;
		
		while(i>=1){
		
			System.out.println(i*i);
			i--;

		}
	
	}

}
*/
/*
//Q5)write a program too print a ountdown of days  to submit the assignment
import java.io.*;

class five{

	public static void main(String[]args)throws IOException{
	
		BufferedReader  br =new BufferedReader(new InputStreamReader(System.in));
                int N=Integer.parseInt(br.readLine());
		
		while(N>=0){
		     
			if(N>=1){
			System.out.println(N+"Days remaining");
			}else{
			
				System.out.println(N+"Days Assingment is overdue");
			}
			N--;


		
		}
	
	}

}
*/
/*
//Q6)Write a code to print all consonants  alphabet from A to Z , but there must not be any vowels int output
class six{

        public static void main(String[]args){

               
                int N=65;

                while(N<=90){

                        if((N!=65&&N!=69&&N!=73&&N!=79&&N!=85)){

                        
				System.out.print((char)N+" ");
			}
                        N++;



                }
		System.out.println();


        }

}
*/
/*
//Q7)write a code to print a cube of first 10 natural numbers 
class seven{

	public static void main(String[]args){
	
		int i=1;
		while(i<=10){
		
          	    System.out.print(i*i*i+"  ");
                    i++;

		}
		System.out.println();

	
	}
}
*/
/*
//Q8)write a program where you have to print  sum of  integer from 90 to 11
class eight{

	public static void main(String[]args){
	        int sum=0;

		int i=90;
		while(i>=11){
			sum=sum+i;
			i--;
		}
		System.out.println(sum);


	
	}

}
*/
/*
//Q9)write a code to print  sum of odd nummbers from 150 -101
class nine{

        public static void main(String[]args){
                int sum=0;

                int i=150;
                while(i>=101){
			if(i%2==1){
                        
				sum=sum+i;
                         }
                        i--;
                }
                System.out.println(sum);



        }

}
*/
/*
//Q10)write a code to print the number in the range 100-24 which are divisible by 4&5
class ten{

	public static void main(String[]args){
	
		int i=100;
		while(i>=24){
		
			if(i%4==0&&i%5==0){
			
				System.out.println(i);
				

			}
			i--;

		
		}
	
	
	
	}

}
*/
























