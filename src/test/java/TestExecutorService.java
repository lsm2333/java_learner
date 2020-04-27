import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * <B>Description:</B> ExecutorService <br>
 * <B>Create on:</B> 2020-04-27 20:01 <br>
 *
 * @author shengming.lin
 * @version 1.0
 */
public class TestExecutorService {

    /**
     * <B>Description:</B> 试试ExecutorService <br>
     * <B>Create on:</B> 2020-04-27 20:41 <br>
     *
     * @param
     * @return
     * @author shengming.lin
     */
    @Test
    public void testExecutor() {
        List<String> input = Lists.newArrayList("1", "2", "3", "4");
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Future<Object>> submits = Lists.newArrayList();

        input.forEach(
                i -> {
                    Future<Object> submit = executorService.submit(() -> {
                        System.out.println("处理" + i);
                        Random random = new Random();
                        Thread.sleep(1000 * (random.nextInt(10) + 1));
                        String result = i + "处理过;";
                        return result;
                    });
                    submits.add(submit);
                }
        );

        for (Future<Object> submit : submits) {
            try {
                System.out.println(submit.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
