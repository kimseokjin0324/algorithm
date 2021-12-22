package chap08;

public class BMmatch {
//Boyer-Moore법으로 문자열 검색
    static int bmMatch(String txt,String pat){
        int pt;             //txt커서
        int pp;             //pat커서
        int txtlen=txt.length();    //txt문자 개수
        int patlen=pat.length();    //pat의 문자개수
        int[] skip=new int[Character.MAX_VALUE+1];  //건너뛰기 표
    }
}
