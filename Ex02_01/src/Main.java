import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   
        /* (1) �Ʒ� ������ �ٿ� �־� �Է� => ���� �ٷ� �� ��ū ����
           Hello world
           I am a file
           Read me until end-of-file.

        */

        int i = 1;   // (2) ���� ���� ��ȣ 

        while(sc.hasNext()) {   // (3) ��ū ����� true
        // ����� �� �پ� ���캸�Ƿ� sc.hasNextLine() �� ��� ����

            System.out.println(i + " " + sc.nextLine());  
            // (4) ���� ��ȣ + ��ū �� �� ���
            // enter �� �������� ��ū�� ��µǰ�, ���� �������� �Ѿ��

            i++; // (5) ���� ���� ��ȣ
        }        
    }
}
