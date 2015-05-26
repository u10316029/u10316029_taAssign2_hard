import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SignFrame extends JFrame{
	private static JLabel name = new JLabel("名字 :");
	public static JTextField inputname = new JTextField(10);
	private static JLabel studentid = new JLabel("學號 :");
	public static JTextField inputid = new JTextField(10);
	private static JButton load = new JButton("確定");
	
	public SignFrame(){
		setTitle("登入畫面");
		setBounds(130, 130, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		name.setBounds(50, 23, 150, 80);
		name.setFont(new Font("PMingLiU",Font.PLAIN,18));
		add(name);
			
		inputname.setBounds(110, 50, 150, 30);
		add(inputname);
			
		studentid.setBounds(50, 108, 150, 80);
		studentid.setFont(new Font("PMingLiU",Font.PLAIN,18));
		add(studentid);
			
		inputid.setBounds(110, 135, 150, 30);
		add(inputid);
			
		load.setBounds(100, 200, 100, 50);
		load.setFont(new Font("PMingLiU",Font.PLAIN,18));
		add(load);
		load.addActionListener(new ButtonListener());
		setVisible(true);
	}	
}

class ButtonListener implements ActionListener{
	String getname;
	String getstudentid;
	@Override
	public void actionPerformed(ActionEvent e) {
		String option = e.getActionCommand();
		try{
			getname = SignFrame.inputname.getText();
			getstudentid = SignFrame.inputid.getText();
			if(getname.isEmpty() || getstudentid.isEmpty()){
				throw new Exception() ;
			}
			if(option.equals("確定") ){
				GuessGame.getSignFrame().dispose();
				GuessGame.getGameFame().setTitle("U10316029_question"+getname+"-"+getstudentid);
				GuessGame.getGameFame().setVisible(true);
				GuessGame.Time.start();
			}
		}
		catch(Exception e1){
			JOptionPane.showMessageDialog(null, "請輸入姓名或學號");	
		}
	}
}
