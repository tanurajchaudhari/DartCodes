/*
class parent{

	parent(){
	
	
		System.out.println("In parent constructor");
	
	
	}

	void fun(){
	
		System.out.println("parent fun");

	
	
	}



}

class child extends parent{


	child(){
	
		System.out.println("child constructor");
	}
        
	void fun(){
	
		System.out.println("child fun method ");
	
	}



}

class client {

	public static void main(String[]args){
	
		child obj=new child();
		obj.fun();

	
	
	
	}



}
*/

/*
class parent{

        parent(){


                System.out.println("In parent constructor");


        }

        void fun(int x){

                System.out.println("parent fun"+ x);



        }



}
class child extends parent{


        child(){

                System.out.println("child constructor");
        }

        void fun(){

                System.out.println("child fun method ");

        }
        void gun (){
	
		System.out.println("child gun method ");
	
	}


}
class client{

	public static void main(String[]args){
	 child obj=new child();

         obj.fun(10);

	 parent obj1=new parent();
	 obj1.gun();

	
	
	
	}



}
*/


class parent {

	void fun(int x){
	
		System.out.println("parent fun"+x);
	
	
	}


}
class child extends parent{
    void fun(float y){
	   
	System.out.println("child fun");
    }

}



class client{

	public static void main(String []args ){
	
	parent obj= new child();
	obj.fun(20.50f);

	
	
	}


}


