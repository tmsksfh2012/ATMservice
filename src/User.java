// 유저 정보
// 계좌 정보는 삭제함

import java.util.ArrayList;

public class User {
    // 입출금 계좌인지 (0 => 입출금, 1 => 정기예금)
    private boolean isDaw;
    // 비밀번호
    private int password;
    // 유저 잔액
    private int userBalance;
    // 유저 이름
    private String name;
    // 유저 리스트
    private ArrayList<User> userList = new ArrayList<User>();

    // constructor
    public User(boolean daw, String uName, int userPassword, int balance) {
        isDaw = daw;
        password = userPassword;
        userBalance = balance;
        name = uName;
    }

    // 잔액 반환
    public int getUserBalance() {
        return userBalance;
    }
    // 비밀번호 반환
    public int getPwd() {
        return password;
    }
    // 계좌 종류 반환
    public boolean kindOfAccount() {
        return isDaw;
    }
    // 이름 반환
    public String getName() {
        return name;
    }

    // 유저 리스트 생성
    public void setUserList(User user) {
        userList.add(user);
    }


}
