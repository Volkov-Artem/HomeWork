import java.util.Random;
import java.util.Scanner;
public class work3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int tryCount = 3;
        int randomNumber = rand.nextInt(10);
        System.out.println("Добро пожаловать в игру угадай число!");
        for (int i = 0,score = 2; i < tryCount; i++,score-- ) {
            System.out.println(" Введите число от 0 до 9 ");
            int answer = scanner.nextInt();
            if (answer == randomNumber){
                System.out.println(" Поздравляем вы угадали! ");
                break;
            }
            else if (score == 0){
                System.out.println(" вы проиграли! Мы загадывали число " + randomNumber);
            }
            else if (answer > randomNumber){
                System.out.println(" загаданное число меньше у вас осталось " + score  +" попытки ");
            }
            else if (answer < randomNumber){
                System.out.println(" Загаданное число больше у вас осталось "  + score + " попытки ");
            }

        }

    }
}
