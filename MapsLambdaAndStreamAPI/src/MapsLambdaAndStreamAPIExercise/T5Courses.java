package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class T5Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, List<String>> coursesMap = new LinkedHashMap<>();
        while (!command.equals("end")){
            String nameCourses = command.split(" : ")[0];
            String nameStudent = command.split(" : ")[1];
            if (!coursesMap.containsKey(nameCourses)){
                coursesMap.put(nameCourses,new ArrayList<>());
                coursesMap.get(nameCourses).add(nameStudent);
            }else {
                coursesMap.get(nameCourses).add(nameStudent);
            }

            command=scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : coursesMap.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());
            for (int i = 0; i < entry.getValue().size() ; i++) {
                System.out.printf("-- %s%n",entry.getValue().get(i));

            }
        }
    }
}
