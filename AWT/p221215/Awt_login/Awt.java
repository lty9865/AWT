package Awt_login;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Awt extends WindowAdapter implements ActionListener, MouseListener {
	private Frame f;
	private Button btn, findPW;
	private TextField tfID, tfPW, tfRes;
	private Label info;
	private Font font;
	private boolean b = true;

	public void startFrame() {
		f = new Frame("Login Form");
		f.setLayout(null);
		f.setSize(400, 300);

		btn = new Button("Login");
		btn.setSize(55, 60);
		btn.setLocation(310, 100);
		btn.addActionListener(this);

		tfID = new TextField("아이디를 입력하세요.", 20);
		tfPW = new TextField("비밀번호를 입력하세요.", 20);
		tfRes = new TextField();
		tfID.setSize(250, 30);
		tfID.setLocation(30, 90);
		tfPW.setSize(250, 30);
		tfPW.setLocation(30, 140);
		tfRes.setSize(340, 45);
		tfRes.setLocation(30, 220);
		tfRes.setEditable(false);
		tfRes.setFocusable(false);

		if (b) {
			tfID.addMouseListener(this);
			tfPW.addMouseListener(this);
		}

		font = new Font("Aharoni 굵게", Font.BOLD, 30);

		info = new Label("Login");
		info.setFont(font);
		info.setSize(100, 50);
		info.setLocation(25, 25);
		findPW = new Button("forget Password?");
		findPW.setSize(150, 30);
		findPW.setLocation(30, 175);
		findPW.setFont(new Font("Aharoni 굵게", Font.ITALIC, 12));
		findPW.addActionListener(this);

		f.add(btn);
		f.add(tfID);
		f.add(tfPW);
		f.add(tfRes);
		f.add(info);
		f.add(findPW);
		f.setLocation(1200, 350);
		f.setVisible(true);
		f.addWindowListener(this);
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Login")) {
			Awt_DAO dao = new Awt_DAO();
			Awt_Vo v = new Awt_Vo(tfID.getText(), tfPW.getText());
			ArrayList<Awt_Vo> list = dao.list(v.getID(), v.getPW());

			for (int i = 0; i < list.size(); i++) {
				Awt_Vo data = (Awt_Vo) list.get(i);
				String userID = data.getID();
				String userPW = data.getPW();

				if (userID.equals(tfID.getText().toUpperCase()) && userPW.equals(tfPW.getText())) {
					tfRes.setText("로그인 성공!");
				} else {
					tfRes.setText("잘못된 입력입니다.");
				}
			}
		} else if (e.getActionCommand().equals(findPW.getLabel())) {
			System.out.println("비밀번호");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (b) {
			if (e.getComponent().equals(tfID) || e.getComponent().equals(tfPW)) {
				tfID.setText(null);
				tfPW.setText(null);
				b = false;
				tfPW.setEchoChar('*');
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
