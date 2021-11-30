package ch06;

import java.util.Scanner;

public class BubbleSort {
    //a[idx1] a[idx2]의 값을 변경
    static void swap(int[] a,int idx1, int idx2){
        int t=a[idx1];
        a[idx1]=a[idx2];
        a[idx2]=t;
    }

    //버블 정렬(V2)
    static void bubbleSort(int[] a,int n){
        for(int i=0;i<n-1;i++){
            int exchg=0;            // 패스의 교환 횟수를 기록한다.
            for(int j=n-1;j>i;j--)
                if(a[j-1]>a[j]){
                    swap(a,j-1,j);
                    exchg++;
                }
            if(exchg==0) break;     //교환이 이뤄지지 않으면 종료

        }

    }

    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.printf("요숫수 :");
        int nx= stdIn.nextInt();
        int[] x=new int[nx];

        for(int i=0;i<nx;i++){
            System.out.printf("x["+i+"] :");
            x[i]= stdIn.nextInt();
        }
        bubbleSort(x,nx);       //배열 x를 버블 정렬한다.
        System.out.println("오름차순으로 정렬 했습니다.");
        for(int i=0;i<nx;i++){
            System.out.println("x["+i+"] ="+x[i]);
        }
    }
}