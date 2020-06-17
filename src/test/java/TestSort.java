import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.List;

/**
 * <B>Description:</B> some sort algorithm <br>
 * <B>Create on:</B> 2020-06-02 16:45 <br>
 *
 * @author shengming.lin
 * @version 1.0
 */
public class TestSort {

    @Test
    public void testBubbleSort() {
        List<Integer> toTest = Lists.newArrayList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        this.bubbleSort(toTest);
        System.out.println(toTest);
    }

    /**
     * <B>Description:</B> sort list in asc order <br>
     * <B>Create on:</B> 2020-06-02 16:47 <br>
     *
     * @param
     * @return
     * @author shengming.lin
     */
    private void bubbleSort(List<Integer> input) {
        for (int x = 0; x < input.size(); x++) {
            for (int y = x + 1; y < input.size(); y++) {
                if (input.get(x) > input.get(y)) {
                    Integer temp = input.get(y);
                    input.set(y, input.get(x));
                    input.set(x, temp);
                }
            }
        }
    }
}
