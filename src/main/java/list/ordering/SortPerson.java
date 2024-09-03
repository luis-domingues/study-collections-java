package main.java.list.ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPerson {
    private List<Person> personList;

    public SortPerson() {
        this.personList = new ArrayList<> ();
    }

    public void addPerson(String name, int age, double height) {
        personList.add (new Person (name, age, height));
    }

    public List<Person> sortByAge() {
        List<Person> ageByPerson = new ArrayList<> (personList);
        Collections.sort(ageByPerson);
        return ageByPerson;
    }

    public List<Person> sortByHeight() {
        List<Person> heightByPerson = new ArrayList<> (personList);
        Collections.sort (heightByPerson, new ComparatorByHeight ());
        return heightByPerson;
    }

    public static void main (String[] args) {
        SortPerson sortPerson = new SortPerson ();

        sortPerson.addPerson ("Nome 01", 20, 1.75);
        sortPerson.addPerson ("Nome 02", 27, 1.81);
        sortPerson.addPerson ("Nome 03", 41, 1.72);
        sortPerson.addPerson ("Nome 04", 36, 1.64);

//        System.out.println (sortPerson.personList);

        System.out.println (sortPerson.sortByAge ());
        System.out.println (sortPerson.sortByHeight ());
    }
}

class ComparatorByHeight implements Comparator<Person> {

    @Override
    public int compare (Person o1, Person o2) {
        return Double.compare (o1.getHeight (), o2.getHeight ());
    }
}