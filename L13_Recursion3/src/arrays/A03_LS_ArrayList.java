package arrays;

import java.util.ArrayList;

public class A03_LS_ArrayList {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndexList(arr,4,0, list);
//        //        ArrayList<Integer> ans = findAllIndexList(arr,4,0, new ArrayList<>());
//        System.out.println(ans);
//        System.out.println(list);
        System.out.println(findAllIndexList2(arr,4,0));
    }
    static ArrayList<Integer> findAllIndexList(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndexList(arr, target, index + 1, list);
    }


    // Don't use this approach because it creates obj of arraylist again and again --- Use above's approach
    static ArrayList<Integer> findAllIndexList2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls  = findAllIndexList2(arr, target, index + 1); // here stack getting empty so recursion call come out

        list.addAll(ansFromBelowCalls); // add all item that we have got till now

        return list; // all item return from below calls
    }
}
