package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class T4Songs {
    static class Song {
        String typeList ;
        String name ;
        String time;
        public Song (String typeList,String name,String time){
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Song> inputLine = new ArrayList<>();
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String[] inputArr = scanner.nextLine().split("_");
            Song newPlayList = new Song(inputArr[0],inputArr[1],inputArr[2]);
            inputLine.add(newPlayList);
        }
        String command = scanner.nextLine();
        if (command.equals("all")){
            for (Song song : inputLine) {
                System.out.println(song.name);
            }
        }else {
            for (Song song : inputLine) {
                if (command.equals(song.typeList)){
                    System.out.println(song.name);
                }
            }
        }
    }
}
