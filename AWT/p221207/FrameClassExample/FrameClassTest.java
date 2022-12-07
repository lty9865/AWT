package FrameClassExample;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameClassTest {
	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		Dimension d =f.getSize();

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
//		f.setLocation(screenSize.width / 2 - 150, screenSize.height / 2 - 100);
		f.setLocation( screenSize.width / 2 - (int)(d.getWidth()/2),
				      screenSize.height / 2 - (int)(d.getHeight()/2));
		f.setVisible(true);
	}
}
