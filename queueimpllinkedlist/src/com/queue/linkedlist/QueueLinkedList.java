package com.queue.linkedlist;

import java.util.Scanner;

public class QueueLinkedList {
	
	class Node
	{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}

	Node front = null;
	Node rear = null;
	
	void enQueue(int data)
	{
		Node node = new Node(data);
		
		
		
		if(front == null)
		{
			front = rear = node;
			System.out.println("Element added ");
			
		}
		else
		{
			rear.next = node;
			rear = node;
			System.out.println("Element added");
		}
	}
	void deQueue()
	{
		if(front==null)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			front = front.next;
			
			if(front == null)
				rear= null;
			
			System.out.println("Element is deleted");
		}
		
		
	}
	void display()
	{
		
		
		if(front == null)
		{
			System.out.println("Queue is empty from [display()]");
		}
		else
		{
			Node temp =front;
			System.out.println("Values are ");
			while(temp !=null)
			{
				System.out.print(temp.data +"--> ");
				
				temp = temp.next;
			}
		}
		
	}
	
	void queueFront()
	{
		if(front == null)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println("front element is : "+front.data);
		}
	}
	public static void main(String [] args)
	{
		QueueLinkedList qLis = new QueueLinkedList();
		
		/*
		 * qLis.display(); qLis.deQueue(); qLis.deQueue();
		 * 
		 * qLis.display();
		 */
		char ch ;
		int choice;
		  System.out.println("*********Queue operations using LinkedList*********\n");  
		    System.out.println("\n------------------------------------------------\n");  
		    do
		    {  
		        System.out.println("\nChose one from the below options...\n");  
		        System.out.println("\n1.EnQueue\n2.DeQueue\n3.Show\n4.QueueFront");  
		        System.out.println("\n Enter your choice \n");     
		        Scanner sc = new Scanner(System.in);
		        choice = sc.nextInt();  
		        switch(choice)  
		        {  
		            case 1:  
		            {   System.out.println("Enter the element to Enqueue");
		                 
		            
		            qLis.enQueue( sc.nextInt()); 
		                break;  
		            }  
		            case 2:  
		            {  
		            	qLis.deQueue();   
		                break;  
		            }  
		            case 3:  
		            {  
		            	qLis.display();
		                break;  
		            }  
		            case 4:  
		            {  
		            	qLis.queueFront(); 
		                break;  
		            }  
		            default:  
		            {  
		                System.out.println("Please Enter valid choice ");  
		            }  
		        }
		            System.out.println("\nDo you want to continue ? (Y/N)");
					Scanner acb = new Scanner(System.in);
					ch = acb.next().charAt(0);
				
		    }while (ch == 'y' || ch == 'Y');
		        
		    
  }
	}

