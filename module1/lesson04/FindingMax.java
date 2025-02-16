package module1.lesson04;

public class FindingMax {

    public static void main(String[] args) {

        int[] numbers = {1,2,11,3,4,5,7,10,8,9};
        int result = 0;

        for (int number : numbers) {

            result = Math.max(result, number);

        }

        System.out.println(result);

    }

}
