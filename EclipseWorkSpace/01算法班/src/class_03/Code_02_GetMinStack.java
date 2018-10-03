package class_03;

import java.util.Stack;

/**
 * @author XX
 *	实现一个特殊的栈，在实现栈基本功能的情况下，再实现返回栈中最小元素的操作
 *	要求：
 *	1.pop/push/getMin操作的时间复杂度都是O（1）
 *	2.设计的栈类型可以使用现成的栈结构
 *
 *
 *	弄两个栈，每次往栈中加的时候都比较栈顶，
	data栈压的时候就像一个正常的栈一样
	当前数和min栈的栈顶比，如果当前数比min栈的栈顶小，就压当前数，否则就重复压入一个min栈的栈顶
 */
public class Code_02_GetMinStack {
	public static class MyStack1 {  //方法一：非同步压栈
		private Stack<Integer> stackData;
		private Stack<Integer> stackMin;

		public MyStack1() {
			this.stackData = new Stack<Integer>();
			this.stackMin = new Stack<Integer>();
		}

		public void push(int newNum) {
			if (this.stackMin.isEmpty()) { //min栈中为空的时候，不再比较，直接压
				this.stackMin.push(newNum);
			} else if (newNum <= this.getmin()) {  //如果大于min的栈顶，就不压栈
				this.stackMin.push(newNum);
			}
			this.stackData.push(newNum); //data栈压的时候就像一个正常的栈一样
		}

		public int pop() {
			if (this.stackData.isEmpty()) {
				throw new RuntimeException("Your stack is empty.");
			}
			int value = this.stackData.pop(); //记录data的栈顶，并将其弹出
			if (value == this.getmin()) {		//如果data的栈顶等于min的栈顶
				this.stackMin.pop();			//那么就将min的栈顶也弹出
			}
			return value;
		}

		public int getmin() {
			if (this.stackMin.isEmpty()) {
				throw new RuntimeException("Your stack is empty.");
			}
			return this.stackMin.peek();
		}
	}

	public static class MyStack2 {		//方法二：同步压栈
		private Stack<Integer> stackData;
		private Stack<Integer> stackMin;

		public MyStack2() {
			this.stackData = new Stack<Integer>();
			this.stackMin = new Stack<Integer>();
		}

		public void push(int newNum) {
			if (this.stackMin.isEmpty()) { //min栈中为空的时候，不再比较，直接压
				this.stackMin.push(newNum);
			} else if (newNum < this.getmin()) {//当前数和min栈的栈顶比，如果当前数比min栈的栈顶小，就压当前数，
				this.stackMin.push(newNum);
			} else {								//否则就重复压入一个min栈的栈顶
				int newMin = this.stackMin.peek();
				this.stackMin.push(newMin);
			}
			this.stackData.push(newNum);
		}

		public int pop() {
			if (this.stackData.isEmpty()) {
				throw new RuntimeException("Your stack is empty.");
			}
			this.stackMin.pop();
			return this.stackData.pop();
		}

		public int getmin() {
			if (this.stackMin.isEmpty()) {
				throw new RuntimeException("Your stack is empty.");
			}
			return this.stackMin.peek();
		}
	}

	public static void main(String[] args) {
		MyStack1 stack1 = new MyStack1();
		stack1.push(3);
		System.out.println(stack1.getmin());
		stack1.push(4);
		System.out.println(stack1.getmin());
		stack1.push(1);
		System.out.println(stack1.getmin());
		System.out.println(stack1.pop());
		System.out.println(stack1.getmin());

		System.out.println("=============");

		MyStack1 stack2 = new MyStack1();
		stack2.push(3);
		System.out.println(stack2.getmin());
		stack2.push(4);
		System.out.println(stack2.getmin());
		stack2.push(1);
		System.out.println(stack2.getmin());
		System.out.println(stack2.pop());
		System.out.println(stack2.getmin());
	}

}
