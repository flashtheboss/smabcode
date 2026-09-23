class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}