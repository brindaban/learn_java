class Sentence{
    private String mySentence;
    private Sentence(String sentence){
        mySentence = sentence;
    }

    public static Sentence getSentence(String sentence){
        return new Sentence(sentence);
    }

    public String strip(){
        String newString = "";
        String[] stringSplittedBySpace = this.mySentence.split(" ");
        for(int counter = 0; counter<stringSplittedBySpace.length; counter++){
            newString = newString+stringSplittedBySpace[counter];
        }
        return newString;
    }

    public String camelCase(){
        String[] stringSplittedBySpace = this.mySentence.split(" ");
        String newString = stringSplittedBySpace[0].toLowerCase();
    	for(int counter=1;counter<stringSplittedBySpace.length;counter++){
            String store = stringSplittedBySpace[counter];
            newString += store.toUpperCase().charAt(0);
            for(int j=1;j<store.length();j++)
    			newString+=store.toLowerCase().charAt(j);
    	}
        return newString;
    }

    private void printSentence(){
        System.out.println("The sentence is -> "+mySentence);
    }

    public void print(){
        printSentence();
    }
}
