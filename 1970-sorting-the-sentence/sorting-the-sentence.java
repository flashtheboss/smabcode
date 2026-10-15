class Solution {
    public String sortSentence(String s) {
        String[] l=new String[9];
        int start=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                l[s.charAt(i)-'0'-1]=s.substring(start,i);
                start=i+2;
            }
        }
        s="";
        for(int i=0;i<9;i++){
            if(l[i]==null){
                continue;
            }
            s=s+l[i]+" ";
        }
        s=s.trim();
        return s;
    }
}