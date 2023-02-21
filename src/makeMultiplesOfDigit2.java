public class makeMultiplesOfDigit2 {
    public int makeMultiplesOfDigit2(int num1, int num2) {
        //TODO:
        int max=0, min=0,count=0;
        if (num2>num1){
            max=num2;
            min=num1;
        }
        else{
            max=num1;
            min=num2;
        }

        for (;min<=max;min++){
            if (min == 0){
                continue;
            }
            else if (min % 2 ==0){
                count++;
            }

        }
        return count;

    }
}
