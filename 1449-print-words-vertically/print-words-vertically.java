import java.util.*;
class Solution {
    public List<String> printVertically(String s) {
        s=s.trim();
        int n=s.length();
        int count=0;
        List<String> arr=new ArrayList<String>();
        for(int i=0;i<n;i++){
            if(i==n-1){
                arr.add(s.substring(count,n));
                break;
            }
            if(s.charAt(i)==' '){
                arr.add(s.substring(count,i));
                count=i+1;
            }
        }
        List<String> twist=new ArrayList<String>();
        int arraysize=arr.size();
        int maxarraywordlength=arr.get(0).length();
        for(int i=0;i<arraysize;i++){
            if(arr.get(i).length()>=maxarraywordlength){
                maxarraywordlength=arr.get(i).length();
            }
        }
        for(int i=0;i<maxarraywordlength;i++){
            String temp="";
            for(int j=0;j<arraysize;j++){
                if(i<arr.get(j).length()){
                temp=temp+arr.get(j).charAt(i);
                }
                else{ 
                    temp=temp+' ';
                }
            }
            temp=temp.stripTrailing();
            twist.add(temp);
        }
        return twist;
    }
}