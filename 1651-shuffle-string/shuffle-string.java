import java.util.HashMap;
class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character> cup =new HashMap<Integer,Character>();
        int n=s.length();
        for(int i=0;i<n;i++){
            cup.put(indices[i],s.charAt(i));
        }
        s="";
        for(int i=0;i<n;i++){
            s=s+cup.get(i);
        }
        return s;
    }
}