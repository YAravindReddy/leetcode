class Solution {
    public boolean isSubsequence(String s, String t) {
       int i=0;
        int l= t.length();
        if(s.length()==0) return true;
        int j=0;
        while(i<s.length() && j<l){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
            if(i==s.length()){
                return true;
            } 
    }
        return false;
}
}