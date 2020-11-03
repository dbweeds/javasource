package ffffffffff;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class TalkingClock {

	public void start(int interval, boolean beep) {
		
	
		Timer t = new Timer(interval, e ->{
		System.out.println("At the tone, the time is " + new Date());
		if (beep) 
			Toolkit.getDefaultToolkit().beep();});
		t.start();
	}
}
