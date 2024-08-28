/*
//Q.1)write a program in which student should enter marks of 5 different subjects.if all subject having above passing marks 
//add them and provide to switch case to print grades(first class second class). if student get failed in any subject program should print "you failed in exam"
import java.io.*;

class one{

 public static void main(String []args)throws IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	 int marathi_marks;
         System.out.println("Enter the marks of marathi subject:- ");
	 marathi_marks=Integer.parseInt(br.readLine());


	          int hindi_marks;
         System.out.println("Enter the marks of hindi subject:- ");
         hindi_marks=Integer.parseInt(br.readLine());

	          int english_marks;
         System.out.println("Enter the marks of english subject:- ");
         english_marks=Integer.parseInt(br.readLine());

	          int maths_marks;
         System.out.println("Enter the marks of maths subject:- ");
         maths_marks=Integer.parseInt(br.readLine());

	          int science_marks;
         System.out.println("Enter the marks of science subject:- ");
         science_marks=Integer.parseInt(br.readLine());
            

	 int total_marks=marathi_marks+hindi_marks+english_marks+maths_marks+science_marks;

	 if( marathi_marks<35||hindi_marks<35||english_marks<35||maths_marks<35||science_marks<35 ){
	 
	 System.out.println("You are failed in exam");
	 } else{
	 
	        float avg=(marathi_marks+maths_marks+english_marks+science_marks+hindi_marks)/5 ;
	        char ch;
		if(avg>75){
		 
			ch='A';
		}else if(avg>60){
		  
			ch='B';  
		}else if(avg>50){
		 
			ch='C';
		}else if(avg>40){
		 
			ch='D';
		}else if(avg>=35){
		
			ch='E';
		}else{
		
			ch='F';
		}
	    
		switch(ch){
		
			case'A':
				System.out.println("First clss with distinction");
			        break;

			case'B':
				System.out.println("first Class");
				break;
			case'C':
				System.out.println("Second class");
				break;
			case'D':
				System.out.println("Third class");
				break;
			case'E':
				System.out.println("Pass");
				break;
			case'F':
				System.out.println("fail" );
				break;

		
		
		
		}
	    
	    }
	 
	 
	 
	 
	 
	 }
 
 }

*/

/*
//Q.2) Write a  program in which ask the user to enter a nummber from 0 to 5 and print  its  spelling .if the entered number is greater than
//5 print entered number is greater than 5.
import java.io.*;

class two{



    public static void main(String []args)throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter the number bitween 0 and 5 :- ");
	    int n=Integer.parseInt(br.readLine());
	    if(n>5){
	    
		    System.out.println("Entered number is greater than 5 ");

	    } else{
	    
		    switch(n){
		    
			    case 0:
				    System.out.println("Zero");
				    break;

			    case 1:
				    System.out.println("One");
				    break;
			    
		            case 2:
				    System.out.println("Two");
				    break;
		            case 3:
				    System.out.println("Three");
				    break;
		       	    case 4:
				    System.out.println("Four");
				    break;
		           case 5:
				    System.out.println("Five");
				    break;
		           default:
				    System.out.println("number is negative");
				    break;

		    
		    }
	    
	    
	    }

    
    
    }
}

*/

/*
//Q.3) Write a program in which user should  enter two numbers .if both numbers are positive  muktiply them and provide to switch  case to verify number is even or odd . if user  enters any negative number  program should  terminate saying "sorry negative numbers not allowed".
import java.io.*;
class three{

  public static void main(String []args)throws IOException{
   
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the first number :-  ");
          int n1=Integer.parseInt(br.readLine());
	  System.out.println("Enter the Second number :-  ");
	  int n2=Integer.parseInt(br.readLine());
          int mul;
	  if (n1>=0 && n2>=0){
	    mul=n1*n2;

	    switch(mul%2){
	    
		    case 0:
			    System.out.println("The multiplication is even ");
			    break;
		    case 1:
			    System.out.println("The multiplication is odd");
			    break;

	    
	    }
		  
	  
	  } else{
	  
		  System.out.println("Negative number is not allowed ");

	  }

  
  }

} 
*/


