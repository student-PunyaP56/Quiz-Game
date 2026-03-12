import java.util.Scanner;

class Question {
    String question;
    String[] options;
    int correctOption;

    Question(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    boolean checkAnswer(int answer) {
        return answer == correctOption;
    }
}

public class quizscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Question[] questions = new Question[5];

        questions[0] = new Question(
            "Who is the intermediary between the human and hardware?",
            new String[]{"1. Compiler", "2. Operating System", "3. Assembler", "4. Interpreter"},
            2
        );

        questions[1] = new Question(
            "What is the full form of CSV?",
            new String[]{"1. Comma Separated Version", "2. Comma Separated Variables", "3. Comma Separated Values", "4. Comma Structured Values"},
            3
        );

        questions[2] = new Question(
            "What is an object in Java?",
            new String[]{"1. A blueprint for creating classes", "2. An instance of a class", "3. A method that performs task", "4. A variable that stores data"},
            2
        );

        questions[3] = new Question(
            "What is the use of the keyword super in Java?",
            new String[]{"1. To call the parent class constructor", "2. To create a new object", "3. To access private members of the class", "4. To stop the execution of a program"},
            1
        );

        questions[4] = new Question(
            "Which keyword is used to inherit a class in Java?",
            new String[]{"1. implements", "2. inherits", "3. extends", "4. super"},
            3
        );

        int score = 0;

        System.out.println("***** Welcome to the Java Quiz Game *****\n");
        System.out.println("***** Let's Rock it*****\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ": " + questions[i].question);
            for (String option : questions[i].options) {
                System.out.println(option);
            }
            System.out.print("Your answer (1-4): ");
            int answer = sc.nextInt();

            if (questions[i].checkAnswer(answer)) {
                System.out.println("Correct!, Well Played\n");
                score++;
            } else {
                System.out.println("OooOoo, Better Luck Next time Try again: " + questions[i].correctOption + "\n");
            }
        }

        System.out.println("***** Quiz Over *****");
        System.out.println("Your score: " + score + "/" + questions.length);

        sc.close();
    }
}