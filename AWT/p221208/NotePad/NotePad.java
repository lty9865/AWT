package NotePad;

import java.awt.CheckboxMenuItem;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NotePad extends WindowAdapter implements ActionListener {
	private Frame f;
	private FileDialog fileOpen;

	public NotePad() {
		f = new Frame("Note Pad");
		f.setSize(400, 400);

		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("파일(F)");
		MenuItem miNew = new MenuItem("새로 만들기(N)");
		MenuShortcut ms = new MenuShortcut(KeyEvent.VK_N);
		miNew.setShortcut(ms);
		MenuItem miNewPage = new MenuItem("새 창(W)");
		MenuItem miOpen = new MenuItem("열기(O)...");
		MenuItem miSave = new MenuItem("저장(S)");
		MenuItem miOtherName = new MenuItem("다른 이름으로 저장(A)...");
		MenuItem miPageSet = new MenuItem("페이지 설정(U)...");
		MenuItem miPrint = new MenuItem("인쇄(P)...");
		MenuItem miExit = new MenuItem("끝내기(X)");

		Menu mEdit = new Menu("편집(E)");
		MenuItem miCancel = new MenuItem("실행 취소(U)");
		MenuItem miCut = new MenuItem("잘라내기(T)");
		MenuItem miCopy = new MenuItem("복사(C)");
		MenuItem miPaste = new MenuItem("붙여넣기(P)");
		MenuItem miDel = new MenuItem("삭제(L)");
		MenuItem miSearch = new MenuItem("Bing으로 검색(S)...");
		MenuItem miFind = new MenuItem("찾기(F)...");
		MenuItem miNextF = new MenuItem("다음 찾기(N)");
		MenuItem miBeforeF = new MenuItem("이전 찾기(V)");
		MenuItem miChange = new MenuItem("바꾸기(R)...");
		MenuItem miMove = new MenuItem("이동(G)...");
		MenuItem miSelectAll = new MenuItem("모두 선택(A)");
		MenuItem miTimeDay = new MenuItem("시간/날짜(D)");

		Menu mTemplate = new Menu("서식(O)");
		MenuItem miAutoNextLine = new MenuItem("자동 줄 바꿈(W)");
		MenuItem miFont = new MenuItem("글꼴(F)...");

		Menu mView = new Menu("보기(V)");
		Menu miZR = new Menu("확대하기/축소하기");
		MenuItem miZoom = new MenuItem("확대(I)");
		MenuItem miReduction = new MenuItem("축소(O)");
		MenuItem miRestore = new MenuItem("확대하기/축소하기 기본값 복원");

		CheckboxMenuItem miStatusBar = new CheckboxMenuItem("상태 표시줄(S)");

		Menu mHelp = new Menu("도움말(H)");
		MenuItem miViewH = new MenuItem("도움말 보기(H)");
		MenuItem miSend = new MenuItem("피드백 보내기(F)");
		MenuItem miInfo = new MenuItem("메모장 정보(A)");

		// 파일 메뉴
		mFile.add(miNew);
		mFile.add(miNewPage);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miOtherName);
		mFile.addSeparator();
		mFile.add(miPageSet);
		mFile.add(miPrint);
		mFile.addSeparator();
		mFile.add(miExit);

		// 편집 메뉴
		mEdit.add(miCancel);
		mEdit.addSeparator();
		mEdit.add(miCut);
		mEdit.add(miCopy);
		mEdit.add(miPaste);
		mEdit.add(miDel);
		mEdit.addSeparator();
		mEdit.add(miSearch);
		mEdit.add(miFind);
		mEdit.add(miNextF);
		mEdit.add(miBeforeF);
		mEdit.add(miChange);
		mEdit.add(miMove);
		mEdit.addSeparator();
		mEdit.add(miSelectAll);
		mEdit.add(miTimeDay);

		// 서식 메뉴
		mTemplate.add(miAutoNextLine);
		mTemplate.add(miFont);

		// 보기 메뉴
		mView.add(miZR);
		miZR.add(miZoom);
		miZR.add(miReduction);
		miZR.add(miRestore);
		mView.add(miStatusBar);

		// 도움말 메뉴
		mHelp.add(miViewH);
		mHelp.add(miSend);
		mHelp.addSeparator();
		mHelp.add(miInfo);

		// 메뉴바 셋업
		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mTemplate);
		mb.add(mView);
		mb.add(mHelp);

		f.setMenuBar(mb);
		f.setVisible(true);

		f.addWindowListener(this);
		miOpen.addActionListener(this);
		miExit.addActionListener(this);
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("열기(O)...")) {
			fileOpen = new FileDialog(f, "열기", FileDialog.LOAD);
			fileOpen.setDirectory("C:\\Windows");
			fileOpen.setVisible(true);
		}

		if (e.getActionCommand().equals("끝내기(X)")) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new NotePad();
	}
}
