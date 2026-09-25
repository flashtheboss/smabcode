class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int end=s.length()-1;
        int count=0;
        for(int i=end;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}