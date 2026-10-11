class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        char[] correct=new char[n];
        for(int w=0;w<n;w++){
            correct[indices[w]]=s.charAt(w);
        }
        return new String(correct);
    }
}