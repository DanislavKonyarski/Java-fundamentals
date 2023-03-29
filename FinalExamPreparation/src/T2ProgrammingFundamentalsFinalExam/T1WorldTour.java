package T2ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class T1WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder firstDestination = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Travel")){
          switch (command.split(":")[0]){
              case "Add Stop":
                  int index = Integer.parseInt(command.split(":")[1]);
                  String place = command.split(":")[2];
                  if (firstDestination.length()>index){
                      firstDestination.insert(index,place);
                      System.out.println(firstDestination);
                  }else {
                      System.out.println(firstDestination);
                  }
                  break;
              case "Remove Stop":
                    int startIndex = Integer.parseInt(command.split(":")[1]);
                    int endIndex = Integer.parseInt(command.split(":")[2]);
                    if (firstDestination.length()>startIndex&&firstDestination.length()>endIndex){
                        firstDestination.delete(startIndex,endIndex+1);
                        System.out.println(firstDestination);
                    }else {
                        System.out.println(firstDestination);
                    }
                  break;
              case "Switch":
                  String oldString = command.split(":")[1];
                  String newString = command.split(":")[2];
                  String currentString = firstDestination.toString();
                  int startIndexOfSwitch =  firstDestination.indexOf(oldString);
                  if (currentString.contains(oldString)){
                      firstDestination.replace(startIndexOfSwitch,startIndexOfSwitch+oldString.length(),newString);
                      System.out.println(firstDestination);
                  }else {
                      System.out.println(firstDestination);
                  }

                  break;
          }
            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: "+firstDestination);
    }
}
