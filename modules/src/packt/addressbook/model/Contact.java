package packt.addressbook.model;

public class Contact implements Comparable<Contact> {
    public String id;
    public String firstName;
    public String lastName;
    public String homePhone;
    public String workPhone;
    public String email;

    public Contact(String id, String firstName, String lastName, String homePhone, String workPhone, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.homePhone = homePhone;
        this.workPhone = workPhone;
        this.email = email;
    }

    @Override
    public int compareTo(Contact other) {
        return this.firstName.compareTo(other.firstName);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", workPhone='" + workPhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
