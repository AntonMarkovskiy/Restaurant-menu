//C:\Users\Anton\OneDrive\Рабочий стол\Test.document

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main extends JComponent implements ActionListener, KeyListener, MouseListener {

    //Главный фон
    Image menu = new ImageIcon("src/Food (2) (1).jpg").getImage();

    Image dish1 = new ImageIcon("src/1.png").getImage();
    Image dish2 = new ImageIcon("src/3.png").getImage();
    Image dish3 = new ImageIcon("src/5.png").getImage();
    Image dish4 = new ImageIcon("src/4.png").getImage();

    //Размеры тарелок
    private int w = 160, h = 160;
    private int w1 = 222, h1 = 222;
    private int w2 = 260, h2 = 160;
    private int w3 = 170, h3 = 135;

    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        gr.drawImage(menu, 0, 0, null);
        gr.drawImage(dish1, 80, 102, w, h, null);
        gr.drawImage(dish2, 236, 193, w1, h1, null);
        gr.drawImage(dish3, 40, 365, w2, h2, null);
        gr.drawImage(dish4, 265, 540, w3, h3, null);
    }

    //Создание главного меню
    public static void main(String[] args) {
        Main t = new Main();
        JFrame f = new JFrame("Restaurant menu");
        f.setSize(496, 720);
        //Dimension screen_Size =Toolkit.getDefaultToolkit().getScreenSize();
       // f.setSize(screen_Size);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.addKeyListener(t);
        f.add(new Main());
        f.add(t);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setResizable(false);

        JPanel panel = new JPanel();
        f.add(panel);

        //кнопки
        JButton button = new JButton("12 $");
        button.setBounds(262, 217, 57, 13); // Задаем положение и размер кнопки
        button.setBackground(Color.gray);
        button.addActionListener(e -> {  // Добавляем обработчик события нажатия на кнопку
            DataEntryForm dataEntryForm = new DataEntryForm();    // Создаем экземпляр класса для ввода данных (ваш следующий класс)
            dataEntryForm.showForm(); // Показываем окно для ввода данных
        });
        f.getContentPane().add(button); // Добавляем кнопку на основное окно
        f.setVisible(true); // Отображаем основное окно


        JButton button2 = new JButton("18 $");
        button2.setBounds(180, 347, 57, 13);
        button2.setBackground(Color.gray);
        button2.addActionListener(e -> {
            DataEntryForm dataEntryForm = new DataEntryForm();
            dataEntryForm.showForm();
        });
        f.getContentPane().add(button2);
        f.setVisible(true);


        JButton button3 = new JButton("16 $");
        button3.setBounds(267, 500, 57, 13);
        button3.setBackground(Color.gray);
        button3.addActionListener(e -> {
            DataEntryForm dataEntryForm = new DataEntryForm();
            dataEntryForm.showForm();
        });
        f.getContentPane().add(button3);
        f.setVisible(true);

        JButton button4 = new JButton("13 $");
        button4.setBounds(200, 660, 57, 13);
        button4.setBackground(Color.gray);
        button4.addActionListener(e -> {
            DataEntryForm dataEntryForm = new DataEntryForm();
            dataEntryForm.showForm();
        });
        f.getContentPane().add(button4);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}



