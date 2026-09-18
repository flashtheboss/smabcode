import java.util.Arrays;
class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        for(int a=0;a<n;a++){
        if(search(arr,arr[a]*2,a)){
            return true;
        }
       }
       return false;
    }
    static boolean search(int[] nums,int target,int exc){
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if((nums[mid]==target)&&(mid!=exc)){
                return true;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}    