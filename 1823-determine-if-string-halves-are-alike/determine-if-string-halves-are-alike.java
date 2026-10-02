class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        String a=s.substring(0,n/2);
        String b=s.substring(n/2);
        int count1=0;int count2=0;
        for(int i=0;i<n/2;i++){
            count1+=vowcount(a.charAt(i));
            count2+=vowcount(b.charAt(i));
        }
        if(count1==count2){
            return true;
        }
        return false;
    }
    static int vowcount(char c){
        int count=0;
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            {
                count++;
                break;
            }
            default:
                count=0;
        }
        return count;
    }
}