import java.util.*;

class ArraylistDemo extends ArrayList{

	public static void main(String[]args){
	
	
		ArraylistDemo al=new ArraylistDemo();
		
		//add(Element);
		al.add(10);
		al.add(20.5f);
		al.add("Tannuraj");
		al.add(10);
		al.add(20.5f);

		System.out.println(al);
	        
		//2)  add(int,Element)
		al.add(3,"Core2Web");
		System.out.println(al);
                  
	        //size()
		System.out.println(al.size());
	        
	        //contains(object)
		System.out.println(al.contains("Tannuraj"));
	        System.out.println(al.contains(30));

		//indexOf(Object)
		System.out.println(al.indexOf(20.5f));

		//lastIndexOF(Object)
		System.out.println(al.lastIndexOf(20.5f));

		//get(int)
		System.out.println(al.get(3));

		//set(index,incubator,)
	        System.out.println(al.set(3,"Incubator"));
		System.out.println(al);
                
		//addAll(collection)
		ArrayList al2=new ArrayList();
                
		al2.add("salma");
		al2.add("Shahrukh");
		al2.add("Amir");
                
		al.addAll(al2);
		System.out.println(al);
                
		//addAll(index,collection)
		al.addAll(3,al2);
		System.out.println(al);
           
               //removerange (3,5)
	       al.removeRange(3,5);
	       System.out.println(al);
	      
	       //remove(int);
	       System.out.println(al.remove(3));
               System.out.println(al);


              //Object[] toarray()
	      Object arr[]=al.toArray();
	      System.out.println(arr);

             for(Object data:arr){
	     
		     System.out.print(data+ "  ");

	     
	     }
	     System.out.println();
              
	     //clear()
	     al.clear();
	     System.out.println(al);







	}




}
