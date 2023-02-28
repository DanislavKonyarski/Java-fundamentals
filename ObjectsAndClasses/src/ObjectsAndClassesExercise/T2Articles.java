package ObjectsAndClassesExercise;

import java.util.Scanner;

public class T2Articles {
    static class Articles {
        String title;
        String content;
        String author;

        public Articles(String title, String content, String author){
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return title+" - "+content+": "+author ;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public void setContent(String content) {
            this.content = content;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(", ");
        Articles articles = new Articles(inputArr[0],inputArr[1],inputArr[2]);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] commandArr = scanner.nextLine().split(": ");
            if (commandArr[0].equals("Edit")){
                articles.setContent(commandArr[1]);
            } else if (commandArr[0].equals("ChangeAuthor")) {
                articles.setAuthor(commandArr[1]);
            } else if (commandArr[0].equals("Rename")) {
                articles.setTitle(commandArr[1]);
            }

        }
        System.out.println(articles);
    }
}
