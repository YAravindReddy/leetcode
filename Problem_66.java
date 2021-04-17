class Solution {
    public int[] plusOne(int[] digits) {
        
        ArrayList<Integer> x= new ArrayList<>();

        for(int i=0;i<digits.length;i++){
          x.add(digits[i]);
        }
      for(int i=1;i<=digits.length;i++){
          if(x.get(digits.length-i)!=9)
          {
              x.set(digits.length-i, 1+x.get(digits.length-i));
              break;
          }
          else{
              x.set(digits.length-i,0);
              if((digits.length-i)==0){
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