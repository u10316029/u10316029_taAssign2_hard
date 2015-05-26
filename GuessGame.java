import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
public class GuessGame extends JFrame{
	public static GuessGame gameFrame ;
	public static SignFrame signFrame;
	private static JButton nextquestion = new JButton("下一題");
	private static JLabel remaintime;
	NextQuestion a;
	private GameFrame choice;
	private int count = 1;
	private int score = 0;
	private int reTime = 20;
	public static Timer Time;
	ImageIcon bgImage = new ImageIcon(getClass().getResource("image/認真.jpg"));
	ImageIcon EndImage = new ImageIcon(getClass().getResource("image/結束.jpg"));
	int repeat[] = new int[10];
	public GuessGame(){
		Time = new Timer(1000, new TimerListener());
		setSize(1000, 800);
		add(new GameFrame()); 
		nextquestion.setBounds(775,655,200,60);
		nextquestion.setFont(new Font("PMingLiU",Font.LAYOUT_LEFT_TO_RIGHT,28));
		a = new NextQuestion();
		nextquestion.addActionListener(a);
		add(nextquestion);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(false);
		choice = new GameFrame();
		choice.setLayout(null);
		add(choice);
		Question();
	}
	
	public static void main(String[]args){
		signFrame = new SignFrame();
		gameFrame = new GuessGame();
	}
	public static GuessGame getGameFame(){
		return gameFrame;
	}
	
	public static SignFrame getSignFrame(){
		return signFrame;
	}	
	
