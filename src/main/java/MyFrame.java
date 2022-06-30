import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button1,button2;

    JLabel label;


    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button1 = new JButton("Pick a font color");
        button1.addActionListener(this);

        button2 = new JButton("Pick a background color");
        button2.addActionListener(this);


        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("Sample text");
        label.setFont(new Font("Arial",Font.PLAIN,80));
        label.setOpaque(true);

        this.add(button1);
        this.add(button2);
        this.add(label);
        this.pack();
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

//        JColorChooser colorChooser = new JColorChooser();
        if (e.getSource()==button1) {


            Color colorFont = JColorChooser.showDialog(null,"Pick a title",Color.BLACK);

            label.setForeground(colorFont);
        }
        if (e.getSource()==button2) {

            Color colorBackground = JColorChooser.showDialog(null,"Choose background color",Color.white);
            label.setBackground(colorBackground);

        }

    }
}
