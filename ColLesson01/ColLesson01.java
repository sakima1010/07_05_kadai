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

		// 回答写経ここから
		int index = 0;
		while(!input.equals("e")){
			String[] tmp = new String[2];
			tmp = input.split(" ");
			try{
				Word wd = new Word(tmp[0],tmp[1]);
				words[index] = wd;
				index++;
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println("登録できなかったようです。もう一度入力して下さい。");
			}
			System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
			input = sc.nextLine();
		}
		for(int i = 0;i < index; i++){
			System.out.println("単語：" + words[i].getWord() + "日本語：" + words[i].getMeaning());
		}
		System.out.println(index + "件、登録しました。");
	}
	// 回答写経ここまで

}


//http://todai-neet.hateblo.jp/entry/2015/09/01/131413