package projectofjava;
import java.util.*;
public class BinarySearch {
	public int binarySearch(ArrayList<Integer> arr, int target) {
        int left = 0, right = arr.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == target) return mid;
            else if (arr.get(mid) < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
    	BinarySearch sol = new BinarySearch();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);
        Collections.sort(arr);
        int target = 7;
        int index = sol.binarySearch(arr, target);
        System.out.println("at the index :"+index);
    }
}
