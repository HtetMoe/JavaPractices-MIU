package question19;

public class isHodder {
    /*
    - n must be prime
    - n =  2 power j - 1

    - find for 3, 7, 31, 127
     */
    public static void main(String[] args) {
        int n = 127;
        System.out.println("result : " + isHodder(n));
    }

    public static int isHodder(int n) {
        int ori   = n;
        int power = 0;

        //find j
        while (n > 0){
            if ( n % 2 != 0)  power ++;
            n /= 2;
        }
        //System.out.println("count " + count);

        //calculate power of 2
        int powerOf2 = 1;
        for(int i = 1; i <= power; i++){
            powerOf2 *= 2;
        }
        System.out.println("result : " + powerOf2);
        return powerOf2 - 1 == ori ? 1 : 0;
    }
}
