package EndlessIteration_1;

public class MainIterator {
    public static void main(String[] args) {
        int counter = 0;
        for (int r : new Randoms(0, 100)) {
            System.out.println(++counter + ". Случайное число: " + r);
            if (r == 100 || counter == 120) {
                if (r == 100) {
                    System.out.println("Выпало число " + r + ", давайте на этом закончим");
                } else System.out.println("Прошло " + counter + " итераций, давайте на этом закончим");
                break;
            }
        }
    }
}