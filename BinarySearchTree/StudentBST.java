/*
Q3:

Describe algorithms and write Java code for creating,
inserting, and deleting nodes in a Binary Search Tree (BST).

The tree processes students data including:

- Student Name
- Student ID
- Student Grade

The student grade is used as the key value in the BST.
*/



package BinarySearchTree;

public class StudentBST {

    class Student {

        private String name;
        private String id;
        private int grade;
        Student right;
        Student left;

        public Student(String name, String id, int grade) {
            this.name = name;
            this.id = id;
            this.grade = grade;
        }

        public int getKey() {
            return grade;
        }
    }

    Student root;

    public void insert(String name, String id, int grade) {
        Student st = new Student(name, id, grade);
        root = insertRec(root, st);
    }

    private Student insertRec(Student temp, Student st) {

        if (temp == null) {
            return st;
        }

        if (st.getKey() > temp.getKey()) {
            temp.right = insertRec(temp.right, st);
        } else if (st.getKey() < temp.getKey()) {
            temp.left = insertRec(temp.left, st);
        }
        return temp;
    }

    public void delete(String name, String id, int grade) {
        Student st = new Student(name, id, grade);
        root = removeRec(root, st);
    }
    
    private Student removeRec(Student temp, Student st) {
        if(temp == null) return null;
        
        if (st.getKey() > temp.getKey()) {
            temp.right = removeRec(temp.right, st);
            
        } else if (st.getKey() < temp.getKey()) {
            temp.left = removeRec(temp.left, st);
            
        }else{
            
            if(temp.left == null){
                return temp.right;
            }
            
            else if(temp.right == null){
                return temp.left;
            }
            
            else{
                temp.grade = successor(temp).grade;
                temp.name = successor(temp).name;
                temp.id = successor(temp).id;
                
                int suc = successor(temp).grade;
                temp.right = removeRec(temp.right ,new Student("","",suc));
            }
        }
        return temp;
    }
    
    public Student successor(Student temp){
        temp = temp.right;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp;
    }

}
