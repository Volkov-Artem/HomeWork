import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Work3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String word;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int randomNumber = rand.nextInt(words.length);
        System.out.println("Мы загадали слово попробуйте его угадать!");
        char[] randomWord = words[randomNumber].toCharArray();
        char[] numberOfCharacters = new char[15];
        System.out.println(randomWord);
        for (int i = 0; i < numberOfCharacters.length; i++) {
            numberOfCharacters[i] = '*';
        }
        for (;;){
            System.out.println("Введите слово");
            word = scanner.nextLine().toLowerCase();
            System.out.println(word);
            if (word.equals(words[randomNumber])) {
                System.out.println(" Поздравляем вы угадали! ");
                break;
            }else {
                System.out.println("Вы не угадали!");
                char[] chWord = word.toCharArray();

                for (int i = 0; i <randomWord.length ; i++) {
                    if (i >= chWord.length){
                        break;
                    }
                    if (randomWord[i] == chWord[i]){
                        numberOfCharacters[i] = randomWord[i];

                    }

                }
                System.out.println(Arrays.toString(numberOfCharacters));
            }
        }
    }
}
