import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   
        /* (1) 아래 문단을 붙여 넣어 입력 => 여러 줄로 된 토큰 존재
           Hello world
           I am a file
           Read me until end-of-file.

        */

        int i = 1;   // (2) 시작 라인 번호 

        while(sc.hasNext()) {   // (3) 토큰 존재시 true
        // 현재는 한 줄씩 살펴보므로 sc.hasNextLine() 도 사용 가능

            System.out.println(i + " " + sc.nextLine());  
            // (4) 라인 번호 + 토큰 한 줄 출력
            // enter 를 기준으로 토큰이 출력되고, 다음 라인으로 넘어간다

            i++; // (5) 다음 라인 번호
        }        
    }
}
