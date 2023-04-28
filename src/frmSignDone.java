import javax.swing.*;

public class frmSignDone extends JFrame {
    private JButton goToLogInButton;
    private JLabel titleLabel;
    private JLabel insLabel;
    private JPanel panel;
    private static frmSignDone instance;
    public static synchronized frmSignDone getInstance(){
        if(instance == null){
            instance = new frmSignDone();
        }
        return instance;
    }

    private frmSignDone() {
        setContentPane(panel);
        setTitle("mindfulNESS - Sign-up completion");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        goToLogInButton.addActionListener(e -> {
            frmIndex.getInstance().setVisible(true);
            setVisible(false);
        });

    }
}
