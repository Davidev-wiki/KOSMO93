package a.b.c.swing;

import javax.swing.JFrame;

public class JframeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HTML과 비슷하다.
		JFrame jf = new JFrame("첫 번째 JFrame");
		
		// JFrame의 크기
			// jf.setSize(폭, 높이)
			// jf.setSize(width, height); void - Window
		jf.setSize(600, 500);
		
		// JFrame 종료 : 창에서 x버튼 누르면 종료시키는 것
			// jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); void - Window
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JFrame 윈도우 화면에 보여줘 : true : 작업관리자에 종료할 때까지 노출됨.
		// JFrame 윈도우 화면에 보여주진 말고 : false : 작업관리자에 나왔다가 사라짐.
		// 메모리엔느 올라가 있는 상태로.
			// jf.setVisible(true); void - window
		jf.setVisible(true);
	}

}
