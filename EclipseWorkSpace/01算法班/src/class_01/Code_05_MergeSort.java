package class_01;

public class Code_05_MergeSort {
	public static void mergeSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		mergeSort(arr, 0, arr.length - 1);
	}

	public static void mergeSort(int[] arr, int l, int r) {
		if (l == r) {
			return;
		}
		int mid = l + ((r - l) >> 1); //l和r的中点位置
		mergeSort(arr, l, mid);
		mergeSort(arr, mid + 1, r);
		merge(arr, l, mid, r);
	}

	public static void merge(int[] arr, int l, int m, int r) {
		int[] help = new int[r - l + 1];  //辅助数组
		int i = 0;
		int p1 = l;	//左边第一个数
		int p2 = m + 1;	//右边第一个数
		while (p1 <= m && p2 <= r) { //p1和p2都不能越界
			help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++]; //排序过程，升序排入到help中，必有一个没有排完
		}
		//两个必有且仅有一个越界
		while (p1 <= m) {
			help[i++] = arr[p1++];
		}
		while (p2 <= r) {
			help[i++] = arr[p2++];
		}
		for (i = 0; i < help.length; i++) {  
			arr[l + i] = help[i];
		}
	}

}
