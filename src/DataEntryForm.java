import javax.swing.*;
import java.awt.*;


   public class DataEntryForm extends JComponent{
        public void showForm() {

            // Создаем экземпляр класса JFrame для окна ввода данных
            Font font1 = new Font("Calibri", Font.BOLD, 23);
            Font font_message = new Font("Calibri", Font.BOLD, 17);
            //JLabel label = new JLabel("Your order: ");
            JLabel name = new JLabel("Your name: ");
            JLabel number = new JLabel("Your number: ");
            JLabel email = new JLabel("Your email: ");
            JFrame frame = new JFrame("Order");

            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Закрываем только текущее окно
            frame.setSize(350, 520);
            frame.setLayout(null);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);

            //frame.add(label);
            frame.add(name);
            frame.add(number);
            frame.add(email);

           // label.setFont(font1);
            name.setFont(font1);
            number.setFont(font1);
            email.setFont(font1);
            frame.setVisible(true);

//            label.setBounds(10, 20, 120, 30);
            name.setBounds(10, 80, 200, 30);
            number.setBounds(10, 200, 200, 30);
            email.setBounds(10, 320, 200, 30);


            JTextField textField = new JTextField();
            textField.setBounds(10, 120, 315, 30);
            textField.setFont(font_message);

            JTextField textField1 = new JTextField();
            textField1.setBounds(10, 240, 315, 30);
            textField1.setFont(font_message);

            JTextField textField2 = new JTextField();
            textField2.setBounds(10, 350, 315, 30);
            textField2.setFont(font_message);


            // Создаем кнопку для сохранения данных
            JButton saveButton = new JButton("Save order");
            saveButton.setBounds(70, 430, 200, 45);
            saveButton.setBackground(Color.lightGray);
            saveButton.addActionListener(e -> {
                String inputData_name = textField.getText();
                String inputData_number = textField1.getText();
                String inputData_email = textField2.getText();
                JOptionPane.showMessageDialog(frame, "Data saved " + "\nName: " + inputData_name + "\nNumber: " + inputData_number + "\nEmail: " + inputData_email +"\nYou will be contacted within 5 minutes");

                frame.dispose();
            });

            // Добавляем текстовое поле и кнопку на окно ввода данных
            frame.getContentPane().add(textField);
            frame.getContentPane().add(textField1);
            frame.getContentPane().add(textField2);
            frame.getContentPane().add(saveButton);

            // Отображаем окно ввода данных
            frame.setVisible(true);
        }
    }


