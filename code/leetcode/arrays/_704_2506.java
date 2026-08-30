package leetcode;
import java.util.Scanner;
import java.util.Arrays;

public class _704_2506 {
    public static void main(String[] args){
        int target=8;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter length of array to input");
        int l=a.nextInt();
        int[] nums=new int[l];
        System.out.println("enter array element one by one");
        for(int i=0;i<l;i++){
            nums[i]=a.nextInt();
        }
        int k=search(nums,target);
        if(k==-1){
            System.out.println("target element not found");
        }
        else{
            System.out.println("target element at "+k);
        }
    }
    static int search(int[] n,int t){
        int start=0;
        int end=n.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(t<n[mid]){
                end=mid-1;
            }
            else if(t>n[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
