public class QuestionOfGame {
	public static String question;
	public static String[] choice  = new String[4];
	public static int answer;
	QuestionOfGame(){}
	public static void printQuestion(int RandomQuestion){
		
		switch (RandomQuestion) {
		case 0:
			question = "豬八戒給了我們什麼啟示?";
			choice[0] = "豬是會說話的";
			choice[1] = "取經要帶一隻豬";
			choice[2] = "一臉豬頭樣就該乖乖去做和尚";
			choice[3] = "別指望減肥了,他都走了十萬八千里遠也沒瘦,而且他還吃素!!";
			answer = 3;
			break;
		case 1:
			question = "Java課我們都在做什麼事?";
			choice[0] = "打CS";
			choice[1] = "玩手機";
			choice[2] = "睡覺";
			choice[3] = "認真上課";
			answer = 3;
			break;
		case 2:
			question = "中國古代曾有多次的焚書事件，下列帝王焚書最多的是?";
			choice[0] = "秦始皇";
			choice[1] = "乾隆";
			choice[2] = "朱元璋";
			choice[3] = "漢武帝";
			answer = 1;
			break;
		case 3:
			question = "有一天,有三個精子再打賭看誰能先游到子宮讓卵子受精,他們游了一個小時還沒到,為什麼?";
			choice[0] = "因為比例問題,所以即使游了一小時也到不了";
			choice[1] = "因為游到一半全累死了";
			choice[2] = "其實他們已經游到喉嚨了~诶!!";
			choice[3] = "以上皆非";
			answer = 2;
			break;
		case 4:
			question = "黃瓜明明是綠色的為什麼叫\"黃\"瓜 ?";
			choice[0] = "因為用途很黃吧~~";
			choice[1] = "因為它是素的";
			choice[2] = "黃瓜本名胡瓜,後趙時因詩中曾將它比喻為玉盤黃瓜,故得此名";
			choice[3] = "以上皆非";
			answer = 2;
			break;
		case 5:
			question = "A片和鬼片的共同點是?";
			choice[0] = "通常一個人深夜看才有意思";
			choice[1] = "常常有人被體液噴得滿身";
			choice[2] = "偶爾會聽到女性的叫聲";
			choice[3] = "以上皆是";
			answer = 3;
			break;
		case 6:
			question = "知識王是?";
			choice[0] = "一款手機遊戲app";
			choice[1] = "周東誼";
			choice[2] = "爛遊戲";
			choice[3] = "以上皆非";
			answer = 0;
			break;
		case 7:
			question = "看到\"av\"兩個字你想到什麼?";
			choice[0] = "AV女優";
			choice[1] = "成人影片";
			choice[2] = "18X";
			choice[3] = "加速度和速度(別欺騙自己)";
			answer = 3;
			break;
		case 8:
			question = "人類和電腦有何不同?";
			choice[0] = "人有生命，電腦沒有";
			choice[1] = "人速度慢，電腦速度快";
			choice[2] = "人纇是把硬體插進軟體中，而電腦是把軟體放進硬體裡";
			choice[3] = "以上皆是";
			answer = 3;
			break;
		case 9:
			question = "小明的媽媽有3個孩子第1個叫1明第2個叫2明第3個叫什麼?";
			choice[0] = "3明";
			choice[1] = "三明";
			choice[2] = "小明";
			choice[3] = "以上皆非";
			answer = 2;
			break;
		}	
	}
}
