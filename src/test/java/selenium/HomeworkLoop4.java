package selenium;

import lesson2.Student;
import lesson2.Train;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

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


        Student a = new Student();
        a.setFirstName("Misha");
        a.setGroup(1);
        Student b = new Student();
        b.setFirstName("Vasja");
        b.setGroup(2);
        Student c = new Student();
        c.setFirstName("Klimov");
        c.setGroup(3);
        Student d = new Student();
        d.setFirstName("Ira");
        d.setGroup(1);
        Student z = new Student();
        z.setFirstName("Iraida");
        z.setGroup(2);

        List<String> studentNames = new ArrayList<>();
        studentNames.add(a.getFirstName());
        studentNames.add(b.getFirstName());
        studentNames.add(c.getFirstName());
        studentNames.add(d.getFirstName());
        studentNames.add(z.getFirstName());
        int count = 0;
        for (int i = 0; i < studentNames.size(); i++){
               count++;
               System.out.println(count + ")" + studentNames.get(i));
        }
        ArrayList<Student> students = new ArrayList<>();
       students.add(a);
       students.add(b);
       students.add(c);

    


   //     student.add(a.setFirstName("Misha"));
    //    student.add(new Student("Stepan"));
     //   student.add(new Student("Viktor");
     //   student.add(new Student("Sasha"));
     //   student.add(new Student("Kostik"));

      //  for (Book book: arrayOfBooks) {
      //      System.out.println("BookTitle: "+book.bookName+", by"+book.author+ "with a rating of "+book.rating);
        }
    }



