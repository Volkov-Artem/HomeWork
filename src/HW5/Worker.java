package HW5;

public class Worker {
   private String name;
   private String position;
   private String email;
   private String phoneNumber;
   private String salary;
   private int age;

   //дефолт
    public Worker(){

    }
    //get для того что бы можно было читать перемненную age в классе Workers
    // set не используем так как менять нам её ненужно
    public int getAge() {
        return age;
    }

   public Worker(String name , String position, String email, String phoneNumber , String salary, int age){
       this.name = name;
       this.position= position;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.salary = salary;
       this.age = age;
   }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary='" + salary + '\'' +
                ", age=" + age +
                '}';
    }

    public void info(){
        System.out.println(toString());
    }


}
