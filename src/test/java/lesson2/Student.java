package lesson2;

public class Student {
    //-----------Атрибуы
    private String firstName;
    private String lastName;
    private int age;
    private String personalCode;
    private int group;

   //---------------getters and settters-----comand+n= code generate


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }
    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
