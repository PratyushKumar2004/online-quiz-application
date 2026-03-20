import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "What is 2 + 2?",
            "Java is a ?",
            "Which keyword is used for inheritance?"
        };

        String[][] options = {
            {"1) 3", "2) 4", "3) 5"},
            {"1) Language", "2) OS", "3) Browser"},
            {"1) extends", "2) implements", "3) import"}
        };

        int[] answers = {2, 1, 1};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String opt : options[i]) {
                System.out.println(opt);
            }
            int userAns = sc.nextInt();
            if (userAns == answers[i]) {
                score++;
            }
        }

        System.out.println("Your score: " + score);
    }
}
