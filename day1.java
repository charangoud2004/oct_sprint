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

class p4{
  public int GCD(int n1, int n2) {
    n1 = Math.abs(n1);
    n2 = Math.abs(n2);
    // Euclidean algorithm 1
    while (n2 != 0) {
      int temp = n2;
      n2 = n1 % n2;
      n1 = temp;
    }
    return n1; // n1 is now the GCD
  }
}

class p5 {
  public boolean isArmstrong(int n) {
    int digit = 0;
    int numSum = 0;
    int compare = n;
    int comp = n;
    for (; comp > 0; comp /= 10) {
      digit++;
    }
    for (; n > 0; n /= 10) {
      int Num = n % 10;
      Num = (int) Math.pow(Num, digit);
      numSum = Num + numSum;
    }
    if (numSum == compare) {
      return true;
    }
    return false;
  }
}

class p6 {
  public boolean isPrime(int n) {
    // your code goes here
    int counter = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        counter++;
      }
    }
    if (counter == 2) {
      return true;
    }
    return false;
  }
}

class p7 {
  public void printNumbers(int n) {
    if (n == 0) return;
    System.out.println(n);
    printNumbers(n - 1);
  }
}

class p8 {
  public int NnumbersSum(int N) {
    if (N == 0) return 0;
    return N + NnumbersSum(N - 1);
  }
}

class pda9 {

  public int fib(int n) {
    // your code goes here
    if (n == 0 || n == 1) return n;
    return fib(n - 1) + fib(n - 2);
  }
}
