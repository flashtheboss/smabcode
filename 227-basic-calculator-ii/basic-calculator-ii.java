class Solution {
    public int calculate(String s) {
        HashSet<Character> op=new HashSet<Character>();
        op.add('+');
        op.add('-');
        op.add('/');
        op.add('*');
        int num=0;
        int lastnum=0;
        int result=0;
        char prevop='+';
        s=s.trim();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                continue;
            }
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            if(op.contains(ch)||(i==s.length()-1)){
               if(prevop=='+'){
                    result+=num;
                    lastnum=num;
               }
               else if(prevop=='-'){
                    result-=num;
                    lastnum=-num;
               }
               else if(prevop=='*'){
                    result-=lastnum;
                    lastnum=lastnum*num;
                    result+=lastnum;
               }
               else if(prevop=='/'){
                    result-=lastnum;
                    lastnum=lastnum/num;
                    result+=lastnum;
               }
               prevop=ch;
               num=0;
            }
        }
        return result;
    }
}