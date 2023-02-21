public class characterAndNumber {
    public String characterAndNumber(String word) {
        // TODO:
        String sc ="";
        for(int i =0; i < word.length(); i++){
            sc = sc+word.charAt(i)+i;
        }
        return sc;
    }
}
