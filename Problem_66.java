class Solution {
    public int[] plusOne(int[] digits) {
        
       int len = digits.length;
        ArrayList<Integer> x= new ArrayList<>();

        for(int i=0;i<len;i++){
          x.add(digits[i]);
        }
      for(int i=1;i<=len;i++){
          if(x.get(len-i)!=9)
          {
              x.set(len-i, 1+x.get(len-i));
              break;
          }
          else{
              x.set(len-i,0);
              if((len-i)==0){
                  x.add(0,1);
              }
          }
      }
      int[] y= new int[x.size()];
      for(int i=0;i<x.size();i++){
          y[i]=x.get(i).intValue();
      }
      return y;
    }
}