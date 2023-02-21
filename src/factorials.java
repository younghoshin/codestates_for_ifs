public class factorials {
    public int factorial(int num) {
        int result = 1;
        //TODO :

        for (int i=1; i<=num; i++){
            result *= i;
        }
        return result;
    }
}
