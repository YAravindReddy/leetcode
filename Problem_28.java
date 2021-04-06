class Solution {
    public int strStr(String haystack, String needle) {
         String s1=haystack;
        String s2=needle;
        int len= s2.length();
        char[] c= new char[len];
        //System.out.println(s1.contains(s2));
        if(s2.isEmpty()){
            return 0;
        }
        else if(s1.contains(s2)){
            return s1.indexOf(s2);
        }
        return -1;
    }
}