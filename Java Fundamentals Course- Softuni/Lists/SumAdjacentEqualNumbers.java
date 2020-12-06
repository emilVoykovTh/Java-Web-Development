package Lists;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

    public class SumAdjacentEqualNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Double> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

            for (int i = 0; i < nums.size(); i++) {
                if(i + 1 >= nums.size() ){break;}
                if(nums.get(i).equals(nums.get(i + 1))){
                    nums.set(i, nums.get(i) + nums.get(i + 1));
                    nums.remove(nums.get(i +1));
                    i = -1;
                }
            }
            String output = joinElementsByDelimeter(nums, " ");
            System.out.println(output);
        }

        private static String joinElementsByDelimeter(List<Double> items, String delimeter) {
            String output = "";
            for(Double item : items){
                output += (new DecimalFormat("0.#").format(item) + delimeter);
            }
            return output;
        }
    }


