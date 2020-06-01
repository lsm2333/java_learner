import org.junit.Test;

import java.util.Date;

/**
 * <B>Description:</B> test oom <br>
 * <B>Create on:</B> 2020-06-01 17:14 <br>
 *
 * @author shengming.lin
 * @version 1.0
 */
public class TestOOM {

    private String longTxt;

    /**
     * <B>Description:</B> 配合jvm参数 -Xmx4M <br>
     * <B>Create on:</B> 2020-06-01 19:16 <br>
     *
     * @param
     * @return
     * @author shengming.lin
     */
    @Test
    public void createOOM() {
        System.out.println("heap test begin");
        while (true) {
            try {
                longTxt += "If life cheats you，\n" +
                        "don't be disappointed and worried．\n" +
                        "Calmness is needed in melancholy days．\n" +
                        "Believe that pleasantness is coming．\n" +
                        "Long for the bright future though you are unhappy．\n" +
                        "All will pass by and everything will be over．\n" +
                        "Past things will be pleasant memories." + new Date();
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
    }

}