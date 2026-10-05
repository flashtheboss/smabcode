import java.util.HashSet;
class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> distinct = new HashSet<Character>();
        for(int i=0;i<sentence.length();i++){
            distinct.add(sentence.charAt(i));
        }
        if(distinct.size()==26){
            return true;
        }
        return false;
    }
}