	class GameFrame extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			g.clearRect(0, 0, 1000, 800);
			g.setColor(Color.black);
			g.setFont(new Font("PMingLiU",Font.BOLD,32));
			g.drawString("A.", 175, 260);
			g.drawString("B.", 175, 360);
			g.drawString("C.", 175, 460);
			g.drawString("D.", 175, 560);
			g.setFont(new Font("PMingLiU",Font.BOLD,26));
			g.drawString("第 "+count+" 題", 10, 30);
			g.drawString("分數: " + score, 20, 700);
		}
	}
	
	public void Question(){
		int i = (int)(Math.random() * 10);
		while(repeat[i]!=0){
			 i = (int)(Math.random() * 10);
		}
		
		QuestionOfGame.printQuestion(i);
		JLabel questionLabel = new JLabel();
		questionLabel.setText("<html>"+QuestionOfGame.question+"<html>");
		questionLabel.setFont(new Font("PMingLiU",Font.BOLD,25));
		questionLabel.setBounds(225,27,500,100);
		choice.add(questionLabel);
	
		JButton choiceofanswer = new JButton(QuestionOfGame.choice[0]);
		choiceofanswer.setFont(new Font("PMingLiU",Font.PLAIN,20));
		choiceofanswer.setBounds(215, 120+ 100*(1), 650, 65);
		choiceofanswer.setMargin(new java.awt.Insets(0,0,0,0)); 
		choiceofanswer.addActionListener(new ButtonofChoice());
		choice.add(choiceofanswer);
		
		JButton choiceofanswer1 = new JButton(QuestionOfGame.choice[1]);
		choiceofanswer1.setFont(new Font("PMingLiU",Font.PLAIN,20));
		choiceofanswer1.setBounds(215, 120+ 100*(2), 650, 65);
		choiceofanswer1.setMargin(new java.awt.Insets(0,0,0,0));
		choiceofanswer1.addActionListener(new ButtonofChoice());
		choice.add(choiceofanswer1);

		JButton choiceofanswer2 = new JButton(QuestionOfGame.choice[2]);
		choiceofanswer2.setFont(new Font("PMingLiU",Font.PLAIN,20));
		choiceofanswer2.setBounds(215, 120+ 100*(3), 650, 65);
		choiceofanswer2.setMargin(new java.awt.Insets(0,0,0,0));
		choiceofanswer2.addActionListener(new ButtonofChoice());
		choice.add(choiceofanswer2);

		JButton choiceofanswer3 = new JButton(QuestionOfGame.choice[3]);
		choiceofanswer3.setFont(new Font("PMingLiU",Font.PLAIN,20));
		choiceofanswer3.setBounds(215, 120+ 100*(4), 650, 65);
		choiceofanswer3.setMargin(new java.awt.Insets(0,0,0,0));
		choiceofanswer3.addActionListener(new ButtonofChoice());
		choice.add(choiceofanswer3);
			
		remaintime = new JLabel();
		remaintime.setText("剩餘時間 : "+reTime+"秒");
		remaintime.setLayout(null);
		remaintime.setFont(new Font("PMingLiU",Font.BOLD,23));
		remaintime.setBounds(750,27,200,50);
		choice.add(remaintime);
		repeat[i]++;
	}
	
	class ButtonofChoice implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String yourChoice = e.getActionCommand();
			a.yourchoice = yourChoice;
		}
	}
	
	class NextQuestion implements ActionListener{
		public String yourchoice = "nochoose";
		@Override
		public void actionPerformed(ActionEvent e) {
			String next = e.getActionCommand();
			if(yourchoice.equals("nochoose")){
				Time.start();
				JOptionPane.showMessageDialog(null, "請選擇一個答案");
			}
			else if(next.equals("下一題")){
				Time.start();
				choice.removeAll();
				reTime = 20;
				
				if(count==10){
					if (yourchoice.equals("別指望減肥了,他都走了十萬八千里遠也沒瘦,而且他還吃素!!")) {
						 count ++;
						 score = score + 10;
					}
					else if(yourchoice.equals("認真上課")){
						count ++;
						score = score + 10;
					}
					else if(yourchoice.equals("乾隆")){
						count ++;
						score = score + 10;
					}
					else if(yourchoice.equals("其實他們已經游到喉嚨了~诶!!")){
						count ++;
						score = score + 10;
					}
					else if(yourchoice.equals("黃瓜本名胡瓜,後趙時因詩中曾將它比喻為玉盤黃瓜,故得此名")){
						count ++;
						score = score + 10;
					}
					else if(yourchoice.equals("以上皆是")){
						count ++;
						score = score + 10;
					}
					else if(yourchoice.equals("一款手機遊戲app")){
						count ++;
						score = score + 10;
					}
					else if(yourchoice.equals("加速度和速度(別欺騙自己)")){
						count ++;
						score = score + 10;
					}
					else if(yourchoice.equals("小明")){
						count ++;
						score = score + 10;
					}
					else{
						JOptionPane.showMessageDialog(null,"正確答案是" + QuestionOfGame.choice[QuestionOfGame.answer],"你的答案錯誤!", JOptionPane.PLAIN_MESSAGE,bgImage);
						Time.stop();
						count++;
						choice.removeAll();
						reTime = 20;
						Time.start();
					}
					Time.stop();
					getGameFame().dispose();
					JOptionPane.showMessageDialog(null,"你的得分是: "+score+"分","遊戲結束", JOptionPane.PLAIN_MESSAGE,EndImage);
				}
				else if (yourchoice.equals("別指望減肥了,他都走了十萬八千里遠也沒瘦,而且他還吃素!!")) {
					 count ++;
					 score = score + 10;
				}
				else if(yourchoice.equals("認真上課")){
					count ++;
					score = score + 10;
				}
				else if(yourchoice.equals("乾隆")){
					count ++;
					score = score + 10;
				}
				else if(yourchoice.equals("其實他們已經游到喉嚨了~诶!!")){
					count ++;
					score = score + 10;
				}
				else if(yourchoice.equals("黃瓜本名胡瓜,後趙時因詩中曾將它比喻為玉盤黃瓜,故得此名")){
					count ++;
					score = score + 10;
				}
				else if(yourchoice.equals("以上皆是")){
					count ++;
					score = score + 10;
				}
				else if(yourchoice.equals("一款手機遊戲app")){
					count ++;
					score = score + 10;
				}
				else if(yourchoice.equals("加速度和速度(別欺騙自己)")){
					count ++;
					score = score + 10;
				}
				else if(yourchoice.equals("小明")){
					count ++;
					score = score + 10;
				}
				else{
					JOptionPane.showMessageDialog(null,"正確答案是" + QuestionOfGame.choice[QuestionOfGame.answer],"你的答案錯誤!", JOptionPane.PLAIN_MESSAGE,bgImage);
					Time.stop();
					count++;
					choice.removeAll();
					reTime = 20;
					Time.start();
				}
				choice.repaint();
				Question();
				yourchoice = "nochoose";
			}
		}	
	}
	class TimerListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			if(reTime>0){
				reTime--;
				remaintime.setText("剩餘時間 : "+reTime+"秒");
			}
			else{
				JOptionPane.showMessageDialog(null, "時間到! 答案是 " + QuestionOfGame.choice[QuestionOfGame.answer]);
				Time.stop();
				reTime = 20;
				choice.repaint();
				choice.removeAll();
				Question();	
				Time.start();
				count++;
			}
		}
	}
}
