/*
//Q1)
//*
//*  *
//*  *  *
//*  *  * *
//
import java.io.*;

class one {

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");

                int N=Integer.parseInt(br.readLine());
                 
		for (int i=1;i<=N;i++){
		
			for(int j=1;j<=i;j++){
			
				System.out.print(" *  ");

			
			}
			System.out.println();
		}
	


                }
 }
*/

/*
//Q2)
//1
//1  2
//1  2  3
//
//
import java.io.*;

class one {

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");

                int N=Integer.parseInt(br.readLine());

                for (int i=1;i<=N;i++){
                        int num=1;

                        for(int j=1;j<=i;j++){

                                System.out.print( num +"  ");
				num++;



                        }
                        System.out.println();
                }



                }
 }
 */

/*
//3)
//3  
//3  2
//3  2  1
//
import java.io.*;

class three{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of rows ");
		int N=Integer.parseInt(br.readLine());
		 int n=N;
		for(int i=1;i<=N;i++){
		        int num= n;
			for(int j=1;j<=i;j++){
			
				System.out.print(num+"  ");
				num--;
			                                
			}
			System.out.println();
		
		}
	
	}
}
*/
/*
//Q4)
//A
//B  C
//C  D  E
import java.io.*;

class four{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");
                int N=Integer.parseInt(br.readLine());
                int C=65;
                for(int i=1;i<=N;i++){
                        
                        for(int j=1;j<=i;j++){

                                System.out.print((char)C+"  ");
                                C++;

                        }
                        System.out.println();
			if(i>=2)
				C--;


                }

        }
}
*/
/*
//Q5)
//3
//3  6
//3  6  9

import java.io.*;

class five{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");
                int N=Integer.parseInt(br.readLine());
                
                for(int i=1;i<=N;i++){
                      
                        for(int j=1;j<=i;j++){

                                System.out.print(N*j+"  ");
                         
                        }
                        System.out.println();

                        


                }

        }
}
*/

/*
//6)  
//1
//2  4
//3  6  9
//4  8  12  16
//
import java.io.*;

class six{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");
                int N=Integer.parseInt(br.readLine());
                int num=0;
                for(int i=1;i<=N;i++){
                          num=i;
                        for(int j=1;j<=i;j++){
				
                             if(j>=2){
				     num=num+i;
				System.out.print(num+"  ");
			     }else{
			     
				     System.out.print(num+"  ");
			     }
                            
                        }
                        System.out.println();




                }

        }
}
*/
/*
//7)
//*  *  *  *
//*  *  *
//*  *
//*
import java.io.*;

class seven {

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");

                int N=Integer.parseInt(br.readLine());
                int N1=N;
                for(int i=1;i<=N;i++){
		
			for(int j=1;j<=N1;j++){
			
				System.out.print(" * ");
			}
			N1--;
			System.out.println();
		
		}



                }
 }
 */
/*
//8)
//3  3  3
//2  2
//1
import java.io.*;

class eight {

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");

                int N=Integer.parseInt(br.readLine());
                int N1=N;
                for (int i=1;i<=N;i++){

                        for(int j=1;j<=N1;j++){

                                System.out.print(N1+"  ");


                        }
                        System.out.println();N1--;
                }



                }
 }

 */
/*
//Q90 
//1  2  3  4
//1  2  3
//1  2
//1

import java.io.*;

class nine {

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");

                int N=Integer.parseInt(br.readLine());
                int N1=N;
                for (int i=1;i<=N;i++){
                       int num=1;
                        for(int j=1;j<=N1;j++){

                                System.out.print( num  +  "  "  );

                               num++;
                        }
                        System.out.println();N1--;
                }



                }
 }

 */

/*
//10)1
//1  2  3  4
//2  3  4
//3  4
//4
//
import java.io.*;


class ten{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");
		int N=Integer.parseInt(br.readLine());
		int N1=N;

		for (int i=1;i<=N;i++){
		         int num=i;

			for(int j=1;j<=N1;j++){
			
				System.out.print(num+"  ");
                                num++;
			}
			System.out.println();N1--;
		
		}
	
	}
}

*/

/*
//Q.11)
//D  C  B  A
//D  C  B
//D  C
//D

import java.io.*;


class eleven{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");
                int N=Integer.parseInt(br.readLine());
                //int num=64+N;
		int N1=N;
                for (int i=1;i<=N;i++){
                         
                         int num=64+N;
                        for(int j=1;j<=N1;j++){

                                System.out.print((char)num +"  ");
                                num--;
                        }
                        System.out.println();N1--;

                }

        }
}
*/

/*
//12)
//65  B  67  D
//B   67 D 
//67  D
//D
//
import java.io.*;


class twelve{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");
                int N=Integer.parseInt(br.readLine());
                int num=65;
                int N1=N;
                for (int i=1;i<=N;i++){

                         int num1=num;
                        for(int j=1;j<=N1;j++){
 
				if(N1%2==0){
				
				       if(j%2==1){
				       
					       System.out.print(num1+"  ");
				       }else{
				       
					       System.out.print((char)num1+"  ");
				       
				       }	

					
				}else{
					if(j%2==1){
					
						 System.out.print((char)num1+"  ");
					}else{
					
						 System.out.print(num1+"  ");
					}
				
				
				}
                                num1++;

                              




                        }
                        System.out.println();N1--;num++;


                }

        }
}

*/


















