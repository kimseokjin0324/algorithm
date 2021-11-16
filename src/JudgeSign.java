import java.util.Scanner;
public class JudgeSign {
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);

        System.out.print("정수를 입력하세요");
        int n=stdIn.nextInt();
//        /**
//         * 정숫값 부호예제
//         */
//        if(n>0)
//            System.out.printf("이 수는 양수 입니다.");
//        else if(n<0)
//            System.out.printf("이 수는 음수 입니다");
//        else
//            System.out.printf("이 수는 0입니다.");
        /**
         * 리스트 1 예제
         */
        if(n==1) System.out.printf("이 수는 1입니다.");
        else if(n==2) System.out.printf("이 수는 2입니다.");
        else if(n==3) System.out.printf("이 수는 3입니다.");
        else ;
    }
}
