class Solution {
    public int romanToInt(String s) {
        int number=0;
        for(int i=0;i<s.length()-1;i++){
            switch(s.charAt(i)){
                case 'M':
                    {
                        number+=1000;
                    }
                    break;
                case 'D':
                    {
                        if(s.charAt(i+1)!='M'){
                        number+=500;}
                        else{
                            number-=500;
                        }
                        break;
                    }
                case 'C':
                    {
                        if(s.charAt(i+1)!='M'&&s.charAt(i+1)!='D'){
                        number+=100;}
                        else{
                            number-=100;
                        }
                        break;
                    }
                case 'L':
                    {
                        if(s.charAt(i+1)!='M'&&s.charAt(i+1)!='D'&&s.charAt(i+1)!='C'){
                        number+=50;}
                        else{
                            number-=50;
                        }
                        break;
                    }
                case 'X':
                    {
                        if(s.charAt(i+1)=='I'||s.charAt(i+1)=='V'||s.charAt(i+1)=='X'){
                        number+=10;}
                        else{
                            number-=10;
                        }
                        break;
                    }
                 case 'V':
                    {
                        if(s.charAt(i+1)=='V'||s.charAt(i+1)=='I'){
                        number+=5;}
                        else{
                            number-=5;
                        }
                        break;
                    }
                case 'I':
                    {
                        if(s.charAt(i+1)=='I'){
                        number+=1;}
                        else{
                            number-=1;
                        }
                        break;
                    }
            }
        }
        int n=s.length();
        if(s.charAt(n-1)=='M'){
            number+=1000;
        }
        else if(s.charAt(n-1)=='D'){
            number+=500;
        }
        else if(s.charAt(n-1)=='C'){
            number+=100;
        }
        else if(s.charAt(n-1)=='L'){
            number+=50;
        }
        else if(s.charAt(n-1)=='X'){
            number+=10;
        }
        else if(s.charAt(n-1)=='V'){
            number+=5;
        }
        else{
            number+=1;
        }
        return number;
    }
}