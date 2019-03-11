package lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;

class ChatWindow extends JFrame {
    private JButton[] buttons = {new JButton("Send"), new JButton("Exit")};

    private JTextArea printText = new JTextArea();
    private JTextArea editText = new JTextArea();

    private Dimension size;

    private int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

    private int widthWindow = screenWidth / 2;
    private int heightWindow = (int)(screenHeight / 1.5);


    ChatWindow() {
        System.out.println(screenWidth + " x " + screenHeight); // отладочная информация

        drawWindow();                   //методы отрисовки окна и
        drawElements();                 //элементов чата
        setOnButtonActionListener();     //экшн кнопки

        setVisible(true);
    }

    private void setOnButtonActionListener() {
        buttons[0].addActionListener(e -> {
            try {
                sendMsg();
            }catch (Exception e1){
                e1.printStackTrace();
            }
        });


        buttons[1].addMouseListener(new MouseListener() {
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
                buttons[1].setBounds(buttons[1].getX() - size.width, buttons[1].getY() - size.height, size.width, size.height);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    private void sendMsg() {
        String text = editText.getText();
        printText.append(new SimpleDateFormat("HH:mm:ss").format(new Date()) + ": " + text + "\n");
        editText.setText("");
        editText.grabFocus();
    }

    private void drawWindow() {
        setBounds(screenWidth / 2 - widthWindow / 2,screenHeight / 2 - heightWindow / 2, widthWindow, heightWindow);
        setTitle("MyChat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void drawElements() {
        JRootPane pane = getRootPane();
        Insets insets = pane.getInsets();
        pane.setLayout(null);

        pane.add(printText);
        pane.add(editText);

        printText.setBounds(widthWindow / 8, heightWindow / 10, (int)(widthWindow / 1.5), heightWindow / 2);
        printText.setEditable(false);
        printText.setWrapStyleWord(true);
        printText.setBackground(new Color(192, 182, 154));
        printText.setForeground(new Color(0, 0, 0));

        editText.setBounds(widthWindow / 8,heightWindow - heightWindow / 3, widthWindow / 2, heightWindow / 8);

        int shiftButtonsY = 0;
        for (JButton button : buttons) {
            pane.add(button);
            size = button.getPreferredSize();
            button.setBounds(widthWindow - widthWindow / 3 + insets.left, heightWindow - heightWindow / 3 +
                    shiftButtonsY + insets.top, size.width, size.height);
            shiftButtonsY += size.height * 2;
        }
    }
}
