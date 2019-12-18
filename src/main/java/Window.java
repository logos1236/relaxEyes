import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window implements ActionListener {
    private static String img = "eye.jpg";

    public Window() {
        initComponents();
    }

    private JFrame viewForm;

    private void initComponents() {
        JFrame.setDefaultLookAndFeelDecorated(false);
        viewForm = new JFrame("Время расслабить глаза");
        viewForm.setSize(302, 214);
        viewForm.setLocationRelativeTo(null);

        viewForm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JLabel jLabel = new JLabel();
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setIcon(new ImageIcon(getClass().getResource(img)));

        viewForm.getContentPane().add(jLabel);
        viewForm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
