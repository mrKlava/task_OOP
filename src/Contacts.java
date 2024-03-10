import java.util.ArrayList;

public class Contacts implements ContactsInterface {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    public Contacts() {};
    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }
    public ArrayList<ArrayList<ArrayList<String>>> getData() {
        ArrayList<ArrayList<ArrayList<String>>> data = new ArrayList<ArrayList<ArrayList<String>>>();

        this.contacts.forEach((contact -> {
            data.add(contact.getData());
        }));

        return data;
    }
}
