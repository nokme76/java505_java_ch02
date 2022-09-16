import java.util.Scanner;

public class Answer {

    private static Scanner scan;

    public static void main(String[] args){

        scan  = new Scanner(System.in);
//        문제 1) 점수를 입력받아 점수 및 등급을 출력하는 프로그램을 작성하세요
//        조건1) else if 문을 사용하여 작성
//        조건2) 95이상 = A+, 90이상 = A, 85이상 = B+, 80이상 = B, 75이상 = C+, 70이상 = C, 60이상 = D, 60미만 = F
//        조건3) 중첩 if문을 사용하여 각각의 + 대의 점수를 출력

//        System.out.println("점수를 입력하세요.");
//        int point = scan.nextInt();
//
//        if (point >=90){
//            if (point >=95){
//                System.out.println("당신의 점수는 : " + point + "점 이고 등급은 A+ 입니다.");
//            }
//            System.out.println("당신의 점수는 : " + point + "점 이고 등급은 A 입니다.");
//        } else if (point >= 80) {
//            if (point >=85){
//                System.out.println("당신의 점수는 : " + point + "점 이고 등급은 B+ 입니다.");
//            }
//            System.out.println("당신의 점수는 : " + point + "점 이고 등급은 B 입니다.");
//        } else if (point >= 70) {
//            if (point >=75){
//                System.out.println("당신의 점수는 : " + point + "점 이고 등급은 C+ 입니다.");
//            }
//            System.out.println("당신의 점수는 : " + point + "점 이고 등급은 C 입니다.");
//        } else if (point >= 60) {
//            System.out.println("당신의 점수는 : " + point + "점 이고 등급은 D 입니다.");
//            }
//            else {
//                System.out.println("당신의 점수는 : " + point + "점 이고 등급은 F 입니다.");
//        }


//        if (point >=60) {
//            if (point >= 95) {
//                System.out.println("당신의 점수는 : " + point + "점 이고 등급은 A+ 입니다.");
//                if (point >= 90) {
//                    System.out.println("당신의 점수는 : " + point + "점 이고 등급은 A 입니다.");
//                }
//                if (point >= 85) {
//                    System.out.println("당신의 점수는 : " + point + "점 이고 등급은 B+ 입니다.");
//                }
//                if (point >= 80) {
//                    System.out.println("당신의 점수는 : " + point + "점 이고 등급은 B 입니다.");
//                }
//                if (point >= 75) {
//                    System.out.println("당신의 점수는 : " + point + "점 이고 등급은 C+ 입니다.");
//                }
//                if (point >= 70) {
//                    System.out.println("당신의 점수는 : " + point + "점 이고 등급은 C+ 입니다.");
//
//                } System.out.println("당신의 점수는 : " + point + "점 이고 등급은 D 입니다.");
//            }else {
//                System.out.println("당신의 점수는 : " + point + "점 이고 등급은 F 입니다.");
//            }
//
//        }
        System.out.print("돈의 액수를 입력하세요>>");
        int money = scan.nextInt();
        int oman = money/50000; //원금 나누기 50000 으로 5만원권의 갯수 확인
        int man = (money%50000)/10000; // 원금을 50000으로 나눈 나머지를 10000으로 나눠서 만원권 확인
        int chun = (money%10000)/1000; // 원금을 10000으로 나눈 나머지를 1000으로 나눠서 천원권 확인
        int obek = (money%1000)/500; // 원금을 1000으로 나눈 나머지를 500으로 나눠서 오백원 확인
        int bek = (money%500)/100; // 원금을 500으로 나눈 나머지를 100으로 나눠서 100원 확인
        int twon = (money%100)/10; // 원금을 100으로 나눈 나머지를 10으로 나눠서 10원 확인
        int won = (money%10)/1; // 원금을 10으로 나눈 나머지를 1로 나눠 1원확인

        System.out.println("오만원"+oman+"개");
        System.out.println("만원"+man+"개");
        System.out.println("천원"+chun+"개");
        System.out.println("500원"+obek+"개");
        System.out.println("10원"+twon+"개");
        System.out.println("1원"+won+"개");

        System.out.println("학점을 입력하세요");
        String grade = scan.next();

        switch (grade){
            case "A" :
            case "B" :
                System.out.println("Excellent");
                break;

            case "C":
            case "D":
                System.out.println("Good");
                break;

            case "F" :
                System.out.println("Bye");
                break;
        }

        System.out.print("1~99 사이의 정수를 입력하세요>>");
        int num = scan.nextInt();
        int first= num/10;
        int second = num%10;

        if (first % 3==0){
            if (second % 3 ==0) {
                System.out.println("박수짝짝");
            }else{
                System.out.println("박수짝");
            }
        } else if (second % 3 ==0) {
            System.out.println("박수짝");
        }
        else{
            System.out.println("박수없음");
        }

//        선생님 정답
        int count = 0;
//        카운트가 1 이면 3의배수의 숫자가 하나만 있는것 2면 2개가 있는것이라 더 깔끔한 코드가 나온다
        if (first % 3 == 0){
            count++;
//            count += 1;
//            count = count +1;
        }
        if(second % 3 == 0){
            count++;
        }
        if(count == 1){
            System.out.println("박수짝");
        } else if (count == 2) {
            System.out.println("박수 짝짝");
        }
        else{
            System.out.println("박수없음");
        }

        if((first % 3 ==0) && (second % 3 == 0)){
            System.out.println("박수 짝짝");
        } else if((first % 3 ==0) ^ (second % 3 == 0)) {
            System.out.println("박수 짝");
        }else {
            System.out.println("박수없음");
        }


//        System.out.print("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
//        String p1 = scan.next();
//        String p1r = scan.next();
//        String p2 = scan.next();
//        String p2r = scan.next();
//
//        String 가위 ;
//        String 바위 ;
//        String 보 ;
//
//       if ()


    }
}
