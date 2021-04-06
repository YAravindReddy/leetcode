class Solution {
    public List<Integer> getRow(int rowIndex) {
         int[][] p=new int[rowIndex+1][rowIndex+1];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){

            for(int j=0;j<=i;j++){
                if(j == i || j==0){
                    p[i][j]=1;
                }
                else {
                    p[i][j] = p[i - 1][j] + p[i - 1][j - 1];
                }
                if(i==rowIndex)
                list.add(p[i][j]);
            }
        }
        return list;
    }
}