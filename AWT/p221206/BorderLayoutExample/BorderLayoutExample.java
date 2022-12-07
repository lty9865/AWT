package BorderLayoutExample;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class BorderLayoutExample {
	private Frame frame;
	private Button center, west, east, south;
	private TextField tf1;

	public BorderLayoutExample() {
		frame = new Frame("BorderLayout example");
		south = new Button("button 1");
		west = new Button("button 2");
		east = new Button("button 3");
		center = new Button("button 4");
		tf1 = new TextField();
		tf1.setText("입력창 입니다.");
	}

	public void startFrame() {
//		frame.add(tf1, "North");
		frame.add(tf1, BorderLayout.NORTH); // 이게 나중에 코드 보기 편함
		frame.add(south, "South");
		frame.add(west, "West");
		frame.add(east, "East");
		frame.add(center, "Center");

		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		BorderLayoutExample border = new BorderLayoutExample();
		border.startFrame();
	}
}
