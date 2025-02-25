import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class QuizGame {
    private JFrame frame;
    private JLabel questionLabel;
    private JRadioButton[] options;
    private JButton nextButton;
    private ButtonGroup group;
    private int currentQuestionIndex = 0;
    private int score = 0;
    private List<Question> questions;

    public QuizGame() {
        frame = new JFrame("Quiz Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new GridLayout(6, 1));

        questionLabel = new JLabel("Question here");
        frame.add(questionLabel);

        options = new JRadioButton[4];
        group = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            options[i] = new JRadioButton("Option " + (i + 1));
            group.add(options[i]);
            frame.add(options[i]);
        }

        nextButton = new JButton("Next");
        nextButton.addActionListener(e -> nextQuestion());
        frame.add(nextButton);

        loadQuestions();
        displayQuestion();

        frame.setVisible(true);
    }

    private void loadQuestions() {
        questions = new ArrayList<>();
        questions.add(new Question("What is Java?", new String[]{"A Language", "A Fruit", "A Tool", "A Car"}, 0));
        questions.add(new Question("What is JVM?", new String[]{"Java Virtual Machine", "Java Very Much", "Just Virtual Memory", "None"}, 0));
        Collections.shuffle(questions);
    }

    private void displayQuestion() {
        if (currentQuestionIndex < questions.size()) {
            Question q = questions.get(currentQuestionIndex);
            questionLabel.setText(q.getQuestion());
            for (int i = 0; i < 4; i++) {
                options[i].setText(q.getOptions()[i]);
                options[i].setSelected(false);
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Quiz Over! Your Score: " + score);
            frame.dispose();
        }
    }

    private void nextQuestion() {
        Question q = questions.get(currentQuestionIndex);
        for (int i = 0; i < 4; i++) {
            if (options[i].isSelected() && i == q.getCorrectAnswer()) {
                score++;
                break;
            }
        }
        currentQuestionIndex++;
        displayQuestion();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(QuizGame::new);
    }
}

class Question {
    private String question;
    private String[] options;
    private int correctAnswer;

    public Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
