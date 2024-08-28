/*
class parent{
int x=10;
	parent(){
	
		System.out.println("In parent constructor");
	
	}
	void access(){
	
		System.out.println("parent instance ");
	
	}


}
class child extends parent{
        int y=20;
	child(){
	
		System.out.println("In child constructor");
		System.out.println(x);
		System.out.println(y);
	}



} 
class client{

	public static void main(String[]args){
	child obj=new child();
	obj.access();


	
	
	}


}
*/

class parent{
     static{
     
	     System.out.println("in parent static blocked 1");
     
     }
     static {
     
	     System.out.println("in parent static blocked 2");
     }

}
class child extends parent{

	static{
	
		System.out.println("in child static blocked 1");
	
	
	}



}
class client{

	public static void main(String[]args){
	
		child obj=new child();

	
	
	
	}

}
