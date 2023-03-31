package basic.dev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queuel = new LinkedList<Integer>();
		queue.add(1);
		queue.add(3);
		queue.add(5);
		queue.add(7);
		queue.add(9);
		
		System.out.println("Queue trước khi đảo ngược: " + queue);
		while (queue.size() > 0) {
			stack.push(queue.remove());
		}
		while (stack.size() > 0) {
			queuel.add(stack.pop());
		}
		System.out.println("Queue sau khi đảo ngược: " + queuel);
	}

}
