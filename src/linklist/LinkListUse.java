package linklist;

import java.util.Scanner;

public class LinkListUse {
	
	
	public static Node<Integer> takeInput(){
		Node<Integer>head = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		while(data!= -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			
			if(head == null) {
				head = newNode;
			}
			else {
				Node<Integer> temp = head;
				while(temp.next != null) {
					temp = temp.next;
					
				}
				temp.next = newNode;
			}
			data = sc.nextInt();
			}
		return head;
					
		
	}
	
	public static void print(Node<Integer>head) {
		
		while(head != null) {
			System.out.print(head.data + " ");
			head =head.next;
		}
		
	}

	public static Node<Integer> insertNode(Node<Integer> head,int data, int i) {
		int pos = 0;
		Node<Integer> temp = head;
		Node<Integer> newNode = new Node<>(data);
		if(i == 0) {
			newNode.next = head;
			return newNode;
		}
		
		while( pos < i-1 ) {
			temp = temp.next;
			pos++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
		return head;
		
	}
	
	public static void delNode(Node<Integer> head, int i) {
		Node<Integer> temp = head;
		Node<Integer> temp1 = head;
		
		int pos = 0;
		
		while(pos < i-1) {
			temp = temp.next;
			pos++;
		}
		temp.next = temp.next.next;
//		}
//		while(pos < i+1) {
//			temp1 = temp1.next;
//			pos++;
//		}
//		temp.next = temp1;
		
	}
	public static Node<Integer> reverse (Node<Integer> head) {
		Node<Integer> temp = head;
		Node<Integer> prev = null;
		Node<Integer> nxt = null;
		
		while(temp != null) {
			nxt = temp.next;
			temp.next = prev;
			prev = temp;
			temp = nxt;
			
		} 
		return prev;		
	}
	public static int length(Node<Integer>head) {
		Node<Integer> temp = head;
		int c = 0;
		
		while(temp != null) {
			c++;
			temp = temp.next;
		}
		return c;
	}
	
	public static Node<Integer> ReverseK(Node<Integer> head , int lent , int k ){
		
		if(lent < k) {
			return   head;
		}
		Node<Integer> currnt = head;
		Node<Integer> prev = null;
		Node<Integer> forward = null;
		int count = 0;
		
		while( currnt != null && count < k) {
			forward = currnt.next;
			currnt.next = prev;
			prev = currnt;
			currnt = forward;
			count++;
		}
		if(forward != null ) {
			head.next = ReverseK(forward, lent - k , k);
		}
		return prev;
	}
	
	public static void printR(Node<Integer> head) {
		if(head == null) {
			System.out.println();
			return;
		}
		System.out.print(head.data + " ");
		printR(head.next);
	}
	public static void Rprint (Node<Integer> head) {
		if(head == null) {
			return;
		}
		Rprint(head.next);
		System.out.print(head.data + " ");
	}
	public static Node<Integer> Insert ( Node<Integer> head , int pos , int elem){
		if(pos == 0) {
			Node<Integer> newNode = new Node<>(elem);
			newNode.next = head;
			return newNode;
		}
		
		if(head == null) {
			return head;
		}
		
		head.next = Insert(head.next, pos-1 , elem);
		return head;
	}
	public static Node<Integer> delR (Node<Integer> head, int pos ){
		
		if(head == null) {
			return null;
		}
		Node<Integer> temp = head;
		
		if(pos == 0) {
			temp  = temp.next;
			return temp;
		}
		
		if(temp.next == null) {
			return head;
		}
		temp.next = delR(temp.next, pos-1);
		return head;
	}
	public static Node<Integer> reverseR(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> finalhead = reverseR(head.next);
		Node<Integer> temp = finalhead;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		head.next = null;
		return finalhead;
	}
	public static doubleNode betterRLL(Node<Integer> head) {
		if(head == null || head.next == null) {
			doubleNode ans = new doubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		doubleNode smallans = betterRLL(head.next);
		smallans.tail.next = head;
		head.next = null;
		smallans.tail = head;
		return smallans;
//		doubleNode ans = new doubleNode();
//		ans.head = smallans.head;
//		ans.tail = head;
//		return ans;
		
	}
	public static Node<Integer> reverseLL1 ( Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> ans = head.next;
		Node<Integer> temp = reverseLL1(head.next);
		ans.next = head;
		head.next = null;
		return temp;
	}
	public static void main(String[] args) {
		
//		Node<Integer> node1 = new Node<Integer>(12);
//		
//		System.out.println(node1.data);
//		System.out.println(node1.next);8
		
		
//		Node <Integer> node2 = new Node<Integer>(66);
		
//		node1.next = node2;
		
//		System.out.println(node1.next);
//		System.out.println(node2.next);
//		
//		Node<Integer>head = node1;
		
//		while(head != null) {
//			System.out.print(head.data + " ");
//			head = head.next;
//		}
		
		Node<Integer> head = takeInput();
//		head = insertNode(head,80,0);
//		delNode(head,2);
//		Node<Integer> ans = reverse(head);
////		reverse(ans);
//		int lent = length(head);
//		int k = 2;
//		Node<Integer> ans = ReverseK(head , lent , k);
//		Node<Integer> ans = Insert(head , 2 , 12);
//		Node<Integer> ans = delR(head , 2 );
//		Node<Integer> ans = reverseR(head);
//		doubleNode ans = betterRLL(head);
		Node<Integer> ans = reverseLL1(head);
		print(ans);
//		Rprint(head);
	}

}
class doubleNode {
	Node<Integer> head;
	Node<Integer> tail;
}
