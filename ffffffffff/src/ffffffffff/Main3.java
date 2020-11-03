package ffffffffff;


import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;


public class TalkingClock3 {
	public void start(int interval, boolean beep) {
	    class TimePrinter implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				System.out.println("At the tone, the time is " + new Date());
				if (beep) Toolkit.getDefaultToolkit().beep();
			}
		}
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();	
	}
}