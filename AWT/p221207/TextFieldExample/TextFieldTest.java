package TextFieldExample;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextFieldTest {
	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(400, 150);
		f.setLayout(new FlowLayout());

		Button submit = new Button("Submit");
		submit.setSize(100, 50);

		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);

		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		pwd.setEchoChar('*');

		TextField result = new TextField(45);

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(submit);

		f.add(result);

		f.setVisible(true);
	}

}
