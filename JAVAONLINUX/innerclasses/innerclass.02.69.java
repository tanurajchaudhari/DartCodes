/*
class outer {

	class inner{
	
	
	
      }



}
*/
/*
class outer{

	class inner {
	
		void m1(){
		
		
			System.out.println("Inner m1");
		
		
		}

	
	
	}
	void m2(){
	
		System.out.println("outer m2");
	
	}

	public static void main(String[]args){
	
		inner obj=new outer ().new inner();
		obj.m1();

	
	
	}


}
*/

/*
//method local inner class 
class outer{

	void m1(){
	
		System.out.println("in m1 outerclass");
	       
		class Inner{
		
			void m1(){
			
			
				System.out.println("In m1 innerclass");
			
			}
		
		
		}
	        Inner obj=new Inner ();
		obj.m1();
	
	}
        void m2(){
	
		System.out.println("In m2 -outer");
	
	}
	public static void main(String[]args){
	
		outer obj=new outer ();
		obj.m1();
		obj.m2();
	
	}

}
*/


//Static Nested /Static  Inner Class 


class  Outer {


	void m1(){
	
		System.out.println("In m1 outer ");
		
	}
        static class  Inner{
	
		void m1(){
		
		
			System.out.println("In m1 Innner class  ");
		
		
		}
	
	
	
	
	}


}

class client{

	public static void main(String[]args){
	
		Outer.Inner obj=new Outer.Inner();
               obj.m1();


	}
}
