public class repeatStrings {

    public String repeatString(String str, int num) {
        String result = "";
        // TODO:
        if(num == 0 || str.isEmpty()){
            return "";
        }
        for(int i = 0; i<num; i++){
            result = result + str;

        }

        return result;



    }


}
