import java.util.ArrayList;

public class Contact implements ContactInterface {
    private String subject;
    private String email;
    private String message;

    public Contact(String subject, String email, String message) {
        this.subject = subject;
        this.email = email;
        this.message = message;
    }

    public String getEmail() {
        return email;
    }
    public String getSubject() {
        return subject;
    }
    public String getMessage() {
        return message;
    }
    public ArrayList<ArrayList<String>> getData() {
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

        ArrayList<String> subject = new ArrayList<String>();
        subject.add("subject");
        subject.add(this.getSubject());
        data.add(subject);

        ArrayList<String> email = new ArrayList<String>();
        email.add("email");
        email.add(this.getEmail());
        data.add(email);

        ArrayList<String> message = new ArrayList<String>();
        message.add("message");
        message.add(this.getMessage());
        data.add(message);

        return data;
    }
}

