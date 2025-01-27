package javaOperators;

public class AssignmentOperators {
	public static void main(String[] args) {
		    	   int a =10;
		    	   int b=20;
		    	   
		    	   
		    	  System.out.println(a+=5);
		    	  System.out.println(a-=5);
		    	  System.out.println(a*=5);
		    	  System.out.println(a/=5);
		    	  System.out.println(a%=5);
		    	  
		    	  System.out.println(a+=b);
		    	 System.out.println(b+=a);
		    	  System.out.println(b-=a);
		    	  System.out.println(a-=b);//0
		    	  
		    	  System.out.println(a+=a++);//0
		    	 System.out.println(a+=++b);
		    	 System.out.println(a-=b--);
		    	 System.out.println(a-=++b-a--);
		    	  
		    	
		       }
		}
