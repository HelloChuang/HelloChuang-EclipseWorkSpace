package class_03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author XX
 *	如何仅用队列结构实现 栈结构    用两个队列
 *	如何仅用栈结构实现 队列结构	用两个栈
 *
 *	
 */
/**
 * @author XX
 *2.如何仅用栈结构实现 队列结构  用两个栈
 *	 压东西发生在Push栈，倒东西发生在pop栈
 *	倒这个行为有两个限制
	限制1：如果push栈决定要把数往pop栈里倒，一次要倒完
	限制2：如果pop栈里有东西，push栈里一定不要倒
 */

public class Code_03_StackAndQueueConvert {

	public static class TwoStacksQueue {
		private Stack<Integer> stackPush;
		private Stack<Integer> stackPop;

		public TwoStacksQueue() {
			stackPush = new Stack<Integer>();
			stackPop = new Stack<Integer>();
		}

		public void push(int pushInt) {
			stackPush.push(pushInt);
		}

		public int poll() {
			if (stackPop.empty() && stackPush.empty()) {//限制2：如果pop栈里有东西，push栈里一定不要倒
				throw new RuntimeException("Queue is empty!");
			} else if (stackPop.empty()) {
				while (!stackPush.empty()) {	//限制1：如果push栈决定要把数往pop栈里倒，一次要倒完
					stackPop.push(stackPush.pop());
				}
			}
			return stackPop.pop();
		}

		public int peek() {							//与poll类似，也要遵守两个限制
			if (stackPop.empty() && stackPush.empty()) {
				throw new RuntimeException("Queue is empty!");
			} else if (stackPop.empty()) {
				while (!stackPush.empty()) {
					stackPop.push(stackPush.pop());
				}
			}
			return stackPop.peek();
		}
	}
	/**
	 * @author XX
	 *	如何仅用队列结构实现 栈结构    用两个队列
	 *	1.假如要pop，就把data中都倒进help，留下最后一个，把其pop
	 *	2.操作过后要把data和help的指向互换
	 */	
	public static class TwoQueuesStack {
		private Queue<Integer> queue;
		private Queue<Integer> help;

		public TwoQueuesStack() {
			queue = new LinkedList<Integer>();
			help = new LinkedList<Integer>();
		}

		public void push(int pushInt) {
			queue.add(pushInt);
		}

		public int peek() {
			if (queue.isEmpty()) {
				throw new RuntimeException("Stack is empty!");
			}
			while (queue.size() != 1) {//	与pop类似，假如要peek，就把data中都倒进help，留下最后一个，把其pop
				help.add(queue.poll());
			}
			int res = queue.poll();
			help.add(res);				//与pop的区别，peek是先把queue的弹出，再将其加入到help中
			swap();
			return res;
		}

		public int pop() {			
			if (queue.isEmpty()) {
				throw new RuntimeException("Stack is empty!");
			}
			while (queue.size() > 1) {//	1.假如要pop，就把data中都倒进help，留下最后一个，把其pop
				help.add(queue.poll());
			}
			int res = queue.poll(); //poll是Queue的方法   
			swap();
			return res;
		}

		private void swap() {  //交换help和queue的指向
			Queue<Integer> tmp = help;
			help = queue;
			queue = tmp;
		}

	}

}
