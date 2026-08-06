package OOPS;

public class Main4 {

    public static void main(String[] args) {

        Post post = new Post();

        post.setPostId(654);
        post.setCaption("ENJOYING NATURE VIBES");

        Creator creator = new Creator("Mustakim", post);

        creator.CreatePost();
        creator.LikeComment();

        System.out.println("---------------------------------------");

        Viewer viewer = new Viewer("SOHEL", post);

        viewer.CreatePost();
        viewer.LikeComment();
    }

}
