package question6;

public class IsLegalNumber {
    public static void main(String[] args){
        int a[] = {3, 7, 1};
        System.out.println(isLegalNumber(a, 6));
    }

    public static int isLegalNumber(int a[], int base) {
        for (int e : a) { // e : element
            if (e >= base) return 0;
        }
        return 1;
    }
}
