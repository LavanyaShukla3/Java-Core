import java.util.List;
import java.util.Arrays;
class Person{
    String lastName;
    int age; 
    boolean maritalStatus;

    public Person(String lastName, int age, boolean maritalStatus){
        this.lastName = lastName;
        this.age = age;
        this.maritalStatus = maritalStatus;
    }
}
interface PersonFilter{
    boolean matches(Person person);
}
class AdultFilter implements PersonFilter{
    
    public boolean matches(Person person){
        return (person.age >= 18);
    }
}
class SeniorFilter implements PersonFilter{
    
    public boolean matches(Person person){
        return (person.age >= 65);
    }
}
class MarriedFilter implements PersonFilter{
    
    public boolean matches(Person person){
        return (person.maritalStatus);
    }
}
class PeopleCounter{
    PersonFilter pf;

    public void setFilter(PersonFilter filter){
        pf = filter;
    }

    public int count(List<Person> people){
        int count = 0;

        for (Person person : people) {
            if (pf.matches(person)) {
                count++;
            }
        }

        return count;
    }
}

public class Main{
    public static void main(String[] args){
        List<Person> people = Arrays.asList(
        new Person("Doe", 20, false),
        new Person("Smith", 30, true),
        new Person("Old", 70, true)
        );

        PeopleCounter counter = new PeopleCounter();

counter.setFilter(new AdultFilter());
System.out.println(counter.count(people)); // Adult count: 3

counter.setFilter(new SeniorFilter());
System.out.println(counter.count(people)); // Senior count: 1

counter.setFilter(new MarriedFilter());
System.out.println(counter.count(people)); // Married count: 2
    }
}
