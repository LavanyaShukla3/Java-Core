interface State {
    void publish(Document doc);
}
class DraftState implements State {

    public void publish(Document document) {
        System.out.println("Document moved from Draft to Review");
        document.setState(new ReviewState());
    }
}
class ReviewState implements State {

    public void publish(Document document) {

        if (document.isApproved()) {
            System.out.println("Document approved. Moving to Published");
            document.setState(new PublishedState());
        } else {
            System.out.println("Document rejected. Moving back to Draft");
            document.setState(new DraftState());
        }
    }
}
class PublishedState implements State {

    public void publish(Document document) {
        System.out.println("Document is already published");
    }
}

class Document {
    State currentState;
    boolean isApproved;

    public Document() {
        currentState = new DraftState();
    }
    public void publish() {
        currentState.publish(this);
    }
        public void setState(State state) {
        currentState = state;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

}
public class Main {

    public static void main(String[] args) {

        Document doc = new Document();

        // Draft -> Review
        doc.publish();

        // Review -> Published
        doc.setApproved(true);
        doc.publish();

        // Already Published
        doc.publish();
    }
}