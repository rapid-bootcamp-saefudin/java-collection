package sortedSet;

import model.Person;

import java.util.SortedSet;
import java.util.TreeSet;

public class MainSortedSet {
    public static void main(String[] args) {
        SortedSet<Person> persons = new TreeSet<>(new PersonComparator());
        persons.add(new Person(1,"Joko","Jakarta"));
        persons.add(new Person(2,"Sugeng","Yogya"));
        persons.add(new Person(3,"Andi","Surabaya"));
        persons.add(new Person(4,"Randi","Surabaya"));
        persons.add(new Person(5,"Rudi","Surabaya"));
        persons.add(new Person(6,"Ridho","Bandung"));

        for (Person p: persons){
            System.out.println(p);
        }
    }
}
