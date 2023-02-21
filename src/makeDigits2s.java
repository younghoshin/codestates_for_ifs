public class makeDigits2s {
    public String makeDigits2(int num) {
        // TODO:
        int count = 2;
        String str ="1";
        while(count <= num){
            str = str +"-"+ count;
            count ++;
        }
        return str;
    }
}
