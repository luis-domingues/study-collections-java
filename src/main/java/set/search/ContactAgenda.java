package main.java.set.search;

import java.util.HashSet;
import java.util.Set;

public class ContactAgenda {
    private Set<Contact> contactSet;

    public ContactAgenda () {
        this.contactSet = new HashSet<> ();
    }

    public void addContact (String name, int number) {
        contactSet.add (new Contact (name, number));
    }

    public void displayContacts () {
        System.out.println (contactSet);
    }

    public Set<Contact> searchByName (String nome) {
        Set<Contact> contactsByName = new HashSet<> ();
        for (Contact c : contactSet) {
            if (c.getName ().startsWith (nome)) {
                contactsByName.add (c);
            }
        }

        return contactsByName;
    }

    public Contact updateContactNumber (String name, int newNumber) {
        Contact updatedContact = null;
        for (Contact c : contactSet) {
            if (c.getName ().equalsIgnoreCase (name)) {
                c.setNumber (newNumber);
                updatedContact = c;
                break;
            }
        }

        return updatedContact;
    }

    public static void main (String[] args) {
        ContactAgenda contactAgenda = new ContactAgenda ();

        contactAgenda.displayContacts ();

        contactAgenda.addContact ("Contato", 55555555);
        contactAgenda.addContact ("Contato novo", 66666666);
        contactAgenda.addContact ("Contato Faculdade", 111111);
        contactAgenda.addContact ("Luis", 236546);
        contactAgenda.addContact ("Contato professor", 111111);

        contactAgenda.displayContacts ();

        System.out.println (contactAgenda.searchByName ("Luis"));

        System.out.println ("Contato atualizado: " + contactAgenda.updateContactNumber ("Contato Faculdade", 2222222));

        contactAgenda.displayContacts ();
    }
}
