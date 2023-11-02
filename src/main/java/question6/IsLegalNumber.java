package question6;

public class IsLegalNumber {
    public static void main(String[] args){
        int a[] = {3, 2, 1};
        System.out.println(isLegalNumber(a, 3));
    }

    public static int isLegalNumber(int a[], int base) {
        for (int e : a) { // e : element
            if (e >= base) return 0;
        }
        return 1;
    }
}
