import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // int max=1000;
        // int min =0;
        // int x = (int) ((Math.random()*((max-min)+1))+min);
        // System.out.println(x);
        int k1 = 0, f = 100;
        int a, b, c;
        int i = 0;
        do {

            a = k1 + (int) (Math.random() * f);
            b = k1 + (int) (Math.random() * f);
            c = k1 + (int) (Math.random() * f);
        } while (a != b && b != c && a != c);
        System.out.println(a + " " + b + " " + c);

        int results = (int) Math.floor((Math.random() * 100) + 1);

        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        Object element = null;
        for (int e = 0; e < list.size(); e++) {
            element = list.get(e);
        }
        int k2 = 0, f1 = 100;
        int a1, b1, c1;
        int t = 0;
        do {

            a1 = k2 + (int) (Math.random() * f1);
            b1 = k2 + (int) (Math.random() * f1);
            c1 = k2 + (int) (Math.random() * f1);
        } while (a1 != b1 && b1 != 1 && a1 != c1);
        System.out.println(a1 + " " + b1 + " " + c1);
        List<Integer> list1 = new ArrayList<>();
        list1.add(a1);
        list1.add(b1);
        list1.add(c1);

        Map<String, List<Integer>> listMap = new HashMap<>();

        listMap.put("Россиия", list);
        listMap.put("Англия", list1);
        Map<String, Integer> resultMap = new LinkedHashMap<>();
        listMap.forEach((k, v) -> v.forEach(e -> resultMap.merge(k, e, Integer::sum)));
        System.out.println(listMap);
        System.out.println(resultMap);

        System.out.println("==================================================");


        Map<String, List<Integer>> products = new HashMap<>();
        List<Integer> intList1 = Arrays.asList(100, 40, 36);
        List<Integer> intList2 = Arrays.asList(300, 2, 36);
        List<Integer> intList3 = Arrays.asList(41, 52, 36);
        List<Integer> intList4 = Arrays.asList(30, 20, 360);
        List<Integer> intList5 = Arrays.asList(410, 52, 136);
        products.put("Россиия", intList1);
        products.put("Англия", intList2);
        products.put("Бельгия", intList3);
        products.put("Норвегия", intList4);
        products.put("Германия", intList5);

        Map<String, Integer> cumulativeMap = new HashMap<String, Integer>();
        // for(Map<String, Integer> productMap: products)
        //     for (Map.Entry<String, Integer> p : productMap.entrySet()) {
        //        if (cumulativeMap.containsKey(p.getKey())) {
        //           cumulativeMap.put(p.getKey(), cumulativeMap.get(p.getKey()) + p.getValue());
        //      } else {
        //          cumulativeMap.put(p.getKey(), p.getValue());
        //       }
        //  }

        for (String key : products.keySet()) {
            System.out.println(key);
        }
        for (List<Integer> value : products.values()) {
            System.out.println(value);
        }


        System.out.println(products);


        Collector<String, StringBuilder, String> stringBuilderCollector = Collector.of(
                StringBuilder::new, // метод инициализации аккумулятора
                (r, s) -> r.append(s).append(" , "), // метод обработки каждого элемента
                (b3, b4) -> b3.append(b4).append(" , "), // метод соединения двух аккумуляторов при параллельном выполнении
                StringBuilder::toString // метод выполняющися в самом конце
        );


        System.out.println("======================================================");


        Map<String, Integer> sortedMap = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);

        sortedMap.put("Попов А.А.", 8904512);
        sortedMap.put("Сидоров А.А.", 852);
        sortedMap.put("Петров А.А.", 2548);
        sortedMap.put("Никитин А.А.", 6585);
        sortedMap.put("Соколов А.А.", 74895);
        sortedMap.put("Мишарин А.А.", 02154);
        sortedMap.put("Анисимов А.А.", 624);
        sortedMap.put("Проныров А.А.", 8922);
        sortedMap.put("Сидоров Н.Ю.", 30245);
        sortedMap.put("Решетов А.А.", 3215);
        sortedMap.putAll(sortedMap);
        System.out.println(sortedMap);
        System.out.println("=============================================================");

        Map<String, Integer> map = new HashMap<>();

        updateValue(map, "Алексей", 3000);
        updateValue(map, "Дмитрий", 9000);
        updateValue(map, "Антон", 3000);
        updateValue(map, "Алексей", 7000);
        updateValue(map, "Антон", 8000);

        System.out.println(map.toString());
    }

    public static void updateValue(Map<String, Integer> map, String key, Integer value) {
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + value);
        } else {
            map.put(key, value);
        }
    }


}

