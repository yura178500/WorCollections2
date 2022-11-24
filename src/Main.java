import java.util.*;
import java.util.stream.Collector;

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



      Map<String, List<Integer>> products = new HashMap<>();
        List<Integer> intList1 = Arrays.asList(100,40, 36);
        List<Integer> intList2 = Arrays.asList(300, 2,36);
        List<Integer> intList3 = Arrays.asList(41,52,36);
        List<Integer> intList4 = Arrays.asList(30, 20,360);
        List<Integer> intList5 = Arrays.asList(410,52,136);
        products.put("Россиия", intList1);
        products.put("Англия", intList2);
        products.put("Бельгия", intList3);
        products.put("Норвегия", intList4);
        products.put("Германия", intList5);

        Map<String, Integer> cumulativeMap = new HashMap<String, Integer>();
        for(Map<String, Integer> productMap: products) {
            for (Map.Entry<String, Integer> p : productMap.entrySet()) {
                if (cumulativeMap.containsKey(p.getKey())) {
                    cumulativeMap.put(p.getKey(), cumulativeMap.get(p.getKey()) + p.getValue());
                } else {
                    cumulativeMap.put(p.getKey(), p.getValue());
                }
            }
        }

        for (String key : products.keySet()) {
            System.out.println(key);
        }
        for (List<Integer> value : products.values()) {
            System.out.println(value);
        }


        System.out.println(products);

    //    for(Map<String, Integer> productMap: products){
      //      for(Map.Entry<String, Integer> p: productMap.entrySet()){
        //        if(cumulativeMap.containsKey(p.getKey())){
          //          cumulativeMap.put(p.getKey(), cumulativeMap.get(p.getKey())+ p.getValue());
        //        }
         //       else{
         //           cumulativeMap.put(p.getKey(),  p.getValue());
        //        }
          //  }
      //  }

        System.out.println(cumulativeMap.toString());



        Collector<String,StringBuilder, String> stringBuilderCollector =  Collector.of(
                StringBuilder::new, // метод инициализации аккумулятора
                (b ,s) -> b.append(s).append(" , "), // метод обработки каждого элемента
                (b1, b2) -> b1.append(b2).append(" , "), // метод соединения двух аккумуляторов при параллельном выполнении
                StringBuilder::toString // метод выполняющися в самом конце
        );



        System.out.println("======================================================");




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
        System.out.println(map);
    }



}

