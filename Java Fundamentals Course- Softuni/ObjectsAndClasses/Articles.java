package ObjectsAndClasses;

import java.util.Scanner;

public class Articles {
    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author){
            this.title = title;
            this.content = content;
            this.author = author;
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

        void edit(String newContent){
            this.content = newContent;
        }

        void changeAuthor(String newAuthor){
            this.author = newAuthor;
        }
         void rename(String newTitle){
            this.title = newTitle;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }
        public String toString(){
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] articleParts = scanner.nextLine().split(", ");
        Article article = new Article(articleParts[0],articleParts[1], articleParts[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            String[] commandParts = command.split(": ");
            String commandType = commandParts[0];

            switch (commandType){
                case "Edit":
                    article.setContent(commandParts[1]);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(commandParts[1]);
                    break;
                case "Rename":
                    article.setTitle(commandParts[1]);
                    break;

            }


        }
        System.out.println(article.toString());

    }

}
