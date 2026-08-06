package OOPS;

public class Viewer extends User3 implements PostActions{


    Post post;

    Viewer(String name, Post post) {
        super(name);
        this.post = post;
    }

    @Override
    public void CreatePost() {
        System.out.println(name + " is viewing Post ID : " + post.getPostId());
    }

    @Override
    void LikeComment() {
        System.out.println("Viewer can like and comment on the post.");
    }

}
