public class Question {
    private String question;
    private boolean isCorrect;

    public Question(String question,boolean isCorrect){
        this.question = question;
        this.isCorrect = isCorrect;
    }
    public String getQuestion() {
        return question;
    }

    public boolean isCorrect() {
        return isCorrect;
    }
}
