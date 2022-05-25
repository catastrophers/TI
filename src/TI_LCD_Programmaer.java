

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TI_LCD_Programmaer extends JFrame implements ActionListener{
    private JTextField IOput;//数据输入/输出
    private JTextField Base;//进制显示

    public static void main(String args[]) {
        TI_LCD_Programmaer Programmer = new TI_LCD_Programmaer();
        Programmer.ProgrammmerInit();
    }
    public void ProgrammmerInit()//界面初始化
    {
        Toolkit kit=Toolkit.getDefaultToolkit();
        this.setTitle("TI LCD Programmer");
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
        Font buttonFont = new Font("Times New Roman", Font.BOLD, 20);
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
        JButton[] ProgrammerButton=new JButton[button.length];
        for(int i=0;i<button.length;i++)
        {
                ProgrammerButton[i]=new JButton(button[i]);
                if(i==39)
                    ProgrammerButton[i].setBackground(new Color(137, 209, 215, 255));
                else
                    ProgrammerButton[i].setBackground(new Color(246, 246, 246, 255));
        }
        JPanel ButtonPanel = new JPanel(new GridLayout(8, 5,2,2));
        setBackground(new Color(0xE4E4E5));
        System.out.println(TextPanel.getHeight());
        for (int i = 0; i < button.length; i++) {
            ProgrammerButton[i].setFocusPainted(false);
            ProgrammerButton[i].setFont(buttonFont);
            ProgrammerButton[i].setBorderPainted(false);
//            temp.setSize(ProgrammerContent.getWidth()/5,ProgrammerContent.getHeight()*4/5);
            ProgrammerButton[i].addActionListener((ActionListener) this);
            int finalI = i;
            System.out.println(finalI);
            ProgrammerButton[finalI].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    if(finalI==39)
                        ProgrammerButton[finalI].setBackground(new Color(0x44C3CC));
                    else
                        ProgrammerButton[finalI].setBackground(new Color(0xD3D3D4));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if(finalI==39)
                        ProgrammerButton[finalI].setBackground(new Color(137, 209, 215, 255));
                    else
                        ProgrammerButton[finalI].setBackground(new Color(248, 248, 249, 255));
                }
            });
            {

            };
            ButtonPanel.add(ProgrammerButton[i]);
//            temp.setBackground(new Color(255, 255, 255, 0));
        }
        TextPanel.setBounds(0,0,500,100);
        ButtonPanel.setBounds(0,100,500,600);
//        this.addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                super.componentResized(e);
//                TextPanel.setBounds(0,0,getWidth(),getHeight()*1/5);
//                ButtonPanel.setBounds(0,TextPanel.getHeight(),getWidth(),getHeight()-TextPanel.getHeight());
//            }
//        });
        this.setLayout(null);

        this.setSize(519,748);
        this.setLocation(kit.getScreenSize().width/2-getWidth()/2,kit.getScreenSize().height/2-getHeight()/2);
        this.setVisible(true);
        this.add(TextPanel);
        this.add(ButtonPanel);
        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


