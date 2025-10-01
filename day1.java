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
        int reverse1 =0;
        for(; n>0; n/=10){
            int digit = n % 10;
            reverse1 = reverse1 * 10 + digit;
        }
        return reverse1;
    }
}

class Solution {
  public boolean isPalindrome(int n) {

    int rev = 0;
    int check = n;

    for (; n > 0; n /= 10) {
      int store = n % 10;

      rev = rev * 10 + store;
    }

    if (rev == check) {
      return true;
    }

    return false;
  }
}