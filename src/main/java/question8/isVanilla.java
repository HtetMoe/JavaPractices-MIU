package question8;

public class isVanilla {
    public static void main(String[] args) {
        int a[] = {-9999, 999, 99999, 9};
        System.out.println("result : " + isVanilla(a));
    }

    public static int isVanilla(int a[]) { //-9999
        if (a.length == 0) return 1;

        //find digit first
        int digitValue = a[0] % 10;
        digitValue = digitValue < 0 ? (0 - digitValue) : digitValue;
        //System.out.println(digit);

        for (int element : a) {
            element = element < 0 ? 0 - element : element; // change positive number
            while (element != 0) {
                int digit = element % 10;
                if (digit != digitValue) return 0;
                element = element / 10; //update
            }
        }
        return 1;
    }
}
