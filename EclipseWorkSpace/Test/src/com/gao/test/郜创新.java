package com.gao.test;

/**
 * @author XX
 *测试内容如下 :
1. 定义方法的格式 及基本解释
[访问限制符][限制符]+返回值+方法名([形参列表]){方法体}
[]中的可以写也可以不写，其它都不能省略

2. 定义一个打印 x * x 的乘法表  , 有一个 int 参数 x , 无返回值  ， 名字叫 showPrint（）    代码实现
3. 使用递归完成 1 - 100 的累加        代码实现

4. 数组的概念 及优点
数组是一个带索引的长度不可变的可以存储各种数据类型的容器
优点：方便存储，方便管理,改查快

5. 数组的声明初始化的三种方式 及 示例
静态初始化:int [] arr = {};
动态初始化:int [] arr = new int[Index];
动静结合初始化：int [] arr = new int[]{};

6. 自行实现选择排序(基础版 || 升级版)  代码实现
 */
public class 郜创新 {
	public static void main(String[] args) {
		showPrint(9);
		int [] arr = {5,6,1,3,8,4,6};
		selectSortHigh(arr);
		printArr(arr);
		int d = diGui();
		System.out.println(d);
	}
	public static void showPrint(int x){
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+"×"+j+"=="+i*j+"	");
			}
			System.out.println();
		}
	}
	public static int diGui(){
		int sum = 0;
		int count = 0;
		if(count ==100){return 100;}
		
		return sum = diGui()+1;
	}
	public static void selectSortLow(int[] arr){
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void selectSortHigh(int[] arr){
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[minIndex]>arr[j]){
					minIndex = j;
				}
			}
			if(minIndex!=i){
				temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
	}
	public static void printArr(int [] arr){
		for (int i : arr) {
			System.out.println(i);
		}
		
	}
}
