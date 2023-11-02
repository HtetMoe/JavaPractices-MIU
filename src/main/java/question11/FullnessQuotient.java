package question11;

public class FullnessQuotient {
    /*
       the number of representations of n in bases 2 through 9 that have no zeroes anywhere after the most significant digit.
       ----> use module to convert number to binary
     */
    public static void main(String[] args){
        int n = 94;
        System.out.println("representation of " + n + " is " + fullnessQuotient(n));
    }
    public static int fullnessQuotient(int n) {
        //argument is less than 1 return -1
        if(n < 1) {
            return -1;
        }

        int count = 0;
        //representations of n in bases 2 through 9.
        for(int base = 2; base <= 9; base++) {
            int dividend = n;
            boolean hasRemainderZero = false;

            //find modulo until dividend is 0
            while(dividend != 0) {
                int remainder = dividend % base;
                if(remainder == 0) {
                    hasRemainderZero = true;
                    break;
                }
                dividend /= base; //update dividend
            }

            if(!hasRemainderZero) {
                count++;
            }
        }// end for

        return count;
    }
}
