package main.java.set.basic_operation;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {
    private Set<Guest> guestSet;

    public GuestSet () {
        this.guestSet = new HashSet<> ();
    }

    public void addGuest (String name, int invitationCode) {
        guestSet.add (new Guest (name,invitationCode));
    }

    public void removeGuestByInvitationCode(int invitationCode) {
        Guest guestToRemove = null;
        for (Guest guest : guestSet) {
            if (guest.getInvitationCode () == invitationCode) {
                guestToRemove = guest;
                break;
            }
        }

        guestSet.remove (guestToRemove);
    }

    public int countGuests() {
        return guestSet.size();
    }

    public void displayGuests() {
        System.out.println (guestSet);
    }

    public static void main (String[] args) {
        GuestSet guestsSet = new GuestSet ();
        System.out.println ("Existem " + guestsSet.countGuests () + " convidados dentro do Set de convidados!");

        guestsSet.addGuest ("Nome 1", 11);
        guestsSet.addGuest ("Nome 2", 13);
        guestsSet.addGuest ("Nome 3", 14);
        guestsSet.addGuest ("Nome 4", 11);

        guestsSet.displayGuests ();
        System.out.println ("Existem " + guestsSet.countGuests () + " convidado(s) dentro do Set de convidados!");

        guestsSet.removeGuestByInvitationCode (14);
        System.out.println ("Existem " + guestsSet.countGuests () + " convidado(s) dentro do Set de convidados!");

        guestsSet.displayGuests ();
    }
}
