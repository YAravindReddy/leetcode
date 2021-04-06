class Solution {
    public List<List<Integer>> generate(int numRows) {
     int[][] p=new int[numRows][numRows];
        List<List<Integer>> result= new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j == i || j==0){
                    p[i][j]=1;
                }
                else {
                    p[i][j] = p[i - 1][j] + p[i - 1][j - 1];
                }
                list.add(p[i][j]);
            }
            result.add(list);
        }
        return result;   
    }
}