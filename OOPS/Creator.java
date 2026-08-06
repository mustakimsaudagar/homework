package OOPS;

public class Creator extends User3 implements PostActions {

    Post post;

    Creator(String name, Post post) {
        super(name);
        this.post = post;
    }

    @Override
    public void CreatePost() {
        System.out.println(name + " created a new post.");
        System.out.println("Caption : " + post.getCaption());
    }

    @Override
    void LikeComment() {
        System.out.println("Creator can like and reply to comments.");
    }
}
