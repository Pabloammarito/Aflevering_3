import java.util.ArrayList;

 public class F {
     public static void main (String[] args) {


         RedditFrontPage frontPage = new RedditFrontPage();
         frontPage.addPost(new RedditFrontPage.RedditPost(" First post ", " John Doe "));
         frontPage.addPost(new RedditFrontPage.RedditPost(" Second post ", " Jane Smith "));
         System.out.println(frontPage.getPosts()); 
         frontPage.deletePost(0);
         System.out.println(frontPage.getPosts());
 }

     public static class RedditFrontPage {
         public ArrayList<RedditPost> posts;

         public RedditFrontPage() {
             this.posts = new ArrayList<>();
         }

         public ArrayList<RedditPost> getPosts() {
             return posts;
         }

         public void addPost(RedditPost post) {
             this.posts.add(post);
         }

         public void deletePost(int index) {
             this.posts.remove(index);
         }

         public static class RedditPost {
             public String title;
             public String author;

             public RedditPost(String title, String author) {
                 this.title = title;
                 this.author = author;
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
         }
     }}



