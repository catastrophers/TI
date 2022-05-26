import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TI_LCD_Programmer_test extends JFrame
{
    private JPanel TI_LCD_Programmer_test;
    private JPanel TextPanel1;
    private JPanel ButtonPanel;
    private JPanel TextPanel2;
    private JTextField IOput;
    private JLabel TEXAS;
    private JTextField Base;
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
    private JButton SHFButton;
    private JButton dButton;
    private JButton EButton;
    private JButton FButton;
    private JButton kButton;
    private JLabel B1010;
    private JLabel B1011;
    private JLabel B1100;
    private JButton a1SCButton;
    private JButton AButton;
    private JButton bButton;
    private JButton CButton;
    private JButton DivButton;
    private JLabel B0111;
    private JLabel B1000;
    private JLabel B1001;
    private JButton ORButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton MulButton;
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
    private JButton XORButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton AddButton;
    private JLabel a2sC;
    private JButton CEButton;
    private JButton a0Button;
    private JButton dotButton;
    private JButton AddOrSubButton;
    private JButton EqualButton;
    private JLabel TI;
    private JLabel CM;

    public TI_LCD_Programmer_test()
    {
        System.out.println("");
    }

    public void init()
    {
        IOput.setBorder(BorderFactory.createEmptyBorder());
        Base.setBorder(BorderFactory.createEmptyBorder());
        this.setTitle("TI_LCD_Programmer_test");
        this.add(TI_LCD_Programmer_test);
        Toolkit kit=Toolkit.getDefaultToolkit();
        this.pack();
//        this.setBounds(kit.getScreenSize().width/2-getWidth()/2-250,
//                kit.getScreenSize().height/2-getHeight()/2-300,
//                500,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
