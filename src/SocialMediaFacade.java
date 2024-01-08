public class SocialMediaFacade {
    private Twitter twitter;
    private FaceBook faceBook;
    private LinkedIn linkedIn;
    public SocialMediaFacade(Twitter twitter, FaceBook facebook, LinkedIn linkedIn) {
        this.twitter = twitter;
        this.faceBook = facebook;
        this.linkedIn = linkedIn;
    }

    public void share(String message){
        this.twitter.setMessage(message);
        this.faceBook.setMessage(message);
        this.linkedIn.setMessage(message);
        this.twitter.share();
        this.faceBook.share();
        this.linkedIn.share();
    }
}
