package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class T3Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, List<Double>> productMap = new LinkedHashMap<>();
        while (!command.equals("buy")){
            String[] inputLineArr = command.split(" ");
            String product = inputLineArr[0];
            double price = Double.parseDouble(inputLineArr[1]);
            double quantity = Double.parseDouble(inputLineArr[2]);
            if (!productMap.containsKey(product)){
                productMap.put(product,new ArrayList<>());
                productMap.get(product).add(price);
                productMap.get(product).add(quantity);
            }else {
                double currentQuantity =  productMap.get(product).get(1);
                productMap.get(product).set(0,price);
                productMap.get(product).set(1,currentQuantity+quantity);
            }

            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<Double>> entry : productMap.entrySet()) {
            System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue().get(0)*entry.getValue().get(1));
        }

    }
}
