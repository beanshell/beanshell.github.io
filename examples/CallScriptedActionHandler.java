import javax.swing.*;
import java.awt.event.ActionListener;
import bsh.Interpreter;

public class CallScriptedActionHandler {
    public static void main( String [] args ) throws Exception {

        JButton button = new JButton("MyButton");
        button.addActionListener( 
            (ActionListener)new Interpreter().source("actionHandler.bsh") );

		JFrame f = new JFrame();
		f.getContentPane().add( button );
		f.show();
    }
}
