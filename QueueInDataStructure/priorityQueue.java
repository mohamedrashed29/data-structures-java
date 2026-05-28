
package QueueInDataStructure;

// Array is sorted in ascending order
//the priority is for the maximum value

public class priorityQueue {
    private int[] priQue;
    private int maxSize;
    private int count;
    
    public priorityQueue(int size) {
        this.maxSize = size;
        priQue = new int[maxSize];
        count = 0;
    }

    public boolean isFull() {
        return count == maxSize;
    }

    public boolean isEmpty() {
        return count == 0;
    }
    
    public void insert(int value){
        if(isFull()) return;
        
        int i = count - 1; 
        while(value < priQue[i] && i >= 0){
            priQue[i + 1] = priQue[i];
            i--;
        }
        priQue[i + 1] = value;
        count ++ ;
    }
    
    public int delete(){
         if(isEmpty()) return -1;
         return priQue[--count];
    }
    
    public int peek(){
         if(isEmpty()) return -1;
         return priQue[count - 1];
    }
}























