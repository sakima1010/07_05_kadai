public class Word{
    //        属性を定義
        private String word;
        private String meaning;

    //        コンストラクタを定義
        public Word(String word, String meaning) {
            this.word = word;
            this.meaning = meaning;
        }
    //        メソッドを作成
    // 回答上不要だったため、削除
//        public void attack(){
//            System.out.print("単語" + word + "意味" + meaning);
//        }

    //        アクセサーを定義
    public String getWord() {
            return word;
    }

    public void setWord(String word) {
            this.word = word;
    }

    public String getMeaning() {
            return meaning;
    }

    public void setMeaning(String meaning) {
            this.meaning = meaning;
    }
}