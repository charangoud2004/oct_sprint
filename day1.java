class day1 {
    public int countDigit(int n) {

       int counter = 0;
       for(; n >0 ; n/=10){
         counter++;
       }
       return counter;
    }
}

class Solution {
    public int reverseNumber(int n) {      
        int reverse =0;
        for(; n>0; n/=10){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
        }
        return reverse;
    }
}