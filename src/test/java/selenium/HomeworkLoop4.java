package selenium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HomeworkLoop4 {

    @Test
public void loopsLesson() {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(20);
    numbers.add(30);
    numbers.add(36);
    numbers.add(56);
    numbers.add(2);
    numbers.add(10);
    numbers.add(50);
    numbers.add(6);
    numbers.add(8);
    numbers.add(90);
    numbers.add(22);
    numbers.add(370);
    numbers.add(80);
    numbers.add(80);
    numbers.add(3);
    numbers.add(115);
    numbers.add(514);
    numbers.add(13);
    numbers.add(12);
    numbers.add(11);
    numbers.add(80);

    for (int i = 0; i < numbers.size(); i++) {
        if ((numbers.get(i))/ 2 == 4) {
            System.out.println("В остатке на деление на 2 = 4: "+numbers.get(i));
        }
    }
    for (int i = 0; i < numbers.size(); i++) {
        if (numbers.get(i) % 2 == 0) {
            System.out.println("Четные числа: "+numbers.get(i));


        }
    }


}}
