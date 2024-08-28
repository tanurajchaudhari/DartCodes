/*
//Q.1) write a program to peint a following pattern
//C2W1 C2W2 C2W3
//C2W1 C2W2 C2W3
//C2W1 C2W2 C2W3
//C2W1 C2W2 C2W3
//
class one{
       
	public static void main(String []args){
       
        for (int i=1;i<=3;i++) {
	  


		for (int j=1;j<=3;j++){
		
		System.out.prinit("C2W"+j+" " );
		
		
		
		} 
		System.out.println();

	
	}   
       
       
       }
}
*/
/*
//Q.2)write a program to peint a following pattern
//4 4 4 4
//5 5 5 5
//6 6 6 6
//7 7 7 7
class two{
  
	public static void main(String[]args){
	
	for (int i=1;i<=4;i++){
	
	   for (int j=1;j<=4;j++){
	   
	   
	   System.out.print(i+3+" ");

	   
	   
	   } 
	   System.out.println();

	
	}
	
	
	}


}
*/
/*
//Q.3)write a program to peint a following pattern
//14 15 16 17
//15 16 17 18
//16 17 18 19
//17 18 19 20
//
class three{

	public static void main(String[]args){
	
	for (int i=1;i<=4;i++){
	
	 int n=14+i-1;
	  for (int j=1;j<=4;j++){
	  

	  System.out.print( n++ +"  " );

	  
	  
	  }
	  System.out.println();
          
	
	
	}
	
	
	
	}
} 
*/

/*
//Q.4)write a program to peint a following pattern
//1A 2B 3C
//1A 2B 3C 
//1A 2B 3C
//
//
class four{

  public static void main(String[]args){
  //char var='A';
  for(int i=1;i<=3;i++){
  
     char var='A'; 
    
     for (int j=1;j<=3;j++){
        System.out.print(j +""+ var++ +"  ");
     
     
     } 
     System.out.println();
  
  
  
  
  
  }
  
  
  }


}
*/

/*
//Q.5)write a program to peint a following pattern
//26 Z 25 Y
//24 X 23 W
//22 V 21 U
//20 T 19 S
class five {

  public static void main(String[]args){
  
  int n=26;
  char ch='Z';
  for(int i=1;i<=4;i++) {
  
    for(int j=1;j<=4;j++){
    if(j%2==1){
    
     System.out.print( n-- +"  " ); 
    
    } else{
    
    System.out.print(ch-- +" ");
    
    } 

    
    
    } 
    System.out.println();
  
  }
  
  }


} 
*/
/*
//Q.6)write a program to peint a following pattern
//1  4  9
//16 25 36
//49 64 81
//
class six{

 public static void main(String[]args){
 int n=1;
 
 for (int i=1; i<=3;i++){
 
   for (int j=1;j<=3;j++){
    
	 System.out.print(n*n+"  ");
	 n++;
   }
 System.out.println();
 
 } 
 
 
 }

} 
*/
/*
//Q.7)write a program to peint a following pattern
//1  2   9
//4  25  6
//49  8  81

class seven{

  public static void main(String[]args){
  
  int n=1;
  for (int i=1;i<=3;i++){
  
   for(int j=1;j<=3;j++){
   
   if(n%2==1){
   System.out.print(n*n+" " );
   n++;
   } else{
     System.out.print(n+" ");
     n++;
   }

     
   } 
   System.out.println();
  
  
  }
  
  }


}

*/

/*
//Q.8)write a program to peint a following pattern
//A b C d
//E f G h
//I j K l
//M n O p
//
//

class eight{

  public static void main(String[]args){
  char ch='A';
  char ch1='a';

  for(int i=1;i<=4;i++){
  
    for(int j=1;j<=4;j++){
    
    if(j%2==1){
    System.out.print(ch + " ");
    } else{
    
    System.out.print(ch1 +" ");
    }
    ch++;
    ch1++;
    
    } 
    System.out.println();

  
  
  
  }
  
  
  
  }



}
*/

/*
//Q.9)write a program to peint a following pattern
//1C3  4B2 9A1
//16C3 25B2 26A1
//49C3 64B2 81A1


class nine{
  
	public static void main(String[]args){
	int n=1;
	for(int i=1;i<=3;i++){
	char ch='C';

	for(int j=3;j>0;j--){
	

		System.out.print(n*n+"" + ch-- +""+ j +" " );
	        n++;

	}
	System.out.println();
	
	}
	
	
	
	}


}
*/

/*
//Q.10)write a program to peint a following pattern
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
//
class ten{

public static void main(String[]args){

for(int i=1;i<=6;i++){
  int n=5;
  char ch='F';

 for (int j=1;j<=6;j++){
   
	 if(j%2==0){
	 System.out.print(n+" ");

	 n=n-2;
	 } else{
	 
	 System.out.print(ch +" ");
	 ch--; 
	 }
        
   
 } 
  System.out.println();

}

}

} 
*/


