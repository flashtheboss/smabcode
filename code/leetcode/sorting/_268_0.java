package leetcode.sorting;

public class _268_0 {
    public static void main(String[] args){
        int[] arr={5,4,2,1,0};
        int n=5;
        System.out.println(missing(arr,n));
    }
    static int missing(int[] arr,int n){
        int i=0;
        while(i<=(n-1)){
            int correct=arr[i];
            if(correct<n && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }

        }
        int j=0;
        while(j<=(n-1)){
            if(j==arr[j]){
                j++;
            }
            else{
                break;
            }
        }
        return j;
    }
    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
