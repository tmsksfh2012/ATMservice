import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//ArrayList가 두 개 필요 -> user, record

public class Database{
    private Map<User,Record> dataList = new HashMap<>(); //User, Record 자료형의 Map으로 데이터베이스 구현

    public Database() {
        dataList.put(null, null);
    }
    public void InputData(User user, Record record) {
    	dataList.put(user, record);
    }
    
    public void DView(User user) {
    	List<Entry<User,Record>> keySetList = new ArrayList<Entry<User,Record>>(dataList.entrySet());
    	for(Entry<User, Record> entry : keySetList) {
    		if(entry.getKey() == user) {
    			System.out.printf("회원 정보: %s\n거래 금액:%d\n잔액: %d\n수행 업무: %d\n", entry.getKey().getName(), entry.getValue().getUsedAmount(),
    					entry.getKey().getUserBalance(), entry.getValue().getServiceNum());
    		}
    	}
    }
}
