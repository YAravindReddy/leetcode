class Solution {
    public int lengthOfLastWord(String s) {
       int j=0;
        String x=s.trim();
        StringBuilder sb= new StringBuilder();
        sb.append(x);
        sb.reverse();
        int len =x.length();

        for(int i=0;i<len;i++){

            if(sb. charAt(i)==' '){
                return i;
            }

        }
        return len;
    }
}