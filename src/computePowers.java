public class computePowers {
    public int computePower(int base, int exponent) {
        // TODO:
        int bases = 1;
        for(int i = 1; i <=exponent;i++){
            bases *= base;
        }
        return bases;

    }

}
