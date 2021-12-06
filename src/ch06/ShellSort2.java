package ch06;

import java.util.Scanner;

//셸 정렬(버전2, h의 값은 ...,40,13,4,1)
public class ShellSort2 {
    //셸정렬
    static void shellSort(int[] a,int n){
        int h;
        for(h=1;h<n/9;h=h*3+1); //h의 초깃값을 구한다. 1부터 시작해서 값을 3배하고 1을 더하면서 h가 n/9를 넘지않는 가장 큰값을 h에 대입
        for(;h>0;h/=3)
            for(int i=h;i<n;i++){
                int j;
                int tmp=a[i];
                for(j=i-h;j>=0&&a[j]>tmp;j-=h)
                    a[j+h]=a[j];
                a[j+h]=tmp;
            }
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);

        System.out.println("셸정렬 버전2");
        System.out.printf("요솟수");
        int nx= stdIn.nextInt();
        int[] x=new int[nx];

        for(int i=0;i<nx;i++){
            System.out.printf("x["+i+"]:");
            x[i]= stdIn.nextInt();
        }
        shellSort(x,nx);    //배열 x를 셸 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i=0;i<nx;i++){
            System.out.println("x["+i+"]="+x[i]);
        }
    }
}
