class Solution {
    public int findDuplicate(int[] nums) {
        int n=cyclic(nums);
        return n;
    }
    static int cyclic(int[] arr){
        int i=0;
        int k=arr.length;
        while(i<k){
            if(arr[i]!=(i+1)){
                int p=arr[i]-1;
                if(arr[p]!=arr[i]){
                    swap(arr,p,i);
                }
                else{
                    return arr[i];
                }
            }
            else{i++;}
        }
        return -1;
    } 
     static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
        }
}