class BasicFunction{
    public static void main(String[] args) {
        Word w = Word.getWord("Brindaban");
        w.print();
        System.out.println("--------------------------------------------------------------------------------------");
        int noOfVowels = w.countVowel();
        System.out.println("In that word the total no vowel is "+noOfVowels);
        System.out.println("--------------------------------------------------------------------------------------");
        int noOfConsonents = w.countConsonents();
        System.out.println("In that word the total no consonents is "+noOfConsonents);
        System.out.println("--------------------------------------------------------------------------------------");
        boolean result = w.isPalindrome();
        System.out.println("The word is palindrome, that is "+result);
        System.out.println("--------------------------------------------------------------------------------------");
        String reversedString = w.reverse();
        System.out.println("The reversed word of that word is "+reversedString);
        System.out.println("--------------------------------------------------------------------------------------");
        //---------------------- String Programm by taking word completed
        System.out.println("--------------------------------------------------------------------------------------");
        Sentence s = Sentence.getSentence("My name is khan and I am not a teririst");
        s.print();
        System.out.println("--------------------------------------------------------------------------------------");
        String strippedSentence = s.strip();
        System.out.println("After Stripped the above sentence, it's look like -> "+strippedSentence);
        System.out.println("--------------------------------------------------------------------------------------");
        String camelCasedSentence = s.camelCase();
        System.out.println("After camelCased the above sentence, it's look like -> "+camelCasedSentence);
        System.out.println("--------------------------------------------------------------------------------------");
        int noUniqueLetters = s.countUniqueLetters();
        System.out.println("No of unique letters is -> "+noUniqueLetters);
        System.out.println("--------------------------------------------------------------------------------------");


    }
}
