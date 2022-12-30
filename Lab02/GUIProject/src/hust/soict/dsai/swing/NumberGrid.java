package hust.soict.dsai.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGrid extends JFrame {  // ke thua lop jframe
    private JButton[] btnNumbers = new JButton[10];  // array of digits
    private JButton btnDelete, btnReset;   // button del and reset
    private JTextField tfDisplay;    // the top display
    public NumberGrid(){
        tfDisplay = new JTextField(); // add JTextField component
        tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JPanel panelButtons = new JPanel(new GridLayout(4,3));   // add JPanel component , which will group all of buttons and put them in a grid layout
        addButtons(panelButtons);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(tfDisplay,BorderLayout.NORTH);
        cp.add(panelButtons,BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Grid");
        setSize(200,200);
        setVisible(true);
    }
    void addButtons(JPanel panelButtons){
        ButtonListener btnListener = new ButtonListener(); // create the action listener
        for( int i = 1; i<=9;i++){
            btnNumbers[i] = new JButton(""+i);
            panelButtons.add(btnNumbers[i]);
            btnNumbers[i].addActionListener(btnListener);
        }

        btnDelete = new JButton("DEL");  // add the delete button
        panelButtons.add(btnDelete);
        btnDelete.addActionListener(btnListener); // add the listener action for the delete button

        btnNumbers[0] = new JButton("0");   // add the second 0 button at the center
        panelButtons.add(btnNumbers[0]);
        btnNumbers[0].addActionListener(btnListener);

        btnReset = new JButton("C");
        panelButtons.add(btnReset);
        btnReset.addActionListener(btnListener);
    }

    public static void main(String[] args){
        new NumberGrid();
    }

    // Complete inner class buttonListener
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String button = e.getActionCommand();
            if(button.charAt(0)>='0' && button.charAt(0) <= '9'){   // when click from 1 -> 9
                tfDisplay.setText(tfDisplay.getText()+ button);     // set text by add button at the right
            }else if(button.equals("DEL")){ // when click del button
                // handles the DEL case
                String s = "";
                s = tfDisplay.getText().substring(0, tfDisplay.getText().length()-1);
                tfDisplay.setText(s);
            }else {                         // when click the C button
                //handles the C case
                tfDisplay.setText("");      // reset text to none
            }
        }
    }

}

