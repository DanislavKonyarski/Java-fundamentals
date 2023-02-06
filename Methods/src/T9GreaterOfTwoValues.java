import java.util.Scanner;

public class T9GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input){
            case "int":
                int numOne = Integer.parseInt(scanner.nextLine());
                int numTwo = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(numOne,numTwo));
                break;
            case "char":
                char symOne = scanner.nextLine().charAt(0);
                char symTwo = scanner.nextLine().charAt(0);
                System.out.println(getMax(symOne,symTwo));
                break;
            case "string":
                String wordOne = scanner.nextLine();
                String wordTwo = scanner.nextLine();
                System.out.println(getMax(wordOne,wordTwo));
                break;
        }
    }
    public static int getMax (int numFirst, int numSecond){
        if(numFirst>numSecond){
            return numFirst;
        }else {
            return numSecond;
        }
    }
    public static char getMax (char symOne, char symTwo ){
        if (symOne>symTwo){
            return symOne;
        }else {
            return symTwo;
        }
    }
    public static String getMax (String strOne, String strTwo){
        if (strOne.compareTo(strTwo)>0){
            return strOne;
        }else {
            return strTwo;
        }
    }
}
