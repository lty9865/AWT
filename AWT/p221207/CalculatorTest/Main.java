package CalculatorTest;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class Main {
	private Frame f;
	private Panel p1, p2;
	private Button[] btn;
	private Button zeroBt, plus, minus, divice, multiple, result;
	private TextField tf;

	public Main() {
		f = new Frame("Calculator");
		p1 = new Panel();
		p2 = new Panel();
		setBtn();
		tf = new TextField();

	}

	public void setBtn() {
		btn = new Button[9];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button("" + (i + 1));
		}
		zeroBt = new Button("" + 0);
		plus = new Button("+");
		minus = new Button("-");
		divice = new Button("/");
		multiple = new Button("*");
		result = new Button("=");
	}

	public void start() {
		f.add(tf, "North");
		p1.add(divice)
	}

	public static void main(String[] args) {

	}
}
