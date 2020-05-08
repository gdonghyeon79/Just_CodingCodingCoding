package my.refactoringTest;

public class Number {
    private int no;

    public Number(int no){
        this.no = no;
    }

    // 요구사항 : calculate() 메소드에서 발생하는 if문을 제거하는 것.  어떻게 제거 할까?
    public Number calculate(String expression, Number number){
        if("+".equals( expression )){
            return new Number( this.no + number.no );
        }
        if("-".equals( expression )){
            return new Number( this.no - number.no );
        }
        if("*".equals( expression )){
            return new Number( this.no * number.no );
        }
        if("/".equals( expression )){
            return new Number( this.no / number.no );
        }
        throw new IllegalArgumentException();
    }


    public static void main(String[] args) {
        Number number = new Number( 5 );
        System.out.println("number >> " + number.no);

        Number newNumber = number.calculate( "+", number );
        System.out.println("newNumber >> " + newNumber.no);
    }
}
