import java.util.ArrayList;
import java.util.List;

public class EvenOddInArray {
    public static void main(String[] args) {
        //Khai báo 2 danh sách để lưu số chắn và số lẻ
        int[] numbers = {10, 5, 8, 3, 15, 22, 7};
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        //Duyệt qua từng phần tử của mảng và phân loại
        for(int number : numbers){
            if(number%2 == 0){
                evenNumbers.add(number);
            }else {
                oddNumbers.add(number);
            }
        }

        //Output even list
        System.out.println("Even numbers: " + evenNumbers);
        //Output odd list
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
