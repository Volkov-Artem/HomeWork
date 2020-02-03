package HW5;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class Workers {
    static final int AGE_NUMBER = 40;
    static final int  WORKER_SIZE = 5;
    public static void main(String[] args) {
        Worker worker1 = new Worker( " Сидоров Евгении Викторович ", " технический деректор ",
                " Sidorov@mail.ru " , " +7(963)854-46-57","4000 долларов", 41 );
       worker1.info();
        System.out.println(".................................................................");
        Worker worker2 = new Worker();
        System.out.println(worker2);//дефолт
        System.out.println(".................................................................");

        Worker [] workArray = new Worker[WORKER_SIZE];
        workArray[0] = new Worker(" Сидоров Евгении Викторович ", " технический деректор ",
                " Sidorov@mail.ru " , " +7(963)854-46-57","4000 долларов", 41 );
        workArray[1] = new Worker(" Кривцов Генадий Александрович ", " Разноробочий ",
                " Krivcov@mail.ru " , " +7(963)854-47-58","1000 долларов", 39  );
        workArray[2] = new Worker(" Кожевников Виталий Степановитч ", " Бухгалтер ",
                " Kojevnikov@mail.ru " , " +7(963)854-48-59","2500 долларов", 45 );
        workArray[3] = new Worker(" Потёмкин Сергей Витальевич ", " Токарь ",
                " Sidorov@mail.ru " , " +7(963)854-49-60","Сдельная: 10 долларов за деталь", 34 );
        workArray[4] = new Worker("Канавалов Дмитрий Вольфовичь", "Менеджер",
                " Kanavalov@mail.ru " , " +7(963)854-50-61","3000 долларов", 28 );


        for (Worker worker : workArray){
            if (worker.getAge()> AGE_NUMBER) worker.info();
        }
    }

}


