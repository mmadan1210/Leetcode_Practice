class Solution {
    public int[] searchRange(int[] arr, int target) {
//         int l = 0;
//         int r = arr.length-1;
//         int first = -1;
//         while(l<=r){
//             int mid = (l+r)/2;
//             if(target==arr[mid]){
//                 first = mid;
//                 r = mid -1;
//             }
//             else if(target>arr[mid]){
//                 l = mid + 1;
//             }
//             else{
//                 r = mid -1;
//             }
//         }
//         int l1 = 0;
//         int r1 = arr.length-1;
//         int last = -1;
//         while(l1<=r1){
//             int mid1 = (l1+r1)/2;
//             if(target==arr[mid1]){
//                 last = mid1;
//                 l1 = mid1 + 1;
//             }
//             else if(target>arr[mid1]){
//                 l1 = mid1 + 1;
//             }
//             else{
//                 r1 = mid1 - 1;
//             }
//         }
        
//         int[] res =new int[2];
//         res=new int[]{first,last};
//         return res;
        int l = 0;
        int r = arr.length-1;
        int first = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==target){
                first = mid;
                r = mid-1;
            }
            else if(arr[mid]>target){
                r = mid - 1;
            }
            else{
                l = mid+1;
            }
        }
        int l1 = 0;
        int r1 = arr.length-1;
        int last = -1;
        while(l1<=r1){
            int mid1 = (l1+r1)/2;
            if(arr[mid1]==target){
                last = mid1;
                l1 = mid1+1;
            }
            else if(arr[mid1]>target){
                r1 = mid1 - 1;
            }
            else{
                l1 = mid1 + 1;
            }
        }
        int x[] = new int[2];
        x[0]=first;
        x[1]=last;
        return x;
    }
}