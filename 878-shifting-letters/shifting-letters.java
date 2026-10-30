class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n=s.length();
        char[] arr=s.toCharArray();
        long sum=0;
        for(int q=0;q<n;q++){
            sum=sum+shifts[q];
        }
        long[] tat=new long[n];
        tat[0]=sum;
        for(int w=1;w<n;w++){
            sum=sum-shifts[w-1];
            tat[w]=sum;
        }
        
        for(int l=0;l<n;l++)
        {
                long k=tat[l]%26;
                if(k<=('z'-arr[l])){
                    arr[l]=(char)(arr[l]+k);
                }
                else{
                    arr[l]=(char)(arr[l]-(26-k));
                }
        }
        s=new String(arr);
        return s;
    }
}