class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> cum=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(lucky(matrix,i,j)){
                    cum.add(matrix[i][j]);
                }
            }
        }
        return cum;
    }
    static boolean lucky(int[][] arr,int i,int j){
        int min=arr[i][0];
        int max=arr[0][j];
        for(int a=0;a<arr[0].length;a++){
            if(arr[i][a]<min){
                min=arr[i][a];
            }
        }
         for(int b=0;b<arr.length;b++){
            if(arr[b][j]>max){
                max=arr[b][j];
            }
        }
        if((max==arr[i][j])&&(min==arr[i][j])){
            return true;
        }
        return false;
    }
}