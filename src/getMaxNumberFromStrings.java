public class getMaxNumberFromStrings {
    public int getMaxNumberFromString(String str) {
        // TODO:
        int max = 0;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)>max+'0'){
                max = str.charAt(i) - '0';
            }
        }

        return max;



    }


}
