class ArrayMain{
    public static void main(String[] args) {
        Array myArrayWithUtil = Array.initialize();
        myArrayWithUtil.addElement(2);
        myArrayWithUtil.addElement(4);
        myArrayWithUtil.reInitilize();
        myArrayWithUtil.addElement(1);
        myArrayWithUtil.addElement(2);

        int summationOfAllElements = myArrayWithUtil.sumAll();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Sumation of all elements is -> "+ summationOfAllElements);
        System.out.println("--------------------------------------------------------------------------------------");
        int greatestNumber = myArrayWithUtil.findGreatest();
        System.out.println("The greatest no of all of these is -> "+greatestNumber);
        System.out.println("--------------------------------------------------------------------------------------");
        int smallestNo = myArrayWithUtil.findSmallest();
        System.out.println("The smallestNo no of all of these is -> "+smallestNo);
        System.out.println("--------------------------------------------------------------------------------------");
        myArrayWithUtil.multiplyAllElementsBy(3);
        System.out.println("After multiply the all element by 3 first element was 1 but now-> "+myArrayWithUtil.getIntegerArray()[0]);
        System.out.println("After multiply the all element by 3 second element was 2 but now-> "+myArrayWithUtil.getIntegerArray()[1]);
        System.out.println("--------------------------------------------------------------------------------------");
    }
}
