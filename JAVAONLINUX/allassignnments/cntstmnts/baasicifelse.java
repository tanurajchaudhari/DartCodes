/*
import java.io.*;


class one {
      public static void main(String [] args ) throws IOException {
      
     BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
     System.out.println("enter  youor  number :- ");


     int  str = Integer.parseInt( br.readLine()) ;

    

      //int var=10;
     if (str%2==0) {
         System.out.println(" the number "+ str + " is even number  " );

     
     }
     else {
     
       System.out.println("the number "+str+ " is  odd nmber ");

     
     }
      
      }


}
*/

/*
import java .io.*;
class two {
  public static void  main(String [] args ) throws IOException { 

     BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));

     System.out.println("Enter  your number :- ");
     int var =Integer.parseInt(br.readLine());
     if(var> 10){
       System.out.println(var +" is greater than 10");
     }
     else if(var<10){
       System.out.println(var+" is lesser than 10");
     }
     else{
     System.out.println(var + " is  equal to 10");
     }
  
  }

}
*/

/*
import java .util.Scanner ;

import java.io.*;
class three{
      public static void main(String [] args)throws IOException {
      
        Scanner sc =new Scanner (System.in);
	System.out.println("Enter th number:-  ");
	 float number = sc.nextFloat();
	if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        
      }
}
*/
/*
import java .util.Scanner;


class four {
      public static void main(String [] args){
           Scanner sc=new Scanner (System.in) ;
           System.out.println("enter  the number:- ");
           int number = sc.nextInt()	;
	   if ( 0 <= number && number <= 5){
	       if (number==0){
	       System.out.println("Zero");
	       } else if(number==1){
	       System.out.println(" One");
	       } else if(number==2){
	       System.out.println("Two");
	       } else if(number==3){
	       System.out.println(" Three");
	       } else if(number==4){
	       System.out.println("Four");

	       }else{
	       System.out.println("five ");
	       }
	   
	   }else if (number >5){
	   
	    System.out.println("the number is greater than 5");
	   } else{
	     System.out.println("number is lesser than 0");
	   
	   }   
 
      }
} 

*/
/*
import java.util.Scanner;
class five{
 public static void main(String [] args){
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter the month number :- ");
   int number = sc.nextInt();
   if (number >12 && number <1){
     if (number >12){
     System.out.println("Invalid Months");
     

      }else{
       System.out.println("month never be  zero and negative ");
       
      }
   }else {
               
            if (number == 1){
		    System.out.println("january has 31 days") ;
	     
	    }else if( number ==2) { 
             System.out.println("February  has 28 or 29 days");
	    
                   
            }else if( number ==3){
	     System.out.println("march has 31 days");
	     
	    } else if( number ==4){
             System.out.println("April has 30 days");
             
            }else if ( number == 5){
	     System.out.println(" may has  31 days");
	     
	    }else if( number ==6){
             System.out.println("Jun has 30 days");
             
            }else if (number == 7){
	     System.out.println("jully has 31 days");
	     
	    }else if( number == 8){
             System.out.println("August has 31 days");
              
            }else if (number==9){
	    System.out.println(" September has 30 days ");
	    
	    }else if( number ==10){
             System.out.println("October has 31 days");
            
            }else if( number ==11){
             System.out.println("November  has 30 days");
             
            }else if( number ==12){
             System.out.println("December has 31 days");
             

            }
      
      }
   
   }
 
 }

*/

/*

import java.util.Scanner;


class six {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number:- ");
	int first=sc.nextInt();
	System.out.println("Enter the second number:- ");
	int second =sc.nextInt();
        System.out.println("Enter the third number:- ");
	int third = sc.nextInt();


	if(first>=second){

		if (first >=third){
		   System.out.println(first+" is largest number ");
		
		}
	   
	
	
	
	} else {
	     if(second >=third){
	       System.out.println(second +"is largest number");
	     }else{
	      System.out.println(third+"is largest number");
	     }
	
	}
     
     
     }



} 
*/


