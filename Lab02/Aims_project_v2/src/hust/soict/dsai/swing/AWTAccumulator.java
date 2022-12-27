package hust.soict.dsai.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame {
    private TextField tfInput;
    private TextField tfOutput;
    private int sum =0 ;  // accumulated sum, init to 0

    // Constructor to setup the GUI components and event handlers

    public AWTAccumulator(){
        setLayout(new GridLayout(2, 2));   // Layout of the frame
        add( new Label("Vũ Đức Lương - Enter a Interger: "));  // add the first label component of the frame
        tfInput = new TextField(10);         // add the textField component
        add(tfInput);
        tfInput.addActionListener(new TFInputListener()); // add the listener

        add(new Label("Vũ Đức Lương - The Accumulated Sum is: ")); // add the second label component og the frame

        tfOutput = new TextField(10);    // add a new textField to display the result
        tfOutput.setEditable((false));           // set the editable to this textField => can not edit
        add(tfOutput);

        setTitle("Vũ Đức Lương - AWT Accumulator"); // set title of frame
        setSize(350,120); // set size ò the frame
        setVisible(true);  // show the frame
    }

    public static void main(String[] args){
        new AWTAccumulator();
    }

    private class TFInputListener implements ActionListener{  // Listener class
        public void actionPerformed(ActionEvent evt){
            int numberIn =Integer.parseInt(tfInput.getText()); // get the input from textField
            sum+= numberIn;
            tfInput.setText("");
            tfOutput.setText(sum + "");
        }
    }
}
