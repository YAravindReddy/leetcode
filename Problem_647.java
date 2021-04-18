class Solution {
    public int countSubstrings(String s) {
        if(s==null || s.length()<1) return 0;
        int start=0, end =0;
        int count=0;
        for(int i=0;i<s.length();i++){
            int len1= expand(s,i,i);
            count=count+len1;
            int len2= expand(s,i,i+1);
            count=count+len2;
        }
        return count;
    }
    private int expand(String s, int left, int right){
        int l=left,r= right;
        int count=0;
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            count++;
            l--;
            r++;
        }
        return count;
    }
}