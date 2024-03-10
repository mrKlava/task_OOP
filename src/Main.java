//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();

        Contact contactTest1 = new Contact("sub1", "test1@email.com", "msg1");
        Contact contactTest2 = new Contact("sub2", "test2@email.com", "msg2");
        Contact contactTest3 = new Contact("sub3", "test3@email.com", "msg3");

        Contacts contacts = new Contacts();

        contacts.addContact(contactTest1);
        contacts.addContact(contactTest2);
        contacts.addContact(contactTest3);


        Register registerTest1 = new Register("Name1", "Surname1", "test1@email.com", "password1");


        /* Get data */

//        System.out.println( registerTest1.getData() );
//        System.out.println( contactTest1.getData() );
//        System.out.println( contacts.getData() );

        /* Converter */

//            // JSON
//        System.out.println( converter.toJSON(registerTest1.getData()) );
//        System.out.println( converter.toJSON(contactTest1.getData()) );
//        System.out.println( converter.listToJSON(contacts.getData()) );

//            // CSV
//        System.out.println( converter.toCSV(registerTest1.getData()) );
//        System.out.println( converter.toCSV(contactTest1.getData()) );
//        System.out.println( converter.listToCSV(contacts.getData()) );

//           // HTML
//        System.out.println( converter.toHTML(registerTest1.getData()) );
//        System.out.println( converter.toHTML(contactTest1.getData()) );
//        System.out.println( converter.listToHTML(contacts.getData()) );

        /* Abstract converter */

//            // JSON
//        System.out.println( ConverterAbstract.toJSON(registerTest1.getData()) );
//        System.out.println( ConverterAbstract.toJSON(contactTest1.getData()) );
//        System.out.println( ConverterAbstract.listToJSON(contacts.getData()) );

//            // CSV
//        System.out.println( ConverterAbstract.toCSV(registerTest1.getData()) );
//        System.out.println( ConverterAbstract.toCSV(contactTest1.getData()) );
//        System.out.println( ConverterAbstract.listToCSV(contacts.getData()) );

//            // HTML
//        System.out.println( ConverterAbstract.toHTML(registerTest1.getData()) );
//        System.out.println( ConverterAbstract.toHTML(contactTest1.getData()) );
//        System.out.println( ConverterAbstract.listToHTML(contacts.getData()) );

    }
}