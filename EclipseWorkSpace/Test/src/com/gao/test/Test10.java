package com.gao.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test10 {
	public static void main(String[] args) {
		String s  =  "a ";
		int count = lengthOfLastWord(s);
		System.out.println(count);
		
	}
	 public static int lengthOfLastWord(String s) {
	        int count = 0;

	        char[] c = s.toCharArray();
	        System.out.println(c.length);
         int j= 1;
         for(int i = c.length-1;i>=0;i--)
         {
              if(c[c.length-j]==' '){
                 j++;
                 continue;
             }
             else break;
         }
	        for (int i = c.length-1; i >=0; i--) {
             if(j==1){
                  if(c[c.length-j] == ' ')break;
				count++;
             }
             else{
                 if(c[i] == ' ')break;
				count++;
             }
                 
				
			}
	      
	        
	        return count;
	    }
}