/*
//Q.4)take choice from user show this to uswer
//
//whats your interest
//1.Movies 
//2.series
//Enter your choice1 or 2:
//if user enters 1:
//
//Movie you wish towatch today 
//1.Founder 
//2.Snowden
//3.Jobs
//4.Her
//5.Sociial Network
//6Wall-E
//7.AI
//
//
//Enter your choice:
//if user enter 2:
//
//Best series to watch 
//1.Silicon valley
//2.Dev
//3.the IT crowd
//4.Mr Robot
//
//
//print users choice
//
import java.io.*;

class four{
   public static void main(String []args)throws IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the choice  number which u want to see :-  ");
     System.out.println("1.Movies ");
     System.out.println("2.Series ");
     int n=Integer.parseInt(br.readLine());
     switch(n){
         case 1:{
           //  int wish;
	     System.out.println("Movie u wish  to watch today: -");
	     System.out.println("1.Founder");
	     System.out.println("2.Snowden");
	     System.out.println("3.jobs");
	     System.out.println("4.her");
	     System.out.println("5.Scocial Network");
	     System.out.println("6.Wall-E");
	     System.out.println("7.AI");
             System.out.println("Enter your choiced numbered in :- ");
             int wish=Integer.parseInt(br.readLine());
	       switch(wish){
	     
		     case 1:
			     System.out.println("You wishe too watch Founder");
			     break;
		     case 2:
			     System.out.println("You wishe too watch Snowden");
			     break;
		     case 3:
			     System.out.println("You wishe too watch jobs");
			     break;
                     
		     case 4:
			     System.out.println("You wishe too watch Her");
			     break;

		     case 5:
			     System.out.println("You wishe too watch Social Network");
			     break;

		     case 6:
			     System.out.println("You wishe too watch Wall-E");
			     break;

		     case 7:
			     System.out.println("You wishe too watch AI");
			     break;

		     default:
			     System.out.println("Invalid choice u Entered ");
	     
	        }
            }
            break;
	 case 2:{
	              
             System.out.println("Series u wish  to watch today: -");
             System.out.println("1.Sillycon valley");
             System.out.println("2.Devs");
             System.out.println("3.the IT crowd");
             System.out.println("4.Mr.RObot");
             int wish=Integer.parseInt(br.readLine());
                  switch(wish){
		  
		  
			  case 1:

				    System.out.println("You wishe too watch Sillycon Valley");
			            break;
                         case 2:
				    System.out.println("You wish to watch Devs ");
				    break;
		         case 3:
				     System.out.println("You wish to watch The IT crowds ");
				     break;
		         case 4:
				      System.out.println("You wish to watch Mr.Robot ");
				      break;
			default :
				       System.out.println("Invalid choice u entered ");
				       break;

		  
		  
		  }
	 
	   
	}

       break;

     

    default:
           System.out.println("Invalid choiced u entered ");
            break;
     }
   
   }

}
*/
//Q.5)Write a real time ime example which shows a index like above code 

import java. io.*;

class five{

	public static void main(String []args)throws IOException{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the choice  number which u want to choose your carrier:-  ");
         System.out.println("1.Medical ");
         System.out.println("2.Engineering");
         int n=Integer.parseInt(br.readLine());
	 switch(n){
         case 1:{
           //  int wish;
             System.out.println("Which type of doctor u will be in future -");
             System.out.println("1.Cardiolgy");
             System.out.println("2.Trauma ");
             System.out.println("3. Dermatology");
             System.out.println("4.Hematology");
             System.out.println("5.Endocrinology");
             System.out.println("6.Surgery");
             System.out.println("7.Oncology");
             System.out.println("Enter your choiced numbered in :- ");
             int wish=Integer.parseInt(br.readLine());
             
	       switch(wish){

                     case 1:
                             System.out.println("You wishe to be Cardiology Surgen");
                             break;
                     case 2:
                             System.out.println("You wishe to be Trauma Sergen");
                             break;
                     case 3:
                             System.out.println("You wishe to be Dermatology Sergen");
                             break;

                     case 4:
                             System.out.println("You wishe to be Hematology Sergen");
                             break;

                     case 5:
                             System.out.println("You wishe to be Endocrinology Sergen");
                             break;

                     case 6:
                             System.out.println("You wishe to be Surgery Surgen");
                             break;

                     case 7:
                             System.out.println("You wishe to Oncology Sergen");
                             break;

                     default:
                             System.out.println("Invalid choice u Entered ");

                }
	
	}
        break;
         case 2:{

             System.out.println("Which type of Engineering u want be in future :- ");
             System.out.println("1.Computer Engineering");
             System.out.println("2.IT Engineering");
             System.out.println("3.Electronic Engineering");
             System.out.println("4.Arinotical Engineering");
             int wish=Integer.parseInt(br.readLine());
                  switch(wish){


                          case 1:

                                    System.out.println("You wishe to be in future Computer Engineering");
                                    break;
                         case 2:
                                    System.out.println("You wish to be in future IT Engieering ");
                                    break;
                         case 3:
                                     System.out.println("You wish to be in future Electronic Engineering");
                                     break;
                         case 4:
                                      System.out.println("You wish to be a Aeronotical Engineering");
                                      break;
                        default :
                                       System.out.println("Invalid choice u entered ");
                                       break;



                  }


        }

       break;
      default:
        System.out.println("Invalid choiced u entered ");
         break;	 
	 
    }	 
  }
}
