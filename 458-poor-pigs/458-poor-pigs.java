class Solution {
    public int poorPigs(int buckets, int md, int mt) {
        int period = mt/md+1;
        int count = 0;
        while(Math.pow(period,count)<buckets){
            count++;
        }
        return count;
    }
}