/*
import java .util.Scanner;
class seven{

     public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
	System.out.println("enter cost price :- ");
	float cost=sc.nextFloat();
	System.out.println("Enter selling price :-");
	float selling =sc.nextFloat();
	if (selling>cost){
	      float ans =selling -cost;
	      System.out.println("profit :- "+ ans);
	
	} else if (cost>selling){
	 float ans =cost-selling;
	 System.out.println("loss:- "+ ans);

	} else{
	     System.out.println("no loss and no profit in these trade ");
	}
     
     }

}



/*
import java.util.Scanner;
class eight{
  public static void main(String [] args){
    Scanner sc= new Scanner (System.in);
     System.out.println ("Enter the number :- ");
     int day=sc.nextInt() ;
    if(day<1&&day>7){
     System.out.println("Invallid nummber");

    } else  {
        if (day==1){
	 System.out.println("Monday");
	
	} else if(day ==2){
	  System.out.println("Tuesday");
	
	} else if(day==3){
	 System.out.println("Wednesday");
	
	} else if(day==4){
	 System.out.println("Thursday");
                 
	} else if(day==5){
	 System.out.println("Friday");

	} else if(day==6){
	  System.out.println("Saturday");
	} else if(day==7){
	 System.out.println("Sunday");
	}
    
    
    }   
  
  }

}


*/
/*
import java.util.Scanner;

class nine{
  public static void main(String [] args){
  
  Scanner sc =new Scanner (System.in);
  System.out.println("Enter the first number :- ");
  float a=sc.nextFloat();
   System.out.println("Enter the second number :- ");
  float b=sc.nextFloat();
   System.out.println("Enter the third number :- ");
  float c=sc.nextFloat();
  if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==b*b+a*a ){
      System.out.println("it is pythagorian triplet");
  } else{
     System.out.println("it is not pythagorian triplet");
  }
  
  }

}
*/
import java.io.*;

