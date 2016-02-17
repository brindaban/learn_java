

class Calculator{
    private int result;
    private Calculator(){
        result = 0;
    }

    public static Calculator initilize(){
        return new Calculator();
    }

    public Calculator add(int number){
        result = result+number;
        return this;
    }

    public Calculator sub(int number){
        result = result - number;
        return this;
    }

    public Calculator multiplication(int number){
        result = result * number;
        return this;
    }

    public Calculator divide(int number){
        result = result / number;
        return this;
    }

    public int getResult(){
        return result;
    }
}
