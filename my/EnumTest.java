package my;

import java.net.SocketOption;

enum Color{
    RED, GREEN, BLUE
}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumTest {

    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
    }

    Day day;

    public EnumTest(Day day){
        this.day = day;
    }

    public void dayIsLike(){
        switch (day){
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case FRIDAY:
                System.out.println();
        }
    }
}
