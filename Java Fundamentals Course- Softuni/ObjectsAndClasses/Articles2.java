package ObjectsAndClasses;

import java.util.*;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Articles2 {
    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
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

        void edit(String newContent) {
            this.content = newContent;
        }

        void changeAuthor(String newAuthor) {
            this.author = newAuthor;
        }

        void rename(String newTitle) {
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

        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articleList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] articleParts = scanner.nextLine().split(", ");
            Article article = new Article(articleParts[0], articleParts[1], articleParts[2]);
            articleList.add(article);
        }
        String orderBy = scanner.nextLine();
        switch (orderBy) {
            case "title":
                articleList.stream().sorted(Comparator.comparing(article -> article.title))
                        .forEach(article -> System.out.println(article.toString()));
                break;
            case "content":
                articleList.stream().sorted(Comparator.comparing(article -> article.content))
                        .forEach(article -> System.out.println(article.toString()));
                break;
            case "author":
                articleList.stream().sorted(Comparator.comparing(article -> article.author))
                        .forEach(article -> System.out.println(article.toString()));
                break;
        }
    }

}
