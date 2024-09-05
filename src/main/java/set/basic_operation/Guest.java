package main.java.set.basic_operation;

import java.util.Objects;

public class Guest {
    private String name;
    private int invitationCode;

    public Guest (String name, int invitationCode) {
        this.name = name;
        this.invitationCode = invitationCode;
    }

    public String getName () {
        return name;
    }

    public int getInvitationCode () {
        return invitationCode;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Guest guest = (Guest) o;
        return getInvitationCode () == guest.getInvitationCode ();
    }

    @Override
    public int hashCode () {
        return Objects.hashCode (getInvitationCode ());
    }

    @Override
    public String toString () {
        return "Guest{" +
                "name='" + name + '\'' +
                ", invitationCode=" + invitationCode +
                '}';
    }
}
