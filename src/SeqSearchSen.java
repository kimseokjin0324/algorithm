import java.util.Scanner;

public class SeqSearchSen {
    //요소수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형검색
    static int seqSearchSen(int[] a,int n,int key){
        int i=0;

        a[n]= key;  //보초를 추가

        while(true){
            if(a[i]==key)//검색성공
                break;
            i++;
        }
        return i==n?-1:i; //-while문에 의한 반복이 완료되면 찾은 값이 배열의 원래 데이터인지 아니면 보초인지 판단해야한다.
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);

        System.out.print("요솟수:");
        int num= stdIn.nextInt();
        int[]x=new int[num+1];      //요솟수 num+1

        for (int i = 0; i < num; i++) {
            System.out.printf("x["+i+"]:");
            x[i]= stdIn.nextInt();
        }
        System.out.print("검색할 값: ");    //키값을 입력
        int ky=stdIn.nextInt();

        int idx=seqSearchSen(x,num,ky);
        if(idx==-1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky+"은 x["+idx+"]에 있습니다.");
    }
}
