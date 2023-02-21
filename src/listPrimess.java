public class listPrimess {
    public String listPrimes(int num) {
        // TODO:
        //입력이 2보다 크기 때문에 2를 미리 대입함
        String str ="2";

        //소수판별을 위한 카운터
        int counts = 0;

        //2가 이미 문자열에 있기 때문에 3부터 연산시작
        for(int i=3; i <= num; i++){

            //카운터를 세기위한 for문
            for(int j=1; j<=i; j++) {
                //나머지가 없이 딱 나눠 떨어지는 횟수를 카운터에 저장
                if (i % j == 0) {
                    counts++;
                }
            }
            //for문을 빠져 나오고 카운터가 2인지 판별함
            //소수는 자기자신과 1로만 나눠지기 때문에 카운터가 2이면 소수이다
            if(counts ==2){
                //확인된 소수를 문자열 변수 str에 저장함
                str= str +'-'+i;
            }

            //소수판별이 끝났으므로 다시 for문 연산전에 카운터를 초기화함
            counts =0;

        }
        return str;

    }


}
//&& (i>Integer.parseInt(set))