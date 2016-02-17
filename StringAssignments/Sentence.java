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

    public String uniqueLetters(){
        String newString = "";
        String stripString = strip();
        for(int counter = 0; counter<stripString.length(); counter++){
            if(newString.indexOf(stripString.charAt(counter))==-1);
                newString += stripString.charAt(counter);
        }
        return newString;
    }

    public int countUniqueLetters(){
        String newString = uniqueLetters();
        // System.out.println(newString.length());
        return newString.length();
    }

    private void printSentence(){
        System.out.println("The sentence is -> "+mySentence);
    }

    public void print(){
        printSentence();
    }

}
