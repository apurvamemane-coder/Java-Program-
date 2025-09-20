public class DoWhileTable {
    public static void main(String[] args) {
        int i = 1;
        int number = 4;

        do {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        } while (i <= 10);
    }
}