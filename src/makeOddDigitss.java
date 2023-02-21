public class makeOddDigitss {
    public String makeOddDigits(int num) {
        // TODO:
        int i =1;
        String str="";
        while(num!=0){
            str = str+i;
            i+=2;
            num -= 1;
        }
            return str;

    }
}
