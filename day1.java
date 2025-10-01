class day1 {
    public int countDigit(int n) {

       int counter = 0;
       for(; n >0 ; n/=10){
         counter++;
       }
       return counter;
    }
}