import java.util.Scanner;

public class Reference_Type {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = new int[30];
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int sum = 0;
        int count = 0;

        while(run){
            System.out.println("--------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                studentNum = scanner.nextInt();
            }
            else if(selectNo == 2){
                for(int i = 0; i < studentNum; i++){
                    scores[i] = scanner.nextInt();
                }
            }
            else if(selectNo == 3){
                for(int i = 0; i < studentNum; i++){
                    System.out.println("scores["+ i +"]"+scores[i]);
                }
            }
            else if(selectNo == 4){
                for(int i = 0; i > studentNum; i++){
                    if(scores[i] > max)
                        max = scores[i];
                    sum += scores[i];
                    count ++;
                }
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수" + (double)sum/(double)count);
            }
            else if(selectNo == 5){
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
