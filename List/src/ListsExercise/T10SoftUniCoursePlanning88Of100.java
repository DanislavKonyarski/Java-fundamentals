package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T10SoftUniCoursePlanning88Of100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputLine = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.startsWith("course start")) {
            List<String> commandList = Arrays.stream(command.split(":")).collect(Collectors.toList());
            if (commandList.get(0).startsWith("Add")) {
                if (!inputLine.contains(commandList.get(1))) {
                    inputLine.add(commandList.get(1));
                }
            } else if (commandList.get(0).startsWith("Insert")) {
                if (!inputLine.contains(commandList.get(1)) &&
                        Integer.parseInt(commandList.get(2)) >= 0 &&
                        Integer.parseInt(commandList.get(2)) <= inputLine.size() - 1) {
                    inputLine.add(Integer.parseInt(commandList.get(2)), commandList.get(1));
                }
            } else if (commandList.get(0).startsWith("Remove")) {
                if (inputLine.get(inputLine.size() - 1).contains(commandList.get(1))) {
                    inputLine.add(inputLine.size(), "");
                }
                if (inputLine.contains(commandList.get(1))) {
                    int index = inputLine.indexOf(commandList.get(1));
                    if (inputLine.get(index + 1).contains(commandList.get(1))) {
                        inputLine.remove(index);
                        inputLine.remove(index);
                    } else {
                        inputLine.remove(commandList.get(1));
                    }
                }
                if (inputLine.get(inputLine.size() - 1).equals("")) {
                    inputLine.remove(inputLine.size() - 1);
                }
            } else if (commandList.get(0).startsWith("Swap")) {
                if (inputLine.contains(commandList.get(1)) &&
                        inputLine.contains(commandList.get(2))) {
                    int indexOne = inputLine.indexOf(commandList.get(1));
                    int indexTwo = inputLine.indexOf(commandList.get(2));
                    if (inputLine.get(inputLine.size() - 1).contains(commandList.get(1))
                            || inputLine.get(inputLine.size() - 1).contains(commandList.get(2))) {
                        if (!inputLine.get(inputLine.size() - 1).contains("Exercise")) {
                            inputLine.add(inputLine.size(), "");
                        }
                    }
                    if (inputLine.get(indexTwo + 1).contains(commandList.get(2)) &&
                            inputLine.get(indexOne + 1).contains(commandList.get(1))) {
                        String currentLessonIndexOne = inputLine.get(indexOne);
                        String currentExerciseIndexOne = inputLine.get(indexOne + 1);
                        String currentLessonIndexTwo = inputLine.get(indexTwo);
                        String currentExerciseIndexTwo = inputLine.get(indexTwo + 1);
                        inputLine.set(indexOne,currentLessonIndexTwo);
                        inputLine.set(indexOne+1,currentExerciseIndexTwo);
                        inputLine.set(indexTwo,currentLessonIndexOne);
                        inputLine.set(indexTwo+1,currentExerciseIndexOne);
                    } else if (inputLine.get(indexTwo + 1).contains(commandList.get(2))) {
                        if (indexTwo>indexOne) {
                            String currentLesson = inputLine.get(indexTwo);
                            String currentExercise = inputLine.get(indexTwo + 1);
                            String currentLessonTwo = inputLine.get(indexOne);
                            inputLine.set(indexTwo, currentLessonTwo);
                            inputLine.set(indexOne, currentLesson);
                            inputLine.remove(currentExercise);
                            inputLine.add(indexOne + 1, currentExercise);
                        }else {
                            String currentLesson = inputLine.get(indexTwo);
                            String currentExercise = inputLine.get(indexTwo + 1);
                            String currentLessonTwo = inputLine.get(indexOne);
                            inputLine.set(indexTwo, currentLessonTwo);
                            inputLine.set(indexOne, currentLesson);
                            inputLine.add(indexOne + 1, currentExercise);
                            inputLine.remove(currentExercise);
                        }
                    } else if (inputLine.get(indexOne + 1).contains(commandList.get(1))) {
                        if (indexOne<indexTwo) {
                            String currentLesson = inputLine.get(indexOne);
                            String currentExercise = inputLine.get(indexOne + 1);
                            String currentLessonTwo = inputLine.get(indexTwo);
                            inputLine.set(indexOne, currentLessonTwo);
                            inputLine.set(indexTwo, currentLesson);
                            inputLine.add(indexTwo + 1, currentExercise);
                            inputLine.remove(indexOne + 1);
                        }else {
                            String currentLesson = inputLine.get(indexOne);
                            String currentExercise = inputLine.get(indexOne + 1);
                            String currentLessonTwo = inputLine.get(indexTwo);
                            inputLine.set(indexOne, currentLessonTwo);
                            inputLine.set(indexTwo, currentLesson);
                            inputLine.remove(indexOne + 1);
                            inputLine.add(indexTwo + 1, currentExercise);
                        }


                    } else {
                        String currentLesson = inputLine.get(indexOne);
                        String currentLessonTwo = inputLine.get(indexTwo);
                        inputLine.set(indexOne,currentLessonTwo);
                        inputLine.set(indexTwo,currentLesson);
                    }
                    if (inputLine.contains("")) {
                        inputLine.remove("");
                    }
                }
            } else if (commandList.get(0).startsWith("Exercise")) {
                if (inputLine.contains(commandList.get(1))) {
                    int index = inputLine.indexOf(commandList.get(1));
                    inputLine.add(index + 1, String.format("%s-Exercise", commandList.get(1)));
                } else {
                    inputLine.add(commandList.get(1));
                    inputLine.add(String.format("%s-Exercise", commandList.get(1)));
                }
            }
            command = scanner.nextLine();
        }
        int i = 1;
        for (String item : inputLine) {
            System.out.println(i + "." + item);
            i++;
        }
    }
}
