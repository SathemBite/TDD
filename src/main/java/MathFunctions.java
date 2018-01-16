


public class MathFunctions {

    public static int fact(int n){
        int res = 1;

        for (; n > 1; n--){
            res *= n;
        }

        return res;
    }

    public static int addition(int a, int b){
        return a + b;
    }

    public static int deduction(int a, int b){
        return a - b;
    }

}
