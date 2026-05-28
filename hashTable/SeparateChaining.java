package hashTable;

public class SeparateChaining {

    private SortedLinkedList[] hashArray;
    private int size;

    public SeparateChaining(int size) {

        this.size = size;
        hashArray = new SortedLinkedList[size];

        for (int i = 0; i < size; i++) {
            hashArray[i] = new SortedLinkedList();
        }
    }

    public int hashFunc(int key) {
        return key % size;
    }

    // Insert
    public void insert(Person p) {

        int index = hashFunc(p.person_ID);

        hashArray[index].insert(p);
    }

    // Delete
    public void delete(int key) {

        int index = hashFunc(key);

        hashArray[index].delete(key);
    }

    // Find
    public Person find(int key) {

        int index = hashFunc(key);

        return hashArray[index].find(key);
    }

    public void displayTable() {

        for (int i = 0; i < size; i++) {

            System.out.print(i + ": ");

            hashArray[i].display();
        }
    }
    
     public static void main(String[] args) {

        SeparateChaining h = new SeparateChaining(5);

        h.insert(new Person("Ali", 12));
        h.insert(new Person("Ahmed", 17));
        h.insert(new Person("Sara", 22));

        h.displayTable();

        System.out.println("Find:");
        Person p = h.find(17);

        if (p != null)
            p.display();
    }
}

