import java.util.Scanner;

/*public class LoopExam1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i <= 100; i++){
            if(i % 3 == 0){
                sum += i;
            }
        }
        System.out.println("3의 배수의 합: "+sum);
    }
}

public class LoopExam2{
    public static void main(String[] args) {
        int a;
        int b;
        do{
            a = (int)(Math.random()*6 + 1);
            b = (int)(Math.random()*6 + 1);
            System.out.println("("+a+","+b+")");
        }while(!(a+b==5));
    }
} */
/*
public class LoopExam3 {
    public static void main(String[] args){
        for(int i = 0; i <= 10; i++){
            for(int j = 0; j <= 10; j++){
                if(4*i + 5*j == 60)
                    System.out.println("("+i+","+j+")");
            }
        }
    }
}
*/
/*

public class LoopExam 4{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); //print는 안끊고 출력, println은 끊고 출력
        }
    }
}*/
/*

public class LoopExam 5{
public static void main(String[] args){
    boolean run = true;

    int balance;

    Scanner scanner = new Scanner(System.in);
    String inputString;

    while(run){
        System.out.println("----------------------------------");
        System.out.println("1.예금 || 2.출금 || 3.잔고 || 4.종료");
        System.out.println("----------------------------------");
        System.out.print("선택> ");
        inputString = scanner.nextLine();
        if(inputString.equals("1"))
            System.out.println("예금액>10000");
        if(inputString.equals("2"))
            System.out.println("출금액>2000");
        if (inputString.equals("3"))
            System.out.println("잔고>8000");
        if(inputString.equals("4"))
            break;

    }
    System.out.println("프로그램 종료.");
    }
}
*/

