package FirstWindow;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame{
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("Insert here",0);
    private JLabel label = new JLabel("LABEL!");
    private JRadioButton radio1 = new JRadioButton("Select this");
    private JRadioButton radio2 = new JRadioButton("Select that");
    private JRadioButton radio3 = new JRadioButton("Select those");
    private JCheckBox check = new JCheckBox("check",false);

        public SimpleGUI(){
            super("Simple Example");
            this.setBounds(100,100,300,500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            Container container = this. getContentPane();
            container.setLayout(new GridLayout(7,3,2,2));
            container.add(label);
            container.add(input);

            ButtonGroup group = new ButtonGroup();
            group.add(radio1);
            group.add(radio2);
            group.add(radio3);
            container.add(radio1);
            radio1.setSelected(true);
            container.add(radio2);
            container.add(radio3);
            container.add(check);
            button.addActionListener(new ButtonEventlistener());
            container.add(button);
        }
        class ButtonEventlistener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                String message = "";
                message += "Button was pressed\n";
                message += "Text is "+input.getText()+"\n";
                message += (radio1.isSelected() ? "radio #1" : "radio #2"+ " is selected\n" );
                message += "Checkbox is "+((check.isSelected()) ?"checked":"unchecked\n");
                JOptionPane.showMessageDialog(null,message,"Output",JOptionPane.PLAIN_MESSAGE);
            }
        }
}
