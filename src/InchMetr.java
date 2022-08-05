class InchMetr {
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