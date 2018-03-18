package com.exapmple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by kangminjeong on 2018. 3. 18..
 */
public class StreamSample {

    public static void main(String[] args) {

        final List<Data> data = new ArrayList<>();

        System.out.println("--------------------------------------------------");
        // 1. numbers sum
        System.out.println("data = " + data.stream().mapToLong(e -> e.numbers).sum());
        System.out.println("--------------------------------------------------");
        // 2. numbers 평균
        System.out.println("data = " + data.stream().mapToLong(e -> e.numbers).average());
        System.out.println("--------------------------------------------------");
        // 3. type을 기준으로 sum
        System.out.println("summarizingLong = " + data.stream().collect(Collectors.groupingBy(e2 -> e2.type, Collectors.summarizingLong(e2 -> e2.numbers))));

        System.out.println(data.stream().collect(Collectors.groupingBy(e -> e.type, Collectors.summingLong(e -> e.numbers))));
        System.out.println("--------------------------------------------------");
        // 4. type을 기준으로 평균
        System.out.println(data.stream().collect(Collectors.groupingBy(e -> e.type, Collectors.averagingLong(e -> e.numbers))));
        System.out.println("--------------------------------------------------");
        // 5. 2000 이상 되는 데이터 이름(,를 기준으로 조합)
        System.out.println("names = " + data.stream().filter(e1 -> e1.numbers >= 2000).map(e1 -> e1.name).collect(Collectors.joining(",")));
        System.out.println("--------------------------------------------------");
        // 6. name -> [대한민국] name 으로 변경 출력
        data.stream().map(e -> String.format("[대한민국] %s", e.name)).forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        // 7. 아이디가 2인 사용자가 포함되어 있는가?
        System.out.println("has = " + data.stream().anyMatch(e -> e.id == 2));
        System.out.println("--------------------------------------------------");
        // 8. 모든 아이템의 numbers가 1000 이상인가?
        System.out.println("has = " + data.stream().allMatch(e -> e.getNumbers() >= 1200));
        System.out.println("--------------------------------------------------");
    }

    @AllArgsConstructor
    @EqualsAndHashCode(of = "id")
    @ToString
    @lombok.Data
    public class Data {
        private Long id;
        private String name;
        private int type;
        private Long numbers;
    }
}
