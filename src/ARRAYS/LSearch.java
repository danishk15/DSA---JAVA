package ARRAYS;

public class LSearch {
    static void main(String[] args) {
        int[] nums = {23, 54, 76, 87, 9999, 443, 6, 5554, 667};
        int target = 76;
        int ans = linearsearch(nums, target,1,4);
        System.out.println(ans);
    }

    //return the index if the item is found....
    //otherwise return -1...
    static int linearsearch(int[] arr, int target ,int start , int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // element not exists....
        return -1;
    }
}