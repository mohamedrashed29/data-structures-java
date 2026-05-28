package hashTable;

class Person {

    String person_name;
    int person_ID;

    public Person(String name, int id) {
        person_name = name;
        person_ID = id;
    }

    public void display() {
        System.out.println(person_name + " " + person_ID);
    }
}
