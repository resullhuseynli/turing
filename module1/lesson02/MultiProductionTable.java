package module1.lesson02;

public class MultiProductionTable {

    public static void main(String[] args) {

        for (int i=1 ; i < 11 ; i++) {

            System.out.println("Multiplication table for " + i);
            System.out.println();

            for (int j=1 ; j<11 ; j++) {

                System.out.println(i + " * " + j + " = " + i*j);

            }
        }

    }
}
