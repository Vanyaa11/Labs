package Lab09;
import javax.swing.*;

public class WorkCalculator extends JFrame {
    private JTextField distanceField;
    private JTextField forceField;
    private JTextField workField;
    private JButton calculateButton;

    public WorkCalculator() {
        setTitle("Калькулятор роботи");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Створення панелі розміщення компонентів інтерфейсу
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        // Створення текстових полів та кнопки
        distanceField = new JTextField(10   );
        forceField = new JTextField(10);
        workField = new JTextField(10);
        workField.setEditable(false);
        // Додавання компонентів на панель
        calculateButton = new JButton("Обчислити");
        calculateButton.addActionListener(e -> calculateWork());

        panel.add(new JLabel("Дистанція (S):"));
        panel.add(distanceField);
        panel.add(new JLabel("Сила (F):"));
        panel.add(forceField);
        panel.add(new JLabel("Робота(A):"));
        panel.add(workField);
        panel.add(calculateButton);
        // Додавання панелі на вікно програми
        add(panel);
    }

    private void calculateWork() {
        try {
            double distance = Double.parseDouble(distanceField.getText());
            double force = Double.parseDouble(forceField.getText());

            double work = force * distance;
            workField.setText(String.valueOf(work));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Неправильні дані. Будь ласка, введіть дійсні числа.", "Помилка", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WorkCalculator calculator = new WorkCalculator();
            calculator.setVisible(true);
        });
    }
}