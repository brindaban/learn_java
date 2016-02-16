class Word{
    private String name;
    private Word(String word){
        name = word;
    }

    public static Word getWord(String word){
        return new Word(word);
    }

    public int countVowel(){
        int count = 0;
        String wordInUpperCase = name.toUpperCase();
        for(int counter = 0; counter<name.length(); counter++){
            char letter = wordInUpperCase.charAt(counter);
            if(letter =='A'||letter =='E'||letter =='I'||letter =='O'||letter =='U')
                count++;
        }
        return count;
    }

    public int countConsonents(){
        return name.length() - countVowel();
    }

    public boolean isPalindrome(){
        for(int counter = 0; counter<name.length()/2; counter++){
            if(name.charAt(counter)!=name.charAt(name.length()-counter-1))
                return false;
        }
        return true;
    }

    public String reverse(){
        String reversedString = "";
        for(int counter = 0; counter<name.length(); counter++){
            reversedString = name.charAt(counter)+reversedString;
        }
        return reversedString;
    }

    private void printTheWord(){
        System.out.println("The name is "+name);
    }
    public void print(){
        printTheWord();
    }

}
