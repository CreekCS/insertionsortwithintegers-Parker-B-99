import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class InsSortInt {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("randInts.txt"));

        ArrayList <Integer> nums = new ArrayList<>();
        while(input.hasNextLine()){
            nums.add(input.nextInt());
        }
        
        Integer[] ints = new Integer[nums.size()];
        nums.toArray(ints);

        for(int i = 0; i < ints.length; i++){
            Integer num = ints[i];
            int j = i - 1;
            while(j >= 0 && ints[j] > num){
                ints[j + 1] = ints[j];
                j--;
            }
            ints[j + 1] = num;
        }

        System.out.println(ints[0]);
        System.out.println(ints[ints.length - 1]);
    }
}
