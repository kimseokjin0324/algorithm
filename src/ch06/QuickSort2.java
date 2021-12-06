package ch06;

//퀵정렬

import intStack.IntStack;

import java.util.Scanner;

public class QuickSort2 {
    //배열 요소 a[idx1]과 a[idx2]의 값을 바꾼다
    static void swap(int[] a,int idx1,int idx2){
        int t=a[idx1]; a[idx1]=a[idx2]; a[idx2]=t;
    }
    //퀵정렬(비재귀 버전)
    static void quickSort(int[] a,int left,int right){
        IntStack lstack=new IntStack(right-left+1);
        IntStack rstack=new IntStack(right-left+1);

        lstack.push(left);
        rstack.push(right);
        while(lstack.isEmpty()!=true){
            int pl=left=lstack.pop();//왼쪽 커서
            int pr=right=rstack.pop();//오른쪽 커서
            int x=a[(left+right)/2];//피벗
        do{
            while(a[pl]<x)pl++;
            while(a[pr]>x)pr--;
            if(pl<=pr)
                swap(a,pl++,pr--);
        }while (pl<=pr);
        if(left<pr){
            lstack.push(left);//왼쪽 그룹 범위의 인덱스를 푸쉬
            rstack.push(pr);
        }
        if(pl<right){
            lstack.push(pl);    //오른쪽 그룹범위의 인덱스를 푸쉬
            rstack.push(right);
        }
    }
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);

        System.out.println("퀵 정렬");
        System.out.printf("요솟수: ");
        int nx=stdIn.nextInt();
        int[] x=new int[nx];
        for (int i = 0; i < nx; i++) {
            System.out.printf("x["+i+"]:");
            x[i]= stdIn.nextInt();
        }
        quickSort(x,0,nx-1);//배열 x를 퀵정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x["+i+"]="+x[i]);
    }
}
