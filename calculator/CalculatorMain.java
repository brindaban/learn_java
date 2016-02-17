class CalculatorMain{
    public static void main(String[] args) {
        Calculator myCalculator = Calculator.initilize();
        myCalculator.add(2).add(3).sub(1).multiplication(4).divide(2);
        int result = myCalculator.getResult();
        System.out.println("result is ->" +result);
    }
}
