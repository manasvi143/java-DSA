package temp;

import java.util.Scanner;

public class LinkListNodeUse {
	
	
	public static LinkListNode<Integer> takeInput(){
		LinkListNode<Integer> head = null;
		Scanner sc =  new Scanner(System.in);
		int data = sc.nextInt();
		while(data != -1) {
			LinkListNode<Integer> newNode = new LinkListNode<Integer>(data);
			if(head == null) {
				head = newNode;
			}else{
				LinkListNode<Integer> temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				temp.next = newNode;
			}
			data = sc.nextInt();
		}
		return head;
	}
	
	public static void print(LinkListNode<Integer> head) {
		LinkListNode<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data +" " );
			temp = temp.next;
		}
	}
	
public static LinkListNode<Integer> reverse(LinkListNode<Integer> head){
	
	LinkListNode<Integer> prev = null;
	LinkListNode<Integer> temp = head;
	LinkListNode<Integer> forwd = null;
	
	while(temp != null) {
		forwd = temp.next;
		temp.next = prev;
		prev = temp;
		temp = forwd;
	}
	return prev;
}

	public static void main(String[] args) {
//		
//		LinkListNode<Integer> p1 = new LinkListNode<>(12);
//		LinkListNode<Integer> p2 = new LinkListNode<>(32);
//		
//		p1.next = p2;
//		
////		 <Integer> head = p1;
//		print(p1);
//	}
		LinkListNode<Integer> head = takeInput();
		LinkListNode<Integer> ans = reverse(head);
		print(ans);
}
}
