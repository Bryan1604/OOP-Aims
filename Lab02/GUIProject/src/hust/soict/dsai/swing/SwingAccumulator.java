package hust.soict.dsai.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingAccumulator extends JFrame {
    private JTextField tfInput;
    private JTextField tfOutput;
    private int sum = 0;
    //Constructor to setup the GUI components and event handlers
    public SwingAccumulator(){
        Container cp = getContentPane();    // add a content pane of top_level container
        cp.setLayout(new GridLayout(2,2)); // set layout of the container

        cp.add(new JLabel("Vu Duc Luong - Enter an Integer: ")); // add a label component

        tfInput = new JTextField(10); // add the JtextField component
        cp.add(tfInput);
        tfInput.addActionListener(new TFInputListener()); // listen the action

        cp.add(new Label("Vu Duc Luong - The Accumulated Sum is: ")); // add the label
        tfOutput = new JTextField(10); // add the Output textField component
        tfOutput.setEditable(false);  // set the editable => can not edit
        cp.add(tfOutput);

        setTitle("Vu Duc Luong - Swing Accumulator"); // set title of JFrame
        setSize(350,120);  // set size
        setVisible(true);              // Show in screen
    }
    public static void main(String[] args){
        new SwingAccumulator();
    }

    private class TFInputListener implements ActionListener{
        public void actionPerformed( ActionEvent evt){  // add method listener action
            int numberIn = Integer.parseInt(tfInput.getText()); // get the text from input
            sum+= numberIn;  // the sum of all input
            tfInput.setText("");
            tfOutput.setText(sum+"");
        }
    }

}
