package ss;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class 치킨프로젝트화면 {

	private JFrame frame;
	private JTextField 등록ID창;
	private JPasswordField 등록비번창;
	private JTextField 로그인ID창;
	private JPasswordField 로그인비번창;
	private JTextField 등록이름창;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					치킨프로젝트화면 window = new 치킨프로젝트화면();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public 치킨프로젝트화면() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JInternalFrame 주문완료창 = new JInternalFrame("주문완료");
		주문완료창.getContentPane().setBackground(new Color(255, 255, 255));
		주문완료창.setBounds(90, 150, 264, 173);
		frame.getContentPane().add(주문완료창);
		주문완료창.getContentPane().setLayout(null);
		
		JLabel 주문완료라벨 = new JLabel("\uC8FC\uBB38 \uC644\uB8CC!");
		주문완료라벨.setFont(new Font("한컴 말랑말랑 Bold", Font.PLAIN, 33));
		주문완료라벨.setBounds(56, 20, 139, 51);
		주문완료창.getContentPane().add(주문완료라벨);
		
		JButton 주문완료버튼 = new JButton("");
		주문완료버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/확인.png"));
		주문완료버튼.setFocusPainted(false);
		주문완료버튼.setContentAreaFilled(false);
		주문완료버튼.setBorderPainted(false);
		주문완료버튼.setBounds(25, 82, 200, 51);
		주문완료창.getContentPane().add(주문완료버튼);
		주문완료창.setVisible(false);
		


		JPanel 랜덤 = new JPanel();
		랜덤.setBackground(Color.WHITE);
		랜덤.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(랜덤);
		랜덤.setLayout(null);
		
		JButton 랜덤백버튼 = new JButton("");
		랜덤백버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽.png"));
		랜덤백버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽클릭.png"));
		랜덤백버튼.setFocusPainted(false);
		랜덤백버튼.setContentAreaFilled(false);
		랜덤백버튼.setBorderPainted(false);
		랜덤백버튼.setBounds(0, 0, 42, 42);
		랜덤.add(랜덤백버튼);
		
		JLabel 랜덤라벨 = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		랜덤라벨.setFont(new Font("THE허니버터", Font.PLAIN, 41));
		랜덤라벨.setBounds(79, 21, 274, 55);
		랜덤.add(랜덤라벨);
		
		JButton 랜덤다시버튼 = new JButton("");
		랜덤다시버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/랜덤다시.png"));
		랜덤다시버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/랜덤다시클릭.png"));
		랜덤다시버튼.setFocusPainted(false);
		랜덤다시버튼.setContentAreaFilled(false);
		랜덤다시버튼.setBorderPainted(false);
		랜덤다시버튼.setBounds(41, 446, 150, 40);
		랜덤.add(랜덤다시버튼);
		
		JButton 랜덤주문버튼 = new JButton("");
		랜덤주문버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문.png"));
		랜덤주문버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문클릭.png"));
		랜덤주문버튼.setFocusPainted(false);
		랜덤주문버튼.setContentAreaFilled(false);
		랜덤주문버튼.setBorderPainted(false);
		랜덤주문버튼.setBounds(237, 446, 150, 40);
		랜덤.add(랜덤주문버튼);
				
		랜덤.setVisible(false);
		
		JPanel 후라이드 = new JPanel();
		후라이드.setBackground(Color.WHITE);
		후라이드.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(후라이드);
		후라이드.setLayout(null);
		
		JButton 후라이드백버튼 = new JButton("");
		후라이드백버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽.png"));
		후라이드백버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽클릭.png"));
		후라이드백버튼.setFocusPainted(false);
		후라이드백버튼.setContentAreaFilled(false);
		후라이드백버튼.setBorderPainted(false);
		후라이드백버튼.setBounds(0, 0, 42, 42);
		후라이드.add(후라이드백버튼);
		
		JLabel 후라이드라벨 = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		후라이드라벨.setFont(new Font("THE허니버터", Font.PLAIN, 41));
		후라이드라벨.setBounds(79, 21, 274, 55);
		후라이드.add(후라이드라벨);
		
		JButton 후라이드저장버튼 = new JButton("");
		후라이드저장버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/저장.png"));
		후라이드저장버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/저장클릭.png"));
		후라이드저장버튼.setFocusPainted(false);
		후라이드저장버튼.setContentAreaFilled(false);
		후라이드저장버튼.setBorderPainted(false);
		후라이드저장버튼.setBounds(41, 446, 150, 40);
		후라이드.add(후라이드저장버튼);
		
		JButton 후라이드주문버튼 = new JButton("");
		후라이드주문버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문.png"));
		후라이드주문버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문클릭.png"));
		후라이드주문버튼.setFocusPainted(false);
		후라이드주문버튼.setContentAreaFilled(false);
		후라이드주문버튼.setBorderPainted(false);
		후라이드주문버튼.setBounds(237, 446, 150, 40);
		후라이드.add(후라이드주문버튼);
		
		JToggleButton 후라이드1버튼 = new JToggleButton("");
		후라이드1버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/후라이드1클릭.png"));
		후라이드1버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/후라이드1.png"));
		후라이드1버튼.setFocusPainted(false);
		후라이드1버튼.setContentAreaFilled(false);
		후라이드1버튼.setBorderPainted(false);
		후라이드1버튼.setBounds(39, 80, 346, 111);
		후라이드.add(후라이드1버튼);
		
		JToggleButton 후라이드2버튼 = new JToggleButton("");
		후라이드2버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/후라이드2클릭.png"));
		후라이드2버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/후라이드2.png"));
		후라이드2버튼.setFocusPainted(false);
		후라이드2버튼.setContentAreaFilled(false);
		후라이드2버튼.setBorderPainted(false);
		후라이드2버튼.setBounds(39, 194, 346, 111);
		후라이드.add(후라이드2버튼);
		
		JToggleButton 후라이드3버튼 = new JToggleButton("");
		후라이드3버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/후라이드3클릭.png"));
		후라이드3버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/후라이드3.png"));
		후라이드3버튼.setFocusPainted(false);
		후라이드3버튼.setContentAreaFilled(false);
		후라이드3버튼.setBorderPainted(false);
		후라이드3버튼.setBounds(39, 311, 346, 111);
		후라이드.add(후라이드3버튼);
		
		후라이드.setVisible(false);
		
		JPanel 양념 = new JPanel();
		양념.setBackground(Color.WHITE);
		양념.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(양념);
		양념.setLayout(null);
		
		JToggleButton 양념1버튼 = new JToggleButton("");
		양념1버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/양념1클릭.png"));
		양념1버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/양념1.png"));
		양념1버튼.setFocusPainted(false);
		양념1버튼.setContentAreaFilled(false);
		양념1버튼.setBorderPainted(false);
		양념1버튼.setBounds(39, 80, 346, 111);
		양념.add(양념1버튼);
		
		JToggleButton 양념2버튼 = new JToggleButton("");
		양념2버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/양념2클릭.png"));
		양념2버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/양념2.png"));
		양념2버튼.setFocusPainted(false);
		양념2버튼.setContentAreaFilled(false);
		양념2버튼.setBorderPainted(false);
		양념2버튼.setBounds(39, 194, 346, 111);
		양념.add(양념2버튼);
		
		JToggleButton 양념3버튼 = new JToggleButton("");
		양념3버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/양념3클릭.png"));
		양념3버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/양념3.png"));
		양념3버튼.setFocusPainted(false);
		양념3버튼.setContentAreaFilled(false);
		양념3버튼.setBorderPainted(false);
		양념3버튼.setBounds(39, 311, 346, 111);
		양념.add(양념3버튼);
		
		JButton 양념백버튼 = new JButton("");
		양념백버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽.png"));
		양념백버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽클릭.png"));
		양념백버튼.setFocusPainted(false);
		양념백버튼.setContentAreaFilled(false);
		양념백버튼.setBorderPainted(false);
		양념백버튼.setBounds(0, 0, 42, 42);
		양념.add(양념백버튼);
		
		JLabel 양념라벨 = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		양념라벨.setFont(new Font("THE허니버터", Font.PLAIN, 41));
		양념라벨.setBounds(79, 21, 274, 55);
		양념.add(양념라벨);
		
		JButton 양념저장버튼 = new JButton("");
		양념저장버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/저장.png"));
		양념저장버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/저장클릭.png"));
		양념저장버튼.setFocusPainted(false);
		양념저장버튼.setContentAreaFilled(false);
		양념저장버튼.setBorderPainted(false);
		양념저장버튼.setBounds(39, 441, 150, 40);
		양념.add(양념저장버튼);
		
		JButton 양념주문버튼 = new JButton("");
		양념주문버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문.png"));
		양념주문버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문클릭.png"));
		양념주문버튼.setFocusPainted(false);
		양념주문버튼.setContentAreaFilled(false);
		양념주문버튼.setBorderPainted(false);
		양념주문버튼.setBounds(235, 441, 150, 40);
		양념.add(양념주문버튼);
		
		양념.setVisible(false);
		
		JPanel 간장 = new JPanel();
		간장.setBackground(Color.WHITE);
		간장.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(간장);
		간장.setLayout(null);
		
		JToggleButton 간장1버튼 = new JToggleButton("");
		간장1버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/간장1클릭.png"));
		간장1버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/간장1.png"));
		간장1버튼.setFocusPainted(false);
		간장1버튼.setContentAreaFilled(false);
		간장1버튼.setBorderPainted(false);
		간장1버튼.setBounds(39, 80, 346, 111);
		간장.add(간장1버튼);
		
		JToggleButton 간장2버튼 = new JToggleButton("");
		간장2버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/간장2클릭.png"));
		간장2버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/간장2.png"));
		간장2버튼.setFocusPainted(false);
		간장2버튼.setContentAreaFilled(false);
		간장2버튼.setBorderPainted(false);
		간장2버튼.setBounds(39, 194, 346, 111);
		간장.add(간장2버튼);
		
		JToggleButton 간장3버튼 = new JToggleButton("");
		간장3버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/간장3클릭.png"));
		간장3버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/간장3.png"));
		간장3버튼.setFocusPainted(false);
		간장3버튼.setContentAreaFilled(false);
		간장3버튼.setBorderPainted(false);
		간장3버튼.setBounds(39, 311, 346, 111);
		간장.add(간장3버튼);
		
		JButton 간장백버튼 = new JButton("");
		간장백버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽.png"));
		간장백버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽클릭.png"));
		간장백버튼.setFocusPainted(false);
		간장백버튼.setContentAreaFilled(false);
		간장백버튼.setBorderPainted(false);
		간장백버튼.setBounds(0, 0, 42, 42);
		간장.add(간장백버튼);
		
		JLabel 간장라벨 = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		간장라벨.setFont(new Font("THE허니버터", Font.PLAIN, 41));
		간장라벨.setBounds(79, 21, 274, 55);
		간장.add(간장라벨);
		
		JButton 간장저장버튼 = new JButton("");
		간장저장버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/저장.png"));
		간장저장버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/저장클릭.png"));
		간장저장버튼.setFocusPainted(false);
		간장저장버튼.setContentAreaFilled(false);
		간장저장버튼.setBorderPainted(false);
		간장저장버튼.setBounds(39, 441, 150, 40);
		간장.add(간장저장버튼);
		
		JButton 간장주문버튼 = new JButton("");
		간장주문버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문.png"));
		간장주문버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문클릭.png"));
		간장주문버튼.setFocusPainted(false);
		간장주문버튼.setContentAreaFilled(false);
		간장주문버튼.setBorderPainted(false);
		간장주문버튼.setBounds(235, 441, 150, 40);
		간장.add(간장주문버튼);
		
		간장.setVisible(false);
		
		JPanel 기타 = new JPanel();
		기타.setBackground(Color.WHITE);
		기타.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(기타);
		기타.setLayout(null);
		
		JToggleButton 기타1버튼 = new JToggleButton("");
		기타1버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/기타1클릭.png"));
		기타1버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/기타1.png"));
		기타1버튼.setFocusPainted(false);
		기타1버튼.setContentAreaFilled(false);
		기타1버튼.setBorderPainted(false);
		기타1버튼.setBounds(39, 80, 346, 111);
		기타.add(기타1버튼);
		
		JToggleButton 기타2버튼 = new JToggleButton("");
		기타2버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/기타2클릭.png"));
		기타2버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/기타2.png"));
		기타2버튼.setFocusPainted(false);
		기타2버튼.setContentAreaFilled(false);
		기타2버튼.setBorderPainted(false);
		기타2버튼.setBounds(39, 194, 346, 111);
		기타.add(기타2버튼);
		
		JToggleButton 기타3버튼 = new JToggleButton("");
		기타3버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/기타3클릭.png"));
		기타3버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/기타3.png"));
		기타3버튼.setFocusPainted(false);
		기타3버튼.setContentAreaFilled(false);
		기타3버튼.setBorderPainted(false);
		기타3버튼.setBounds(39, 311, 346, 111);
		기타.add(기타3버튼);
		
		JButton 기타백버튼 = new JButton("");
		기타백버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽.png"));
		기타백버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽클릭.png"));
		기타백버튼.setFocusPainted(false);
		기타백버튼.setContentAreaFilled(false);
		기타백버튼.setBorderPainted(false);
		기타백버튼.setBounds(0, 0, 42, 42);
		기타.add(기타백버튼);
		
		JLabel 기타라벨 = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		기타라벨.setFont(new Font("THE허니버터", Font.PLAIN, 41));
		기타라벨.setBounds(79, 21, 274, 55);
		기타.add(기타라벨);
		
		JButton 기타저장버튼 = new JButton("");
		기타저장버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/저장.png"));
		기타저장버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/저장클릭.png"));
		기타저장버튼.setFocusPainted(false);
		기타저장버튼.setContentAreaFilled(false);
		기타저장버튼.setBorderPainted(false);
		기타저장버튼.setBounds(39, 441, 150, 40);
		기타.add(기타저장버튼);
		
		JButton 기타주문버튼 = new JButton("");
		기타주문버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문.png"));
		기타주문버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문클릭.png"));
		기타주문버튼.setFocusPainted(false);
		기타주문버튼.setContentAreaFilled(false);
		기타주문버튼.setBorderPainted(false);
		기타주문버튼.setBounds(235, 441, 150, 40);
		기타.add(기타주문버튼);
		
		기타.setVisible(false);
		
		JPanel 교촌 = new JPanel();
		교촌.setBackground(Color.WHITE);
		교촌.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(교촌);
		교촌.setLayout(null);
		
		JToggleButton 교촌1버튼 = new JToggleButton("");
		교촌1버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/교촌1클릭.png"));
		교촌1버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/교촌1.png"));
		교촌1버튼.setFocusPainted(false);
		교촌1버튼.setContentAreaFilled(false);
		교촌1버튼.setBorderPainted(false);
		교촌1버튼.setBounds(39, 80, 346, 111);
		교촌.add(교촌1버튼);
		
		JToggleButton 교촌2버튼 = new JToggleButton("");
		교촌2버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/교촌2클릭.png"));
		교촌2버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/교촌2.png"));
		교촌2버튼.setFocusPainted(false);
		교촌2버튼.setContentAreaFilled(false);
		교촌2버튼.setBorderPainted(false);
		교촌2버튼.setBounds(39, 194, 346, 111);
		교촌.add(교촌2버튼);
		
		JToggleButton 교촌3버튼 = new JToggleButton("");
		교촌3버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/교촌3클릭.png"));
		교촌3버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/교촌3.png"));
		교촌3버튼.setFocusPainted(false);
		교촌3버튼.setContentAreaFilled(false);
		교촌3버튼.setBorderPainted(false);
		교촌3버튼.setBounds(39, 311, 346, 111);
		교촌.add(교촌3버튼);
		
		JButton 교촌백버튼 = new JButton("");
		교촌백버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽.png"));
		교촌백버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽클릭.png"));
		교촌백버튼.setFocusPainted(false);
		교촌백버튼.setContentAreaFilled(false);
		교촌백버튼.setBorderPainted(false);
		교촌백버튼.setBounds(0, 0, 42, 42);
		교촌.add(교촌백버튼);
		
		JLabel 교촌라벨 = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		교촌라벨.setFont(new Font("THE허니버터", Font.PLAIN, 41));
		교촌라벨.setBounds(79, 21, 274, 55);
		교촌.add(교촌라벨);
		
		JButton 교촌저장버튼 = new JButton("");
		교촌저장버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/저장.png"));
		교촌저장버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/저장클릭.png"));
		교촌저장버튼.setFocusPainted(false);
		교촌저장버튼.setContentAreaFilled(false);
		교촌저장버튼.setBorderPainted(false);
		교촌저장버튼.setBounds(39, 441, 150, 40);
		교촌.add(교촌저장버튼);
		
		JButton 교촌주문버튼 = new JButton("");
		교촌주문버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문.png"));
		교촌주문버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문클릭.png"));
		교촌주문버튼.setFocusPainted(false);
		교촌주문버튼.setContentAreaFilled(false);
		교촌주문버튼.setBorderPainted(false);
		교촌주문버튼.setBounds(235, 441, 150, 40);
		교촌.add(교촌주문버튼);
		
		교촌.setVisible(false);
		
		JPanel BHC = new JPanel();
		BHC.setBackground(Color.WHITE);
		BHC.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(BHC);
		BHC.setLayout(null);
		
		JToggleButton BHC1버튼 = new JToggleButton("");
		BHC1버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/BHC1클릭.png"));
		BHC1버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/BHC1.png"));
		BHC1버튼.setFocusPainted(false);
		BHC1버튼.setContentAreaFilled(false);
		BHC1버튼.setBorderPainted(false);
		BHC1버튼.setBounds(39, 80, 346, 111);
		BHC.add(BHC1버튼);
		
		JToggleButton BHC2버튼 = new JToggleButton("");
		BHC2버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/BHC2클릭.png"));
		BHC2버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/BHC2.png"));
		BHC2버튼.setFocusPainted(false);
		BHC2버튼.setContentAreaFilled(false);
		BHC2버튼.setBorderPainted(false);
		BHC2버튼.setBounds(39, 194, 346, 111);
		BHC.add(BHC2버튼);
		
		JToggleButton BHC3버튼 = new JToggleButton("");
		BHC3버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/BHC3클릭.png"));
		BHC3버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/BHC3.png"));
		BHC3버튼.setFocusPainted(false);
		BHC3버튼.setContentAreaFilled(false);
		BHC3버튼.setBorderPainted(false);
		BHC3버튼.setBounds(39, 311, 346, 111);
		BHC.add(BHC3버튼);
		
		JButton BHC백버튼 = new JButton("");
		BHC백버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽.png"));
		BHC백버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽클릭.png"));
		BHC백버튼.setFocusPainted(false);
		BHC백버튼.setContentAreaFilled(false);
		BHC백버튼.setBorderPainted(false);
		BHC백버튼.setBounds(0, 0, 42, 42);
		BHC.add(BHC백버튼);
		
		JLabel BHC라벨 = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		BHC라벨.setFont(new Font("THE허니버터", Font.PLAIN, 41));
		BHC라벨.setBounds(79, 21, 274, 55);
		BHC.add(BHC라벨);
		
		JButton BHC저장버튼 = new JButton("");
		BHC저장버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/저장.png"));
		BHC저장버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/저장클릭.png"));
		BHC저장버튼.setFocusPainted(false);
		BHC저장버튼.setContentAreaFilled(false);
		BHC저장버튼.setBorderPainted(false);
		BHC저장버튼.setBounds(39, 441, 150, 40);
		BHC.add(BHC저장버튼);
		
		JButton BHC주문버튼 = new JButton("");
		BHC주문버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문.png"));
		BHC주문버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문클릭.png"));
		BHC주문버튼.setFocusPainted(false);
		BHC주문버튼.setContentAreaFilled(false);
		BHC주문버튼.setBorderPainted(false);
		BHC주문버튼.setBounds(235, 441, 150, 40);
		BHC.add(BHC주문버튼);
		
		BHC.setVisible(false);
		
		JPanel BBQ = new JPanel();
		BBQ.setBackground(Color.WHITE);
		BBQ.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(BBQ);
		BBQ.setLayout(null);
		
		JToggleButton BBQ1버튼 = new JToggleButton("");
		BBQ1버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/BBQ1클릭.png"));
		BBQ1버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/BBQ1.png"));
		BBQ1버튼.setFocusPainted(false);
		BBQ1버튼.setContentAreaFilled(false);
		BBQ1버튼.setBorderPainted(false);
		BBQ1버튼.setBounds(39, 80, 346, 111);
		BBQ.add(BBQ1버튼);
		
		JToggleButton BBQ2버튼 = new JToggleButton("");
		BBQ2버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/BBQ2클릭.png"));
		BBQ2버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/BBQ2.png"));
		BBQ2버튼.setFocusPainted(false);
		BBQ2버튼.setContentAreaFilled(false);
		BBQ2버튼.setBorderPainted(false);
		BBQ2버튼.setBounds(39, 194, 346, 111);
		BBQ.add(BBQ2버튼);
		
		JToggleButton BBQ3버튼 = new JToggleButton("");
		BBQ3버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/BBQ3클릭.png"));
		BBQ3버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/BBQ3.png"));
		BBQ3버튼.setFocusPainted(false);
		BBQ3버튼.setContentAreaFilled(false);
		BBQ3버튼.setBorderPainted(false);
		BBQ3버튼.setBounds(39, 311, 346, 111);
		BBQ.add(BBQ3버튼);
		
		JButton BBQ백버튼 = new JButton("");
		BBQ백버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽.png"));
		BBQ백버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽클릭.png"));
		BBQ백버튼.setFocusPainted(false);
		BBQ백버튼.setContentAreaFilled(false);
		BBQ백버튼.setBorderPainted(false);
		BBQ백버튼.setBounds(0, 0, 42, 42);
		BBQ.add(BBQ백버튼);
		
		JLabel BBQ라벨 = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		BBQ라벨.setFont(new Font("THE허니버터", Font.PLAIN, 41));
		BBQ라벨.setBounds(79, 21, 274, 55);
		BBQ.add(BBQ라벨);
		
		JButton BBQ저장버튼 = new JButton("");
		BBQ저장버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/저장.png"));
		BBQ저장버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/저장클릭.png"));
		BBQ저장버튼.setFocusPainted(false);
		BBQ저장버튼.setContentAreaFilled(false);
		BBQ저장버튼.setBorderPainted(false);
		BBQ저장버튼.setBounds(39, 441, 150, 40);
		BBQ.add(BBQ저장버튼);
		
		JButton BBQ주문버튼 = new JButton("");
		BBQ주문버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문.png"));
		BBQ주문버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문클릭.png"));
		BBQ주문버튼.setFocusPainted(false);
		BBQ주문버튼.setContentAreaFilled(false);
		BBQ주문버튼.setBorderPainted(false);
		BBQ주문버튼.setBounds(235, 441, 150, 40);
		BBQ.add(BBQ주문버튼);
		
		BBQ.setVisible(false);
		
		JPanel 굽네 = new JPanel();
		굽네.setBackground(Color.WHITE);
		굽네.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(굽네);
		굽네.setLayout(null);
		
		JToggleButton 굽네1버튼 = new JToggleButton("");
		굽네1버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/굽네1클릭.png"));
		굽네1버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/굽네1.png"));
		굽네1버튼.setFocusPainted(false);
		굽네1버튼.setContentAreaFilled(false);
		굽네1버튼.setBorderPainted(false);
		굽네1버튼.setBounds(39, 80, 346, 111);
		굽네.add(굽네1버튼);
		
		JToggleButton 굽네2버튼 = new JToggleButton("");
		굽네2버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/굽네2클릭.png"));
		굽네2버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/굽네2.png"));
		굽네2버튼.setFocusPainted(false);
		굽네2버튼.setContentAreaFilled(false);
		굽네2버튼.setBorderPainted(false);
		굽네2버튼.setBounds(39, 194, 346, 111);
		굽네.add(굽네2버튼);
		
		JToggleButton 굽네3버튼 = new JToggleButton("");
		굽네3버튼.setSelectedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/굽네3클릭.png"));
		굽네3버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/굽네3.png"));
		굽네3버튼.setFocusPainted(false);
		굽네3버튼.setContentAreaFilled(false);
		굽네3버튼.setBorderPainted(false);
		굽네3버튼.setBounds(39, 311, 346, 111);
		굽네.add(굽네3버튼);
		
		JButton 굽네백버튼 = new JButton("");
		굽네백버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽.png"));
		굽네백버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽클릭.png"));
		굽네백버튼.setFocusPainted(false);
		굽네백버튼.setContentAreaFilled(false);
		굽네백버튼.setBorderPainted(false);
		굽네백버튼.setBounds(0, 0, 42, 42);
		굽네.add(굽네백버튼);
		
		JLabel 굽네라벨 = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		굽네라벨.setFont(new Font("THE허니버터", Font.PLAIN, 41));
		굽네라벨.setBounds(79, 21, 274, 55);
		굽네.add(굽네라벨);
		
		JButton 굽네저장버튼 = new JButton("");
		굽네저장버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/저장.png"));
		굽네저장버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/저장클릭.png"));
		굽네저장버튼.setFocusPainted(false);
		굽네저장버튼.setContentAreaFilled(false);
		굽네저장버튼.setBorderPainted(false);
		굽네저장버튼.setBounds(39, 441, 150, 40);
		굽네.add(굽네저장버튼);
		
		JButton 굽네주문버튼 = new JButton("");
		굽네주문버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문.png"));
		굽네주문버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/주문클릭.png"));
		굽네주문버튼.setFocusPainted(false);
		굽네주문버튼.setContentAreaFilled(false);
		굽네주문버튼.setBorderPainted(false);
		굽네주문버튼.setBounds(235, 441, 150, 40);
		굽네.add(굽네주문버튼);
		
		굽네.setVisible(false);
				
		JPanel 선택1 = new JPanel();
		선택1.setBackground(new Color(255, 255, 255));
		선택1.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(선택1);
		선택1.setLayout(null);
		
		JInternalFrame 내치킨목록 = new JInternalFrame("\uB0B4\uB0B4 \uCE58\uD0A8");
		내치킨목록.getContentPane().setBackground(new Color(240, 255, 255));
		내치킨목록.setBounds(12, 68, 406, 351);
		선택1.add(내치킨목록);
		내치킨목록.getContentPane().setLayout(null);
		
		JLabel 내치킨라벨 = new JLabel("\uB0B4 \uCE58\uD0A8 \uBAA9\uB85D");
		내치킨라벨.setFont(new Font("THE허니버터", Font.PLAIN, 20));
		내치킨라벨.setBounds(12, 10, 113, 34);
		내치킨목록.getContentPane().add(내치킨라벨);
		
		JTextArea 내치킨목록창 = new JTextArea();
		내치킨목록창.setBounds(12, 42, 366, 241);
		내치킨목록.getContentPane().add(내치킨목록창);
		
		JButton 내치킨목록검색버튼 = new JButton("");
		내치킨목록검색버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/유저 검색.png"));
		내치킨목록검색버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/유저 검색 클릭.png"));
		내치킨목록검색버튼.setBorderPainted(false);
		내치킨목록검색버튼.setFocusPainted(false);
		내치킨목록검색버튼.setContentAreaFilled(false);
		내치킨목록검색버튼.setBounds(197, 289, 97, 30);
		내치킨목록.getContentPane().add(내치킨목록검색버튼);
		
		JButton 내치킨목록닫기버튼 = new JButton("");
		내치킨목록닫기버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/유저 닫기.png"));
		내치킨목록닫기버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/유저 닫기 클릭.png"));
		내치킨목록닫기버튼.setBorderPainted(false);
		내치킨목록닫기버튼.setFocusPainted(false);
		내치킨목록닫기버튼.setContentAreaFilled(false);
		내치킨목록닫기버튼.setBounds(288, 288, 97, 31);
		내치킨목록.getContentPane().add(내치킨목록닫기버튼);
		내치킨목록.setVisible(false);
				
		JLabel 선택1라벨 = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		선택1라벨.setFont(new Font("THE허니버터", Font.PLAIN, 41));
		선택1라벨.setBounds(79, 21, 274, 55);
		선택1.add(선택1라벨);
				
		JButton 선택1취향버튼 = new JButton("");
		선택1취향버튼.setBounds(27, 91, 178, 202);
		선택1취향버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/취향.png"));
		선택1취향버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/취향클릭.png"));
		선택1취향버튼.setBorderPainted(false);
		선택1취향버튼.setFocusPainted(false);
		선택1취향버튼.setContentAreaFilled(false);
		선택1.add(선택1취향버튼);
				
		JButton 선택1랜덤버튼 = new JButton("");
		선택1랜덤버튼.setBounds(228, 93, 178, 187);
		선택1랜덤버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/랜덤.png"));
		선택1랜덤버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/랜덤클릭.png"));
		선택1랜덤버튼.setBorderPainted(false);
		선택1랜덤버튼.setFocusPainted(false);
		선택1랜덤버튼.setContentAreaFilled(false);
		선택1.add(선택1랜덤버튼);
				
		JButton 선택1돌아가기버튼 = new JButton("");
		선택1돌아가기버튼.setBounds(228, 293, 178, 208);
		선택1돌아가기버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/돌아가기.png"));
		선택1돌아가기버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/돌아가기클릭.png"));
		선택1돌아가기버튼.setBorderPainted(false);
		선택1돌아가기버튼.setFocusPainted(false);
		선택1돌아가기버튼.setContentAreaFilled(false);
		선택1.add(선택1돌아가기버튼);
				
		JButton 선택1내치킨버튼 = new JButton("");
		선택1내치킨버튼.setBounds(27, 291, 178, 210);
		선택1내치킨버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/내치킨.png"));
		선택1내치킨버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/내치킨클릭.png"));
		선택1내치킨버튼.setBorderPainted(false);
		선택1내치킨버튼.setFocusPainted(false);
		선택1내치킨버튼.setContentAreaFilled(false);
		선택1.add(선택1내치킨버튼);
				
		JButton 선택1백버튼 = new JButton("");
		선택1백버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽.png"));
		선택1백버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽클릭.png"));
		선택1백버튼.setFocusPainted(false);
		선택1백버튼.setContentAreaFilled(false);
		선택1백버튼.setBorderPainted(false);
		선택1백버튼.setBounds(0, 0, 42, 42);
		선택1.add(선택1백버튼);
		선택1.setVisible(false);
				
				
				
		JPanel 맛선택 = new JPanel();
		맛선택.setBackground(Color.WHITE);
		맛선택.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(맛선택);
		맛선택.setLayout(null);
				
		JLabel 맛선택라벨 = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		맛선택라벨.setFont(new Font("THE허니버터", Font.PLAIN, 41));
		맛선택라벨.setBounds(79, 21, 274, 55);
		맛선택.add(맛선택라벨);
				
		JButton 맛선택후라이드버튼 = new JButton("");
		맛선택후라이드버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/후라이드.png"));
		맛선택후라이드버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/후라이드클릭.png"));
		맛선택후라이드버튼.setFocusPainted(false);
		맛선택후라이드버튼.setContentAreaFilled(false);
		맛선택후라이드버튼.setBorderPainted(false);
		맛선택후라이드버튼.setBounds(27, 91, 178, 220);
		맛선택.add(맛선택후라이드버튼);
				
		JButton 맛선택양념버튼 = new JButton("");
		맛선택양념버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/양념.png"));
		맛선택양념버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/양념클릭.png"));
		맛선택양념버튼.setFocusPainted(false);
		맛선택양념버튼.setContentAreaFilled(false);
		맛선택양념버튼.setBorderPainted(false);
		맛선택양념버튼.setBounds(228, 93, 178, 202);
		맛선택.add(맛선택양념버튼);
				
		JButton 맛선택간장버튼 = new JButton("");
		맛선택간장버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/간장.png"));
		맛선택간장버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/간장클릭.png"));
		맛선택간장버튼.setFocusPainted(false);
		맛선택간장버튼.setContentAreaFilled(false);
		맛선택간장버튼.setBorderPainted(false);
		맛선택간장버튼.setBounds(27, 291, 178, 212);
		맛선택.add(맛선택간장버튼);
				
		JButton 맛선택기타버튼 = new JButton("");
		맛선택기타버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/기타.png"));
		맛선택기타버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/기타클릭.png"));
		맛선택기타버튼.setFocusPainted(false);
		맛선택기타버튼.setContentAreaFilled(false);
		맛선택기타버튼.setBorderPainted(false);
		맛선택기타버튼.setBounds(228, 293, 178, 210);
		맛선택.add(맛선택기타버튼);
				
		JButton 맛선택백버튼 = new JButton("");
		맛선택백버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽.png"));
		맛선택백버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽클릭.png"));
		맛선택백버튼.setBorderPainted(false);
		맛선택백버튼.setFocusPainted(false);
		맛선택백버튼.setContentAreaFilled(false);
		맛선택백버튼.setBounds(0, 0, 42, 42);
		맛선택.add(맛선택백버튼);
		맛선택.setVisible(false);
				
		JPanel 선택2 = new JPanel();
		선택2.setBackground(Color.WHITE);
		선택2.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(선택2);
		선택2.setLayout(null);
			
		JLabel 선택2치킨 = new JLabel("");
		선택2치킨.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/치킨메인.png"));
		선택2치킨.setBounds(105, 79, 227, 145);
		선택2.add(선택2치킨);
				
		JLabel 선택2라벨 = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		선택2라벨.setBounds(79, 21, 264, 48);
		선택2라벨.setFont(new Font("THE허니버터", Font.PLAIN, 41));
		선택2.add(선택2라벨);
				
		JButton 선택2브랜드버튼 = new JButton("");
		선택2브랜드버튼.setBounds(228, 262, 177, 229);
		선택2브랜드버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/브랜드.png"));
		선택2브랜드버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/브랜드클릭.png"));
		선택2브랜드버튼.setBorderPainted(false);
		선택2브랜드버튼.setFocusPainted(false);
		선택2브랜드버튼.setContentAreaFilled(false);
		선택2.add(선택2브랜드버튼);
				
		JButton 선택2맛버튼 = new JButton("");
		선택2맛버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/맛.png"));
		선택2맛버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/맛클릭.png"));
		선택2맛버튼.setBorderPainted(false);
		선택2맛버튼.setFocusPainted(false);
		선택2맛버튼.setContentAreaFilled(false);
		선택2맛버튼.setBounds(25, 262, 177, 194);
		선택2.add(선택2맛버튼);
				
		JButton 선택2백버튼 = new JButton("");
		선택2백버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽.png"));
		선택2백버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽클릭.png"));
		선택2백버튼.setBorderPainted(false);
		선택2백버튼.setFocusPainted(false);
		선택2백버튼.setContentAreaFilled(false);
		선택2백버튼.setBounds(0, 0, 42, 42);
		선택2.add(선택2백버튼);
		선택2.setVisible(false);
		
				
		JPanel 메인화면 = new JPanel();
		메인화면.setBackground(new Color(255, 255, 255));
		메인화면.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(메인화면);
		메인화면.setLayout(null);
				
		JInternalFrame 유저검색창 = new JInternalFrame("\uC0AC\uC6A9\uC790 \uAC80\uC0C9");
		유저검색창.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		유저검색창.setBounds(0, 86, 434, 318);
		메인화면.add(유저검색창);
		유저검색창.getContentPane().setLayout(null);
				
		JLabel 유저검색창라벨 = new JLabel("\uBAA8\uB4E0 \uC0AC\uC6A9\uC790 \uAC80\uC0C9");
		유저검색창라벨.setFont(new Font("THE허니버터", Font.PLAIN, 22));
		유저검색창라벨.setBounds(12, 0, 154, 33);
		유저검색창.getContentPane().add(유저검색창라벨);
				
		JTextArea 유저검색창텍스트 = new JTextArea();
		유저검색창텍스트.setBounds(10, 38, 400, 206);
		유저검색창.getContentPane().add(유저검색창텍스트);
				
		JButton 유저검색버튼 = new JButton("");
		유저검색버튼.setBounds(241, 248, 77, 28);
		유저검색버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/유저 검색.png"));
		유저검색버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/유저 검색 클릭.png"));
		유저검색버튼.setBorderPainted(false);
		유저검색버튼.setFocusPainted(false);
		유저검색버튼.setContentAreaFilled(false);
		유저검색창.getContentPane().add(유저검색버튼);
				
		JButton 유저검색닫기버튼 = new JButton("");
		유저검색닫기버튼.setBounds(321, 248, 85, 29);
		유저검색닫기버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/유저 닫기.png"));
		유저검색닫기버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/유저 닫기 클릭.png"));
		유저검색닫기버튼.setBorderPainted(false);
		유저검색닫기버튼.setFocusPainted(false);
		유저검색닫기버튼.setContentAreaFilled(false);
		유저검색창.getContentPane().add(유저검색닫기버튼);
				
		JButton 메인등록버튼 = new JButton("");
		메인등록버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/가입.png"));
		메인등록버튼.setBackground(Color.WHITE);
		메인등록버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/가입클릭.png"));
		메인등록버튼.setBounds(34, 256, 169, 159);
		메인등록버튼.setBorderPainted(false);
		메인등록버튼.setFocusPainted(false);
		메인등록버튼.setContentAreaFilled(false);
				
		메인화면.add(메인등록버튼);
				
		JButton 메인로그인버튼 = new JButton("");
		메인로그인버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/로그인1.png"));
		메인로그인버튼.setBackground(Color.WHITE);
		메인로그인버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/로그인클릭.png"));
		메인로그인버튼.setBounds(229, 256, 169, 159);
		메인화면.add(메인로그인버튼);
		메인로그인버튼.setBorderPainted(false);
		메인로그인버튼.setFocusPainted(false);
		메인로그인버튼.setContentAreaFilled(false);
		
		JButton 메인종료버튼 = new JButton("");
		메인종료버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/나가기.png"));
		메인종료버튼.setBackground(new Color(255, 255, 204));
		메인종료버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/나가기클릭.png"));
		메인종료버튼.setBounds(378, 446, 44, 45);
		메인종료버튼.setBorderPainted(false);
		메인종료버튼.setFocusPainted(false);
		메인종료버튼.setContentAreaFilled(false);
		메인화면.add(메인종료버튼);
		
		JButton 메인유저검색버튼 = new JButton("");
		메인유저검색버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/유저.png"));
		메인유저검색버튼.setBackground(new Color(255, 255, 204));
		메인유저검색버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/유저클릭.png"));
		메인유저검색버튼.setBounds(322, 446, 44, 45);
		메인유저검색버튼.setBorderPainted(false);
		메인유저검색버튼.setFocusPainted(false);
		메인유저검색버튼.setContentAreaFilled(false);
		메인화면.add(메인유저검색버튼);
		
		JLabel 메인제목 = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		메인제목.setFont(new Font("THE허니버터", Font.PLAIN, 41));
		메인제목.setBounds(79, 21, 274, 55);
		메인화면.add(메인제목);
		
		JLabel 메인치킨 = new JLabel("");
		메인치킨.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/치킨메인.png"));
		메인치킨.setBounds(105, 79, 227, 145);
		메인화면.add(메인치킨);
		
		JPanel 로그인 = new JPanel();
		로그인.setBackground(new Color(255, 255, 255));
		로그인.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(로그인);
		로그인.setLayout(null);
		
		JLabel 로그인라벨 = new JLabel("Login");
		로그인라벨.setFont(new Font("THE허니버터", Font.PLAIN, 41));
		로그인라벨.setBounds(166, 24, 140, 55);
		로그인.add(로그인라벨);
		
		JLabel 로그인ID = new JLabel("ID");
		로그인ID.setFont(new Font("THE허니버터", Font.PLAIN, 35));
		로그인ID.setBounds(193, 109, 58, 33);
		로그인.add(로그인ID);
		
		로그인ID창 = new JTextField();
		로그인ID창.setFont(new Font("굴림", Font.PLAIN, 20));
		로그인ID창.setColumns(10);
		로그인ID창.setBounds(121, 156, 189, 44);
		로그인.add(로그인ID창);
		
		JLabel 로그인비번 = new JLabel("PASSWORD");
		로그인비번.setFont(new Font("THE허니버터", Font.PLAIN, 35));
		로그인비번.setBounds(136, 229, 165, 33);
		로그인.add(로그인비번);
		
		로그인비번창 = new JPasswordField();
		로그인비번창.setFont(new Font("굴림", Font.PLAIN, 20));
		로그인비번창.setBounds(121, 287, 189, 44);
		로그인.add(로그인비번창);
		
		JButton 로그인버튼 = new JButton("");
		로그인버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/로긴.png"));
		로그인버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/로긴클릭.png"));
		로그인버튼.setBorderPainted(false);
		로그인버튼.setFocusPainted(false);
		로그인버튼.setContentAreaFilled(false);
		로그인버튼.setBounds(118, 376, 193, 50);
		로그인.add(로그인버튼);
		
		JButton 로그인백버튼 = new JButton("");
		로그인백버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽.png"));
		로그인백버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽클릭.png"));
		로그인백버튼.setFocusPainted(false);
		로그인백버튼.setContentAreaFilled(false);
		로그인백버튼.setBorderPainted(false);
		로그인백버튼.setBounds(0, 0, 42, 42);
		로그인.add(로그인백버튼);
	
		
		JPanel 등록 = new JPanel();
		등록.setBackground(new Color(255, 255, 255));
		등록.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(등록);
		등록.setLayout(null);
		
		JLabel 등록라벨 = new JLabel("Sign Up");
		등록라벨.setFont(new Font("THE허니버터", Font.PLAIN, 41));
		등록라벨.setBounds(140, 23, 150, 55);
		등록.add(등록라벨);
		
		JLabel 등록ID = new JLabel("아이디 : ", JLabel.RIGHT);
		등록ID.setFont(new Font("THE허니버터", Font.PLAIN, 30));
		등록ID.setBounds(40, 120, 150, 33);
		등록.add(등록ID);
		
		등록ID창 = new JTextField();
		등록ID창.setFont(new Font("굴림", Font.PLAIN, 20));
		등록ID창.setBounds(200, 120, 189, 44);
		등록.add(등록ID창);
		등록ID창.setColumns(10);
		
		JLabel 등록비번 = new JLabel("비밀번호 : ", JLabel.RIGHT);
		등록비번.setFont(new Font("THE허니버터", Font.PLAIN, 30));
		등록비번.setBounds(40, 220, 150, 33);
		등록.add(등록비번);
		
		등록비번창 = new JPasswordField();
		등록비번창.setFont(new Font("굴림", Font.PLAIN, 20));
		등록비번창.setBounds(200, 220, 189, 44);
		등록.add(등록비번창);
		
		JLabel 등록이름 = new JLabel("이름 : ", JLabel.RIGHT);
		등록이름.setFont(new Font("THE허니버터", Font.PLAIN, 30));
		등록이름.setBounds(40, 320, 150, 33);
		등록.add(등록이름);
		
		등록이름창 = new JTextField();
		등록이름창.setFont(new Font("굴림", Font.PLAIN, 20));
		등록이름창.setBounds(200, 320, 189, 44);
		등록.add(등록이름창);
		
		
	
		
		JButton 등록확인버튼 = new JButton("");
		등록확인버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/확인.png"));
		등록확인버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/확인클릭.png"));
		등록확인버튼.setBorderPainted(false);
		등록확인버튼.setFocusPainted(false);
		등록확인버튼.setContentAreaFilled(false);
		등록확인버튼.setBounds(93, 389, 245, 85);
		등록.add(등록확인버튼);
		
		JButton 등록백버튼 = new JButton("");
		등록백버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽.png"));
		등록백버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/뺵클릭.png"));
		등록백버튼.setFocusPainted(false);
		등록백버튼.setContentAreaFilled(false);
		등록백버튼.setBorderPainted(false);
		등록백버튼.setBounds(0, 0, 42, 42);
		등록.add(등록백버튼);
		
		JPanel 브랜드 = new JPanel();
		브랜드.setBackground(Color.WHITE);
		브랜드.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(브랜드);
		브랜드.setLayout(null);
		
		JLabel 브랜드라벨 = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		브랜드라벨.setFont(new Font("THE허니버터", Font.PLAIN, 41));
		브랜드라벨.setBounds(79, 21, 274, 55);
		브랜드.add(브랜드라벨);
		
		JButton 브랜드교촌버튼 = new JButton("");
		브랜드교촌버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/교촌.png"));
		브랜드교촌버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/교촌클릭.png"));
		브랜드교촌버튼.setFocusPainted(false);
		브랜드교촌버튼.setContentAreaFilled(false);
		브랜드교촌버튼.setBorderPainted(false);
		브랜드교촌버튼.setBounds(27, 91, 178, 220);
		브랜드.add(브랜드교촌버튼);
		
		JButton 브랜드BHC버튼 = new JButton("");
		브랜드BHC버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/BHC.png"));
		브랜드BHC버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/BHC클릭.png"));
		브랜드BHC버튼.setFocusPainted(false);
		브랜드BHC버튼.setContentAreaFilled(false);
		브랜드BHC버튼.setBorderPainted(false);
		브랜드BHC버튼.setBounds(228, 93, 178, 202);
		브랜드.add(브랜드BHC버튼);
		
		JButton 브랜드BBQ버튼 = new JButton("");
		브랜드BBQ버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/BBQ.png"));
		브랜드BBQ버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/BBQ클릭.png"));
		브랜드BBQ버튼.setFocusPainted(false);
		브랜드BBQ버튼.setContentAreaFilled(false);
		브랜드BBQ버튼.setBorderPainted(false);
		브랜드BBQ버튼.setBounds(27, 291, 178, 212);
		브랜드.add(브랜드BBQ버튼);
		
		JButton 브랜드굽네버튼 = new JButton("");
		브랜드굽네버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/굽네.png"));
		브랜드굽네버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/굽네클릭.png"));
		브랜드굽네버튼.setFocusPainted(false);
		브랜드굽네버튼.setContentAreaFilled(false);
		브랜드굽네버튼.setBorderPainted(false);
		브랜드굽네버튼.setBounds(228, 293, 178, 210);
		브랜드.add(브랜드굽네버튼);
		
		JButton 브랜드백버튼 = new JButton("");
		브랜드백버튼.setIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽.png"));
		브랜드백버튼.setPressedIcon(new ImageIcon("D:/자바 안드로이드/화면/이미지/빽클릭.png"));
		브랜드백버튼.setBorderPainted(false);
		브랜드백버튼.setFocusPainted(false);
		브랜드백버튼.setContentAreaFilled(false);
		브랜드백버튼.setBounds(0, 0, 42, 42);
		브랜드.add(브랜드백버튼);
		브랜드.setVisible(false);		
		등록.setVisible(false);
		로그인.setVisible(false);
		
		
		등록확인버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				등록.setVisible(false);
				메인화면.setVisible(true);
			}
			
		});
		등록백버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				등록.setVisible(false);
				메인화면.setVisible(true);
			}
			
		});
		
		로그인백버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				로그인.setVisible(false);
				메인화면.setVisible(true);
			}
			
		});
		선택2백버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				선택2.setVisible(false);
				선택1.setVisible(true);
			}
			
		});
		맛선택백버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				맛선택.setVisible(false);
				선택2.setVisible(true);
			}
			
		});
		
		선택2맛버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				선택2.setVisible(false);
				맛선택.setVisible(true);
			}
			
		});
	
	
	
		
		로그인버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				로그인.setVisible(false);
				선택1.setVisible(true);
			}
			
		});
		
		메인등록버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				등록.setVisible(true);
				메인화면.setVisible(false);
			}
			
		});
		
		메인로그인버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				로그인.setVisible(true);
				메인화면.setVisible(false);
			}
			
		});
		메인유저검색버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				유저검색창.setVisible(true);
			}
			
		});
		유저검색닫기버튼.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				유저검색창.setVisible(false);
			}
		});
		
		메인종료버튼.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		선택1내치킨버튼.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				내치킨목록.setVisible(true);
			}
		});
		선택1백버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				선택1.setVisible(false);
				로그인.setVisible(true);
			}
			
		});
		
		선택1취향버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				선택2.setVisible(true);
				선택1.setVisible(false);
			}
			
		});
		내치킨목록닫기버튼.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				내치킨목록.setVisible(false);
			}
		});
		
		선택1돌아가기버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				메인화면.setVisible(true);
				선택1.setVisible(false);
			}
			
		});
		
		선택2브랜드버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				브랜드.setVisible(true);
				선택2.setVisible(false);
			}
			
		});
		
		브랜드백버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				선택2.setVisible(true);
				브랜드.setVisible(false);
			}
			
		});
		
		맛선택후라이드버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				후라이드.setVisible(true);
				맛선택.setVisible(false);
			}
			
		});
		
		맛선택양념버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				양념.setVisible(true);
				맛선택.setVisible(false);
			}
			
		});
		
		
		맛선택간장버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				간장.setVisible(true);
				맛선택.setVisible(false);
			}
			
		});
		
		맛선택기타버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				기타.setVisible(true);
				맛선택.setVisible(false);
			}
			
		});
		
		
		후라이드백버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				맛선택.setVisible(true);
				후라이드.setVisible(false);
			}
			
		});
		
		양념백버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				맛선택.setVisible(true);
				양념.setVisible(false);
			}
			
		});
		
		간장백버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				맛선택.setVisible(true);
				간장.setVisible(false);
			}
			
		});
		
		기타백버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				맛선택.setVisible(true);
				기타.setVisible(false);
			}
			
		});
		
		브랜드교촌버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				교촌.setVisible(true);
				브랜드.setVisible(false);
			}
			
		});
		
		브랜드BHC버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BHC.setVisible(true);
				브랜드.setVisible(false);
			}
			
		});
		
		
		브랜드BBQ버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BBQ.setVisible(true);
				브랜드.setVisible(false);
			}
			
		});
		
		브랜드굽네버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				굽네.setVisible(true);
				브랜드.setVisible(false);
			}
			
		});
		
		
		교촌백버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				브랜드.setVisible(true);
				교촌.setVisible(false);
			}
			
		});
		
		BHC백버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				브랜드.setVisible(true);
				BHC.setVisible(false);
			}
			
		});
		
		BBQ백버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				브랜드.setVisible(true);
				BBQ.setVisible(false);
			}
			
		});
		
		굽네백버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				브랜드.setVisible(true);
				굽네.setVisible(false);
			}
			
		});
		
		랜덤백버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				선택1.setVisible(true);
				랜덤.setVisible(false);
			}
			
		});
		
		선택1랜덤버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				랜덤.setVisible(true);
				선택1.setVisible(false);
				
			}
			
		});
		
		후라이드주문버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				주문완료창.setVisible(true);
				
			}
			
		});
		
		
		양념주문버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				주문완료창.setVisible(true);
				
			}
			
		});
		
		
		간장주문버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				주문완료창.setVisible(true);
				
			}
			
		});
		
		
		기타주문버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				주문완료창.setVisible(true);
				
			}
			
		});
		
		
		굽네주문버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				주문완료창.setVisible(true);
				
			}
			
		});
		
		
		교촌주문버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				주문완료창.setVisible(true);
				
			}
			
		});
		
		
		BHC주문버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				주문완료창.setVisible(true);
				
			}
			
		});
		
		
		BBQ주문버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				주문완료창.setVisible(true);
				
			}
			
		});
		
		랜덤주문버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				주문완료창.setVisible(true);
				
			}
			
		});
		
		
		주문완료버튼.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				주문완료창.setVisible(false);
				후라이드.setVisible(false);
				양념.setVisible(false);
				간장.setVisible(false);
				기타.setVisible(false);
				굽네.setVisible(false);
				교촌.setVisible(false);
				BBQ.setVisible(false);
				BHC.setVisible(false);
				랜덤.setVisible(false);
				메인화면.setVisible(true);
				
			}
			
		});
		
		
	}
}
