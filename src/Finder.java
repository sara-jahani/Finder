import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Finder {
    public List<int[]> findPairs(int[] numbers , int x)
    {
        HashMap<Integer, Integer> subtraction = new HashMap<Integer, Integer>();

        ArrayList<int[]> result = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++)
        {

            int diff = x - numbers[i];

            if (subtraction.containsKey(diff))
            {
                int[] temp = {numbers[i], diff};
                result.add(temp);

            }
            else
            {
                subtraction.put(numbers[i], diff);
            }
        }

        return result;
    }

}






