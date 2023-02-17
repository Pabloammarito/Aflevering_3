import java.time.LocalDate;


public class E {
    public static void main(String[] args) {

        RedditPost post = new RedditPost("My first post", "John Doe");
        System.out.println("Title: " + post.getTitle());
        System.out.println("Author: " + post.getAuthor());
        System.out.println("Post date: " + post.getPostDate());
        System.out.println("Upvotes: " + post.getUpvotes());
        System.out.println("Downvotes: " + post.getDownvotes());

    }


        static class RedditPost {
            public LocalDate postDate;
            public int upvotes;
            public int downvotes;
            public String title;
            public String author;

            public RedditPost(String title, String author) {
                this.postDate = LocalDate.now();
                this.upvotes = 1;
                this.downvotes = 1;
                this.title = title;
                this.author = author;
            }

            public LocalDate getPostDate() {
                return postDate;
            }

            public int getUpvotes() {
                return upvotes;
            }

            public void setUpvotes(int upvotes) {
                this.upvotes = upvotes;
            }

            public int getDownvotes() {
                return downvotes;
            }

            public void setDownvotes(int downvotes) {
                this.downvotes = downvotes;
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


    }


// Har prøvet den var svær, men for mig ser den rigtig ud!!