public class countCharacter {
    public int countCharacter(String str, char letter) {
        // TODO:
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
