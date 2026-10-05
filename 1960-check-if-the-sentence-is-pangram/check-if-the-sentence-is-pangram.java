class Solution {
    public boolean checkIfPangram(String s) {
        boolean[] check=new boolean[26];
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i);
            check[val-97]=true;
        }
        for(int i=0;i<26;i++){
            if(check[i]==false){
                return false;
            }
        }
        return true;
    }
}