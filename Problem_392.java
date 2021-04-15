class Solution {
    public boolean isSubsequence(String s, String t) {
       int i=0;
        int len= s.length();
        int l= t.length();
        if(len==0) return true;
        int j=0;
        while(i<len && j<l){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
            if(i==len){
                return true;
            } 
    }
        return false;
}
}