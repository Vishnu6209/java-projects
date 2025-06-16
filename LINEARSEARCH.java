package projectofjava;
import java.util.ArrayList;

public class LINEARSEARCH {
    public int linearSearch(ArrayList<Integer> arr, int target) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LINEARSEARCH ls = new LINEARSEARCH();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(2);
        arr.add(7);
        arr.add(1);
        arr.add(9);
        int target = 7;
        int index = ls.linearSearch(arr, target);
        System.out.println(index);
    }
}
