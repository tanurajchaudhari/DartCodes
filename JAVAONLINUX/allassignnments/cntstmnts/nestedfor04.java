/*
//Q.1)Write aproggram to print a following pattern
//C2W10
//C2W9 C2W8
//C2W7 C2W6 C2W5
//C2W4 C2W3 C2W2 C2W1
//


class one{
    
	public static void main(String[]args){
	
	int row=4;
        int N=10;
	for(int i=1;i<=row;i++){
	
	 for(int j=1;j<=i;j++){
	 
	  System.out.print("C2W"+N+" ");
	  N--;

	 
	 
	 }
	System.out.println();

	
	
	
	}
	
	
	}

}
*/
/*
//Q.2)Write aproggram to print a following pattern
//1
//3  4
//6  7  8
//10 11 12  13
//15 16 17  18  19
class two{

  public static void main(String[]args){
  int row=5;
  int N=1;
  for(int i=1;i<=row;i++){
  
    for(int j=1;j<=i;j++){
    
     System.out.print( N+"  ");
     N++;
    
    
    }
    System.out.println();
    N++;

  
  
  }

  
  
  
  
  }

}
*/

/*
//Q.2)Write aproggram to print a following pattern.
//10
//10  9
//9   8  7
//7   6  5  4
//
class three{


   public static void main(String[]args){
   
   int N=10;
	  
   for(int i=1;i<=4;i++){
   
     for(int j=1;j<=i;j++){
     
          System.out.print(N+"  ");
          N--;

     
     } 
     System.out.println();
     N++;
         
   
   }
   
   
   
   }

}
*/
/*
//Q.4)Write aproggram to print a following pattern
//1  2  3  4
//2  3  4
//3  4
//4
//
class four {

  public static void main(String[]args){
  
  for(int i=1;i<=4;i++){
    for(int j=i;j<=4;j++){
    
    System.out.print(j+"  ");
    
    
    
    }
    System.out.println();



  
  
  
  }


} 
}
*/

/*
//Q.5)Write aproggram to print a following pattern.
//
//A  B  C  D
//B  C  D
//C  D
//D
//

class five{
   public static void main(String[]args){
   
   char ch='A';

   for(int i=1;i<=4;i++){
     char temp=ch;

     for(int j=i;j<=4;j++){
     
      System.out.print(temp+" ");
      temp++;

     
     } 
     System.out.println();
     ch++;

   
   
   }
   
   
   }


} 
*/

/*
//Q.6)Write a proggram to print a following pattern.
//1
//2  3
//3  4  5
//4  5  6  7
//
//

class six{
    public static void main(String[]args){
    
    for(int i=1;i<=4;i++){
     int temp=i;
     for(int j=1;j<=i;j++){
       
	System.out.print(temp++ +"  ");
        
     
     
     }
     System.out.println();    
    }  
    
    
    
    }

} 
*/

/*
//Q.7)Write aproggram to print a following pattern.
//F
//E  1
//D  2  E
//C  3  D  4
//B  5  C  6  D
//A  7  B  8  C  9
//
class seven{

   public static void main(String []args){
   int N=1;
   char ch='F';

   int row=6;

   for(int i=1;i<=row;i++){
     char temp1=ch;
     //int temp2=N;

     for(int j=1;j<=i;j++){
      
      if(j%2==1){
      
       System.out.print(temp1+" ");
       temp1++; 
      } else{
      
	  System.out.print(N+"  ");    
          N++;
      
      }
     
     
     }
    System.out.println();
    ch--;
    //N++;
   
   }
   
   
   }

}
*/


//Q.8)Write aproggram to print a following pattern.
//
//
//10
//I   H
//7   6   5
//D   C   B   A
//
/*
class eight{

   public static void main(String[]args){
   
   int N=10;
   char ch='I';
   for (int i=1;i<=4;i++){
     for (int j=1;j<=i;j++){
     
      if(i%2==1){
       System.out.print(N+"  ");
       N--;

      
      } else{
      
      System.out.print(ch +" "  );
       ch--;

      
      }
     
     
     } 
     if(i%2==1){
      
     N=N-2;
     
     } else{
     //  System.out.print("/n after 1 minus  "+ ch );
       ch--;
       //System.out.print("after 2 minus  "+ ch );
       ch--;
       //System.out.print("after 3 minus  "+ ch );
       ch--;
       //System.out.print("after 4 minus"+ ch );


     
     }
     
     System.out.println();
   
   }
   
   
   }

}
*/

/*
//Q.9)Write aproggram to print a following pattern.
//1
//8  9
//27 16  125
//64 25  216  49
//
class nine{

  public static void main(String[]args){
  
  for(int i=1;i<=4;i++){
     int temp=i;
    for(int j=1;j<=i;j++){
    
    if(j%2==1){
      System.out.print(temp*temp*temp+"  ");
      temp++;

    } else{
      System.out.print(temp*temp +"  ");
      temp++;
    }
    
    }
    System.out.println();
  }
  
  }


}
*/

//Q.10)Write aproggram to print a following pattern.
//1
//8  9
//9  64  25
//64 25  216  49
//
class ten{

  public static void main(String[]args){
  
  for(int i=1;i<=4;i++){
       int temp=i;
	  for(int j=1;j<=i;j++){
	  
	  if(i%2==0){
	     if (j%2==0){ 
	      System.out.print(temp*temp+"  ");
	       temp++;
	     } else{
	       System.out.print(temp*temp*temp+"  ");
	       temp++;
	     }

	  
	  } else{
	  
		  if(j%2==1){
		    System.out.print(temp*temp+"  ");
		    temp++;
		  
		  
		  } else{
		   System.out.print(temp*temp*temp+"  ");
		   temp++;
		   
		  }
	  
	  
	  }
	  
	  
	  }
   System.out.println();

  
  }
  
  
  }

}
