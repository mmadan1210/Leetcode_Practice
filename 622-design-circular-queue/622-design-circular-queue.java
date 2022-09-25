class MyCircularQueue {
    int front;
    int rear;
    int arr[];
    int size;
    int cap;
    public MyCircularQueue(int k) {
        this.cap = k;
        this.arr = new int[k];
        this.rear = k-1;
        this.front = 0;
        this.size=0;
    }
    
    public boolean enQueue(int value) {
        if(this.isFull()){
            return false;
        }
        this.rear = (this.rear +1) % this.cap;
        this.arr[this.rear] = value;
        this.size = this.size + 1;
        return true;
    }
    
    public boolean deQueue() {
        if(this.isEmpty()){
            return false;
        }
        this.front = (this.front +1) % this.cap;
        this.size = this.size - 1;
        return true;
    }
    
    public int Front() {
        if(this.isEmpty()){
            return -1;
        }
        return arr[this.front];
    }
    
    public int Rear() {
        if(this.isEmpty()){
            return -1;
        }
        return arr[this.rear];
    }
    
    public boolean isEmpty() {
        return (this.size == 0);
    }
    
    public boolean isFull() {
        return (this.size == this.cap);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */