class Solution {
    public int firstMissingPositive(int[] nums) {
        cyclesort(nums);
        int l=nums.length;
        int i;
        for(i=0;i<l;i++){
            if(nums[i]!=(i+1)){
                return i+1;
            }
        }
        return l+1;
    }
    static void cyclesort(int[] arr){
        int i=0;
        int n=arr.length;
        while(i<n){
            int correct=arr[i]-1;
            if((arr[i]<=n)&&(arr[i]>0)){
                if(arr[correct]!=arr[i]){
                swap(arr,correct,i);
                }
                else{
                    i++;
                }
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] nums,int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    } 
}