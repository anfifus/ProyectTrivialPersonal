import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int limit = askHowManyQuestionsWants();
        List<Question> questionsList = new ArrayList<>();
        questionsList = addQuestions(questionsList,limit);
        answeringQuestions(questionsList);
    }

    private static List<Question> addQuestions(List<Question> questionsList, int limit) {
        int cont = 0;
        while (cont < limit){
            questionsList.add(new Question(writeQuestion(),writeIsCorrect()));
        }
        return questionsList;
    }

    private static boolean writeIsCorrect() {
        return  new Scanner(System.in).nextBoolean();
    }

    private static String writeQuestion() {
        System.out.println("Write the question");
        return new Scanner(System.in).nextLine();
    }

    private static int askHowManyQuestionsWants() {
        System.out.println("How many questions want?");
        return new Scanner(System.in).nextInt();
    }
}
