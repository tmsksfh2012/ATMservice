// 추후 디비 인터페이스와 연결
// 클래스에서 현재 잔액 반환은 필요없는것으로 판단

public class Record {
    // 계좌 종류
    private boolean isDaw;
    // 서비스 번호
    private int serviceNum;
    // 이용한 금액
    private int usedAmount;

    // constructor
    public Record(boolean daw, int num, int amount) {
        isDaw = daw;
        serviceNum = num;
        usedAmount = amount;
    }
    // 계좌 종류 반환
    public boolean getAccountKind() {
        return isDaw;
    }
    // 이용한 서비스 번호 반환
    public int getServiceNum() {
        return serviceNum;
    }
    // 사용된 금액 반환
    public int getUsedAmount() {
        return usedAmount;
    }

}
