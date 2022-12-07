package AnonymousClassAWTExample;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTEvent2_1 {
	private Frame frame;
	private Button btn[];

	public AWTEvent2_1() {
		frame = new Frame("event handler example");
		btn = new Button[5];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button("Button" + i);
		}
	}

	public void startFrame() {
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button 1 Click!");
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button 2 Click!");
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button 3 Click!");
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button 4 Click!");
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button 5 Click!");
			}
		});

		frame.add(btn1, BorderLayout.NORTH);
		frame.add(btn2, BorderLayout.SOUTH);
		frame.add(btn3, BorderLayout.WEST);
		frame.add(btn4, BorderLayout.EAST);
		frame.add(btn5, BorderLayout.CENTER);

		frame.setSize(200, 200);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		AWTEvent2_1 border = new AWTEvent2_1();
		border.startFrame();
	}
}
