package BorderLayoutExample_2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class BorderLayoutExample2 {
	private Frame frame;
	private Button center, west;
	private TextField tf1;

	public BorderLayoutExample2() {
		frame = new Frame("BorderLayout example");
		west = new Button("button 2");
		center = new Button("button 4");
		tf1 = new TextField();
		tf1.setText("입력창 입니다.");
	}

	public void startFrame() {
		frame.add(tf1, BorderLayout.NORTH);
		frame.add(west, BorderLayout.WEST);
		frame.add(center, BorderLayout.CENTER);

		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		BorderLayoutExample2 border = new BorderLayoutExample2();
		border.startFrame();
	}
}
