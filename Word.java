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
        public void regist(){
            System.out.print("単語" + word + "意味" + meaning);
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

    //    public void attack(){
//        System.out.println( tmp[0] + tmp);
//    }//        public unknown(String word, String meaning){
//            this.word = word;
//            this.meaning = meaning;
//
//            public void regist(){ System.out.println("単語：" + this.word + "意味：" + this.meadning);}

    //    public String word;
//    public String meaning;
//
//    public unknown(String word, String meaning){
//        ColLesson01.tmp[0] = word;
//        ColLesson01.tmp[1] = meaning;
//    }
//
//    public void regist{
//        System.out.plintln("単語：" + this.word + " 意味：" + this.meaning);
//    }

}