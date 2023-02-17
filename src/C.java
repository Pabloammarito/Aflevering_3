import java.util.ArrayList;


class Article {
    public String title;
    public String author;
    public String content;
    public String publicationDate;

    public Article(String title, String author, String content, String publicationDate) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nContent: " + content + "\nPublication Date: " + publicationDate + "\n";
    }

    public static void main(String[] args) {
        // Create 5 articles
        Article article1 = new Article("How to code in Java", "John Doe", "In this article, we will explore the basics of Java programming.", "2022-01-01");
        Article article2 = new Article("The benefits of exercise", "Jane Smith", "In this article, we will discuss the various health benefits of regular exercise.", "2022-01-02");
        Article article3 = new Article("The history of the internet", "Bob Johnson", "In this article, we will trace the origins and evolution of the internet.", "2022-01-03");
        Article article4 = new Article("10 easy recipes for busy weeknights", "Alice Lee", "In this article, we will share some quick and simple dinner ideas for when you're short on time.", "2022-01-04");
        Article article5 = new Article("How to plan your dream vacation", "Tom Williams", "In this article, we will provide tips and advice for planning the perfect vacation.", "2022-01-05");

        // Add articles to ArrayList
        ArrayList<Article> articleList = new ArrayList<>();
        articleList.add(article1);
        articleList.add(article2);
        articleList.add(article3);
        articleList.add(article4);
        articleList.add(article5);

        // Print articles using toString() method
        for (Article article : articleList) {
            System.out.println(article.toString());


        }
    }
};