public class SumAndAverage {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 3, 15, 22, 7};
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }

        //Average numbers
        double average = sum/(double)numbers.length;

        //Output
        System.out.println("Sum: " +sum);
        System.out.println("Average: " + average);
    }

}
