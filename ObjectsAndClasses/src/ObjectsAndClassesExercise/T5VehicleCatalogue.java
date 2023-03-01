package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class T5VehicleCatalogue {
    static class Vehicles {
        String type;
        String model;
        String color;
        double horsePower;

        public Vehicles (String type, String model, String color, double horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Vehicles> vehiclesList = new ArrayList<>();
        while (!command.equals("End")){
            String[] commandArr = command.split("\\s+");
            Vehicles newVehicles = new Vehicles(commandArr[0],commandArr[1],commandArr[2],Double.parseDouble(commandArr[3]));
            vehiclesList.add(newVehicles);
            command = scanner.nextLine();
        }
        command =scanner.nextLine();
        while (!command.equals("Close the Catalogue")){
            for (Vehicles vehicles : vehiclesList) {
                if (vehicles.model.equals(command)){
                    System.out.printf("Type: %s%n" +
                            "Model: %s%n" +
                            "Color: %s%n" +
                            "Horsepower: %.0f%n",vehicles.type.substring(0,1).toUpperCase()+vehicles.type.substring(1),vehicles.model,vehicles.color,vehicles.horsePower);
                }
            }
            command= scanner.nextLine();
        }
        double sumCar = 0;
        double sumTruck = 0;
        int countCar = 0;
        int countTruck = 0;
        for (Vehicles vehicles : vehiclesList) {
            if (vehicles.type.equals("car")){
                sumCar+=vehicles.horsePower;
                countCar++;
            }else {
                sumTruck+=vehicles.horsePower;
                countTruck++;
            }
        }
        double resultCar =  sumCar/countCar;
        double resultTruck = sumTruck/countTruck;
        if (sumCar==0){
            resultCar = 0;
        }
        if (sumTruck==0){
            resultTruck = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n" +
                "Trucks have average horsepower of: %.2f.",resultCar,resultTruck);
    }
}
