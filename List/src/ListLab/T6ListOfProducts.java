package ListLab;

import java.util.*;

public class T6ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countProduct = Integer.parseInt(scanner.nextLine());
        List<String> productList = new ArrayList<>();
        for (int i = 0; i < countProduct; i++) {
            productList.add(scanner.nextLine());
        }Collections.sort(productList);
        for (int i = 0; i < productList.size(); i++) {
            System.out.println((i+1)+"."+productList.get(i));
        }
    }
}
