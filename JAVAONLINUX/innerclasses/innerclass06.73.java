/*
class outer{

 
	void m1(){
	
		System.out.println("In m1 ouoter");

		class inner{
		
		
			void m1(){
			
				System.out.println("In m1 inner");
			
			}
		
		
		}
            inner obj=new inner();
	    obj.m1();
	
	}
	void m2(){
	
		System.out.println("In m2 outer");

	}

}
class client{

	public static void main(String[]args){
	
		outer obj=new outer();
		obj.m1();
		obj.m2();
	}


}

*/

class outer{


        Object m1(){

                System.out.println("In m1 ouoter");

                class inner{


                        void m1(){

                                System.out.println("In m1 inner");

                        }


                }
           return new inner();

        }
        void m2(){

                System.out.println("In m2 outer");

        }

}
class client{

        public static void main(String[]args){

                outer obj=new outer();
                obj.m1().m1();
               // obj1.m1(); 
        }


}
