package DialogTest;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogTest extends WindowAdapter implements ActionListener {
	private Frame f;
	private Button ok;
	private Dialog info;

	public void starFrame() {
		f = new Frame("Parent");
		f.setSize(300, 200);

		info = new Dialog(f, "Information", true);
		info.setSize(140, 100);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());

		Label msg = new Label("This is madal dialog", Label.CENTER);
		ok = new Button("OK");
		info.add(msg);
		info.add(ok);

		f.addWindowListener(this);
//		info.addWindowListener(this);
		ok.addActionListener(this);

		f.setVisible(true);
		info.setVisible(true);
	}

	public void windowClosing(WindowEvent e) {
//		if (e.getSource().toString() == "Dialog") {
//			info.dispose();
//		}
		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(ok.getActionCommand())) {
			info.dispose();
		}
	}

	public static void main(String[] args) {
		DialogTest d = new DialogTest();
		d.starFrame();
	}
}
