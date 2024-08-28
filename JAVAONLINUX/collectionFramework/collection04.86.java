/*
import java.util.*;

class  Vectordemo{

	public static void main(String[]args){
	
		Vector v=new Vector();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);

		System.out.println(v);

	

	}

}
*/
/*
import java.util.*;

class StackDemo{

	public static void main(String[]args){
	
		Stack s=new Stack();

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
	        s.pop();
                System.out.println(s.peek());
		System.out.println(s);
	}
}
*/
/*
import java.util.*;
import java.util.*;

class CursurDemo{

        public static void main(String[]args){

                ArrayList al=new ArrayList();

                al.add(10);
                al.add(20.5);
                al.add(30.5f);
                al.add("Tanuraj");
                //for each
               for(var x:al){

                       System.out.println(x.getClass().getName());

               }
               //Iterator
               Iterator cursur=al.iterator();




        }


}
*/
import java.util.*;

class CursurDemo{

	public static void main(String[]args){
	
	/*	ArrayList al=new ArrayList();

		al.add(10);
		al.add(20.5);
		al.add(30.5f);
		al.add("Tanuraj");
                //for each
	       for(var x:al){
	       
		       System.out.println(x.getClass().getName());
	       
	       }*/ 
	       /*
	       //Iterator
	       Iterator cursor=al.iterator();
               while(cursor.hasNext()){
	       
		       if("Kanha".equals(cursor.next()))
			       cursor.remove();
	       
	       }
               */    

               /*
	       //listIterator
	       ListIterator litr=al.listIterator();
	       //System.out.println(litr.getClass().getName());
                 while(litr.hasNext()){
		 
			 System.out.println(litr.next());
		 } 
		 while(litr.hasPrevious()){
		 
			 System.out.println(litr.previous());
		 }
		*/



                 //Enumeration   

                Vector  al=new Vector();

                al.add("sunny");
                al.add("abba");
                al.add("om");
                al.add("sanket"); 
	        

	       Enumeration cursor=al.elements();
               System.out.println(cursor.getClass().getName());

	      while(cursor.hasMoreElements()){
	      
		      System.out.println(cursor.nextElement());
	      
	      } 

              	       


	}


}













































