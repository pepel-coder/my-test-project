package lesson2;

import org.junit.jupiter.api.Test;

public class First {
    @Test
    public void first(){
        int a = 3;
        int b = 16;
        int c =sum(a,b);
        System.out.println(c);
        a = 22;
        b = 15;
        System.out.println(sum(a,b));
    }

    private int sum(int a, int b){
        System.out.println("Firs digit is: "+ a +" and second digit: "+ b);
    int c= a + b;
    return c;
    }
    @Test
    public void usingObjects(){
        Student michail = new Student();
        michail.setFirstName("Mihail");
        michail.setLastName("lasti");
        michail.setAge(18);
        michail.setPersonalCode("250912-1128");
        Student timur =new Student();
        System.out.println( michail.getFirstName()+" "+michail.getLastName());
    }
}
