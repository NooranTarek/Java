package packt.addressbook;

import packt.addressbook.model.Contact;
import packt.addressbook.util.ContactUtil;
import packt.addressbook.util.SortUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some sample contacts
        Contact contact1 = new Contact("1", "zyad", "Eng", "123-456-7890", "WorkPhone1", "omar@email.com");
        Contact contact2 = new Contact("2", "Omar", "Eng", "987-654-3210", "WorkPhone2", "rawan@email.com");

        // Create a list of contacts
        List<Contact> contacts = List.of(contact1, contact2);

        // Use ContactUtil to get contacts
        ContactUtil contactUtil = new ContactUtil(contacts);

        // Display all contacts
        System.out.println("All Contacts:");
        List<Contact> allContacts = contactUtil.getContacts();
        for (Contact contact : allContacts) {
            System.out.println(contact);
        }

        // Sort contacts by first name
        System.out.println("\nSorted Contacts by First Name:");
        List<Contact> sortedContacts = SortUtil.sortList(allContacts);
        for (Contact contact : sortedContacts) {
            System.out.println(contact);
        }
    }
}
