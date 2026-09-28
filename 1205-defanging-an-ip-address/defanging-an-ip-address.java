class Solution {
    public String defangIPaddr(String address) {
        String add="";
        int n=address.length();
        for(int i=0;i<n;i++){
            if(address.charAt(i)=='.'){
                add=add+"[.]";
            }
            else{
                add=add+address.charAt(i);
            }
        }
        return add;
    }
}