package MapsLambdaAndStreamAPILab;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class T1CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Map<Double,Integer> numberMap =new TreeMap<>();

        for (int i = 0; i < inputArr.length; i++) {
            if (numberMap.containsKey(inputArr[i])){
                numberMap.put(inputArr[i],numberMap.get(inputArr[i])+1);
            }else {
                numberMap.put(inputArr[i],1);
            }
        }
        for (Map.Entry<Double, Integer> entry : numberMap.entrySet()) {
            DecimalFormat bF = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n",bF.format(entry.getKey()),entry.getValue());
        }

    }
}
