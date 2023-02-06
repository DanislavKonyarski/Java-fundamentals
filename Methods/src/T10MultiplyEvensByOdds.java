import java.util.Scanner;

public class T10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInput = Integer.parseInt(scanner.nextLine());
        System.out.println(multiply(numInput));

    }
    public static int multiply(int num){
      //  num =Math.abs(num);
        int sumEven = 0;
        int sumOdd = 0;
        while (num!=0){
            int currentNum = num%10;
            num/=10;
                if (currentNum%2==0){
                    sumEven += currentNum;
                }else {
                    sumOdd+=currentNum;
                }
            }
        return sumEven*sumOdd;
    }
}
