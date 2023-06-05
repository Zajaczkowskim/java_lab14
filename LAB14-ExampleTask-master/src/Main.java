import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("My app");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 600);

//                 Etap 1
                 frame.setContentPane(new MyComponent());

                // Etap 2, 3, 4
                 frame.setContentPane(new PersonalComponent().mainPanel);


                frame.setVisible(true);
            }
        });
    }
}