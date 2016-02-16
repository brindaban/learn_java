class BasicFunction{
    public static void main(String[] args) {
        Word w = Word.getWord("Brindaban");
        w.print();
        int noOfVowels = w.countVowel();
        System.out.println("In that word the total no vowel is "+noOfVowels);
        int noOfConsonents = w.countConsonents();
        System.out.println("In that word the total no consonents is "+noOfConsonents);
        boolean result = w.isPalindrome();
        System.out.println("The word is palindrome, that is "+result);
        String reversedString = w.reverse();
        System.out.println("The reversed word of that word is "+reversedString);

        //---------------------- String Programm by taking word completed

        System.out.println("--------------------------------------------------------------------------------------");
        Sentence s = Sentence.getSentence("My name is khan and I am not a teririst");
        s.print();
        String strippedSentence = s.strip();
        System.out.println("After Stripped the above sentence, it's look like -> "+strippedSentence);
        String camelCasedSentence = s.camelCase();
        System.out.println("After camelCased the above sentence, it's look like -> "+camelCasedSentence);


    }
}
