public class Word{
    //        属性を定義
        private String word;
        private String meaning;

    //        コンストラクタを定義
        public Word(String word, String meaning) {
            this.word = word;
            this.meaning = meaning;
        }

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

    @Override
    public String toString(){
       return "単語：" + this.word + "日本語：" + this.meaning;
    }

}