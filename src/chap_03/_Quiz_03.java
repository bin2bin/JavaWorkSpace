package chap_03;

// "901231-1234567" 인 경우 901231-1 까지 출력

public class _Quiz_03 {
    public static void main(String[] args) {

        String no = "950218-1011743"; // 주민등록번호 13자리

        System.out.println(no.substring(0, 8)); // 0 위치부터 8 위치 직전까지 자름

        no = "030708-4567890";

        System.out.println(no.substring(0, no.indexOf("-") + 2)); // 0 위치부터 하이픈 위치 + 2 직전까지

    }
}
