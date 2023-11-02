package question6;

public class IsSquare {
    public static void main(String[] args){
        int n = 16;
        System.out.println("result : " + isSquare(n));
    }

    public static int isSquare(int n) {
        int i = 1;
        while (i * i <= n)	{
            if (i * i == n)	return 1;
            i++	;
        }
        return 0;
    }
}