class ten  {
   public static void main(String [] args )throws IOException{
       
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           //System.out.println("Enter the day for your gym schedule:- ");
	   //String day =br.readLine();
	   System.out.println("There are two approaches of 1) Three day split and 2) Five days split  ");
	   System.out.println("Enter "+" 1 "+" for first aproach and Enter "+"2"+ "for second approach");
	   int approach = Integer.parseInt(br.readLine());
	   //System.out.println("Enter the day for your gym schedule:- ");
           //String day =br.readLine();
                            
	   if (approach==1){
	   
	      System.out.println("*****************************************Welcome to three days split approach****************************");
	      System.out.println("Enter the day for your gym schedule:- ");
              String day =br.readLine();
	         /*if(day=="Monday"||day=="Thursday"){
		   System.out.println ( "Monday is your push day"  );
		   System.out.println ( "Push day contain following workouts"  );
		   System.out.println ( "1)Inclain Bench Press ( 4 sets 10-16 reps/n 2)alt doumble Skullcrusher)"  );
		   System.out.println ( "Monday is your push day"  );
		 
		 }*/
	         switch(day){
		 
		   case"Monday":
			    System.out.println ( "Monday is your push day"  );
                            System.out.println ( "Push day contain following workouts"  );
                            System.out.println ( " 1)Inclain Bench Press ( 4 sets 10-16 reps) \n\r 2)alt doumble Skullcrusher\n\r3),Twisted Front Raises(4 sets of 10-16 reps)\n\r4)Hex Press(Modified)(3 sets of 6-10 reps)\n\r5)DB standing fly(3 sets of12-16 reps)\n\r6)diamond push ups(3sets of 10-15 reps ))"  );
		             break;
                 
		   case"Tuesday":
			      System.out.println("Tuesday is your pull dya\n\r Pull day contains folowing workouts\n\r 1)barbel Row(4 sets 6-12reps)\n\r2)Double Hammer curl(4 sets of 6-12 reps )\n\r3)reverse curl(reverse curl()3 ste of 6-12 rep\n\r4)concentration curl(3 sets of 8 -16 reps)\n\r5)Single arm row(3 sets of 8-10 reps per arm)\n\r6) Incline wide curl (3 sets of 6-8 reps )");

                               

			     break;

	          case"Wednesday":
			     System.out.println ( "Wednesday is your leg day"  );
                             System.out.println ( "leg day contain following workouts"  );
			     System.out.println("1)Barbel hip trust(4 sets of 6-10 reps )\n\r2)Barbel squat (Heel elevated )(4 sets of 6-12 reps )\n\r3)Seated calf raises(elevated )(3 sets of 12-15 reps)\n\r4) DB Side lunges(3sets of 16 reps )\n\r5)single dumble bulgarian squats(3 sets of 8 reps )") ;  
			     break;

		  case"Thursday":
                            System.out.println ( "Thursday is your push day");
                            System.out.println ( "Push day contain following workouts");
                            System.out.println ( "1)Inclain Bench Press ( 4 sets 10-16 reps) \n\r 2)alt doumble Skullcrusher\n\r3),Twisted Front Raises(4 sets of 10-16 reps)\n\r4)Hex Press(Modified)(3 sets of 6-10 reps)\n\r5)DB standing fly(3 sets of12-16 reps)\n\r6)diamond push ups(3sets of 10-15 reps ))"  );
			     break;


		 case"Friday":
			      System.out.println("Fryday your pull dya\n\r Pull day contains folowing workouts\n\r 1)barbel Row(4 sets 6-12reps)\n\r2)Double Hammer curl(4 sets of 6-12 reps )\n\r3)reverse curl(reverse curl()3 ste of 6-12 rep\n\r4)concentration curl(3 sets of 8 -16 reps)\n\r5)Single arm row(3 sets of 8-10 reps per arm)\n\r6) Incline wide curl (3 sets of 6-8 reps )");
                             
			     break;

	       case"Saturday":
                              System.out.println ( "Saturday is your leg day"  );
                             System.out.println ( "leg day contain following workouts"  );
                             System.out.println("1)Barbel hip trust(4 sets of 6-10 reps )\n\r2)Barbel squat (Heel elevated )(4 sets of 6-12 reps )\n\r3)Seated calf raises(elevated )(3 sets of 12-15 reps)\n\r4) DB Side lunges(3sets of 16 reps )\n\r5)single dumble bulgarian squats(3 sets of 8 reps )");
			     break;
			     
	     case"Sunday":
			     System.out.println("Sunday is the REST DAY ") ;
			     break;
             default:
			System.out.println("No match");

	   }
	       
	       
	   } else{
               System.out.println("*****************************************Welcome to five  days split approach****************************");                System.out.println("Enter the day for your gym schedule:- ");                                                                                   String day =br.readLine();

               switch(day){
	         case"Monday":
			 System.out.println("Monday: Chest and Triceps\n\r* Bench Press\n\r* Incline Dumbbell Press\n\r* Tricep Pushdowns\n\r* Dumbbell Flyes\n\r* Skull Crushers");
	                 break;
                 
                case"Tuesday":
	       
		
		       System.out.println("Tuesday: Back and Biceps\n\r* Pull-Ups\n\r* Barbell Rows\n\r* Lat Pulldowns\n\r* Bicep Curls\n\r* Hammer Curls");
	               break;

		 case"Wednesday":
		       System.out.println("Wednesday: Legs\n\r* Squats\n\r* Leg Press\n\r* Hamstring Curls\n\r* Calf Raises\n\r* Lunge");
		       break;

		 case"Thursday":
		       System.out.println("Thursday: Shoulders and Abs\n\r* Shoulder Press\n\r* Lateral Raises\n\r* Front Raises\n\r* Reverse Flyes\n\r* Planks\n\r* Leg Raises");
		       break;

		 case"Friday":
		        System.out.println("Full Body or Weak Points\n\r* Deadlifts\n\r* Squats (lighter)\n\r* Pull-Ups\n\r* Push-Ups\n\r* Farmer's Walk\n\r* Any lagging muscle group exercises");
		       break;
                case"Saturday":
		       System.out.println(" Cardio and Core\n\r* Running or Cycling: 30-45 minutes\n\r* Mountain Climbers: 3 sets of 1 minute\n\r* Bicycle Crunches: 3 sets of 20 reps (each side)\n\r* Hanging Leg Raises: 3 sets of 12-15 reps\n\rSit-Ups: 3 sets of 15-20 reps");
		       break;
                case"Sunday":
		       System.out.println(" Rest and Recovery\n\r Rest: No intense workouts. Focus on stretching, foam rolling, or light activities like walking or yoga");
		       break;


	       
	       }
       
       
    }
 }
}
