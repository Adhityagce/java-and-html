class NaturalNumbers {
    public static void main(String[] args) {
        int n = 10; 
        NaturalNumbers(1, n);
    }

    public static void NaturalNumbers(int current, int n) {
        if (current <= n) {
            System.out.print(" "+ current);
            NaturalNumbers(current + 1, n);
        }
    }
}
