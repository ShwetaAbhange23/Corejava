package collection;
import java.util.LinkedList;
import java.util.Stack;
public class LinkedListEx {

	public static void main(String[] args) {
	LinkedList<Integer> ll = new LinkedList<>();
	ll.add(10);
	ll.addFirst(23);
	ll.add(6);
	ll.addLast(40);
	System.out.println("Element in Linked List :"+ll);
	ll.removeLast();
	System.out.println("Element in Linked list:"+ll);
	Stack<Integer> s = new Stack<>();
	s.push(10);
	s.push(12);
	s.push(13);
	System.out.println("My Elements:"+s);
	s.pop();//remove
	System.out.println("My Elements:"+s);
	int a=s.peek();
	System.out.println(a);//top od elements
	System.out.println(s.isEmpty());
	System.out.println();
	
	}

}
