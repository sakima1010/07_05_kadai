import java.util.Scanner;

public class ColLesson01 {

	public static void main(String[] args) {
		// Wordクラスのインスタンス配列
		Word[] words = new Word[10];

		// コマンドラインから入力
		System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
		Scanner sc  = new Scanner(System.in);
		String input = sc.nextLine();

		// ここから記述してください
		// 例えば、「Dukeくん Javaのマスコットキャラクター」と入力されたときはtmp[0]に"Dukeくん"、tmp[1]に"Javaのマスコットキャラクター"が入る
//		参考：http://zero-config.com/java/string_split.html

		String[] tmp = input.split(" ",2);
		System.out.print("単語：" + tmp[0] + " 意味：" + tmp[1]);

//		for (int i = 0; i <= 4; i++) {
//			System.out.println(i);

//		public void keyTyped(KeyEvent.VK_E){}

	}
}


//http://todai-neet.hateblo.jp/entry/2015/09/01/131413