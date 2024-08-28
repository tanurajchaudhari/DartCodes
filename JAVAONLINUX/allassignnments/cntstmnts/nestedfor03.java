/*
//Q.1) Write a program to print the following pattern.
//C2W
//C2W C2W
//C2W C2W C2W
//C2W C2W C2W C2W

class one{

  public static void main(String[]args){
  int row =4;
  for(int i=1;i<=row;i++){
  
    for (int j =1;j<=i;j++){
    
    System.out.print("C2W ");
    
    
    }
    System.out.println();

  }

   

  
  
  }

}
*/

/*
//Q.2) Write a program to print the following pattern.
//1
//2  3
//4  5  6
//7  8  9  10
class two{


  public static void main(String[]args){
  int N=1;
  int row=4;
  for(int i=1;i<=row;i++){
  
  
    for(int j=1;j<=i;j++){
    System.out.print(N+"  ");
    N++;
    
    
    }
   System.out.println();

  
  }
  
  
  }


}
*/

/*
//Q.3) Write a program to print the following pattern.
//10
//9   8  
//7   6  5
//4   3   2   1
class three{


  public static void main(String[]args){
  int N=10;
  int row=4;
  for(int i=1;i<=row;i++){


    for(int j=1;j<=i;j++){
    System.out.print(N+"  ");
    N--;


    }
   System.out.println();


  }


  }


}
*/


//Q.4) Write a program to print the following pattern.
//3C  3C  3C  3C
//3C  3C  3C
//3C  3C
//3C
/*
class four{

  public static void main(String[]args){
  
  for(int i=1;i<=4;i++){
  
     for (int j=i;j<=4;j++){
     System.out.print("3C ");
     
     }
  System.out.println();
  }
  
  }

}
*/

//Q.5) Write a program to print the following pattern.
//
//10  10  10  10
//11  11  11
//12  12
//13
/*
class five{

  public static void main(String[]args){
 int N=10;
  for(int i=1;i<=4;i++){

     for (int j=i;j<=4;j++){
     System.out.print(N+" ");

     }
  System.out.println();
  N++;
  }

  }

}
*/

/*
//Q.6)Write a program to print the following pattern.
//9
//9 8
//9 8 7
//9 8 7 6
//
class six{

  public static void main(String[]args){

  for(int i=1;i<=4;i++){
    int N=9;
     for (int j=1;j<=i;j++){
     System.out.print(N+" ");
     N--;

     }
  System.out.println();
  }

  }

}
*/

/*
//Q.7) Write a program to print the following pattern.
//F
//E  F
//D  E  F
//C  D  E  F
//B  C  D  E  F
//A  B  C  D  E  F
//
class seven{

  public static void main(String[]args){
  int row =6;
  char ch='F';
  for(int i=1;i<=row;i++){
     
     int ch1=ch-i+1;
     for(int j=1;j<=i;j++){
     
     System.out.print((char)ch1+"  ");
     ch1++;


     
     } 
     System.out.println();


  
  }
  
  
  }

}
*/
/*
//Q.8) Write a program to print the following pattern.
//
//J
//I  H
//G  F  E
//D  C  B  A
class eight{

  public static void main(String[]args){
  int row =4;
  char ch='J';
  for(int i=1;i<=row;i++){

      
     for(int j=1;j<=i;j++){

     System.out.print((char)ch+"  ");
     ch--;



     }
     System.out.println();



  }


  }

}
*/
/*
//Q.9) Write a program to print the following pattern.
//1
//8  27
//64 125  216
//

class nine{

  public static void main(String[]args){
  
  int N=1;
  int row=3;
  for(int i=1;i<=row;i++){
  
    for (int j=1;j<=i;j++){
    
    System.out.print((N*N*N)+" ");
    N++;
    
    }
    System.out.println();
  
  
  }
  
  
  }

}
*/



//Q.10) Write a program to print the following pattern.
// 1  2  3  4
// 4  5  6
// 6  7
// 7
//
class ten{
  public static void main(String[]args){
  
  int N=1;
  for(int i=1;i<=4;i++){
  
    for(int j=i;j<=4;j++){
    
    System.out.print(N+"  ");
    N++;

    }
    N--;
    System.out.println();
  
  
  }
  
  
  }


}
