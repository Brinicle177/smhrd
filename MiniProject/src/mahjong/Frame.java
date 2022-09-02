package mahjong;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame {

	public static void main(String[] args) {

		JFrame frm = new JFrame("Mahjong");		// 프레임 생성
		
		frm.setSize(1000, 800);					// 프레임 크기 설정
		frm.setLocationRelativeTo(null);		// 프레임 화면 가운데 배치
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 프레임 닫으면 메모리에서 제거되도록 설정
		
		 FlowLayout fLay = new FlowLayout();
	     frm.getContentPane().setLayout(fLay);
		
		JButton startBtn = new JButton("시작");	// 시작 버튼 생성
		
		frm.add(startBtn);
		
		frm.setVisible(true);

	}

}
