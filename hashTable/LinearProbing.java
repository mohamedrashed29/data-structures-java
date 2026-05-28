
package hashTable;


public class LinearProbing {

    private Person[] arr;
    private int size;

    public LinearProbing(int size) {

        this.size = size;
        arr = new Person[size];
    }

    public int hashFunc(int key) {
        return key % size;
    }

    // Insert
    public void insert(Person p) {

        int index = hashFunc(p.person_ID);

        while (arr[index] != null) {
            index = (index + 1) % size;
        }

        arr[index] = p;
    }

    // Find
    public Person find(int key) {

        int index = hashFunc(key);

        while (arr[index] != null) {

            if (arr[index].person_ID == key) {
                return arr[index];
            }

            index = (index + 1) % size;
        }

        return null;
    }

    // Delete
    public void delete(int key) {

        int index = hashFunc(key);

        while (arr[index] != null) {

            if (arr[index].person_ID == key) {
                arr[index] = null;
                return;
            }

            index = (index + 1) % size;
        }
    }

    public void display() {

        for (int i = 0; i < size; i++) {

            if (arr[i] != null) {
                arr[i].display();
            } else {
                System.out.println("empty");
            }
        }
    }
    
    public static void main(String[] args) {

        LinearProbing h = new LinearProbing(5);

        h.insert(new Person("Ali", 12));
        h.insert(new Person("Ahmed", 17));
        h.insert(new Person("Sara", 22));

        h.display();

        System.out.println("Find:");
        Person p = h.find(17);

        if (p != null)
            p.display();
    }
}

 