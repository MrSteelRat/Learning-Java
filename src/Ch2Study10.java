public class Ch2Study10 {
    public static void main(String[] args) {
        int numberOne = 0;
        int counter = 0;

        for (numberOne = 2; numberOne <= 100; numberOne++) {
            if (numberOne % 2 != 0 && numberOne % 3 != 0 && numberOne % 5 != 0 && numberOne % 7 != 0) {
                System.out.print(numberOne + " ");
            }
        }
    }
}
