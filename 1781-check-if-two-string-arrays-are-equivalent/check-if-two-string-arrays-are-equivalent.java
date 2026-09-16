class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n=word1.length;
        int l=word2.length;
        String a="";
        String b="";
        for(int i=0;i<n;i++){
            a=a.concat(word1[i]);
        }
        for(int i=0;i<l;i++){
            b=b.concat(word2[i]);
        }
        if(a.equals(b)){
            return true;
        }
        return false;
    }
}