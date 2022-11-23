import java.util.*;

public class Main {
    public static void main(String[] args) {


        int results = (int) Math.floor((Math.random() * 100) + 1);


        List<Integer> list = new ArrayList<>();
        list.add(403 + 60 + 120);
        list.add(40 + 80 + 500);
        list.add(10 + 30 + 54);
        list.add(400 + 60 + 120);
        list.add(400 + 60 + 120);
        Object element = null;
        for (int i = 0; i < list.size(); i++) {
            element = list.get(i);
        }
        System.out.println(results);
        System.out.println(element);


        Map<String, List<Integer>> listMap = new HashMap<>();
        listMap.put("Россиия", Collections.singletonList(403 + 60 + 120));
        listMap.put("Англия", Collections.singletonList(400 + 60 + 120));
        listMap.put("Бельгия", Collections.singletonList(10 + 30 + 54));
        listMap.put("Норвегия", Collections.singletonList(40 + 80 + 500));
        listMap.put("Германия", Collections.singletonList(500 + 100 + 50));
        System.out.println(listMap.toString());

        Map<Integer, String> map =new HashMap<>();
        map.put(8904512,"Попов А.А." );
        map.put(852,"Сидоров А.А.");
        map.put(2548,"Петров А.А.");
        map.put(6585,"Никитин А.А." );
        map.put(74895,"Соколов А.А." );
        map.put(02154,"Мишарин А.А." );
        map.put(624,"Анисимов А.А.");
        map.put(8922,"Проныров А.А.");
        map.put(0245,"Сидоров Н.Ю." );
        map.put(3215,"Решетов А.А." );

    }



}

