import java.util.Random;
import java.util.Scanner;

public class Chatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greetUser(scanner);
        String name = getUserName(scanner);
        guessUserAge(scanner);
        countToNumber(scanner);
        testProgrammingKnowledge(scanner);
        tellStory(name);

        scanner.close();
    }

    private static void greetUser(Scanner scanner) {
        System.out.println("Hello! Welcome to the ChatBot.");
    }

    private static String getUserName(Scanner scanner) {
        System.out.print("Please tell me your name: ");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
        return name;
    }

    private static void guessUserAge(Scanner scanner) {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int tries = 3;

        System.out.println("Let's play a game. I'll try to guess your age.");

        for (int i = 0; i < tries; i++) {
            int guess = random.nextInt((max - min) + 1) + min;
            System.out.println("Is your age " + guess + "? (yes/higher/lower)");
            String response = scanner.next();

            if (response.equalsIgnoreCase("yes")) {
                System.out.println("I guessed your age correctly!");
                return;
            } else if (response.equalsIgnoreCase("higher")) {
                min = guess + 1;
            } else if (response.equalsIgnoreCase("lower")) {
                max = guess - 1;
            }

            if (i == tries - 1) {
                System.out.println("I couldn't guess your age within 3 tries.");
            }
        }
    }

    private static void countToNumber(Scanner scanner) {
        System.out.print("Enter a number you want me to count to: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    private static void testProgrammingKnowledge(Scanner scanner) {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Which programming language is known as the language of the web?");
        System.out.println("1. Java");
        System.out.println("2. CSS");
        System.out.println("3. JavaScript");
        System.out.println("4. C++");

        int answer;
        do {
            System.out.print("Your answer: ");
            answer = scanner.nextInt();
            if (answer != 3) {
                System.out.println("Please, try again.");
            }
        } while (answer != 3);

        System.out.println("Congratulations, you are correct!");
    }

    private static void tellStory(String name) {
        System.out.println("Once upon a time, there was a person named " + name + " who found an apprenticeship to learn to code.");
        System.out.println(name + " would often spend time learning new things and playing games.");
        System.out.println("One day, " + name + " created a chatbot for an assignment.");
        System.out.println("They became great friends and had many adventures together. The end.");
    }
}