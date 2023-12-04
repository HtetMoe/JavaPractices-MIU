package question8;

public class isVanilla {
    public static void main(String[] args) {
        int a[] = {-9999, 999, 99999, 9};
        System.out.println("result : " + isVanilla(a));
    }
    public static int isVanilla(int[] a) {
        if(a.length < 1) return 1;

        int num =  Math.abs(a[0]) % 10;
        for(int element : a){
            int value = Math.abs(element);
            while (value != 0){
                int digit = value % 10;
                if(digit != num) return 0;
                value /= 10; //update
            }
        }
        return 1;
    }
}
