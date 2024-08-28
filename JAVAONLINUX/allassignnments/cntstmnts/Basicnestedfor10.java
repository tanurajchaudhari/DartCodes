/*
//Q1)
//number of rows user input
//$#  $#  $#  
//$#  $#  $#
//$#  $#  $#

import java.io.*;

class one {

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");
                
		int N=Integer.parseInt(br.readLine());
                //int IN=N;
		for(int i=1;i<=N;i++){
		        
			for (int j=1;j<=N;j++){
			
				System.out.print("$#  ");

			
			}
			System.out.println();

		
		}	
	}
}
*/

/*
//Q2)
//1  2  3
//1  2  3
//1  2  3

import java.io.*;

class two {

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");

                int N=Integer.parseInt(br.readLine());
                //int IN=N;
                for(int i=1;i<=N;i++){

                        for (int j=1;j<=N;j++){

                                System.out.print(j+" ");



                        }
                        System.out.println();


                }
        }
}
*/
/*
//3)
//1  1  1
//2  2  2
//3  3  3

import java.io.*;

class three {

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");

                int N=Integer.parseInt(br.readLine());
                //int IN=N;
                for(int i=1;i<=N;i++){

                        for (int j=1;j<=N;j++){

                                System.out.print(i+"  ");


                        }
                        System.out.println();


                }
        }
}
*/
/*
//4)
//A   C  E
//G   I  K
//M   O  Q

import java.io.*;

class four {

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");

                int N=Integer.parseInt(br.readLine());
                
		int C=65;
                for(int i=1;i<=N;i++){

                        for (int j=1;j<=N;j++){

                                System.out.print((char)C+"  ");
				
                                 C=C+2;
                        }
                        System.out.println();


                }
        }
}

*/

/*
//%)
//1A  1A  1A
//1A  1A  1A
//1A  1A  1A
import java.io.*;

class five {

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");

                int N=Integer.parseInt(br.readLine());

                
                for(int i=1;i<=N;i++){

                        for (int j=1;j<=N;j++){

                                System.out.print(" 1A ");

                                
                        }
                        System.out.println();


                }
        }
}
*/
/*
//6) 
//1A  2B  3C
//1A  2B  3C
//1A  2B  3C
import java.io.*;

class six {

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");

                int N=Integer.parseInt(br.readLine());


                for(int i=1;i<=N;i++){
                        int C=65;
                        for (int j=1;j<=N;j++){
                                
                                System.out.print(j+""+(char)C+"  ");
				C++;


                        }
                        System.out.println();


                }
        }
} 
*/
/*
//7)
//d  c  b  a
//d  c  b  a
//d  c  b  a
//d  c  b  a
//
import java.io.*;

class seven {

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");

                int N=Integer.parseInt(br.readLine());
                int C=(97+N)-1;

                for(int i=1;i<=N;i++){
                        int C1=C;
                        for (int j=1;j<=N;j++){

                                System.out.print((char)C1+"  ");
                                C1--;


                        }
                        System.out.println();


                }
        }
}
*/
/*
//8)
//C1  C2  C3
//C4  C5  C6
//C7  C8  C9
//
import java.io.*;

class eight {

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");

                int N=Integer.parseInt(br.readLine());
                int C=(65+N)-1;
                int num=1;
                for(int i=1;i<=N;i++){
                        
                        for (int j=1;j<=N;j++){

                                System.out.print((char)C+""+num+"  ");
                                num++;


                        }
                        System.out.println();


                }
        }
}
*/

/*
//9)
//1  2  3  4
//4  5  6  7
//7  8  9  10
//10 11 12 13

import java.io.*;

class nine {

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");

                int N=Integer.parseInt(br.readLine());
                int num=1;

                for(int i=1;i<=N;i++){
                        
                        for (int j=1;j<=N;j++){

                                System.out.print(num+"  ");
                                num++;


                        }
                        System.out.println();
			num--;



                }
        }
}
*/


//10)
//1  2  3  4
//2  3  4  5
//3  4  5  6
//4  5  6  7
import java.io.*;

class ten {

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");

                int N=Integer.parseInt(br.readLine());
                int num=1;

                for(int i=1;i<=N;i++){
                        int C1=num;
                        for (int j=1;j<=N;j++){

                                System.out.print(C1+"  ");
                                C1++;


                        }
                        System.out.println();
			num++;



                }
        }
}
