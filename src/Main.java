import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();

        out.println(a + 1);

        out.flush();
    }

  static class InchMetr {
      public static void main(String args[]) {

          double sizeInches;
          double sizeMeter;
          int counter;

          counter = 0;
          for (sizeInches = 1; sizeInches <= 100; sizeInches++) {
              sizeMeter = sizeInches / 39.72;
              System.out.println(sizeInches + " Inche " + sizeMeter + " Meter ");
          }
          counter++;
          if (counter == 12) {
              System.out.println();
              counter = 0;
          }
      }
  }

    static class WeightOnMoon {
        public static void main(String args[]) {
            double weightOnEarth = 86;
            double weightOnMoon = weightOnEarth * 0.17;

            System.out.println("Your weight on the moon is " + weightOnMoon + " kg");
        }
    }

    static class GalToLitTable {
        public static void main(String args[]) {
            double gallons; //variable for value gallons
            double liters; // variable for value litres
            int counter;

            counter = 0;
            {
                liters = gallons * 3.7854;

                System.out.println(gallons + " gallons corresponds to" + liters + " liers");

            }

            counter++;
            if (counter == 10) {
                {
                    System.out.println();
                }
                counter = 0;
            }
        }
    }
}