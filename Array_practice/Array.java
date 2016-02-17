import java.util.Arrays;
class Array{
    private int [] integerArray;

    private Array(){
        integerArray = new int[0] ;
    }

    public static Array initialize(){
        return new Array();
    }

    private Array(int [] array){
        integerArray = array;
    }

    public static Array initializeByValue(int [] array){
        return new Array(array);
    }

    public int[] getIntegerArray(){
        return integerArray;
    }

    public void reInitilize(){
        integerArray = new int[0];
    }

    public int addElement(int element){
        integerArray  = Arrays.copyOf(integerArray, integerArray.length + 1);
        integerArray[integerArray.length - 1] = element;
        return integerArray.length;
    }

    public int sumAll(){
        int sum = 0;
        for(int counter=0; counter<integerArray.length; counter++)
            sum += integerArray[counter];
        return sum;
    }

    public int findGreatest(){
        int greatest = integerArray[0];
        for(int counter=1; counter<integerArray.length; counter++)
            if(greatest<integerArray[counter])
                greatest = integerArray[counter];
        return greatest;
    }

    public int findSmallest(){
        int smallest = integerArray[0];
        for(int counter=1; counter<integerArray.length; counter++)
            if(smallest>integerArray[counter])
                smallest = integerArray[counter];
        return smallest;
    }

    public void multiplyAllElementsBy(int multiplier){
        for(int counter = 0; counter<integerArray.length; counter++)
            integerArray[counter] *= multiplier;
    }

}
