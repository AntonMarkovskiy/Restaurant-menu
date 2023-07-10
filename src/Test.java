import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Test {

    public static void main(String[] args) {
        // Создаем экземпляр класса JFrame для основного окна
        JFrame frame = new JFrame("Пример кнопки");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null); // Отключаем автоматическую компоновку

        // Создаем экземпляр класса JButton для кнопки
//        JButton button = new JButton("Ввести данные");
//        button.setBounds(100, 100, 200, 50); // Задаем положение и размер кнопки
//
//        // Добавляем обработчик события нажатия на кнопку
//        button.addActionListener(e -> {
//            // Создаем экземпляр класса для ввода данных (ваш следующий класс)
//            DataEntryForm dataEntryForm = new DataEntryForm();
//            dataEntryForm.showForm(); // Показываем окно для ввода данных
//        });
//
//        // Добавляем кнопку на основное окно
//        frame.getContentPane().add(button);
//
//        // Отображаем основное окно
//        frame.setVisible(true);
//    }
//}
        class DataEntryForm {

            public void showForm() {
                // Создаем экземпляр класса JFrame для окна ввода данных
                JFrame frame = new JFrame("Окно ввода данных");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Закрываем только текущее окно
                frame.setSize(400, 300);
                frame.setLayout(null); // Отключаем автоматическую компоновку

                // Создаем текстовое поле для ввода данных
                JTextField textField = new JTextField();
                textField.setBounds(100, 100, 200, 30); // Задаем положение и размер текстового поля

                // Создаем кнопку для сохранения данных
                JButton saveButton = new JButton("Сохранить");
                saveButton.setBounds(150, 150, 100, 30); // Задаем положение и размер кнопки

                // Добавляем обработчик события нажатия на кнопку сохранения
                saveButton.addActionListener(e -> {
                    String inputData = textField.getText(); // Получаем введенные данные
                    // Дополнительная обработка введенных данных...
                    JOptionPane.showMessageDialog(frame, "Данные сохранены: " + inputData);
                    frame.dispose(); // Закрываем окно после сохранения данных
                });

                // Добавляем текстовое поле и кнопку на окно ввода данных
                frame.getContentPane().add(textField);
                frame.getContentPane().add(saveButton);

                // Отображаем окно ввода данных
                frame.setVisible(true);
            }
        }
    }
}