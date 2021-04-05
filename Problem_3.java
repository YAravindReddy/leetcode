package com.company;

import java.util.HashSet;

public class Problem_3 {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        HashSet<Character> hash_set = new HashSet();
        int j=0;
        int max_len = 0;
        int i=0;
        int current_length = 0;

        while(j<len){
            if(!hash_set.contains(s.charAt(j)) ){
                hash_set.add(s.charAt(j));
                j++;
                current_length=j-i;
                ///max_len=Math.max(hash_set.size(),max_len);
            }
            else{
                hash_set.remove(s.charAt(i));
                i++;
            }
            if(max_len< current_length){
                max_len=current_length;
                //System.out.println("value changed  from:"+ max_len);
            }

        }
        return max_len;
    }
}
