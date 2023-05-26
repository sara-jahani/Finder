import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        int [] numbers = {1 , 2 ,3 ,4 , 5, 6};
        int x = 5;
        Finder finder = new Finder();
        List<int[]>result = finder.findPairs(numbers , x);

        for (int i=0 ; i<result.size() ; i++)
        {
            System.out.println(Arrays.toString(result.get(i)));
        }
    }

}