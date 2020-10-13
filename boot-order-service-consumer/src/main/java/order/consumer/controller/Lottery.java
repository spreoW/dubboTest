package order.consumer.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangquan
 * @date 2020/10/5
 */
public class Lottery {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        for (int i = 1; i < 34; i++) {
            list.add(i);
        }
        for (int i = 1; i < 17; i++) {
            list3.add(i);
        }
        for (int i = 0; i < 6; i++) {
            int index = (int) (Math.random()*list.size());
            System.out.println("index: " + index);
            list2.add(list.get(index));
            list.remove(index);
            System.out.println("list.size(): " + list.size());
            System.out.println("list: " + list);
        }
        for (int i = 0; i < 1; i++) {
            int index = (int) (Math.random()*list3.size());
            System.out.println("index: " + index);
            list2.add(list3.get(index));
        }
            System.out.println("list2:  "+ list2);
    }
}


//2，8，9，25，29，32，2
//6，8，20，22，25，30，8
/**
 * 22, 6, 25, 30, 8, 20, 8
 * 3, 20, 11, 4, 18, 30, 10
 * 3，4，11，18，20，30，10
 */
