/*
//1)write a code to check whether the given number is in range of 1 to 1000 or not
import java.io.*;
import java .util.*;
class one{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int N=Integer.parseInt(br.readLine());
                if(N>0&&N<=1000){
		
			System.out.println(N+" is in the range of 1 to 1000");
		
		}else {
		
			System.out.println(N+" is not in the rangge of 1 to 1000");
		}



	}

}
*/
/*
//2) write a program to check whether the given number is in the table of 13 or not.
import java.io.*;
import java .util.*;
class two{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the number");
                int N=Integer.parseInt(br.readLine());
                if(N%13==0){

                        System.out.println(N+" is in the table of 13");

                }else {

                        System.out.println(N+" is not in the table of 13");
                }



        }

}
*/

/*
//3)write a program to check whether the given character is a vowel or consonant
//
import java.io.*;
import java .util.*;
class three{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the character");
               //char N;
               char N=(char)br.read();
                if(N==97){

                        System.out.println(N+" is a vowel ");

                }else if(N==101){
		
			System.out.println(N+" is a vowel ");

		} else if(N==105){
		
			System.out.println(N+" is a vowel ");
		}else if(N==111){
		
			System.out.println(N+" is a vowel ");
		}else if (N==117){
		
			System.out.println(N+" is a vowel ");
		}else if (N==65){
		
			System.out.println(N+" is a vowel ");
		}else if(N==69){
		
			System.out.println(N+" is a vowel ");
		}else if(N==73){
		
			System.out.println(N+" is a vowel ");
		
		}else if (N==79){
		
			System.out.println(N+" is a vowel ");
		}else if(N==85){
		
			System.out.println(N+" is a vowel ");
		}else {

                        System.out.println(N+" is a consonant");
                }



        }

}
*/
/*
//4) A student passed his exam in 12 th standard and  he thinks that he might get marks upto  85 percentage . Suggest the better carrer field depending upon the marks assumption

import java.io.*;
import java .util.*;
class four{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the number");
                float N= Float.parseFloat(br.readLine());
                if(N>85.0f){

                        System.out.println("Medical ");

                }else if(N>=75&&N<=85){

                        System.out.println(" Engineering");
                }else if(N>=65&&N<75){
		
		
			System.out.println("Pharmacy or Bachelor in science ");
		
		}else{
		
			System.out.println("Do what u want and enjoy your life ");
		}



        }

}
*/
/*
//5) write a program to check whether the given  float value is divisible 6 or not
import java.io.*;
import java .util.*;
class five{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the number");
                float N= Float.parseFloat(br.readLine());
                if(N%6==0){

                        System.out.println(N+" is divisible by 6 ");

                }else{
                    
                        System.out.println(N+" is not divisible by 6 ");
                }



        }

}
*/

/*
//6) write a code to check whether the age of voteris valid or not
import java.io.*;
import java .util.*;
class six{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the number");
                float N= Float.parseFloat(br.readLine());
                if(N>=18){

import java.io.*;
import java .util.*;
class four{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the number");
                float N= Float.parseFloat(br.readLine());
                if(N>85.0f){

                        System.out.println("Medical ");

                }else if(N>=75&&N<=85){

                        System.out.println(" Engineering");
                }else if(N>=65&&N<75){


                        System.out.println("Pharmacy or Bachelor in science ");

                }else{

                        System.out.println("Do what u want and enjoy your life ");
                }



        }

}                        System.out.println("Valid age for voting ");

                }else if(N<=0  ){

                        System.out.println(" Invalid age");
                }else{


                        System.out.println("not aplicable for voting ");

                }



        }

}
*/
/*
//7)Calculate profit Loss
import java.io.*;
import java .util.*;
class seven{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the cost price");
                float Cp= Float.parseFloat(br.readLine());
                System.out.println("Enter the Selling price");
                float Sp= Float.parseFloat(br.readLine());
                if(Sp>Cp){

                        System.out.println("Profit : "+(Sp-Cp));

                }else if(Sp<Cp){

                        System.out.println("Loss :"+(Cp-Sp));
                }else{


                        System.out.println("NA NAFA NA TOTA ");

                }



        }

}
*/
/*
//8)write a program to check whether the stident passed with first class with distinction,irst class ,second class, pass and failed
import java.io.*;
import java .util.*;
class eight{ 

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the number");
                float N= Float.parseFloat(br.readLine());
                if(N>=75){

                        System.out.println("first class with distinction ");

                }else if(N>=60){

                        System.out.println(" first class");
                }else if(N>=50){


                        System.out.println(" Second class  ");

                }else if(N>=35){

                        System.out.println(" Pass ");
                }else{
		
			System.out.println("Failed ");
		}



        }

}
*/

//9) write a program to check the three numbers are pythagorian triplets or not 
import java.io.*;
import java .util.*;
class nine{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the first number");
                float a= Float.parseFloat(br.readLine());
                System.out.println("Enter the second number");
                float b= Float.parseFloat(br.readLine());
                System.out.println("Enter the third number");
                float c= Float.parseFloat(br.readLine());
                if ((a*a+b*b)==c*c){
		
			System.out.println("Yes its pythagorian triplets ");
		} else if((a*a+c*c)==b*b){
		
			System.out.println("Yes its pythagorian triplets");
		
		}else if((b*b+c*c)==a*a){
		
			 System.out.println("Yes its pythagorian triplets");
		}else{
		
			 System.out.println("No its not  pythagorian triplets");
		
		}

                

	}
}		
