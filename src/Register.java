import java.util.ArrayList;

public class Register implements  RegisterInterface {
    private String name;
    private String surname;
    private String email;
    private String pwd;

    public Register(String name, String surname, String email, String pwd) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEmail() {
        return email;
    }
    public ArrayList<ArrayList<String>> getData() {
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

        ArrayList<String> name = new ArrayList<String>();
        name.add("name");
        name.add(this.getName());
        data.add(name);

        ArrayList<String> surname = new ArrayList<String>();
        surname.add("surname");
        surname.add(this.getSurname());
        data.add(surname);

        ArrayList<String> email = new ArrayList<String>();
        email.add("email");
        email.add(this.getEmail());
        data.add(email);

        return data;
    }
}
