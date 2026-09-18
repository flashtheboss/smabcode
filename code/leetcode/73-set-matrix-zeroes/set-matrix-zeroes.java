class Solution {
    public void setZeroes(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        boolean[] row=new boolean[m];
        boolean[] col=new boolean[n];
        // chekc krrhe ki konse roew aur column ko udna ahai poora
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    row[i]=true;
                    col[j]=true;
               }
            }
        }
        // assign krrhe flag ko dekhte hue ki..kahi phle to nhi jab check kiy tab ye us row aur column ko hatae ki baat krrhea hai
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(row[i]||col[j]){
                    arr[i][j]=0;
                }
            }
        }
    }
}