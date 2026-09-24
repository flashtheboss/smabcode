class Solution {
    public int maximumProduct(int[] nums) {
         int n=nums.length;
        insertion(nums,n);
        int max1=nums[n-1]*nums[n-2]*nums[n-3];
        int max2=nums[0]*nums[1]*nums[n-1];
        if(max1>max2){
            return max1;
        }
        return max2;

    }
    static void insertion(int[] arr,int n){
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] nums,int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    } 
}