package com.jenny.leetcode;

public class findMaxConsecutiveOnes {
    
	    public int findMaxConsecutiveOnes(int[] nums) {
	        int count = 0;
	        int max = 0;
	        for (int i = 0;i<nums.length;i++) {
	            if(i ==0){
	                if(count>max) {
	                	max = count;
	                }
	                count = 0;
	                continue;
	            }
	            
	            count ++;

	        }
	        if(count>max){
	            max = count;
	        }
	        
	        return max;
	    }
}
