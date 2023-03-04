package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class T6StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!studentMap.containsKey(student)){
                studentMap.put(student,new ArrayList<>());
                studentMap.get(student).add(grade);
            }else {
                studentMap.get(student).add(grade);
            }
        }
        for (Map.Entry<String, List<Double>> entry : studentMap.entrySet()) {
            double grade = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                grade+=entry.getValue().get(i);
            }
            double averageGrade = grade / entry.getValue().size();
            if (averageGrade>=4.5){
            System.out.printf("%s -> %.2f%n",entry.getKey(),averageGrade);
            }
        }

    }
}
