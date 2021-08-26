package a.b.c.kosmo.scr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class KosmoScr extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	// 생성자 
	public KosmoScr() {
		this.setTitle("코스모 메인");
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 600, 400);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KosmoScr();
	}
}
