package packt.addressbook.util;

import packt.addressbook.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactUtil {
    private List<Contact> contacts;

    public ContactUtil(List<Contact> contacts) {
        // Make a copy of the input list to ensure mutability
        this.contacts = new ArrayList<>(contacts);
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
