import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;

public class PaymentReceipt extends JFrame {

	private JPanel contentPane;
	int xx,yy,a;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentReceipt frame = new PaymentReceipt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PaymentReceipt() {
		setBounds(100, 100, 1244, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105,105,105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("  Bill Desk");
		title.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
				yy = e.getY();
			}
		});
		title.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				PaymentReceipt.this.setLocation(x - xx, y - yy);
			}
		});
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setOpaque(true);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setBackground(Color.RED);
				lblNewLabel.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setBackground(new Color(0,206,209));
				lblNewLabel.setForeground(Color.BLACK);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		JLabel label = new JLabel("-");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PaymentReceipt.this.setState(JFrame.ICONIFIED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setBackground(Color.BLACK);
				label.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label.setBackground(new Color(0,206,209));
				label.setForeground(Color.BLACK);
			}
		});
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Berlin Sans FB", Font.PLAIN, 35));
		label.setBackground(new Color(0, 206, 209));
		label.setBounds(1152, 0, 46, 41);
		contentPane.add(label);
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(new Color(0,206,209));
		lblNewLabel.setBounds(1198, 0, 46, 41);
		contentPane.add(lblNewLabel);
		title.setBackground(new Color(0, 206, 209));
		title.setFont(new Font("Tahoma", Font.PLAIN, 18));
		title.setBounds(0, 0, 1244, 41);
		contentPane.add(title);
		title.setOpaque(true);
		
		JLabel lblPuinanHighSchool = new JLabel("PUINAN HIGH SCHOOL");
		lblPuinanHighSchool.setForeground(Color.WHITE);
		lblPuinanHighSchool.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuinanHighSchool.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
		lblPuinanHighSchool.setBounds(120, 54, 337, 41);
		contentPane.add(lblPuinanHighSchool);
		
		JLabel lblForSchoolsFee = new JLabel("For Schools Fee Collection");
		lblForSchoolsFee.setHorizontalAlignment(SwingConstants.CENTER);
		lblForSchoolsFee.setForeground(Color.WHITE);
		lblForSchoolsFee.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		lblForSchoolsFee.setBounds(147, 105, 279, 41);
		contentPane.add(lblForSchoolsFee);
		
		JLabel lblNo = new JLabel("No. :");
		lblNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNo.setForeground(Color.WHITE);
		lblNo.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNo.setBounds(0, 159, 69, 41);
		contentPane.add(lblNo);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.control);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		textArea.setBounds(589, 40, 655, 960);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.windowBorder);
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		textField.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField.setForeground(Color.WHITE);
		textField.setBounds(64, 165, 116, 31);
		textField.setColumns(10);
		textField.setOpaque(false);
		contentPane.add(textField);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblDate.setBounds(357, 159, 69, 41);
		contentPane.add(lblDate);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.windowBorder);
		textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		textField_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField_1.setForeground(Color.WHITE);
		textField_1.setOpaque(false);
		textField_1.setColumns(10);
		textField_1.setBounds(425, 166, 132, 31);
		contentPane.add(textField_1);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblName.setBounds(98, 209, 69, 41);
		contentPane.add(lblName);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.windowBorder);
		textField_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		textField_2.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField_2.setForeground(Color.WHITE);
		textField_2.setOpaque(false);
		textField_2.setColumns(10);
		textField_2.setBounds(174, 215, 199, 31);
		contentPane.add(textField_2);
		
		JLabel lblRollNo = new JLabel("Class :");
		lblRollNo.setHorizontalAlignment(SwingConstants.LEFT);
		lblRollNo.setForeground(Color.WHITE);
		lblRollNo.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblRollNo.setBounds(98, 270, 69, 41);
		contentPane.add(lblRollNo);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.windowBorder);
		textField_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		textField_3.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField_3.setForeground(Color.WHITE);
		textField_3.setOpaque(false);
		textField_3.setColumns(10);
		textField_3.setBounds(174, 274, 199, 31);
		contentPane.add(textField_3);
		
		JLabel lblAdmissionFee = new JLabel("Admission Fee :");
		lblAdmissionFee.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdmissionFee.setForeground(Color.WHITE);
		lblAdmissionFee.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblAdmissionFee.setBounds(18, 337, 126, 41);
		contentPane.add(lblAdmissionFee);
		
		textField_4 = new JTextField();
		textField_4.setBackground(SystemColor.windowBorder);
		textField_4.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		textField_4.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField_4.setForeground(Color.WHITE);
		textField_4.setOpaque(false);
		textField_4.setColumns(10);
		textField_4.setBounds(199, 344, 126, 31);
		contentPane.add(textField_4);
		
		JLabel lblTutionFee = new JLabel("Tution Fee :");
		lblTutionFee.setHorizontalAlignment(SwingConstants.LEFT);
		lblTutionFee.setForeground(Color.WHITE);
		lblTutionFee.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblTutionFee.setBounds(18, 400, 126, 41);
		contentPane.add(lblTutionFee);
		
		textField_5 = new JTextField();
		textField_5.setBackground(SystemColor.windowBorder);
		textField_5.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		textField_5.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField_5.setForeground(Color.WHITE);
		textField_5.setOpaque(false);
		textField_5.setColumns(10);
		textField_5.setBounds(199, 407, 126, 31);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBackground(SystemColor.windowBorder);
		textField_6.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		textField_6.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField_6.setForeground(Color.WHITE);
		textField_6.setOpaque(false);
		textField_6.setColumns(10);
		textField_6.setBounds(199, 468, 126, 31);
		contentPane.add(textField_6);
		
		JLabel lblSecurityFee = new JLabel("Security Fee :");
		lblSecurityFee.setHorizontalAlignment(SwingConstants.LEFT);
		lblSecurityFee.setForeground(Color.WHITE);
		lblSecurityFee.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblSecurityFee.setBounds(18, 461, 126, 41);
		contentPane.add(lblSecurityFee);
		
		textField_7 = new JTextField();
		textField_7.setBackground(SystemColor.windowBorder);
		textField_7.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		textField_7.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField_7.setForeground(Color.WHITE);
		textField_7.setOpaque(false);
		textField_7.setColumns(10);
		textField_7.setBounds(199, 531, 126, 31);
		contentPane.add(textField_7);
		
		JLabel lblTransportationFee = new JLabel("Transportation Fee :");
		lblTransportationFee.setHorizontalAlignment(SwingConstants.LEFT);
		lblTransportationFee.setForeground(Color.WHITE);
		lblTransportationFee.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblTransportationFee.setBounds(18, 525, 175, 41);
		contentPane.add(lblTransportationFee);
		
		JLabel lblLibraryFee = new JLabel("Library Fee :");
		lblLibraryFee.setHorizontalAlignment(SwingConstants.LEFT);
		lblLibraryFee.setForeground(Color.WHITE);
		lblLibraryFee.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblLibraryFee.setBounds(18, 590, 175, 41);
		contentPane.add(lblLibraryFee);
		
		textField_8 = new JTextField();
		textField_8.setBackground(SystemColor.windowBorder);
		textField_8.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		textField_8.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField_8.setForeground(Color.WHITE);
		textField_8.setOpaque(false);
		textField_8.setColumns(10);
		textField_8.setBounds(199, 596, 126, 31);
		contentPane.add(textField_8);
		
		JLabel lblAssessmentFee = new JLabel("Development Fee :");
		lblAssessmentFee.setHorizontalAlignment(SwingConstants.LEFT);
		lblAssessmentFee.setForeground(Color.WHITE);
		lblAssessmentFee.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblAssessmentFee.setBounds(18, 654, 175, 41);
		contentPane.add(lblAssessmentFee);
		
		textField_9 = new JTextField();
		textField_9.setBackground(SystemColor.windowBorder);
		textField_9.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		textField_9.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField_9.setForeground(Color.WHITE);
		textField_9.setOpaque(false);
		textField_9.setColumns(10);
		textField_9.setBounds(199, 660, 126, 31);
		contentPane.add(textField_9);
		
		JLabel lblElectricityFee = new JLabel("Electricity Fee :");
		lblElectricityFee.setHorizontalAlignment(SwingConstants.LEFT);
		lblElectricityFee.setForeground(Color.WHITE);
		lblElectricityFee.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblElectricityFee.setBounds(18, 715, 175, 41);
		contentPane.add(lblElectricityFee);
		
		textField_10 = new JTextField();
		textField_10.setBackground(SystemColor.windowBorder);
		textField_10.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		textField_10.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField_10.setForeground(Color.WHITE);
		textField_10.setOpaque(false);
		textField_10.setColumns(10);
		textField_10.setBounds(199, 721, 126, 31);
		contentPane.add(textField_10);
		
		JLabel lblDevelopmentFee = new JLabel("Assessment Fee :");
		lblDevelopmentFee.setHorizontalAlignment(SwingConstants.LEFT);
		lblDevelopmentFee.setForeground(Color.WHITE);
		lblDevelopmentFee.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblDevelopmentFee.setBounds(18, 776, 175, 41);
		contentPane.add(lblDevelopmentFee);
		
		textField_11 = new JTextField();
		textField_11.setBackground(SystemColor.windowBorder);
		textField_11.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		textField_11.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField_11.setForeground(Color.WHITE);
		textField_11.setOpaque(false);
		textField_11.setColumns(10);
		textField_11.setBounds(199, 782, 126, 31);
		contentPane.add(textField_11);
		
		JLabel lblOtherFee = new JLabel("Other Fee :");
		lblOtherFee.setHorizontalAlignment(SwingConstants.LEFT);
		lblOtherFee.setForeground(Color.WHITE);
		lblOtherFee.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblOtherFee.setBounds(18, 839, 175, 41);
		contentPane.add(lblOtherFee);
		
		textField_12 = new JTextField();
		textField_12.setBackground(SystemColor.windowBorder);
		textField_12.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		textField_12.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField_12.setForeground(Color.WHITE);
		textField_12.setOpaque(false);
		textField_12.setColumns(10);
		textField_12.setBounds(199, 845, 126, 31);
		contentPane.add(textField_12);
		
		JLabel lblGenerateBill = new JLabel("Generate Bill");
		lblGenerateBill.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblGenerateBill.setBackground(Color.WHITE);
				lblGenerateBill.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblGenerateBill.setBackground(new Color(0, 206, 209));
				lblGenerateBill.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().equals("") || textField_1.getText().equals("") || textField_2.getText().equals("") || textField_3.getText().equals("") 
						|| textField_4.getText().equals("") || textField_5.getText().equals("") || textField_6.getText().equals("") || textField_7.getText().equals("") 
						|| textField_8.getText().equals("") || textField_9.getText().equals("") || textField_10.getText().equals("") || textField_11.getText().equals("") 
						|| textField_12.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "PLEASE FILL ALL THE FORM CORRECTLY !");
				}
				else {
					try {
						a = Integer.parseInt(textField_4.getText()) + Integer.parseInt(textField_5.getText()) + Integer.parseInt(textField_6.getText()) + 
								Integer.parseInt(textField_7.getText()) + Integer.parseInt(textField_8.getText()) + Integer.parseInt(textField_9.getText()) + 
								Integer.parseInt(textField_10.getText()) + Integer.parseInt(textField_11.getText()) + Integer.parseInt(textField_12.getText());
						//System.out.print(a);
						textArea.setText("\t\t\tPUINAN HIGH SCHOOL \n \t\t\t  Puinan,Hooghly \n \t\t      Admission Bill Receipt\n\n "
								+ "\tNo : "+textField.getText()+"\t\t\tDate : "+textField_1.getText()+"\n\t*************************************************\n\n"
										+ "\t\t\tName  : "+textField_2.getText()+"\n\t\t\tClass : "+textField_3.getText()+"\n\n      Admission Fee      \t: "+textField_4.getText()
										+ "\n\n      Tution Fee         \t: "+textField_5.getText()+"\n\n      Security Fee       \t: "+textField_6.getText()+"\n\n      Transportation Fee \t: "
										+ textField_7.getText()+"\n\n      Library Fee        \t: "+textField_8.getText()+"\n\n      Development Fee    \t: "+textField_9.getText()
										+"\n\n      Electricity Fee    \t: "+textField_10.getText()+"\n\n      Assessment Fee     \t: "+textField_11.getText()+"\n\n      Other Fee          \t: "
										+textField_12.getText()+"\n      --------------------------------------------------\n\n      Total Fee         \t: "+a+"\n\n\n\n\n\n\n\n\t\t\t\t"
												+ "_________________________\n\t\t\t\tSignature of Head Teacher");
					}
					catch(Exception p){
						JOptionPane.showMessageDialog(null, "DATA IS NOT VALID !");
					}
				}
			}
		});
		lblGenerateBill.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblGenerateBill.setBorder(new LineBorder(new Color(255, 250, 240)));
		lblGenerateBill.setBackground(new Color(0, 206, 209));
		lblGenerateBill.setHorizontalAlignment(SwingConstants.CENTER);
		lblGenerateBill.setForeground(Color.WHITE);
		lblGenerateBill.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblGenerateBill.setBounds(28, 923, 116, 41);
		lblGenerateBill.setOpaque(true);
		contentPane.add(lblGenerateBill);
		
		JLabel lblPrint = new JLabel("Print");
		lblPrint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblPrint.setBackground(Color.WHITE);
				lblPrint.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblPrint.setBackground(new Color(0, 206, 209));
				lblPrint.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					textArea.print();
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		lblPrint.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblPrint.setOpaque(true);
		lblPrint.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrint.setForeground(Color.WHITE);
		lblPrint.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblPrint.setBorder(new LineBorder(new Color(255, 250, 240)));
		lblPrint.setBackground(new Color(0, 206, 209));
		lblPrint.setBounds(174, 923, 116, 41);
		contentPane.add(lblPrint);
		
		JLabel lblClear = new JLabel("Clear");
		lblClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblClear.setBackground(Color.WHITE);
				lblClear.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblClear.setBackground(new Color(255, 0, 0));
				lblClear.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.setText("");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
			}
		});
		lblClear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblClear.setOpaque(true);
		lblClear.setHorizontalAlignment(SwingConstants.CENTER);
		lblClear.setForeground(Color.WHITE);
		lblClear.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblClear.setBorder(new LineBorder(new Color(255, 250, 240)));
		lblClear.setBackground(new Color(255, 0, 0));
		lblClear.setBounds(441, 923, 116, 41);
		contentPane.add(lblClear);
		
		setUndecorated(true);
	}
}
