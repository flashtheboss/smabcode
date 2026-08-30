package leetcode;
import java.util.Scanner;

public class _136_1 {
    public int paad(int[] nums){
            int result=0,i;
            for(i=0;i<nums.length;i++){
                result=result^nums[i];
            }
            return result;
    }

    public static void main(String[] args) {
        _136_1 obj=new _136_1();
        int i;
        Scanner in =new Scanner(System.in);
        System.out.println("enter length of array x");
        int l=in.nextInt();
        int[] x=new int[l];
        System.out.println("enter array element one by one");
        for(i=0;i<l;i++){
            x[i]=in.nextInt();
        }
        System.out.println(obj.paad(x));


    }
}