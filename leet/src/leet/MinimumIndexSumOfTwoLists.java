package leet;

import java.util.HashMap;

public class MinimumIndexSumOfTwoLists {

	public static void main(String[] args) {
		
		// https://leetcode.com/problems/minimum-index-sum-of-two-lists/

		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list2 = {"KFC","Burger King","Tapioca Express","Shogun"};
		
		MinimumIndexSumOfTwoLists l = new MinimumIndexSumOfTwoLists();
		for(String str : l.findRestaurant(list1, list2)) {
		System.out.println(str);
		}
		
	}
	
	public String[] findRestaurant(String[] list1, String[] list2) {
        
		HashMap hmap1 = new HashMap();
		HashMap hmap2 = new HashMap();
		HashMap result = new HashMap();
		
		int cnt = 1;
		
		for(int i = 0; i < list2.length; i++) {
			
			for(int j = 0; j < list1.length; j++) {
				
				if(list2[i].equals(list1[j])) {
					
					hmap1.put(cnt, i + j);
					hmap2.put(cnt, list2[i]);
					cnt++;
				}
				
			}
		}
		
		int cnt2 = 0;
		int index = 0;
		
		if(hmap2.size() == 1) {
			
			result.put(1, hmap2.get(1));
			
		} else {
			
			int min = Integer.MAX_VALUE;
			
			for(int i = 1; i <= hmap1.size(); i++) {
				
				if((int)hmap1.get(i) < min) {
					
					min = (int)hmap1.get(i);
					index = i;
				}
				
			}
			
			HashMap num = new HashMap();
			int cnt3 = 1;
			
			for(int i = 1; i <= hmap1.size(); i++) {
				
				if(min == (int)hmap1.get(i)) {
					num.put(cnt3, hmap2.get(i));
					cnt3++;
					cnt2++;
				}
				
			}
			
			if(cnt2 == 0) {
				
				result.put(1, hmap2.get(index));
			
			} else {
				
				for(int i = 1; i <= cnt2; i++) {
					result.put(i, num.get(i));
				}
			}
			
		}
		
		String[] resultstr = new String[result.size()];
        for(int i = 0; i < resultstr.length; i++) {
            
            resultstr[i] = (String)result.get(i+1);
        }
        
        return resultstr;
        
    }

}
