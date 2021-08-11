public class Main {
    public static void main(String[] args) {
        int StartCount = 100;
        int count = 1100;
        int refill = 1;
        int limit = 1000;
            if (count >= limit) {
                int BonusSum = (count / 100) * refill;
                int sum = StartCount + count + BonusSum;
                System.out.println(sum);
            } else {
                int sum = StartCount + count;
                System.out.println(sum);
        }
    }
}