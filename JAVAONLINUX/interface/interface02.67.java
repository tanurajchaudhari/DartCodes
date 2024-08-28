/*
interface  demo{

	static void fun(){
	
	
		System.out.println("In fun demo");
	
	}
        default void gun(){
	
		System.out.println("In fun demo");
	
       }

       
            
       

}

*/

interface demo{

	void gun();

	default void fun(){
	
		System.out.println("In fun demo");
	
	
	
	}



}
class demochild implements demo{

	public void gun(){
	
	
		System.out.println("In gun demochild ");
	
	
	}

}
class client{

	public static void main(String []args){
	
	
		demo obj=new demochild();
		obj.gun();
		obj.fun();
	}




}





























