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

public class ġŲ������Ʈȭ�� {

	private JFrame frame;
	private JTextField ���IDâ;
	private JPasswordField ��Ϻ��â;
	private JTextField �α���IDâ;
	private JPasswordField �α��κ��â;
	private JTextField ����̸�â;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ġŲ������Ʈȭ�� window = new ġŲ������Ʈȭ��();
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
	public ġŲ������Ʈȭ��() {
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
		
		
		JInternalFrame �ֹ��Ϸ�â = new JInternalFrame("�ֹ��Ϸ�");
		�ֹ��Ϸ�â.getContentPane().setBackground(new Color(255, 255, 255));
		�ֹ��Ϸ�â.setBounds(90, 150, 264, 173);
		frame.getContentPane().add(�ֹ��Ϸ�â);
		�ֹ��Ϸ�â.getContentPane().setLayout(null);
		
		JLabel �ֹ��Ϸ�� = new JLabel("\uC8FC\uBB38 \uC644\uB8CC!");
		�ֹ��Ϸ��.setFont(new Font("���� �������� Bold", Font.PLAIN, 33));
		�ֹ��Ϸ��.setBounds(56, 20, 139, 51);
		�ֹ��Ϸ�â.getContentPane().add(�ֹ��Ϸ��);
		
		JButton �ֹ��Ϸ��ư = new JButton("");
		�ֹ��Ϸ��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/Ȯ��.png"));
		�ֹ��Ϸ��ư.setFocusPainted(false);
		�ֹ��Ϸ��ư.setContentAreaFilled(false);
		�ֹ��Ϸ��ư.setBorderPainted(false);
		�ֹ��Ϸ��ư.setBounds(25, 82, 200, 51);
		�ֹ��Ϸ�â.getContentPane().add(�ֹ��Ϸ��ư);
		�ֹ��Ϸ�â.setVisible(false);
		


		JPanel ���� = new JPanel();
		����.setBackground(Color.WHITE);
		����.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(����);
		����.setLayout(null);
		
		JButton �������ư = new JButton("");
		�������ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��.png"));
		�������ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ŭ��.png"));
		�������ư.setFocusPainted(false);
		�������ư.setContentAreaFilled(false);
		�������ư.setBorderPainted(false);
		�������ư.setBounds(0, 0, 42, 42);
		����.add(�������ư);
		
		JLabel ������ = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		������.setFont(new Font("THE��Ϲ���", Font.PLAIN, 41));
		������.setBounds(79, 21, 274, 55);
		����.add(������);
		
		JButton �����ٽù�ư = new JButton("");
		�����ٽù�ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�����ٽ�.png"));
		�����ٽù�ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�����ٽ�Ŭ��.png"));
		�����ٽù�ư.setFocusPainted(false);
		�����ٽù�ư.setContentAreaFilled(false);
		�����ٽù�ư.setBorderPainted(false);
		�����ٽù�ư.setBounds(41, 446, 150, 40);
		����.add(�����ٽù�ư);
		
		JButton �����ֹ���ư = new JButton("");
		�����ֹ���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�.png"));
		�����ֹ���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�Ŭ��.png"));
		�����ֹ���ư.setFocusPainted(false);
		�����ֹ���ư.setContentAreaFilled(false);
		�����ֹ���ư.setBorderPainted(false);
		�����ֹ���ư.setBounds(237, 446, 150, 40);
		����.add(�����ֹ���ư);
				
		����.setVisible(false);
		
		JPanel �Ķ��̵� = new JPanel();
		�Ķ��̵�.setBackground(Color.WHITE);
		�Ķ��̵�.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(�Ķ��̵�);
		�Ķ��̵�.setLayout(null);
		
		JButton �Ķ��̵���ư = new JButton("");
		�Ķ��̵���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��.png"));
		�Ķ��̵���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ŭ��.png"));
		�Ķ��̵���ư.setFocusPainted(false);
		�Ķ��̵���ư.setContentAreaFilled(false);
		�Ķ��̵���ư.setBorderPainted(false);
		�Ķ��̵���ư.setBounds(0, 0, 42, 42);
		�Ķ��̵�.add(�Ķ��̵���ư);
		
		JLabel �Ķ��̵�� = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		�Ķ��̵��.setFont(new Font("THE��Ϲ���", Font.PLAIN, 41));
		�Ķ��̵��.setBounds(79, 21, 274, 55);
		�Ķ��̵�.add(�Ķ��̵��);
		
		JButton �Ķ��̵������ư = new JButton("");
		�Ķ��̵������ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����.png"));
		�Ķ��̵������ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����Ŭ��.png"));
		�Ķ��̵������ư.setFocusPainted(false);
		�Ķ��̵������ư.setContentAreaFilled(false);
		�Ķ��̵������ư.setBorderPainted(false);
		�Ķ��̵������ư.setBounds(41, 446, 150, 40);
		�Ķ��̵�.add(�Ķ��̵������ư);
		
		JButton �Ķ��̵��ֹ���ư = new JButton("");
		�Ķ��̵��ֹ���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�.png"));
		�Ķ��̵��ֹ���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�Ŭ��.png"));
		�Ķ��̵��ֹ���ư.setFocusPainted(false);
		�Ķ��̵��ֹ���ư.setContentAreaFilled(false);
		�Ķ��̵��ֹ���ư.setBorderPainted(false);
		�Ķ��̵��ֹ���ư.setBounds(237, 446, 150, 40);
		�Ķ��̵�.add(�Ķ��̵��ֹ���ư);
		
		JToggleButton �Ķ��̵�1��ư = new JToggleButton("");
		�Ķ��̵�1��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�Ķ��̵�1Ŭ��.png"));
		�Ķ��̵�1��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�Ķ��̵�1.png"));
		�Ķ��̵�1��ư.setFocusPainted(false);
		�Ķ��̵�1��ư.setContentAreaFilled(false);
		�Ķ��̵�1��ư.setBorderPainted(false);
		�Ķ��̵�1��ư.setBounds(39, 80, 346, 111);
		�Ķ��̵�.add(�Ķ��̵�1��ư);
		
		JToggleButton �Ķ��̵�2��ư = new JToggleButton("");
		�Ķ��̵�2��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�Ķ��̵�2Ŭ��.png"));
		�Ķ��̵�2��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�Ķ��̵�2.png"));
		�Ķ��̵�2��ư.setFocusPainted(false);
		�Ķ��̵�2��ư.setContentAreaFilled(false);
		�Ķ��̵�2��ư.setBorderPainted(false);
		�Ķ��̵�2��ư.setBounds(39, 194, 346, 111);
		�Ķ��̵�.add(�Ķ��̵�2��ư);
		
		JToggleButton �Ķ��̵�3��ư = new JToggleButton("");
		�Ķ��̵�3��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�Ķ��̵�3Ŭ��.png"));
		�Ķ��̵�3��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�Ķ��̵�3.png"));
		�Ķ��̵�3��ư.setFocusPainted(false);
		�Ķ��̵�3��ư.setContentAreaFilled(false);
		�Ķ��̵�3��ư.setBorderPainted(false);
		�Ķ��̵�3��ư.setBounds(39, 311, 346, 111);
		�Ķ��̵�.add(�Ķ��̵�3��ư);
		
		�Ķ��̵�.setVisible(false);
		
		JPanel ��� = new JPanel();
		���.setBackground(Color.WHITE);
		���.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(���);
		���.setLayout(null);
		
		JToggleButton ���1��ư = new JToggleButton("");
		���1��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���1Ŭ��.png"));
		���1��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���1.png"));
		���1��ư.setFocusPainted(false);
		���1��ư.setContentAreaFilled(false);
		���1��ư.setBorderPainted(false);
		���1��ư.setBounds(39, 80, 346, 111);
		���.add(���1��ư);
		
		JToggleButton ���2��ư = new JToggleButton("");
		���2��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���2Ŭ��.png"));
		���2��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���2.png"));
		���2��ư.setFocusPainted(false);
		���2��ư.setContentAreaFilled(false);
		���2��ư.setBorderPainted(false);
		���2��ư.setBounds(39, 194, 346, 111);
		���.add(���2��ư);
		
		JToggleButton ���3��ư = new JToggleButton("");
		���3��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���3Ŭ��.png"));
		���3��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���3.png"));
		���3��ư.setFocusPainted(false);
		���3��ư.setContentAreaFilled(false);
		���3��ư.setBorderPainted(false);
		���3��ư.setBounds(39, 311, 346, 111);
		���.add(���3��ư);
		
		JButton �����ư = new JButton("");
		�����ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��.png"));
		�����ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ŭ��.png"));
		�����ư.setFocusPainted(false);
		�����ư.setContentAreaFilled(false);
		�����ư.setBorderPainted(false);
		�����ư.setBounds(0, 0, 42, 42);
		���.add(�����ư);
		
		JLabel ���� = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		����.setFont(new Font("THE��Ϲ���", Font.PLAIN, 41));
		����.setBounds(79, 21, 274, 55);
		���.add(����);
		
		JButton ��������ư = new JButton("");
		��������ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����.png"));
		��������ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����Ŭ��.png"));
		��������ư.setFocusPainted(false);
		��������ư.setContentAreaFilled(false);
		��������ư.setBorderPainted(false);
		��������ư.setBounds(39, 441, 150, 40);
		���.add(��������ư);
		
		JButton ����ֹ���ư = new JButton("");
		����ֹ���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�.png"));
		����ֹ���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�Ŭ��.png"));
		����ֹ���ư.setFocusPainted(false);
		����ֹ���ư.setContentAreaFilled(false);
		����ֹ���ư.setBorderPainted(false);
		����ֹ���ư.setBounds(235, 441, 150, 40);
		���.add(����ֹ���ư);
		
		���.setVisible(false);
		
		JPanel ���� = new JPanel();
		����.setBackground(Color.WHITE);
		����.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(����);
		����.setLayout(null);
		
		JToggleButton ����1��ư = new JToggleButton("");
		����1��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����1Ŭ��.png"));
		����1��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����1.png"));
		����1��ư.setFocusPainted(false);
		����1��ư.setContentAreaFilled(false);
		����1��ư.setBorderPainted(false);
		����1��ư.setBounds(39, 80, 346, 111);
		����.add(����1��ư);
		
		JToggleButton ����2��ư = new JToggleButton("");
		����2��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����2Ŭ��.png"));
		����2��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����2.png"));
		����2��ư.setFocusPainted(false);
		����2��ư.setContentAreaFilled(false);
		����2��ư.setBorderPainted(false);
		����2��ư.setBounds(39, 194, 346, 111);
		����.add(����2��ư);
		
		JToggleButton ����3��ư = new JToggleButton("");
		����3��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����3Ŭ��.png"));
		����3��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����3.png"));
		����3��ư.setFocusPainted(false);
		����3��ư.setContentAreaFilled(false);
		����3��ư.setBorderPainted(false);
		����3��ư.setBounds(39, 311, 346, 111);
		����.add(����3��ư);
		
		JButton ������ư = new JButton("");
		������ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��.png"));
		������ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ŭ��.png"));
		������ư.setFocusPainted(false);
		������ư.setContentAreaFilled(false);
		������ư.setBorderPainted(false);
		������ư.setBounds(0, 0, 42, 42);
		����.add(������ư);
		
		JLabel ����� = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		�����.setFont(new Font("THE��Ϲ���", Font.PLAIN, 41));
		�����.setBounds(79, 21, 274, 55);
		����.add(�����);
		
		JButton ���������ư = new JButton("");
		���������ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����.png"));
		���������ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����Ŭ��.png"));
		���������ư.setFocusPainted(false);
		���������ư.setContentAreaFilled(false);
		���������ư.setBorderPainted(false);
		���������ư.setBounds(39, 441, 150, 40);
		����.add(���������ư);
		
		JButton �����ֹ���ư = new JButton("");
		�����ֹ���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�.png"));
		�����ֹ���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�Ŭ��.png"));
		�����ֹ���ư.setFocusPainted(false);
		�����ֹ���ư.setContentAreaFilled(false);
		�����ֹ���ư.setBorderPainted(false);
		�����ֹ���ư.setBounds(235, 441, 150, 40);
		����.add(�����ֹ���ư);
		
		����.setVisible(false);
		
		JPanel ��Ÿ = new JPanel();
		��Ÿ.setBackground(Color.WHITE);
		��Ÿ.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(��Ÿ);
		��Ÿ.setLayout(null);
		
		JToggleButton ��Ÿ1��ư = new JToggleButton("");
		��Ÿ1��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ÿ1Ŭ��.png"));
		��Ÿ1��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ÿ1.png"));
		��Ÿ1��ư.setFocusPainted(false);
		��Ÿ1��ư.setContentAreaFilled(false);
		��Ÿ1��ư.setBorderPainted(false);
		��Ÿ1��ư.setBounds(39, 80, 346, 111);
		��Ÿ.add(��Ÿ1��ư);
		
		JToggleButton ��Ÿ2��ư = new JToggleButton("");
		��Ÿ2��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ÿ2Ŭ��.png"));
		��Ÿ2��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ÿ2.png"));
		��Ÿ2��ư.setFocusPainted(false);
		��Ÿ2��ư.setContentAreaFilled(false);
		��Ÿ2��ư.setBorderPainted(false);
		��Ÿ2��ư.setBounds(39, 194, 346, 111);
		��Ÿ.add(��Ÿ2��ư);
		
		JToggleButton ��Ÿ3��ư = new JToggleButton("");
		��Ÿ3��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ÿ3Ŭ��.png"));
		��Ÿ3��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ÿ3.png"));
		��Ÿ3��ư.setFocusPainted(false);
		��Ÿ3��ư.setContentAreaFilled(false);
		��Ÿ3��ư.setBorderPainted(false);
		��Ÿ3��ư.setBounds(39, 311, 346, 111);
		��Ÿ.add(��Ÿ3��ư);
		
		JButton ��Ÿ���ư = new JButton("");
		��Ÿ���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��.png"));
		��Ÿ���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ŭ��.png"));
		��Ÿ���ư.setFocusPainted(false);
		��Ÿ���ư.setContentAreaFilled(false);
		��Ÿ���ư.setBorderPainted(false);
		��Ÿ���ư.setBounds(0, 0, 42, 42);
		��Ÿ.add(��Ÿ���ư);
		
		JLabel ��Ÿ�� = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		��Ÿ��.setFont(new Font("THE��Ϲ���", Font.PLAIN, 41));
		��Ÿ��.setBounds(79, 21, 274, 55);
		��Ÿ.add(��Ÿ��);
		
		JButton ��Ÿ�����ư = new JButton("");
		��Ÿ�����ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����.png"));
		��Ÿ�����ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����Ŭ��.png"));
		��Ÿ�����ư.setFocusPainted(false);
		��Ÿ�����ư.setContentAreaFilled(false);
		��Ÿ�����ư.setBorderPainted(false);
		��Ÿ�����ư.setBounds(39, 441, 150, 40);
		��Ÿ.add(��Ÿ�����ư);
		
		JButton ��Ÿ�ֹ���ư = new JButton("");
		��Ÿ�ֹ���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�.png"));
		��Ÿ�ֹ���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�Ŭ��.png"));
		��Ÿ�ֹ���ư.setFocusPainted(false);
		��Ÿ�ֹ���ư.setContentAreaFilled(false);
		��Ÿ�ֹ���ư.setBorderPainted(false);
		��Ÿ�ֹ���ư.setBounds(235, 441, 150, 40);
		��Ÿ.add(��Ÿ�ֹ���ư);
		
		��Ÿ.setVisible(false);
		
		JPanel ���� = new JPanel();
		����.setBackground(Color.WHITE);
		����.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(����);
		����.setLayout(null);
		
		JToggleButton ����1��ư = new JToggleButton("");
		����1��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����1Ŭ��.png"));
		����1��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����1.png"));
		����1��ư.setFocusPainted(false);
		����1��ư.setContentAreaFilled(false);
		����1��ư.setBorderPainted(false);
		����1��ư.setBounds(39, 80, 346, 111);
		����.add(����1��ư);
		
		JToggleButton ����2��ư = new JToggleButton("");
		����2��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����2Ŭ��.png"));
		����2��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����2.png"));
		����2��ư.setFocusPainted(false);
		����2��ư.setContentAreaFilled(false);
		����2��ư.setBorderPainted(false);
		����2��ư.setBounds(39, 194, 346, 111);
		����.add(����2��ư);
		
		JToggleButton ����3��ư = new JToggleButton("");
		����3��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����3Ŭ��.png"));
		����3��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����3.png"));
		����3��ư.setFocusPainted(false);
		����3��ư.setContentAreaFilled(false);
		����3��ư.setBorderPainted(false);
		����3��ư.setBounds(39, 311, 346, 111);
		����.add(����3��ư);
		
		JButton ���̹��ư = new JButton("");
		���̹��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��.png"));
		���̹��ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ŭ��.png"));
		���̹��ư.setFocusPainted(false);
		���̹��ư.setContentAreaFilled(false);
		���̹��ư.setBorderPainted(false);
		���̹��ư.setBounds(0, 0, 42, 42);
		����.add(���̹��ư);
		
		JLabel ���̶� = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		���̶�.setFont(new Font("THE��Ϲ���", Font.PLAIN, 41));
		���̶�.setBounds(79, 21, 274, 55);
		����.add(���̶�);
		
		JButton ���������ư = new JButton("");
		���������ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����.png"));
		���������ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����Ŭ��.png"));
		���������ư.setFocusPainted(false);
		���������ư.setContentAreaFilled(false);
		���������ư.setBorderPainted(false);
		���������ư.setBounds(39, 441, 150, 40);
		����.add(���������ư);
		
		JButton �����ֹ���ư = new JButton("");
		�����ֹ���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�.png"));
		�����ֹ���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�Ŭ��.png"));
		�����ֹ���ư.setFocusPainted(false);
		�����ֹ���ư.setContentAreaFilled(false);
		�����ֹ���ư.setBorderPainted(false);
		�����ֹ���ư.setBounds(235, 441, 150, 40);
		����.add(�����ֹ���ư);
		
		����.setVisible(false);
		
		JPanel BHC = new JPanel();
		BHC.setBackground(Color.WHITE);
		BHC.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(BHC);
		BHC.setLayout(null);
		
		JToggleButton BHC1��ư = new JToggleButton("");
		BHC1��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/BHC1Ŭ��.png"));
		BHC1��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/BHC1.png"));
		BHC1��ư.setFocusPainted(false);
		BHC1��ư.setContentAreaFilled(false);
		BHC1��ư.setBorderPainted(false);
		BHC1��ư.setBounds(39, 80, 346, 111);
		BHC.add(BHC1��ư);
		
		JToggleButton BHC2��ư = new JToggleButton("");
		BHC2��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/BHC2Ŭ��.png"));
		BHC2��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/BHC2.png"));
		BHC2��ư.setFocusPainted(false);
		BHC2��ư.setContentAreaFilled(false);
		BHC2��ư.setBorderPainted(false);
		BHC2��ư.setBounds(39, 194, 346, 111);
		BHC.add(BHC2��ư);
		
		JToggleButton BHC3��ư = new JToggleButton("");
		BHC3��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/BHC3Ŭ��.png"));
		BHC3��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/BHC3.png"));
		BHC3��ư.setFocusPainted(false);
		BHC3��ư.setContentAreaFilled(false);
		BHC3��ư.setBorderPainted(false);
		BHC3��ư.setBounds(39, 311, 346, 111);
		BHC.add(BHC3��ư);
		
		JButton BHC���ư = new JButton("");
		BHC���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��.png"));
		BHC���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ŭ��.png"));
		BHC���ư.setFocusPainted(false);
		BHC���ư.setContentAreaFilled(false);
		BHC���ư.setBorderPainted(false);
		BHC���ư.setBounds(0, 0, 42, 42);
		BHC.add(BHC���ư);
		
		JLabel BHC�� = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		BHC��.setFont(new Font("THE��Ϲ���", Font.PLAIN, 41));
		BHC��.setBounds(79, 21, 274, 55);
		BHC.add(BHC��);
		
		JButton BHC�����ư = new JButton("");
		BHC�����ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����.png"));
		BHC�����ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����Ŭ��.png"));
		BHC�����ư.setFocusPainted(false);
		BHC�����ư.setContentAreaFilled(false);
		BHC�����ư.setBorderPainted(false);
		BHC�����ư.setBounds(39, 441, 150, 40);
		BHC.add(BHC�����ư);
		
		JButton BHC�ֹ���ư = new JButton("");
		BHC�ֹ���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�.png"));
		BHC�ֹ���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�Ŭ��.png"));
		BHC�ֹ���ư.setFocusPainted(false);
		BHC�ֹ���ư.setContentAreaFilled(false);
		BHC�ֹ���ư.setBorderPainted(false);
		BHC�ֹ���ư.setBounds(235, 441, 150, 40);
		BHC.add(BHC�ֹ���ư);
		
		BHC.setVisible(false);
		
		JPanel BBQ = new JPanel();
		BBQ.setBackground(Color.WHITE);
		BBQ.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(BBQ);
		BBQ.setLayout(null);
		
		JToggleButton BBQ1��ư = new JToggleButton("");
		BBQ1��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/BBQ1Ŭ��.png"));
		BBQ1��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/BBQ1.png"));
		BBQ1��ư.setFocusPainted(false);
		BBQ1��ư.setContentAreaFilled(false);
		BBQ1��ư.setBorderPainted(false);
		BBQ1��ư.setBounds(39, 80, 346, 111);
		BBQ.add(BBQ1��ư);
		
		JToggleButton BBQ2��ư = new JToggleButton("");
		BBQ2��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/BBQ2Ŭ��.png"));
		BBQ2��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/BBQ2.png"));
		BBQ2��ư.setFocusPainted(false);
		BBQ2��ư.setContentAreaFilled(false);
		BBQ2��ư.setBorderPainted(false);
		BBQ2��ư.setBounds(39, 194, 346, 111);
		BBQ.add(BBQ2��ư);
		
		JToggleButton BBQ3��ư = new JToggleButton("");
		BBQ3��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/BBQ3Ŭ��.png"));
		BBQ3��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/BBQ3.png"));
		BBQ3��ư.setFocusPainted(false);
		BBQ3��ư.setContentAreaFilled(false);
		BBQ3��ư.setBorderPainted(false);
		BBQ3��ư.setBounds(39, 311, 346, 111);
		BBQ.add(BBQ3��ư);
		
		JButton BBQ���ư = new JButton("");
		BBQ���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��.png"));
		BBQ���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ŭ��.png"));
		BBQ���ư.setFocusPainted(false);
		BBQ���ư.setContentAreaFilled(false);
		BBQ���ư.setBorderPainted(false);
		BBQ���ư.setBounds(0, 0, 42, 42);
		BBQ.add(BBQ���ư);
		
		JLabel BBQ�� = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		BBQ��.setFont(new Font("THE��Ϲ���", Font.PLAIN, 41));
		BBQ��.setBounds(79, 21, 274, 55);
		BBQ.add(BBQ��);
		
		JButton BBQ�����ư = new JButton("");
		BBQ�����ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����.png"));
		BBQ�����ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����Ŭ��.png"));
		BBQ�����ư.setFocusPainted(false);
		BBQ�����ư.setContentAreaFilled(false);
		BBQ�����ư.setBorderPainted(false);
		BBQ�����ư.setBounds(39, 441, 150, 40);
		BBQ.add(BBQ�����ư);
		
		JButton BBQ�ֹ���ư = new JButton("");
		BBQ�ֹ���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�.png"));
		BBQ�ֹ���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�Ŭ��.png"));
		BBQ�ֹ���ư.setFocusPainted(false);
		BBQ�ֹ���ư.setContentAreaFilled(false);
		BBQ�ֹ���ư.setBorderPainted(false);
		BBQ�ֹ���ư.setBounds(235, 441, 150, 40);
		BBQ.add(BBQ�ֹ���ư);
		
		BBQ.setVisible(false);
		
		JPanel ���� = new JPanel();
		����.setBackground(Color.WHITE);
		����.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(����);
		����.setLayout(null);
		
		JToggleButton ����1��ư = new JToggleButton("");
		����1��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����1Ŭ��.png"));
		����1��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����1.png"));
		����1��ư.setFocusPainted(false);
		����1��ư.setContentAreaFilled(false);
		����1��ư.setBorderPainted(false);
		����1��ư.setBounds(39, 80, 346, 111);
		����.add(����1��ư);
		
		JToggleButton ����2��ư = new JToggleButton("");
		����2��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����2Ŭ��.png"));
		����2��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����2.png"));
		����2��ư.setFocusPainted(false);
		����2��ư.setContentAreaFilled(false);
		����2��ư.setBorderPainted(false);
		����2��ư.setBounds(39, 194, 346, 111);
		����.add(����2��ư);
		
		JToggleButton ����3��ư = new JToggleButton("");
		����3��ư.setSelectedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����3Ŭ��.png"));
		����3��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����3.png"));
		����3��ư.setFocusPainted(false);
		����3��ư.setContentAreaFilled(false);
		����3��ư.setBorderPainted(false);
		����3��ư.setBounds(39, 311, 346, 111);
		����.add(����3��ư);
		
		JButton ���׹��ư = new JButton("");
		���׹��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��.png"));
		���׹��ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ŭ��.png"));
		���׹��ư.setFocusPainted(false);
		���׹��ư.setContentAreaFilled(false);
		���׹��ư.setBorderPainted(false);
		���׹��ư.setBounds(0, 0, 42, 42);
		����.add(���׹��ư);
		
		JLabel ���׶� = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		���׶�.setFont(new Font("THE��Ϲ���", Font.PLAIN, 41));
		���׶�.setBounds(79, 21, 274, 55);
		����.add(���׶�);
		
		JButton ���������ư = new JButton("");
		���������ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����.png"));
		���������ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����Ŭ��.png"));
		���������ư.setFocusPainted(false);
		���������ư.setContentAreaFilled(false);
		���������ư.setBorderPainted(false);
		���������ư.setBounds(39, 441, 150, 40);
		����.add(���������ư);
		
		JButton �����ֹ���ư = new JButton("");
		�����ֹ���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�.png"));
		�����ֹ���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�ֹ�Ŭ��.png"));
		�����ֹ���ư.setFocusPainted(false);
		�����ֹ���ư.setContentAreaFilled(false);
		�����ֹ���ư.setBorderPainted(false);
		�����ֹ���ư.setBounds(235, 441, 150, 40);
		����.add(�����ֹ���ư);
		
		����.setVisible(false);
				
		JPanel ����1 = new JPanel();
		����1.setBackground(new Color(255, 255, 255));
		����1.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(����1);
		����1.setLayout(null);
		
		JInternalFrame ��ġŲ��� = new JInternalFrame("\uB0B4\uB0B4 \uCE58\uD0A8");
		��ġŲ���.getContentPane().setBackground(new Color(240, 255, 255));
		��ġŲ���.setBounds(12, 68, 406, 351);
		����1.add(��ġŲ���);
		��ġŲ���.getContentPane().setLayout(null);
		
		JLabel ��ġŲ�� = new JLabel("\uB0B4 \uCE58\uD0A8 \uBAA9\uB85D");
		��ġŲ��.setFont(new Font("THE��Ϲ���", Font.PLAIN, 20));
		��ġŲ��.setBounds(12, 10, 113, 34);
		��ġŲ���.getContentPane().add(��ġŲ��);
		
		JTextArea ��ġŲ���â = new JTextArea();
		��ġŲ���â.setBounds(12, 42, 366, 241);
		��ġŲ���.getContentPane().add(��ġŲ���â);
		
		JButton ��ġŲ��ϰ˻���ư = new JButton("");
		��ġŲ��ϰ˻���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���� �˻�.png"));
		��ġŲ��ϰ˻���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���� �˻� Ŭ��.png"));
		��ġŲ��ϰ˻���ư.setBorderPainted(false);
		��ġŲ��ϰ˻���ư.setFocusPainted(false);
		��ġŲ��ϰ˻���ư.setContentAreaFilled(false);
		��ġŲ��ϰ˻���ư.setBounds(197, 289, 97, 30);
		��ġŲ���.getContentPane().add(��ġŲ��ϰ˻���ư);
		
		JButton ��ġŲ��ϴݱ��ư = new JButton("");
		��ġŲ��ϴݱ��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���� �ݱ�.png"));
		��ġŲ��ϴݱ��ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���� �ݱ� Ŭ��.png"));
		��ġŲ��ϴݱ��ư.setBorderPainted(false);
		��ġŲ��ϴݱ��ư.setFocusPainted(false);
		��ġŲ��ϴݱ��ư.setContentAreaFilled(false);
		��ġŲ��ϴݱ��ư.setBounds(288, 288, 97, 31);
		��ġŲ���.getContentPane().add(��ġŲ��ϴݱ��ư);
		��ġŲ���.setVisible(false);
				
		JLabel ����1�� = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		����1��.setFont(new Font("THE��Ϲ���", Font.PLAIN, 41));
		����1��.setBounds(79, 21, 274, 55);
		����1.add(����1��);
				
		JButton ����1�����ư = new JButton("");
		����1�����ư.setBounds(27, 91, 178, 202);
		����1�����ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����.png"));
		����1�����ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����Ŭ��.png"));
		����1�����ư.setBorderPainted(false);
		����1�����ư.setFocusPainted(false);
		����1�����ư.setContentAreaFilled(false);
		����1.add(����1�����ư);
				
		JButton ����1������ư = new JButton("");
		����1������ư.setBounds(228, 93, 178, 187);
		����1������ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����.png"));
		����1������ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����Ŭ��.png"));
		����1������ư.setBorderPainted(false);
		����1������ư.setFocusPainted(false);
		����1������ư.setContentAreaFilled(false);
		����1.add(����1������ư);
				
		JButton ����1���ư����ư = new JButton("");
		����1���ư����ư.setBounds(228, 293, 178, 208);
		����1���ư����ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���ư���.png"));
		����1���ư����ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���ư���Ŭ��.png"));
		����1���ư����ư.setBorderPainted(false);
		����1���ư����ư.setFocusPainted(false);
		����1���ư����ư.setContentAreaFilled(false);
		����1.add(����1���ư����ư);
				
		JButton ����1��ġŲ��ư = new JButton("");
		����1��ġŲ��ư.setBounds(27, 291, 178, 210);
		����1��ġŲ��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��ġŲ.png"));
		����1��ġŲ��ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��ġŲŬ��.png"));
		����1��ġŲ��ư.setBorderPainted(false);
		����1��ġŲ��ư.setFocusPainted(false);
		����1��ġŲ��ư.setContentAreaFilled(false);
		����1.add(����1��ġŲ��ư);
				
		JButton ����1���ư = new JButton("");
		����1���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��.png"));
		����1���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ŭ��.png"));
		����1���ư.setFocusPainted(false);
		����1���ư.setContentAreaFilled(false);
		����1���ư.setBorderPainted(false);
		����1���ư.setBounds(0, 0, 42, 42);
		����1.add(����1���ư);
		����1.setVisible(false);
				
				
				
		JPanel ������ = new JPanel();
		������.setBackground(Color.WHITE);
		������.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(������);
		������.setLayout(null);
				
		JLabel �����ö� = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		�����ö�.setFont(new Font("THE��Ϲ���", Font.PLAIN, 41));
		�����ö�.setBounds(79, 21, 274, 55);
		������.add(�����ö�);
				
		JButton �������Ķ��̵��ư = new JButton("");
		�������Ķ��̵��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�Ķ��̵�.png"));
		�������Ķ��̵��ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�Ķ��̵�Ŭ��.png"));
		�������Ķ��̵��ư.setFocusPainted(false);
		�������Ķ��̵��ư.setContentAreaFilled(false);
		�������Ķ��̵��ư.setBorderPainted(false);
		�������Ķ��̵��ư.setBounds(27, 91, 178, 220);
		������.add(�������Ķ��̵��ư);
				
		JButton �����þ���ư = new JButton("");
		�����þ���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���.png"));
		�����þ���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���Ŭ��.png"));
		�����þ���ư.setFocusPainted(false);
		�����þ���ư.setContentAreaFilled(false);
		�����þ���ư.setBorderPainted(false);
		�����þ���ư.setBounds(228, 93, 178, 202);
		������.add(�����þ���ư);
				
		JButton �����ð����ư = new JButton("");
		�����ð����ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����.png"));
		�����ð����ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����Ŭ��.png"));
		�����ð����ư.setFocusPainted(false);
		�����ð����ư.setContentAreaFilled(false);
		�����ð����ư.setBorderPainted(false);
		�����ð����ư.setBounds(27, 291, 178, 212);
		������.add(�����ð����ư);
				
		JButton �����ñ�Ÿ��ư = new JButton("");
		�����ñ�Ÿ��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ÿ.png"));
		�����ñ�Ÿ��ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��ŸŬ��.png"));
		�����ñ�Ÿ��ư.setFocusPainted(false);
		�����ñ�Ÿ��ư.setContentAreaFilled(false);
		�����ñ�Ÿ��ư.setBorderPainted(false);
		�����ñ�Ÿ��ư.setBounds(228, 293, 178, 210);
		������.add(�����ñ�Ÿ��ư);
				
		JButton �����ù��ư = new JButton("");
		�����ù��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��.png"));
		�����ù��ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ŭ��.png"));
		�����ù��ư.setBorderPainted(false);
		�����ù��ư.setFocusPainted(false);
		�����ù��ư.setContentAreaFilled(false);
		�����ù��ư.setBounds(0, 0, 42, 42);
		������.add(�����ù��ư);
		������.setVisible(false);
				
		JPanel ����2 = new JPanel();
		����2.setBackground(Color.WHITE);
		����2.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(����2);
		����2.setLayout(null);
			
		JLabel ����2ġŲ = new JLabel("");
		����2ġŲ.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/ġŲ����.png"));
		����2ġŲ.setBounds(105, 79, 227, 145);
		����2.add(����2ġŲ);
				
		JLabel ����2�� = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		����2��.setBounds(79, 21, 264, 48);
		����2��.setFont(new Font("THE��Ϲ���", Font.PLAIN, 41));
		����2.add(����2��);
				
		JButton ����2�귣���ư = new JButton("");
		����2�귣���ư.setBounds(228, 262, 177, 229);
		����2�귣���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�귣��.png"));
		����2�귣���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�귣��Ŭ��.png"));
		����2�귣���ư.setBorderPainted(false);
		����2�귣���ư.setFocusPainted(false);
		����2�귣���ư.setContentAreaFilled(false);
		����2.add(����2�귣���ư);
				
		JButton ����2����ư = new JButton("");
		����2����ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��.png"));
		����2����ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ŭ��.png"));
		����2����ư.setBorderPainted(false);
		����2����ư.setFocusPainted(false);
		����2����ư.setContentAreaFilled(false);
		����2����ư.setBounds(25, 262, 177, 194);
		����2.add(����2����ư);
				
		JButton ����2���ư = new JButton("");
		����2���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��.png"));
		����2���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ŭ��.png"));
		����2���ư.setBorderPainted(false);
		����2���ư.setFocusPainted(false);
		����2���ư.setContentAreaFilled(false);
		����2���ư.setBounds(0, 0, 42, 42);
		����2.add(����2���ư);
		����2.setVisible(false);
		
				
		JPanel ����ȭ�� = new JPanel();
		����ȭ��.setBackground(new Color(255, 255, 255));
		����ȭ��.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(����ȭ��);
		����ȭ��.setLayout(null);
				
		JInternalFrame �����˻�â = new JInternalFrame("\uC0AC\uC6A9\uC790 \uAC80\uC0C9");
		�����˻�â.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		�����˻�â.setBounds(0, 86, 434, 318);
		����ȭ��.add(�����˻�â);
		�����˻�â.getContentPane().setLayout(null);
				
		JLabel �����˻�â�� = new JLabel("\uBAA8\uB4E0 \uC0AC\uC6A9\uC790 \uAC80\uC0C9");
		�����˻�â��.setFont(new Font("THE��Ϲ���", Font.PLAIN, 22));
		�����˻�â��.setBounds(12, 0, 154, 33);
		�����˻�â.getContentPane().add(�����˻�â��);
				
		JTextArea �����˻�â�ؽ�Ʈ = new JTextArea();
		�����˻�â�ؽ�Ʈ.setBounds(10, 38, 400, 206);
		�����˻�â.getContentPane().add(�����˻�â�ؽ�Ʈ);
				
		JButton �����˻���ư = new JButton("");
		�����˻���ư.setBounds(241, 248, 77, 28);
		�����˻���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���� �˻�.png"));
		�����˻���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���� �˻� Ŭ��.png"));
		�����˻���ư.setBorderPainted(false);
		�����˻���ư.setFocusPainted(false);
		�����˻���ư.setContentAreaFilled(false);
		�����˻�â.getContentPane().add(�����˻���ư);
				
		JButton �����˻��ݱ��ư = new JButton("");
		�����˻��ݱ��ư.setBounds(321, 248, 85, 29);
		�����˻��ݱ��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���� �ݱ�.png"));
		�����˻��ݱ��ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/���� �ݱ� Ŭ��.png"));
		�����˻��ݱ��ư.setBorderPainted(false);
		�����˻��ݱ��ư.setFocusPainted(false);
		�����˻��ݱ��ư.setContentAreaFilled(false);
		�����˻�â.getContentPane().add(�����˻��ݱ��ư);
				
		JButton ���ε�Ϲ�ư = new JButton("");
		���ε�Ϲ�ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����.png"));
		���ε�Ϲ�ư.setBackground(Color.WHITE);
		���ε�Ϲ�ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����Ŭ��.png"));
		���ε�Ϲ�ư.setBounds(34, 256, 169, 159);
		���ε�Ϲ�ư.setBorderPainted(false);
		���ε�Ϲ�ư.setFocusPainted(false);
		���ε�Ϲ�ư.setContentAreaFilled(false);
				
		����ȭ��.add(���ε�Ϲ�ư);
				
		JButton ���ηα��ι�ư = new JButton("");
		���ηα��ι�ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�α���1.png"));
		���ηα��ι�ư.setBackground(Color.WHITE);
		���ηα��ι�ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�α���Ŭ��.png"));
		���ηα��ι�ư.setBounds(229, 256, 169, 159);
		����ȭ��.add(���ηα��ι�ư);
		���ηα��ι�ư.setBorderPainted(false);
		���ηα��ι�ư.setFocusPainted(false);
		���ηα��ι�ư.setContentAreaFilled(false);
		
		JButton ���������ư = new JButton("");
		���������ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/������.png"));
		���������ư.setBackground(new Color(255, 255, 204));
		���������ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/������Ŭ��.png"));
		���������ư.setBounds(378, 446, 44, 45);
		���������ư.setBorderPainted(false);
		���������ư.setFocusPainted(false);
		���������ư.setContentAreaFilled(false);
		����ȭ��.add(���������ư);
		
		JButton ���������˻���ư = new JButton("");
		���������˻���ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����.png"));
		���������˻���ư.setBackground(new Color(255, 255, 204));
		���������˻���ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����Ŭ��.png"));
		���������˻���ư.setBounds(322, 446, 44, 45);
		���������˻���ư.setBorderPainted(false);
		���������˻���ư.setFocusPainted(false);
		���������˻���ư.setContentAreaFilled(false);
		����ȭ��.add(���������˻���ư);
		
		JLabel �������� = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		��������.setFont(new Font("THE��Ϲ���", Font.PLAIN, 41));
		��������.setBounds(79, 21, 274, 55);
		����ȭ��.add(��������);
		
		JLabel ����ġŲ = new JLabel("");
		����ġŲ.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/ġŲ����.png"));
		����ġŲ.setBounds(105, 79, 227, 145);
		����ȭ��.add(����ġŲ);
		
		JPanel �α��� = new JPanel();
		�α���.setBackground(new Color(255, 255, 255));
		�α���.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(�α���);
		�α���.setLayout(null);
		
		JLabel �α��ζ� = new JLabel("Login");
		�α��ζ�.setFont(new Font("THE��Ϲ���", Font.PLAIN, 41));
		�α��ζ�.setBounds(166, 24, 140, 55);
		�α���.add(�α��ζ�);
		
		JLabel �α���ID = new JLabel("ID");
		�α���ID.setFont(new Font("THE��Ϲ���", Font.PLAIN, 35));
		�α���ID.setBounds(193, 109, 58, 33);
		�α���.add(�α���ID);
		
		�α���IDâ = new JTextField();
		�α���IDâ.setFont(new Font("����", Font.PLAIN, 20));
		�α���IDâ.setColumns(10);
		�α���IDâ.setBounds(121, 156, 189, 44);
		�α���.add(�α���IDâ);
		
		JLabel �α��κ�� = new JLabel("PASSWORD");
		�α��κ��.setFont(new Font("THE��Ϲ���", Font.PLAIN, 35));
		�α��κ��.setBounds(136, 229, 165, 33);
		�α���.add(�α��κ��);
		
		�α��κ��â = new JPasswordField();
		�α��κ��â.setFont(new Font("����", Font.PLAIN, 20));
		�α��κ��â.setBounds(121, 287, 189, 44);
		�α���.add(�α��κ��â);
		
		JButton �α��ι�ư = new JButton("");
		�α��ι�ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�α�.png"));
		�α��ι�ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/�α�Ŭ��.png"));
		�α��ι�ư.setBorderPainted(false);
		�α��ι�ư.setFocusPainted(false);
		�α��ι�ư.setContentAreaFilled(false);
		�α��ι�ư.setBounds(118, 376, 193, 50);
		�α���.add(�α��ι�ư);
		
		JButton �α��ι��ư = new JButton("");
		�α��ι��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��.png"));
		�α��ι��ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ŭ��.png"));
		�α��ι��ư.setFocusPainted(false);
		�α��ι��ư.setContentAreaFilled(false);
		�α��ι��ư.setBorderPainted(false);
		�α��ι��ư.setBounds(0, 0, 42, 42);
		�α���.add(�α��ι��ư);
	
		
		JPanel ��� = new JPanel();
		���.setBackground(new Color(255, 255, 255));
		���.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(���);
		���.setLayout(null);
		
		JLabel ��϶� = new JLabel("Sign Up");
		��϶�.setFont(new Font("THE��Ϲ���", Font.PLAIN, 41));
		��϶�.setBounds(140, 23, 150, 55);
		���.add(��϶�);
		
		JLabel ���ID = new JLabel("���̵� : ", JLabel.RIGHT);
		���ID.setFont(new Font("THE��Ϲ���", Font.PLAIN, 30));
		���ID.setBounds(40, 120, 150, 33);
		���.add(���ID);
		
		���IDâ = new JTextField();
		���IDâ.setFont(new Font("����", Font.PLAIN, 20));
		���IDâ.setBounds(200, 120, 189, 44);
		���.add(���IDâ);
		���IDâ.setColumns(10);
		
		JLabel ��Ϻ�� = new JLabel("��й�ȣ : ", JLabel.RIGHT);
		��Ϻ��.setFont(new Font("THE��Ϲ���", Font.PLAIN, 30));
		��Ϻ��.setBounds(40, 220, 150, 33);
		���.add(��Ϻ��);
		
		��Ϻ��â = new JPasswordField();
		��Ϻ��â.setFont(new Font("����", Font.PLAIN, 20));
		��Ϻ��â.setBounds(200, 220, 189, 44);
		���.add(��Ϻ��â);
		
		JLabel ����̸� = new JLabel("�̸� : ", JLabel.RIGHT);
		����̸�.setFont(new Font("THE��Ϲ���", Font.PLAIN, 30));
		����̸�.setBounds(40, 320, 150, 33);
		���.add(����̸�);
		
		����̸�â = new JTextField();
		����̸�â.setFont(new Font("����", Font.PLAIN, 20));
		����̸�â.setBounds(200, 320, 189, 44);
		���.add(����̸�â);
		
		
	
		
		JButton ���Ȯ�ι�ư = new JButton("");
		���Ȯ�ι�ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/Ȯ��.png"));
		���Ȯ�ι�ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/Ȯ��Ŭ��.png"));
		���Ȯ�ι�ư.setBorderPainted(false);
		���Ȯ�ι�ư.setFocusPainted(false);
		���Ȯ�ι�ư.setContentAreaFilled(false);
		���Ȯ�ι�ư.setBounds(93, 389, 245, 85);
		���.add(���Ȯ�ι�ư);
		
		JButton ��Ϲ��ư = new JButton("");
		��Ϲ��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��.png"));
		��Ϲ��ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ŭ��.png"));
		��Ϲ��ư.setFocusPainted(false);
		��Ϲ��ư.setContentAreaFilled(false);
		��Ϲ��ư.setBorderPainted(false);
		��Ϲ��ư.setBounds(0, 0, 42, 42);
		���.add(��Ϲ��ư);
		
		JPanel �귣�� = new JPanel();
		�귣��.setBackground(Color.WHITE);
		�귣��.setBounds(0, 0, 434, 501);
		frame.getContentPane().add(�귣��);
		�귣��.setLayout(null);
		
		JLabel �귣��� = new JLabel("\uCE58\uD0A8 \uCD94\uCC9C \uD504\uB85C\uADF8\uB7A8");
		�귣���.setFont(new Font("THE��Ϲ���", Font.PLAIN, 41));
		�귣���.setBounds(79, 21, 274, 55);
		�귣��.add(�귣���);
		
		JButton �귣�屳�̹�ư = new JButton("");
		�귣�屳�̹�ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����.png"));
		�귣�屳�̹�ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����Ŭ��.png"));
		�귣�屳�̹�ư.setFocusPainted(false);
		�귣�屳�̹�ư.setContentAreaFilled(false);
		�귣�屳�̹�ư.setBorderPainted(false);
		�귣�屳�̹�ư.setBounds(27, 91, 178, 220);
		�귣��.add(�귣�屳�̹�ư);
		
		JButton �귣��BHC��ư = new JButton("");
		�귣��BHC��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/BHC.png"));
		�귣��BHC��ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/BHCŬ��.png"));
		�귣��BHC��ư.setFocusPainted(false);
		�귣��BHC��ư.setContentAreaFilled(false);
		�귣��BHC��ư.setBorderPainted(false);
		�귣��BHC��ư.setBounds(228, 93, 178, 202);
		�귣��.add(�귣��BHC��ư);
		
		JButton �귣��BBQ��ư = new JButton("");
		�귣��BBQ��ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/BBQ.png"));
		�귣��BBQ��ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/BBQŬ��.png"));
		�귣��BBQ��ư.setFocusPainted(false);
		�귣��BBQ��ư.setContentAreaFilled(false);
		�귣��BBQ��ư.setBorderPainted(false);
		�귣��BBQ��ư.setBounds(27, 291, 178, 212);
		�귣��.add(�귣��BBQ��ư);
		
		JButton �귣����׹�ư = new JButton("");
		�귣����׹�ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����.png"));
		�귣����׹�ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/����Ŭ��.png"));
		�귣����׹�ư.setFocusPainted(false);
		�귣����׹�ư.setContentAreaFilled(false);
		�귣����׹�ư.setBorderPainted(false);
		�귣����׹�ư.setBounds(228, 293, 178, 210);
		�귣��.add(�귣����׹�ư);
		
		JButton �귣����ư = new JButton("");
		�귣����ư.setIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��.png"));
		�귣����ư.setPressedIcon(new ImageIcon("D:/�ڹ� �ȵ���̵�/ȭ��/�̹���/��Ŭ��.png"));
		�귣����ư.setBorderPainted(false);
		�귣����ư.setFocusPainted(false);
		�귣����ư.setContentAreaFilled(false);
		�귣����ư.setBounds(0, 0, 42, 42);
		�귣��.add(�귣����ư);
		�귣��.setVisible(false);		
		���.setVisible(false);
		�α���.setVisible(false);
		
		
		���Ȯ�ι�ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				���.setVisible(false);
				����ȭ��.setVisible(true);
			}
			
		});
		��Ϲ��ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				���.setVisible(false);
				����ȭ��.setVisible(true);
			}
			
		});
		
		�α��ι��ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�α���.setVisible(false);
				����ȭ��.setVisible(true);
			}
			
		});
		����2���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				����2.setVisible(false);
				����1.setVisible(true);
			}
			
		});
		�����ù��ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				������.setVisible(false);
				����2.setVisible(true);
			}
			
		});
		
		����2����ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				����2.setVisible(false);
				������.setVisible(true);
			}
			
		});
	
	
	
		
		�α��ι�ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�α���.setVisible(false);
				����1.setVisible(true);
			}
			
		});
		
		���ε�Ϲ�ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				���.setVisible(true);
				����ȭ��.setVisible(false);
			}
			
		});
		
		���ηα��ι�ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�α���.setVisible(true);
				����ȭ��.setVisible(false);
			}
			
		});
		���������˻���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�����˻�â.setVisible(true);
			}
			
		});
		�����˻��ݱ��ư.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				�����˻�â.setVisible(false);
			}
		});
		
		���������ư.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		����1��ġŲ��ư.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				��ġŲ���.setVisible(true);
			}
		});
		����1���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				����1.setVisible(false);
				�α���.setVisible(true);
			}
			
		});
		
		����1�����ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				����2.setVisible(true);
				����1.setVisible(false);
			}
			
		});
		��ġŲ��ϴݱ��ư.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				��ġŲ���.setVisible(false);
			}
		});
		
		����1���ư����ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				����ȭ��.setVisible(true);
				����1.setVisible(false);
			}
			
		});
		
		����2�귣���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�귣��.setVisible(true);
				����2.setVisible(false);
			}
			
		});
		
		�귣����ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				����2.setVisible(true);
				�귣��.setVisible(false);
			}
			
		});
		
		�������Ķ��̵��ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�Ķ��̵�.setVisible(true);
				������.setVisible(false);
			}
			
		});
		
		�����þ���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				���.setVisible(true);
				������.setVisible(false);
			}
			
		});
		
		
		�����ð����ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				����.setVisible(true);
				������.setVisible(false);
			}
			
		});
		
		�����ñ�Ÿ��ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				��Ÿ.setVisible(true);
				������.setVisible(false);
			}
			
		});
		
		
		�Ķ��̵���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				������.setVisible(true);
				�Ķ��̵�.setVisible(false);
			}
			
		});
		
		�����ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				������.setVisible(true);
				���.setVisible(false);
			}
			
		});
		
		������ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				������.setVisible(true);
				����.setVisible(false);
			}
			
		});
		
		��Ÿ���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				������.setVisible(true);
				��Ÿ.setVisible(false);
			}
			
		});
		
		�귣�屳�̹�ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				����.setVisible(true);
				�귣��.setVisible(false);
			}
			
		});
		
		�귣��BHC��ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BHC.setVisible(true);
				�귣��.setVisible(false);
			}
			
		});
		
		
		�귣��BBQ��ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BBQ.setVisible(true);
				�귣��.setVisible(false);
			}
			
		});
		
		�귣����׹�ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				����.setVisible(true);
				�귣��.setVisible(false);
			}
			
		});
		
		
		���̹��ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�귣��.setVisible(true);
				����.setVisible(false);
			}
			
		});
		
		BHC���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�귣��.setVisible(true);
				BHC.setVisible(false);
			}
			
		});
		
		BBQ���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�귣��.setVisible(true);
				BBQ.setVisible(false);
			}
			
		});
		
		���׹��ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�귣��.setVisible(true);
				����.setVisible(false);
			}
			
		});
		
		�������ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				����1.setVisible(true);
				����.setVisible(false);
			}
			
		});
		
		����1������ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				����.setVisible(true);
				����1.setVisible(false);
				
			}
			
		});
		
		�Ķ��̵��ֹ���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�ֹ��Ϸ�â.setVisible(true);
				
			}
			
		});
		
		
		����ֹ���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�ֹ��Ϸ�â.setVisible(true);
				
			}
			
		});
		
		
		�����ֹ���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�ֹ��Ϸ�â.setVisible(true);
				
			}
			
		});
		
		
		��Ÿ�ֹ���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�ֹ��Ϸ�â.setVisible(true);
				
			}
			
		});
		
		
		�����ֹ���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�ֹ��Ϸ�â.setVisible(true);
				
			}
			
		});
		
		
		�����ֹ���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�ֹ��Ϸ�â.setVisible(true);
				
			}
			
		});
		
		
		BHC�ֹ���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�ֹ��Ϸ�â.setVisible(true);
				
			}
			
		});
		
		
		BBQ�ֹ���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�ֹ��Ϸ�â.setVisible(true);
				
			}
			
		});
		
		�����ֹ���ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�ֹ��Ϸ�â.setVisible(true);
				
			}
			
		});
		
		
		�ֹ��Ϸ��ư.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�ֹ��Ϸ�â.setVisible(false);
				�Ķ��̵�.setVisible(false);
				���.setVisible(false);
				����.setVisible(false);
				��Ÿ.setVisible(false);
				����.setVisible(false);
				����.setVisible(false);
				BBQ.setVisible(false);
				BHC.setVisible(false);
				����.setVisible(false);
				����ȭ��.setVisible(true);
				
			}
			
		});
		
		
	}
}
