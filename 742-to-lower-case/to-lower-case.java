class Solution {
    public String toLowerCase(String s) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if((arr[i]<=90)&&(arr[i]>=65)){
                arr[i]+=32;
            }
        }
        s=new String(arr);
        return s;
    }
}