package hashTable;

public class DoubleHashing {

    private Person[] arr;
    private int size;

    public DoubleHashing(int size) {

        this.size = size;
        arr = new Person[size];
    }

    public int hashFunc1(int key) {
        return key % size;
    }

    public int hashFunc2(int key) {
        return 7 - (key % 7);
    }

    // Insert
    public void insert(Person p) {

        int index = hashFunc1(p.person_ID);

        int step = hashFunc2(p.person_ID);

        while (arr[index] != null) {

            index = (index + step) % size;
        }

        arr[index] = p;
    }

    // Find
    public Person find(int key) {

        int index = hashFunc1(key);

        int step = hashFunc2(key);

        while (arr[index] != null) {

            if (arr[index].person_ID == key) {
                return arr[index];
            }

            index = (index + step) % size;
        }

        return null;
    }

    // Delete
    public void delete(int key) {

        int index = hashFunc1(key);

        int step = hashFunc2(key);

        while (arr[index] != null) {

            if (arr[index].person_ID == key) {

                arr[index] = null;
                return;
            }

            index = (index + step) % size;
        }
    }

}
