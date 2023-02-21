public class hasRepeatedCharacters {
    public static boolean hasRepeatedCharacters(String str) {
        // TODO:
        for(int i = 0; i <= str.length(); i++){
            for (int j=0;j <= str.length();j++ ){
                if(i==j){}
                if( i!=j && str.charAt(j) == str.charAt(i)){
                    return true;
                }
            }
        }
        return false;

    }
}