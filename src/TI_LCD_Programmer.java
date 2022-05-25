import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;


public class TI_LCD_Programmer extends JFrame implements ActionListener{
    private JTextField IOput;//数据输入/输出
    private JTextField Base;//进制显示


    public void init()//界面初始化
    {
        this.setTitle("TI LCD Programmer");
        Toolkit kit=Toolkit.getDefaultToolkit();

        IOput = new JTextField();
        Base = new JTextField();
        Font textFont=new Font("宋体",Font.BOLD,20);
        IOput.setFont(textFont);
        Base.setFont(textFont);
        IOput.setText("");
        Base.setText("DEC");
        IOput.setEditable(false);
        IOput.setBorder(null);
        Base.setEditable(false);
        Base.setBorder(null);
        IOput.setBackground(new Color(255, 255, 255, 255));
        Base.setBackground(new Color(255, 255, 255, 255));
        IOput.setHorizontalAlignment(JTextField.RIGHT);//右对齐
        Base.setHorizontalAlignment(JTextField.RIGHT);//右对齐
        JPanel TextPanel = new JPanel(new GridLayout(2, 1));
        TextPanel.add(IOput);
        TextPanel.add(Base);
        //
        Font buttonFont = new Font("Times New Roman", Font.BOLD, 16);
        String[] button = {
                "DEC", "HEX", "OCT", "OFF", "ON/C",
                "STO", "RCL", "SUM", "(", ")",
                "SHF", "d", "E", "F", "K",
                "1'sC", "A", "b", "C", "/",
                "OR", "7", "8", "9", "*",
                "AND", "4", "5", "6", "-",
                "XOR", "1", "2", "3", "+",
                "CE", "0", ".", "+/-", "="
        };
        JPanel ButtonPanel = new JPanel(new GridLayout(8, 5));
        System.out.println(TextPanel.getHeight());
        for (int i = 0; i < button.length; i++) {
            JButton temp = new JButton(button[i]);
            temp.setFocusPainted(false);
            temp.setFont(buttonFont);
//            temp.setSize(ProgrammerContent.getWidth()/5,ProgrammerContent.getHeight()*4/5);
            temp.addActionListener((ActionListener) this);
            temp.setBackground(new Color(255, 255, 255, 174));
            ButtonPanel.add(temp);
        }
        TextPanel.setBounds(0,0,500,100);
        ButtonPanel.setBounds(0,100,500,600);
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                TextPanel.setBounds(0,0,getWidth(),getHeight()*1/5);
                ButtonPanel.setBounds(0,TextPanel.getHeight(),getWidth(),getHeight()-TextPanel.getHeight());
            }
        });
        this.setLayout(null);
        this.add(TextPanel);
        this.add(ButtonPanel);
        this.setSize(519,748);
        this.setLocation(kit.getScreenSize().width/2-getWidth()/2,kit.getScreenSize().height/2-getHeight()/2);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


