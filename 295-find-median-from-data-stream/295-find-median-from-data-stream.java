class MedianFinder {
    
    PriorityQueue<Integer> minHeap,maxHeap;
    boolean even;
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        even = true;
    }
    
    public void addNum(int num) {
        if(even){
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
        }
        else{
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
        }
        even = !even;
    }
    
    public double findMedian() {
        if(even){
            return (double)(maxHeap.peek()+minHeap.peek())/2;
        }
        else{
            return (double)maxHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */