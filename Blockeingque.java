package queue;

import java.security.Key;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Blockeingque {
    public static void main(String[] args) {
//        Queue a =new LinkedBlockingDeque();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        a.add(null);
//        System.out.println(a);
//        Queue a=new ArrayBlockingQueue(6);
//        a.add(4);
//        a.add(4);
//        a.add(4);
//        a.add(4);
//        a.add(4);
//        a.offer(2);
//        System.out.println(a);
//        a.poll();
//        System.out.println(a);
//        Deque<Integer> a=new LinkedBlocki
//        ngDeque<>();
//        a.offer(3);
//        a.offer(2);
//        a.offer(1);
//        a.offer(6);
//        System.out.println(a);
//        a.addFirst(1);
//        a.removeLast();
////        System.out.println(a);
//        Map<Integer,String> a=new TreeMap<>();
//        a.put(1,"S");
//        a.put(2,"D");
//        a.put(4,"D");
//        a.put(3,"E");
//        System.out.println(a);
//        for ( Integer b:a.keySet()) {
//            System.out.println("Key:"+b+"Values"+a.get(b));
////        }
//        Map<String, String> a = new HashMap<>();
//        a.put("S", "S");
//        a.put("S", "S");
//        a.put("S", "S");
//        for (Map.Entry<String,St-ring> entry:a.entrySet()) {
//            System.out.println(entry.getKey());
//        }
//        Map<String ,String> a=new HashMap<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        Iterator<Map.Entry<Integer,String>> ite=map.entrySet().iterator();
        while(ite.hasNext()){
            Map.Entry<Integer,String> temp=ite.next();
            System.out.println(temp.getKey());
        }
    }

}
