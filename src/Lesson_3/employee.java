package Lesson_3;

public class employee {
     private String name;
    private String position;
    private String  phone_number;
    private int salary;
    private int age;

     public employee(String name, String position, String phone_number, int salary, int age ) {
         this.name = name;
         this.position = position;
         this.phone_number = phone_number;
         this.salary = salary;
         this.age = age;
     }

     public String getName() {
         return name;
     }

     public String getPosition() {
         return position;
     }

     public String getPhoneNumber() {
         return phone_number;
     }

     public int getSalary() {
         return salary;
     }

     public int getAge() {
         return age;
     }

}
