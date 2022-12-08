package CalculatorTest;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends WindowAdapter implements ActionListener {
	private Frame f;
	private Button[] btn;
	private Button plus, minus, multiple, divice, confirm;
	private TextField tf1, tf2;
	private Panel p1, p2;

	public Main() {
		f = new Frame("Calculator");
		btn = new Button[10];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button("" + i);
		}
		plus = new Button("+");
		minus = new Button("-");
		multiple = new Button("*");
		divice = new Button("/");
		confirm = new Button("=");
		tf1 = new TextField();
		tf2 = new TextField();
		p1 = new Panel();
		p2 = new Panel();
	}

	public void startFrame() {
		f.add(tf1, "North");
		f.add(tf2, "South");
		p1.setLayout(new GridLayout(4, 3));
		for (int i = 0; i < btn.length; i++) {
			p1.add(btn[i]);
			btn[i].addActionListener(this);
		}
		p2.setLayout(new GridLayout(5, 1));
		p2.add(plus);
		plus.addActionListener(this);
		p2.add(minus);
		minus.addActionListener(this);
		p2.add(multiple);
		multiple.addActionListener(this);
		p2.add(divice);
		divice.addActionListener(this);
		p2.add(confirm);
		confirm.addActionListener(this);
		f.add(p1, "Center");
		f.add(p2, "East");

		f.setSize(300, 350);
		f.setVisible(true);
		f.addWindowListener(this);

		tf1.setEditable(false);
		tf1.setFocusable(false);
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < btn.length; i++) {
			if (e.getActionCommand().equals(btn[i].getActionCommand())) {
				tf1.setText(btn[i].getActionCommand());
				tf2.setText(tf2.getText() + btn[i].getActionCommand());
			}
		}
		if (e.getActionCommand().equals(plus.getActionCommand())) {
			tf1.setText(plus.getActionCommand());
			tf2.setText(tf2.getText() + plus.getActionCommand());
		}
		if (e.getActionCommand().equals(minus.getActionCommand())) {
			tf1.setText(minus.getActionCommand());
			tf2.setText(tf2.getText() + minus.getActionCommand());
		}
		if (e.getActionCommand().equals(multiple.getActionCommand())) {
			tf1.setText(multiple.getActionCommand());
			tf2.setText(tf2.getText() + multiple.getActionCommand());
		}
		if (e.getActionCommand().equals(divice.getActionCommand())) {
			tf1.setText(divice.getActionCommand());
			tf2.setText(tf2.getText() + divice.getActionCommand());
		}
		if (e.getActionCommand().equals(confirm.getActionCommand())) {
			tf1.setText(confirm.getActionCommand());
			tf2.setText(tf2.getText() + confirm.getActionCommand());
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.startFrame();
	}
}
