package com.gao.test2;

import java.util.Arrays;

/**
 * public int length()
public boolean equals(Object anObject)
public int compareTo(String anotherString)
public int compareToIgnoreCase(String str)
public char charAt(int index)
public String concat(String str)
public boolean contains(CharSequence s)
public static String copyValueOf(char[] data)
public boolean endsWith(String suffix)
public int indexOf(int ch,int fromIndex)
public int lastIndexOf(int ch)
public boolean startsWith(String prefix)
public String substring(int beginIndex)
public char[] toCharArray()
public String toLowerCase()
public String toUpperCase()
public String trim()
 * @author XX
 *
 */
public class MyString implements Comparable<MyString>{
	
	private final  char [] value ;
	public MyString(){
		this.value = new char[0];
	}
	public MyString(String str){//TODO  下面把MyString的toCharArray写完就可以不用调用String了
		this.value = str.toCharArray();
	}
	public MyString(char [] c){
		this.value = c;
	}
	public int length(){
		return this.value.length;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyString){
			MyString ms = (MyString)obj;
			char [] v1 = value;
			char [] v2 = ms.value;
			int len1 = v1.length;
			int len2 = v2.length;
			if(len1 == len2){
				for (int i = 0; i < v2.length; i++) {
					if(v1[i]!=v2[i])return false;
					else return true;
				}
			}else return false;
	}else return false;
		return false;
}
	@Override
	public int compareTo(MyString o) {
		if(!(o instanceof MyString))return 0;
		MyString ms = (MyString)o;
		char [] v1 = value;
		char [] v2 = ms.value;
		int len1 = v1.length;
		int len2 = v2.length;
		if(len1 == len2){
			//TODO 如果都相等的话，该按照什么排序呢
		}else return len1-len2;
		return 0;
	}
	public char charAt(int index){
		if(index<0||index>value.length)new Exception();
		int len = value.length;
		char [] v = value;
		return v[index];
		//TODO  如果找不到，该返回声明值呢
	}
	public MyString concat(MyString str){
		char [] v1 = value;
		char [] v2 = str.value;
		int len1 = v1.length;
		int len2 = v2.length;
		char [] newArray = Arrays.copyOf(v1,len1+len2);
		System.arraycopy(v2, 0, newArray, len1, len2);
		return new MyString(newArray);
	}
	public boolean contains(MyString s){
		if(s==null)return true;
		char [] v1 = value;
		char [] v2 = s.value;
		int len1 = v1.length;
		int len2 = v2.length;
		int max = len1-len2;  //max为最多比的次数
		if(max<0)return false;
		for (int i = 0; i <= max; i++) {
			if(v1[i] == v2[0]){
				int y = i + 1;
	            int t = 1;
	            int ycount = 0;
	            for( ; ycount <= len2-2 ; t++ , y++ ,ycount++){
                    if( v1[y] != v2[t]){
                        break;
                    }
                }
	            if( t==len2)
                   // System.out.println(i);
	            	return true;
			}
		}
		
		
		return false;
	}
	
	public boolean startsWith(String prefix,int start){
		char [] v1 = value;
		char [] v2 = prefix.toCharArray();
		int start2 = 0;
		int len2 = v2.length;
		if((start<0)||(start>value.length-len2)){
			return false;
		}
		while(--len2>=0){
			if(v1[start++]!=v2[start2++]){
				return false;
			}
		}
		return true;
	}
	public boolean endsWith(String suffix){
		int len = suffix.length();
		
		return false;
	}
	static int indexOf(char[] source, int sourceOffset, int sourceCount,
            char[] target, int targetOffset, int targetCount,
            int fromIndex) {
        if (fromIndex >= sourceCount) {
            return (targetCount == 0 ? sourceCount : -1);
        }
        if (fromIndex < 0) {
            fromIndex = 0;
        }
        if (targetCount == 0) {
            return fromIndex;
        }

        char first = target[targetOffset];
        int max = sourceOffset + (sourceCount - targetCount);

        for (int i = sourceOffset + fromIndex; i <= max; i++) {
            /* Look for first character. */
            if (source[i] != first) {
                while (++i <= max && source[i] != first);
            }

            /* Found first character, now look at the rest of v2 */
            if (i <= max) {
                int j = i + 1;
                int end = j + targetCount - 1;
                for (int k = targetOffset + 1; j < end && source[j]
                        == target[k]; j++, k++);

                if (j == end) {
                    /* Found whole string. */
                    return i - sourceOffset;
                }
            }
        }
        return -1;
    }
	public static boolean contains2(MyString m){
		
		return false;
	}
	public static void printArray(MyString m){
		char [] v =  m.value;
		for (char c : v) {
			System.out.print(c+" ");
		}
		System.out.println();
		
	}
}
