// 정기예금 ui

import java.util.ArrayList;
import java.util.Scanner;

public class TdUI {
    public static void main(String[] args) {
        // 정기예금 계좌, 비밀번호 1111, 300000원을 보유하고 있는 테스트 계좌 생성
        User user = new User(false, "박현빈", 1111, 300000);
        Account account = new Account(user.getUserBalance());
        // 기록
        ArrayList<Record> transaction = new ArrayList<Record>();

        // initial state
        System.out.printf("%s님 안녕하세요\n", user.getName());
        // 입금금액
        int amount;
        // 비밀번호
        int pwd;

        Scanner input = new Scanner(System.in);

        // 입금 화면
        System.out.printf("\n<----입금---->");
        System.out.printf("\n입금 금액을 입력해주세요: ");
        amount = input.nextInt();
        // !입금 화면

        // 비밀번호 확인
        System.out.printf("\n비밀번호를 입력해주세요: ");
        pwd = input.nextInt();

        // 비밀번호 불일치
        if (pwd != user.getPwd()) {
            System.out.println("비밀번호 불일치");
            System.out.printf("비밀번호를 다시 입력해주세요: ");
            pwd = input.nextInt();
        }
        // !비밀번호 불일치

        // 비밀번호 일치
        else {
            // 입금 수행
            System.out.printf("%d원을 정기예금 계좌에 입금합니다. \n\n", amount);
            account.deposit(amount);
            // !입금 수행

            // 기록
            Record record = new Record(false, 1, amount);
            transaction.add(record);
            // !기록

        }
    }
}

