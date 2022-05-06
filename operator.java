//연산자 확인문제


//public class oper1 {
//    public static void main(String[] args) {
//        int x = 10;
//        int y = 20;
//        int z = (++x) + (y--);
//        System.out.println(z); // 정답은 31
//    }
//}

//public  class oper2 {
//    public static void main(String[]args) {
//        int score = 85;
//        String result = (!(score>90)) ? "가":"나";
//        System.out.println(result); //정답은 가
//    }
//}

/*public class oper3 {
    public static void main(String[]args){
        int pencils = 534;
        int students = 30;

        //학생 한 명이 가지는 연필 수
        int pencilsPerstudent = (pencils / students);
        System.out.println(pencilsPerstudent);

        //남은 연필 수
        int pencilsleft = (pencils % students);
        System.out.println(pencilsleft);
    }
}*/

/*public class oper4 {
    public static void main(String[]args){
        int value = 356;
        System.out.println(value/10*10);
    }
}*/

/*public class oper5 {
    public static void main(String[]args) {
    int lengthtop = 5;
    int lengthbottom = 10;
    int height = 7;
    double area = ((lengthbottom + lengthtop) * (double)height/2);
    System.out.println(area);
  }
}*/

/*public class oper6 {
    public static void main(String[]args){
        int x = 10;
        int y = 5;

        System.out.println((x>7) && (y<=5)); -- true
        System.out.println((x%3 == 2) || (y%2 != 1) ); --false
    }
}*/

/*public class oper7 {
    public static void main(String[]args) {
        double x = 5.0;
        double y = 0.0;

        double z = x % y;

        if(Double.isNaN(z)){
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double result = z + 10;
            System.out.println("결과: " + result);
        }
    }
}*/



