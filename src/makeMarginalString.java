public class makeMarginalString {

    public static void main(String[] args) {
        makePermutationss mk = new makePermutationss();
        listPrimess lists = new listPrimess();


        System.out.println(lists.listPrimes(15));
        System.out.println(makeMarginalString(""));
        System.out.println(mk.makePermutations("87"));
    }

    public static String makeMarginalString(String str){
        // TODO:
        if (str =="" || str == null){
            return str;
        }
        String str2 ="";
        String concat_str=""+str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (i == 0){
                str2 = ""+str.charAt(i);
            }
            else {
                str2 += str.charAt(i);
                concat_str += str2 ;
            }
        }

        return concat_str;
    }

}
