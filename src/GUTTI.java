
import javax.swing.*;

public class GUTTI {
    private JPanel TI_LCD_Programmer;
    private JTextField IOput;
    private JTextField Base;
    private JPanel TextPanel1;
    private JPanel ButtonPanel;
    private JButton kButton;
    private JButton a1SCButton;
    private JButton AButton;
    private JButton bButton;
    private JButton CButton;
    private JButton DivButton;
    private JButton ORButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton MulButton;
    private JButton XORButton;
    private JButton CEButton;
    private JPanel TextPanel2;
    private JButton DECButton;
    private JButton HEXButton;
    private JButton OCTButton;
    private JButton OFFButton;
    private JButton ONorCLRButton;
    private JButton STOButton;
    private JButton RCLButton;
    private JButton SUMButton;
    private JButton OPButton;
    private JButton CPButton;
    private JLabel B1101;
    private JLabel B110;
    private JLabel B1111;
    private JButton SHFButton;
    private JButton dButton;
    private JButton EButton;
    private JButton FButton;
    private JLabel B1010;
    private JLabel B1011;
    private JLabel B1100;
    private JLabel B0111;
    private JLabel B1000;
    private JLabel B1001;
    private JLabel B0100;
    private JLabel B0101;
    private JLabel B0110;
    private JButton ANDButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton SubButton;
    private JLabel B0001;
    private JLabel B0010;
    private JLabel B0011;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton AddButton;
    private JLabel a2sC;
    private JButton a0Button;
    private JButton dotButton;
    private JButton AddOrSubButton;
    private JButton EqualButton;
    private JLabel TI;
    private JLabel CM;
    private JLabel TEXAS;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUTTI");
        frame.setContentPane(new GUTTI().TI_LCD_Programmer);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
