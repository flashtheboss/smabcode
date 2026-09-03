package leetcode.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _448_0 {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter length of array to input");
        int l=a.nextInt();
        int[] nums=new int[l];
        System.out.println("enter array element one by one");
        for(int i=0;i<l;i++){
            nums[i]=a.nextInt();
        }
        cycle(nums);
        int[] left=left(nums);
        System.out.println(Arrays.toString(left));
    }
    static void cycle(int[] arr){
        int n=arr.length;
        int i=0;
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
    static int[] left(int[] arr){
        ArrayList<Integer> lefty =new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if((i+1)!=arr[i]){
                lefty.add(i+1);
            }
        }
        int[] lefty1=new int[lefty.size()];
        for(int j=0;j<lefty.size();j++){
            lefty1[j]=lefty.get(j);
        }
        return lefty1;
    }
    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
