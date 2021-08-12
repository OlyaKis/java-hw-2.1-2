public class Main {
    public static void main(String[] args) {
        int startCount = 100;
        int count = 1100;
        int refill = 1;
        int limit = 1000;
        int bonusSum;
            if (count > limit) {
                bonusSum = (count / 100) * refill;
            } else {
                bonusSum = 0;
        }
        int sum = startCount + count + bonusSum;
        System.out.println(sum);
    }
}