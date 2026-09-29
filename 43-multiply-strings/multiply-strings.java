class Solution {
    public String multiply(String num1, String num2) {
        int n1=num1.length();
        int n2=num2.length();
        String PRO= pro(num1,n1,num2,n2);
        return PRO;
    }
    static String pro(String num1,int n1,String num2,int n2){
        int[] finale=new int[n1+n2];
        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                int dig1=num1.charAt(i)-'0';
                int dig2=num2.charAt(j)-'0';
                finale[i+j+1]+=dig1*dig2;
            }
        }
        for(int i=(n1+n2-1);i>0;i--){
            int digit=finale[i]%10;
            int pass=finale[i]/10;
            finale[i]=digit;
            finale[i-1]+=pass;
        }
        
        int i=0;
        while(i<(n1+n2)&&finale[i]==0){
            i++;
        }
        String s="";
        if(i==n1+n2){
            s=s+"0";
            return s;
        }
        for(;i<(n1+n2);i++){
            s=s+finale[i];
        }
        return s;
    }
}