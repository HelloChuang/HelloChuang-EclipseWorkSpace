package class_01_test;

public class HeapSort_2 {
	public static void main(String[] args) {
		int [] arr = {3,5,1,2,7,6};
		heapSort(arr);
		print(arr);
	}
	public static void heapSort(int []arr){
		for (int i = 0; i < arr.length; i++) {
			heapInsert(arr, i);
		}
		int size = arr.length;
		swap(arr,0,--size);
		while(size>0){
			heapify(arr, 0, size);
			swap(arr, 0, --size);
		}
	}
	public static void heapInsert(int [] arr, int index){
		while(arr[index]>arr[(index - 1) / 2]){
			swap(arr,index,(index - 1) / 2);
			index = (index-1)/2;
		}
	}
	public static void heapify(int []arr,int index , int size){
		int left = index*2+1;
		while(left<size){
			int largst = left+1<size&&arr[left+1]>arr[left]?left+1:left;
			largst = arr[largst]>arr[index]?largst:index;
			if(largst==index)return;
			swap(arr,largst,index);
			index = largst;
			left = index*2+1;
		}
	}
	private static void swap(int[] arr, int x, int y) {
		if(arr[x]==arr[y])return;
		arr[x] ^= arr[y];
		arr[y] ^= arr[x];
		arr[x] ^= arr[y];
	
	}
	public static void print(int [] arr){
		for (int i : arr) {
			
			System.out.print(i+" ");
		}
	}
}
