package chap08;

import java.util.Scanner;

public class IndexOfTester {
    //String.indexOf,String.lastIndextOf 메서드로 문자열을 검색한다.
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);

        System.out.printf("텍스트:  ");
        String s1= stdIn.next();

        System.out.printf("패턴: ");
        String s2= stdIn.next();

        int idx1=s1.indexOf(s2);
        int idx2=s1.lastIndexOf(s2);

        if(idx1==-1)
            System.out.println("텍스트 안에 패턴이 없습니다.");
        else{
            //찾아낸 문자열의 바로 앞까지의 문자개수를 구함
            int len1=0;
            for(int i=0;i<idx1;i++)
                len1+=s1.substring(i,i+1).getBytes().length;
            len1+=s2.length();

            int len2=0;
            for(int i=0;i<idx2;i++)
                len2+=s1.substring(i,i+1).getBytes().length;
            len2+=s2.length();

            System.out.println("텍스트: "+s1);
            System.out.printf(String.format("패턴: %%%ds\n",len1),s2);
            System.out.println("텍스트: "+s1);
            System.out.printf(String.format("패턴: %%%ds\n",len2),s2);
        }
    }
}
