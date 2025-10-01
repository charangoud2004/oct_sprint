class p1 {
    public int countDigit(int n) {

       int counter = 0;
       for(; n >0 ; n/=10){
         counter++;
       }
       return counter;
    }
}

class p2 {
    public int reverseNumber(int n) {      
        int reverse1 =0;
        for(; n>0; n/=10){
            int digit = n % 10;
            reverse1 = reverse1 * 10 + digit;
        }
        return reverse1;
    }
}

class p3 {
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

class p4 {
  public int GCD(int n1, int n2) {
    n1 = Math.abs(n1);
    n2 = Math.abs(n2);

    // Euclidean algorithm
    while (n2 != 0) {
      int temp = n2;
      n2 = n1 % n2;
      n1 = temp;
    }
    return n1; // n1 is now the GCD
  }
}
