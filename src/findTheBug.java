public class findTheBug {
    public int findTheBug(String word) {
        // TODO:

        for (int i =0; i< word.length(); i++){
            if (word.charAt(i)=='#'){
                return i;
            }
        }
        return -1;


    }
}
