package com.gao;

public class MergeSort {
	public static void main(String[] args) {
		
	}

	/// 归并排序之归：归并排序入口 
	public static int[] Sort(int[] data)
	{
	    //若data为null，或只剩下1 or 0个元素，返回，不排序
	    if (null == data || data.length <= 1)
	    {
	        return data;
	    }
	    //取数组中间下标
	    int middle = data.length >> 1;
	    //初始化临时数组left,right，并定义result作为最终有序数组，
	//若数组元素奇数个，将把多余的那元素空间预留在right临时数组
	    int[] left = new int[middle];
	    int[] right = new int[data.length - middle];
	    int[] result = new int[data.length];
	    for (int i = 0; i < data.length; i++)
	    {
	        if (i < middle)
	        {
	            left[i] = data[i];
	        }
	        else
	        {
	            right[i - middle] = data[i]; //此处i-middle，让我省掉定义一个j，性能有所提高
	        }
	    }
	    left = Sort(left);//递归左数组
	    right = Sort(right);//递归右数组
	    result = Merge(left, right);//开始排序
	    return result;
	}

	// 归并排序之并:排序在这一步
	//合并左右数组排序后返回
	public  static int[] Merge(int[] a, int[] b)
	{
	    
	    //定义结果数组，用来存储最终结果
	    int[] result = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;
	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])//左数组中元素小于右数组中元素
	        {
	            result[k++] = a[i++];//将小的那个放到结果数组
	        }
	        else//左数组中元素大于右数组中元素
	        {
	            result[k++] = b[j++];//将小的那个放到结果数组
	        }
	    }
	    while (i < a.length)//这里其实是还有左元素，但没有右元素 
	    {
	        result[k++] = a[i++];
	    }
	    while (j < b.length)//有右元素，无左元素
	    {
	        result[k++] = b[j++];
	    }
	    return result;//返回结果数组
		
	}
}

