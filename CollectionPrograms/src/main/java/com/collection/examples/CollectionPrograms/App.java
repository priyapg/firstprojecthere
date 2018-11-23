package com.collection.examples.CollectionPrograms;

/**
 * Hello world!
 *
 */
public class App 
{
	public  final int a=0;
	 public static void main(String argv[])
	   { 
		 System.out.println(Runtime.getRuntime().toString());
		 System.out.println(Runtime.getRuntime().totalMemory());
		 equality obj = new equality();
         obj.x = 5;
         obj.y = 5;
         System.out.println(obj.isequal()); 
    //     Runtime.getRuntime().exit(0);
        String p=new String("priya");
        String pr=p;
        System.out.println(p.intern());
        System.out.println(pr==p);
        System.out.println(p.equals(pr));
        
         }
	 
	   } 

class equality {
    int x=3;
    int y=4;
    boolean isequal() {
        return(x == y);
    } 
}  