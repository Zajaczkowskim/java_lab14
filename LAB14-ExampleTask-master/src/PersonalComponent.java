import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PersonalComponent {
    private JRadioButton redRadioButton;
    private JRadioButton greenRadioButton;
    private JRadioButton blueRadioButton;
    private JRadioButton grayRadioButton;
    public JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton serializujButton;
    private JButton startButton;
    private JButton stopButton;
    Timer timer = null;


    public PersonalComponent() {
    var grouop = new ButtonGroup();
    grouop.add(redRadioButton);
    grouop.add(greenRadioButton);
    grouop.add(blueRadioButton);
    grouop.add(grayRadioButton);


    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("red")) {
                mainPanel.setBackground(Color.red);
            } else if (e.getActionCommand().equals("blue")) {
                mainPanel.setBackground(Color.blue);
            } else if (e.getActionCommand().equals("gray")) {
                mainPanel.setBackground(Color.gray);
            } else if (e.getActionCommand().equals("green")) {
                mainPanel.setBackground(Color.green);
            }

        }
    };
    redRadioButton.addActionListener(listener);
    greenRadioButton.addActionListener(listener);
    blueRadioButton.addActionListener(listener);
    grayRadioButton.addActionListener(listener);

    serializujButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (textField1.getText().isEmpty() || textField2.getText().isEmpty() || textField3.getText().isEmpty() ||
                    textField1.getText() != null  && textField1.getText().split("\\s+").length > 1 ||
                    textField2.getText() != null && textField2.getText().split("\\s+").length > 1 ||
                    textField3.getText() != null && textField3.getText().split("\\s+").length > 1
            ) {
                JOptionPane.showMessageDialog(null, "cos tam zle");

            }

        }
    });
        Font old = startButton.getFont();
        startButton.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                startButton.setFont(new Font(old.getFontName(), Font.BOLD, old.getSize()+10));
                startButton.setText("Start");

            }
            @Override
            public void mouseExited(MouseEvent e) {
                startButton.setFont(old);
                startButton.setText("Start");

            }
        });

        timer = new Timer(1000, new AbstractAction() {
            int count = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                Color[] lista= {Color.CYAN, new Color(13, 71, 160)};
                mainPanel.setBackground(lista[count%2]);
                count += 1;
            }
        });


        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    timer.start();

            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });
    }
}

