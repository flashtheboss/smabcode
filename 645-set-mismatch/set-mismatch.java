class Solution {
    public int[] findErrorNums(int[] nums) {
        cyclesort(nums);
        int n=nums.length;
        int j;
        for(j=0;j<n;j++){
            if((j+1)!=nums[j]){
                break;
            }     
       }
       return new int[]{nums[j],j+1};
    }
    static void cyclesort(int[] arr){
        int i=0;
        int n=arr.length;
        while(i<n){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
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