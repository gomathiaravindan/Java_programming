

import java.io.*;
public class Linkedlist {
	
	Node head;
	
	static class Node{
		
		int Data;
		Node next;
		
		Node(int data)
		{
			Data = data;
			next = null;
		}
		
	}
	


public static Linkedlist insert(Linkedlist list, int data)
{
	Node new_node = new Node(data);
	new_node.next = null;
	
	if(list.head==null)
		list.head = new_node;
	else {
		Node last = list.head;
		while(last.next!=null)
		
		{
			last = last.next;
		}
		last.next = new_node;
	}
	return list;
}


public static void printlist(Linkedlist list)
{
	Node present_node = list.head;
	
	while(present_node!=null)
	{
		System.out.print(present_node.Data+" ");
		present_node = present_node.next;
	}
	
}

public static Linkedlist delete(Linkedlist list, int data)
{
	Node curr_node = list.head;
	Node temp = list.head;
	
	while(curr_node!=null && curr_node.Data != data)
	{
		temp = curr_node;
		curr_node = curr_node.next;
	}
	//System.out.println(curr_node.Data);
	temp.next =  curr_node.next;
	return list;
}
public static void main(String[] args)
{
	Linkedlist nodes = new Linkedlist();
	
	nodes = insert(nodes, 1);
	nodes = insert(nodes, 2);
	nodes = insert(nodes, 3);
	nodes = insert(nodes, 4);
	nodes = insert(nodes, 5);
	
	System.out.println("Before deleting:");
	nodes.printlist(nodes);
	
	System.out.println("\n");
	
	System.out.println("After deleting:");
	nodes.delete(nodes, 4);
	nodes.delete(nodes, 5);
	nodes.printlist(nodes);
	
}

}

