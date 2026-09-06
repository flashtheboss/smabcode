import java.util.ArrayList;
import java.util.Arrays;

class _442_0 {
    public static void main( String[] args){

    }
    public ArrayList<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        // sorting
        int i=0;
        int n=nums.length;
        while(i<n){
            int corr=nums[i]-1;
            if(nums[i]!=nums[corr]){
                swap(nums,corr,i);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=(j+1)){
                list.add(nums[j]);
            }
        }
        return list;

    }
    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}