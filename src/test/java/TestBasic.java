import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.*;

/**
 * <B>Description:</B> test basic grammer <br>
 * <B>Create on:</B> 2020-03-07 16:30 <br>
 *
 * @author shengming.lin
 * @version 1.0
 */
public class TestBasic extends TestBasicAbstract {
    @Test
    public void testHashCode() {
        String str1 = "通话";
        String str2 = "重地";
        System.out.println(String.format("str1：%d | str2：%d",
                str1.hashCode(), str2.hashCode()));
        System.out.println(str1.equals(str2));
    }


    @Test
    public void testCollection() {
        List emptyList = Lists.newArrayList();
        emptyList.add("a");
        emptyList.add("b");
        System.out.println(emptyList);//[a, b]
        Collections.reverse(emptyList);
        System.out.println(emptyList);//[b, a]
    }

    @Test
    public void testAsList() {
        List<String> a = Lists.newArrayList();
        Object[] toArray = a.toArray();
        List<Object> asList = Arrays.asList(toArray);
    }

    @Test
    public void testVector() {
        Vector vector = new Vector(3, 2);
        System.out.println("init size:" + vector.size());
        System.out.println("init cap:" + vector.capacity());
        vector.add("a");
        vector.add(1);
        vector.add(1l);
        vector.add(1l);
        System.out.println("1 cap:" + vector.capacity());
        System.out.println("1 size:" + vector.size());
        vector.get(3);
    }

    @Test
    public void testArray() {
        String[] array = new String[]{};
        System.out.println("array is object? a=" + (array instanceof Object));
        System.out.println("null is object? a=" + (null instanceof Object));
    }

    @Test
    public void testQueue() {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add("a");
        priorityQueue.poll();
        LinkedList linkedList = new LinkedList();
        linkedList.add("a");
        linkedList.poll();
    }

    @Test
    public void testCorrenct() {
        List<String> list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.parallelStream();
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Collections.unmodifiableList(list);//return the unmodifiable list
    }

    @Test
    public void testStack() {
        Stack stack = new Stack();
        stack.listIterator();
    }

    @Test
    public void testHashTable() {
        new Hashtable<String, Object>();
    }

    @Test
    public void testEnumeration() {
        new Enumeration<String>() {
            @Override
            public boolean hasMoreElements() {
                return false;
            }

            @Override
            public String nextElement() {
                return null;
            }
        };
    }
}
