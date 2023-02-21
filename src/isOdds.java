public class isOdds {
    public boolean isOdd(int num) {
        //조건문을 사용하여 짝수인 경우 return false를,
        //홀수인 경우 return true;를 작성해야 합니다.
        //TODO :
        num = Math.abs(num);
        while (true){
            if (num == 0){
                return false;
            } else if (num < 0) {
                return true;

            } else{
                num = num - 2;
            }

        }


    }
}
