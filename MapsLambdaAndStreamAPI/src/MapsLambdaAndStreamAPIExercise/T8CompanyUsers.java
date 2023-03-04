package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class T8CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, List<String>> companyMap = new LinkedHashMap<>();
        while (!command.equals("End")) {
            String[] inputArr = command.split(" -> ");
            String companyName = inputArr[0];
            String idEmployees = inputArr[1];
            if (!companyMap.containsKey(companyName)) {
                companyMap.put(companyName,new ArrayList<>());
                companyMap.get(companyName).add(idEmployees);
            }else {
                    if (!companyMap.get(companyName).contains(idEmployees)){
                        companyMap.get(companyName).add(idEmployees);
                }
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : companyMap.entrySet()) {
            System.out.println(entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n",entry.getValue().get(i));

            }
        }

    }
}

