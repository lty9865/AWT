package InnerClassAWTExample;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderTest_pracArr {
	private Frame f;
	private Button btn[];

	public BorderTest_pracArr() {
		f = new Frame("event handler example");
		btn = new Button[5];
		for (int i = 0; i < btn.length; i++)
			btn[i] = new Button("Button[" + i + "]");
	}

	public class InnerHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			for (int j = 0; j < btn.length; j++) {
				if (e.getActionCommand().equals("Button[" + j + "]"))
					System.out.println("Button " + j + " Click!");
			}
		}
	}

	public void startFrame() {

		String[] location = { "North", "South", "West", "East", "Center" };

		for (int i = 0; i < btn.length; i++) {
			btn[i].addActionListener(new InnerHandler());
			f.add(btn[i], location[i]);
		}

		f.setSize(300, 300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		BorderTest border = new BorderTest();
		border.startFrame();
	}
}
