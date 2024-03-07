import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main extends JFrame {
    public static void main(String[] args) {
        new Main(7);
    }
    public Main(int n){
        setTitle("Simple Clock");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        JButton button = new JButton("time");
        button.setBounds(220,170,150,40);
        add(button);
        JTextField textField = new JTextField();
        textField.setBounds(20,170,150,40);
        add(textField);
        Clock clock = new Clock();
        add(clock);
        clock.Start(n);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(textField.getText());
                new Main(a);
            }
        });

    }
}