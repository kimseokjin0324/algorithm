import java.util.Arrays;
import java.util.Scanner;

//Arrays.binarySearch로 이진검색
class binarySearch {
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);

        System.out.print("요솟수 :");
        int num= stdIn.nextInt();
        int[] x=new int[num];           //요솟수가 num인 배열

        System.out.println("오름차순으로 입력하세요");
        System.out.printf("x[0]: ");
        x[0]= stdIn.nextInt();

        for (int i = 1; i <num; i++) {
            do {
                System.out.printf("x[" + i + "] :");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);        //바로 앞 요소보다 작으면 다시 입력
        }
            System.out.printf("검색 할 값: ");
            int ky=stdIn.nextInt();

            int idx= Arrays.binarySearch(x,ky);

            if(idx<0){
                System.out.println("그 값의 요소가 없습니다");
            }else
                System.out.println(ky+"은 x["+idx+"]에 있습니다.");

    }
}
