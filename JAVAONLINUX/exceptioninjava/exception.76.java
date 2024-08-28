/*
class stackdemo{
        static void fun(int x){
	
		System.out.println(x);
		fun(++x);

	
	
	}




	public static void  main(String[]args){
	 
		fun(1);

	

	
	
	}



}
*/
/*
import java.util.Scanner;
class demo{

	public static void main(String[]args){
	
		Scanner sc=new Scanner (System.in);
		int x=sc.nextInt();
		try{
		
			if(x==0){
			
				throw new ArithmeticException("Divid by zero");
			}
			System.out.println(10/x);
		
		} catch(ArithmeticException ae){
		
		
			System.out.print("Exception in thread "+ Thread.cuurentTHread().getName()+" ");
			ae.printStackTrace();
		
		}

	
	    
	}

 
}
*/

import java .util.Scanner;

class DataOverFlowException extends RuntimeException{

	DataOverFlowException(String msg){
	
		super(msg);
	
	}

}

class DataUnderFlowException extends RuntimeException{

	DataUnderFlowException(String msg){
	
		super(msg);
	
	}


}
class  ArayDemo{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);
		int arr[]=new int [5];

		System.out.println("Enter integeer value");
		System.out.println("0<integer<100");

		for(int i=0;i<arr.length;i++){
		
			int data=sc.nextInt();
			
			if (data<0){
			
				throw new DataUnderFlowException("Are data integer zero peksha lahan dila ahe ");
			}
			if(data>100){
			
				throw new DataOverFlowException("Are dada integer hundred peksha moth ahe ");

			}
			arr[i]=data;
		
		}
		for(int i=0;i<arr.length;i++){
		
			System.out.print(arr[i]+" ");
		
		
		}
	
	}

}
