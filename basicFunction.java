class Word{
    private String name;
    private Word(String word){
        this.name = word;
    }

    public static Word getWord(String word){
        return new Word(word);
    }

    public void printTheWord(){
        System.out.println("The name is "+this.name);
    }

}

class basicFunction{
    public static void main(String[] args) {
        Word w = Word.getWord("Brindaban");
        w.printTheWord();
    }
}
