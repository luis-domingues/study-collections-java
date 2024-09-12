package main.java.map.basic_operation;

import java.util.HashMap;
import java.util.Map;

public class ContactAgenda {
    private Map<String, Integer> contactAgendaMap;

    public ContactAgenda () {
        this.contactAgendaMap = new HashMap<> ();
    }

    public void addContact (String name, Integer phone) {
        contactAgendaMap.put (name, phone);
    }

    public void removeContact (String name) {
        if (!contactAgendaMap.isEmpty ())  {
            contactAgendaMap.remove(name);
        }
    }

    public void displayContact () {
        System.out.println (contactAgendaMap);
    }

    public Integer searchByName (String name) {
        Integer numberByName = null;
        if (!contactAgendaMap.isEmpty ()) {
            numberByName = contactAgendaMap.get(name);
        }

        return numberByName;
    }

    public static void main (String[] args) {
        ContactAgenda contactAgenda = new ContactAgenda ();

        contactAgenda.addContact ("Luís Paulo", 1020304);
        contactAgenda.addContact ("Pizzeria", 7884000);
        contactAgenda.addContact ("Contact 1", 4055005);
        contactAgenda.addContact ("Mom", 1475200);
        contactAgenda.addContact ("Contact 2", 68959385);

        contactAgenda.displayContact ();

        contactAgenda.removeContact ("Contact 2");

        contactAgenda.displayContact ();

        System.out.println ("O número é: " + contactAgenda.searchByName ("Contact 2"));
    }
}