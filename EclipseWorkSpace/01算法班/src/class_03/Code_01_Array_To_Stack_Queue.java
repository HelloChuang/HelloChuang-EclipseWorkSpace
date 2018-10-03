package class_03;

/**
 * @author XX
 *用数组实现实现栈：
 *准备一个变量叫index  数组的size
  index的含义：如果新来一个数，我把新来的数放在什么位置
     新来一个数 index++
     弹出一个数 index--
     因为新来的数总是放在index指的位置上
 */


public class Code_01_Array_To_Stack_Queue {

	public static class ArrayStack {
		private Integer[] arr;
		private Integer index;    

		public ArrayStack(int initSize) {
			if (initSize < 0) {
				throw new IllegalArgumentException("The init size is less than 0");
			}
			arr = new Integer[initSize];
			index = 0;
		}

		public Integer peek() {//取数并不弹出，不修改index就可以了
			if (index == 0) {
				return null;
			}
			return arr[index - 1];
		}

		public void push(int obj) {//压一个数的时候，先把数给到指定index上，index再++
			if (index == arr.length) {
				throw new ArrayIndexOutOfBoundsException("The queue is full");
			}
			arr[index++] = obj;
		}

		public Integer pop() {//弹出一个数，先把--index，然后再弹出index位置的数，此时index位置上仍然有数，但是下一次压数的时候会把此时的数给覆盖掉
			if (index == 0) {
				throw new ArrayIndexOutOfBoundsException("The queue is empty");
			}
			return arr[--index];
		}
	}
	/**
	 * @author XX
	 *	用数组实现队列
	 *  size用来约束end和start的行为
	 *  
		如果end不大于3，那就把用户新给的数放到end的位置上去
		
		如果size！=0，用户找我要数的时候，总把start指向的数给用户
		
		end和size之间，start和size之间有关系，end和start之间是独立的
		
		end的轨迹是：只要它到底了，就回到开头，start不断在追end
	 */
	public static class ArrayQueue {
		private Integer[] arr;
		private Integer size;
		private Integer start;  //用来记录
		private Integer end;

		public ArrayQueue(int initSize) {
			if (initSize < 0) {
				throw new IllegalArgumentException("The init size is less than 0");
			}
			arr = new Integer[initSize];
			size = 0;
			start = 0;
			end = 0;
		}

		public Integer peek() {
			if (size == 0) {
				return null;
			}
			return arr[start];
		}

		public void push(int obj) { //如果end不大于3，那就把用户新给的数放到end的位置上去
			if (size == arr.length) {	
				throw new ArrayIndexOutOfBoundsException("The queue is full");
			}
			size++;
			arr[end] = obj;
			end = end == arr.length - 1 ? 0 : end + 1; 
		}

		public Integer poll() { //如果size！=0，用户找我要数的时候，总把start指向的数给用户
			if (size == 0) {
				throw new ArrayIndexOutOfBoundsException("The queue is empty");
			}
			size--;
			int tmp = start;	//先留住start的值，→
			start = start == arr.length - 1 ? 0 : start + 1;//因为start此时会变
			return arr[tmp];	
		}
	}

	public static void main(String[] args) {

	}

}
