class Solution {
    public int arrangeCoins(int n) {
        int i=0;
        long k=1;
    while(i<n){
        if(((k*(k+1))/2)>n){
            break;
        }
        k++;
        i++;
    }    
    return i;    
    }
}