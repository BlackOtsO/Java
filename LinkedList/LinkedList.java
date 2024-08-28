/*
 
 */
package sample;
import java.util.*;
import  java.lang.*;
import java.io.*;
//push 0 1 2  Order 
public class Main {
public class Node
{
	String data;
	Node next;
	
	Node(String data)
	{
		this.data=data;
		this.next=null;
	}
}
Node head=null;
Node tail=null;


public void insertValueEnd(String value)
{
	
	Node newnode  =new Node(value);
	if(head==null)
	{
		head=newnode;
		head.next=tail;
		
	}
	Node current=head;
	while(current.next!=tail)
	{
		
		current=current.next;
	}
	current.next=newnode;
	current.next.next=tail;
	}
public void display()
{
	Node current =head;
	while(current!=null)
	{
		System.out.println(current.data);
		current=current.next;
	}
}
public static void main(String[]args)
{
	Main obj=new Main();
	
	obj.insertValueEnd("F");
	obj.insertValueEnd("B");
	obj.insertValueEnd("Ba");
	obj.insertValueEnd("Bac");
	obj.insertValueEnd("Bace");
	
	obj.display();
	
}

}

	
	