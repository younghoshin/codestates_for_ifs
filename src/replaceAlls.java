public class replaceAlls {
    public String replaceAll(String str, char from, char to) {
        // TODO:
        String sc ="";
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i)==from){
                sc = sc+to;
            }
            else {
                sc = sc + str.charAt(i);
            }
        }
        return sc;

    }
}
