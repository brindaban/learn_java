class BasicFunction{
    public static void main(String[] args) {
        Word w = Word.getWord("Brindaban");
        w.print();
        int noOfVowels = w.countVowel();
        System.out.println("In that word the total no vowel is "+noOfVowels);
        int noOfConsonents = w.countConsonents();
        System.out.println("In that word the total no consonents is "+noOfConsonents);
    }
}
