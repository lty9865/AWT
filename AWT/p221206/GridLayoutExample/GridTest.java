package GridLayoutExample;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class GridTest {
	private Frame frame;
	private Button b1, b2, b3;
	private TextField tf1, tf2, tf3;

	public GridTest() {
		frame = new Frame("GridLayout example");
		b1 = new Button("button 1");
		b2 = new Button("button 2");
		b3 = new Button("button 3");

		tf1 = new TextField("Input Text1");
		tf2 = new TextField("Input Text2");
		tf3 = new TextField("Input Text3");
	}

	public void startFrame() {
		frame.setLayout(new GridLayout(3, 0));
		frame.add(b1);
		frame.add(tf1);
		frame.add(b2);
		frame.add(tf2);
		frame.add(b3);
		frame.add(tf3);

//		frame.pack();
		frame.setSize(720, 480);
		frame.setLocation(540, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		GridTest flow = new GridTest();
		flow.startFrame();
	}
}
