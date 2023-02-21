public class makePermutationss {


    public String makePermutations(String str) {
        // TODO:
        String concat_strs="";
        if(str == ""){return "";}
        for(int i = 0; i <str.length(); i++){
            for (int j=0; j <str.length(); j++){

                    concat_strs = concat_strs + str.charAt(i) + str.charAt(j) + ",";

            }
        }

        return concat_strs.substring(0,concat_strs.length()-1);


    }

}
