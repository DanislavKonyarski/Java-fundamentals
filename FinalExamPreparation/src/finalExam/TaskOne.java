package finalExam;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String spell = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Abracadabra")) {
            StringBuilder currentSpellSB = new StringBuilder();
            String command = input.split("\\s+")[0];
            if (command.equals("Abjuration")) {
                spell = spell.toUpperCase();
                System.out.println(spell);
            } else if (command.equals("Necromancy")) {
                spell = spell.toLowerCase();
                System.out.println(spell);
            } else if (command.equals("Illusion")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);
                String letter = input.split("\\s+")[2];
                if (spell.length() > index) {
                    currentSpellSB.append(spell);
                    currentSpellSB.replace(index, index + 1, letter);
                    spell = currentSpellSB.toString();
                    System.out.println("Done!");
                } else {
                    System.out.println("The spell was too weak.");
                }
            } else if (command.equals("Divination")) {
                String oldSubstring = input.split("\\s+")[1];
                String newSubstring = input.split("\\s+")[2];
                if (spell.contains(oldSubstring)){
                    spell = spell.replace(oldSubstring,newSubstring);
                    System.out.println(spell);
                }
            } else if (command.equals("Alteration")) {
                String substringForRemove = input.split("\\s+")[1];
                if (spell.contains(substringForRemove)){
                    spell = spell.replace(substringForRemove,"");
                    System.out.println(spell);
                }
            }else {
                System.out.println("The spell did not work!");
            }

            input = scanner.nextLine();
        }
    }
}
