public class getSumOfFactors {
    public int getSumOfFactors(int num) {
        // TODO:
        int result = 0;
        int i=1;
        for (;i<=num;i++){
            if (num%i==0){
                result += i;
            }
        }
        return result;
    }
}


// while 문
//        while (true){
//            if(num%i==0){
//                result = result+i;
//                if(num == i || num == 0){
//                    return result;
//                }
//            }
//
//            i++;
//
//        }