package Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lineOfNums1 = scanner.nextLine().split("\\s+");
        String[] lineOfNums2 = scanner.nextLine().split("\\s+");

        List<Integer> nums1 = collectNumsFrom(lineOfNums1);
        List<Integer> nums2 = collectNumsFrom(lineOfNums2);
        List<Integer> resultList = new ArrayList<>();

        if (nums1.size() >= nums2.size()) {
            for (int i = 0; i < nums2.size(); i++) {

                resultList.add(nums1.get(i));
                resultList.add(nums2.get(i));

            }
            for (int i = nums2.size(); i < nums1.size(); i++) {
                resultList.add(nums1.get(i));
            }
        }else{
            for (int i = 0; i < nums1.size(); i++) {
                resultList.add(nums1.get(i));
                resultList.add(nums2.get(i));

            }
            for (int i = nums1.size(); i < nums2.size(); i++) {
                resultList.add(nums2.get(i));
            }
        }
        for (int j = 0; j < resultList.size(); j++) {
            System.out.print(resultList.get(j) + " ");
        }
    }

    private static List<Integer> collectNumsFrom(String[] lineOfNums1) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < lineOfNums1.length; i++) {
            resultList.add(Integer.parseInt(lineOfNums1[i]));
        }
        return resultList;
    }
}
