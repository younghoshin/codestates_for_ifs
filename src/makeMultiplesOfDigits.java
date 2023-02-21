public class makeMultiplesOfDigits {

    public String makeMultiplesOfDigit(int num) {
        // TODO:
        String count = "";
        for (int i =1; i<=num; i++){
            if(i%3==0){
                count = count + i;
            }
        }
        return count;


    }

}
