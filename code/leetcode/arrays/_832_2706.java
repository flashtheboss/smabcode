package leetcode;
import java.util.Scanner;


public class _832_2706 {
    public static void main(String[] args){
        int m,n;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter no of rows");
        m=k.nextInt();
        System.out.println("Enter no of columns");
        n=k.nextInt();
        int[][] image=new int[m][n];

    }
    static int[][] invert(int[][] img,int m,int n){
        for(int i=0;i<m;i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                swap(img[i],start,end);
                start++;
                end--;
            }
            for(int k=0;k<n;k++){
                if(img[i][k]==0){
                    img[i][k]=1;
                }
                else{
                    img[i][k]=0;
                }
            }
        }
        return img[][];
    }
    static void swap(int[] arr,int a,int b){
            int temp=arr[b];
            arr[b]=arr[a];
            arr[a]=temp;
        }
}