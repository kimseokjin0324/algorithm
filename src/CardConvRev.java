import java.util.Scanner;

class CardConvRev {
    static int caardConvR(int x,int r,char[] d){
        int digits=0;
        String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++]=dchar.charAt(x%r);
            x/=r;
        }while(x!=0);
        return digits;
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        int no;                     //-변환하는 정수
        int cd;                     //-기수
        int dno;                    //-변환 후의 자릿수
        int retry;                  //-다시한번?
        char[] cno=new char[32];    //-변환 후 각 자리의 숫자를 넣어두는 문자의 배열

        System.out.println("10진수를 기수 변환합니다.");
        do{
            do{
                System.out.printf("변환하는 음이 아닌정수:");
                no=stdIn.nextInt();
            }while(no<0);
            do{
                System.out.printf("어떤 진수로 변활할까요? (2~36) : ");
                cd= stdIn.nextInt();
            }while(cd<2||cd>36);
            dno=caardConvR(no,cd,cno);
            System.out.printf(cd+"진수로는 ");
            for (int i = dno-1; i >=0 ; i--)
                System.out.printf(String.valueOf(cno[i]));
            System.out.println("입니다.");
            System.out.println("한 번 더 할까요? (1.예/0.아니요) :");
            retry=stdIn.nextInt();
        }while(retry==1);
    }
}
