package E1ProgrammingFundamentalsFinalExamRetake;

import java.util.*;

public class T3NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCar = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> carMap = new LinkedHashMap<>();
        for (int i = 0; i < countCar; i++) {
            String[] inputCar = scanner.nextLine().split("\\|");
            if (!carMap.containsKey(inputCar[0])) {
                String car = inputCar[0];
                int km = Integer.parseInt(inputCar[1]);
                int fuel = Integer.parseInt(inputCar[2]);
                carMap.put(car, new ArrayList<>());
                carMap.get(car).add(km);
                carMap.get(car).add(fuel);
            }
        }
        String inputCommand = scanner.nextLine();
        while (!inputCommand.equals("Stop")) {
            String[] command = inputCommand.split("\\s*:\\s*");
            switch (command[0]) {
                case "Drive":
                    String car = command[1];
                    int distance = Integer.parseInt(command[2]);
                    int fuel = Integer.parseInt(command[3]);
                    if (carMap.get(car).get(1) < fuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carMap.get(car).add(0, carMap.get(car).get(0) + distance);
                        carMap.get(car).remove(1);
                        carMap.get(car).add(1, carMap.get(car).get(1) - fuel);
                        carMap.get(car).remove(2);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                    }
                    if (carMap.get(car).get(0) >= 100000) {
                        System.out.printf("Time to sell the %s!%n", car);
                        carMap.remove(car);
                    }
                    break;
                case "Refuel":
                    carMap.get(command[1]).add(1, carMap.get(command[1]).get(1) + Integer.parseInt(command[2]));
                    if (carMap.get(command[1]).get(1) > 75) {
                        int currentFuel = Integer.parseInt(command[2]) - (carMap.get(command[1]).get(1) - 75);
                        carMap.get(command[1]).add(1, 75);
                        carMap.get(command[1]).remove(2);
                        System.out.printf("%s refueled with %d liters%n", command[1], currentFuel);
                    } else {
                        System.out.printf("%s refueled with %s liters%n", command[1], command[2]);
                    }
                    break;
                case "Revert":
                    carMap.get(command[1]).set(0, carMap.get(command[1]).get(0) - Integer.parseInt(command[2]));
                    if (carMap.get(command[1]).get(0) < 10000) {
                        carMap.get(command[1]).set(0, 10000);
                        inputCommand = scanner.nextLine();
                        continue;
                    }
                    System.out.printf("%s mileage decreased by %s kilometers%n", command[1], command[2]);
                    break;
            }
            inputCommand = scanner.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : carMap.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }

    }
}
