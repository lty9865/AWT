package ButtonClassExample;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest extends WindowAdapter implements ActionListener {
	Frame f;
	Button b;

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void startFrame() {
		f = new Frame("Login");
		f.addWindowListener(this);
		f.setSize(300, 200);
		f.setLayout(null);

		b = new Button("Confirm");
		b.addActionListener(this);
		b.setSize(100, 50);
		b.setLocation(100, 75);

		f.add(b);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (b.getLabel().equals("Confirm")) {
			b.setLabel("Cancel");
		} else {
			b.setLabel("Confirm");
		}
	}

	public static void main(String[] args) {
		ButtonTest bt = new ButtonTest();
		bt.startFrame();
	}
}
