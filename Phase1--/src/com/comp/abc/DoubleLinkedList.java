package com.comp.abc;

import java.util.LinkedList;

public class DoubleLinkedList {

  class terminals
  {  
	  int data;  
      terminals previous;  
	  terminals next;  
	  public terminals(int data) {  
	this.data = data;  
		        }  
		    }  
		    
	 terminals head, tail = null;  
		     
		    public void addNode(int data) {  
		        
		        terminals newNode = new terminals(data);  
		  
		       
		        if(head == null) {  
		             
		            head = tail = newNode;  

		            head.previous = null;  
		           
		            tail.next = null;  
		        }  
		        else {  
		           
		            tail.next = newNode;  
		            
		            newNode.previous = tail;  
		            
		            tail = newNode;  
		            
		            tail.next = null;  
		        }  
		    }  
		  
		    
		    public void display() {  
		          
		        terminals current = head;  
		        if(head == null) {  
		            System.out.println("List is empty");  
		            return;  
		        }  
		        System.out.println("Nodes of doubly linked list: ");  
		        while(current != null) {  
		         
		  
		            System.out.print(current.data + " ");  
		            current = current.next;  
		        }  
		    }  
		  
		    public static void main(String[] args) {  
		  
		        LinkedList d = new LinkedList();  
		       
		        d.add(1);  
		        d.add(2);  
		       System.out.println(d); 
		    }  
		}  

	
