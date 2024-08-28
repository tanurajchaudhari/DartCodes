/*
import java.util.*;
class QueueDemo{

	public static void main(String[]args){
	
		Queue que=new LinkedList();
		que.offer(10);
	        que.offer(20);
		que.offer(50);
		que.offer(30);
		que.offer(40);

		System.out.println(que);
		que.poll();
	        System.out.println(que);
		que.remove();
		System.out.println(que);
		System.out.println(que.peek());
		System.out.println(que.element());
		System.out.println(que);
		

        	       
	
	}

}

*/ 
/*
import java.util.*;
class Pqueue{

	public static void main(String[]args){
	
		PriorityQueue pq=new PriorityQueue();

		pq.offer(20);
		pq.offer(10);
		pq.offer(50);
		pq.offer(30);
		pq.offer(40);
	       System.out.println(pq);
	}

}
*/

/*
import java.util.*;
class PQueueDemo{

	public static void main(String[]args){
	
		PriorityQueue pq=new PriorityQueue();
		pq.offer("Kanha");
		pq.offer("Ashish");
		pq.offer("Rahul");
		pq.offer("Rajesh");
		pq.offer("Badhe");
                System.out.println(pq);

	
	}

}
*/
/*
import java.util.*;

class Project implements Comparable{

	String pName=null;
	int NoEmp=0;
	float Duration=0;

	Project (String pName,int NoEmp,float duration){
	
		this.pName=pName;
		this.NoEmp=NoEmp;
		this.Duration=Duration;
	}
	public String toString(){
	
		return "{"+pName+":"+NoEmp+":"+Duration+"}";
	
	}
        public  int compareTo(Object obj){
	
		return pName.compareTo(((Project)obj).pName);
	
	} 


}

class Demo{

	public static void main(String[]args){
	
		PriorityQueue pq=new PriorityQueue();
		pq.offer(new Project("Facebook",50,12.5f));
                pq.offer(new Project("Instagram",80,11.5f));
		pq.offer(new Project("Snapchat",70,7.5f));
		pq.offer(new Project("Whatsapp",30,8.5f));

                System.out.println(pq);

	 
	}

}

*/


/*
import java.util.*;

class Project {

        String pName=null;
        int NoEmp=0;
        int Duration=0;

        Project (String pName,int NoEmp,int duration){

                this.pName=pName;
                this.NoEmp=NoEmp;
                this.Duration=Duration;
        }
        public String toString(){

                return "{"+pName+":"+NoEmp+":"+Duration+"}";

        }
    



}
class SortByDuration implements Comparator{

	public int compare(Object obj1,Object obj2){
	
		return  (((Project)obj1).Duration)-(((Project)obj2).Duration);

	
	}

}
class Demo{

        public static void main(String[]args){

                PriorityQueue pq=new PriorityQueue();
                pq.offer(new Project("Facebook",50,12));
                pq.offer(new Project("Instagram",80,11));
                pq.offer(new Project("Snapchat",70,7));
                pq.offer(new Project("Whatsapp",30,8));

                System.out.println(pq);



        }

}

*/















