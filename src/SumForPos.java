import java.util.Scanner;

public class SumForPos {
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구한다.");

        do{
            System.out.print("n의값 : ");
            n=stdIn.nextInt();
        }while(n<=0);                       //-n이 0보다 클때까지 반복함
        int sum=0;

        for(int i=1;i<=n;i++)
            sum+=i;
        System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
    }
}
