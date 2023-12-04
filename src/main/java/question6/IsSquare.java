package question6;

public class IsSquare {
    public static void main(String[] args){
        int n = 16;
        System.out.println("result : " + isSquare(n));
    }

    public static int isSquare(int n) {
        int num = 1;
        while (num * num <= n)	{
            if (num * num == n)	return 1;
            num++;
        }
        return 0;
    }
}
