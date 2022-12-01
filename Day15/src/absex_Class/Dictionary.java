package absex_Class;

public class Dictionary extends PairMap {

	protected int cnt = 0;
	// 현재 저장된 항목의 개수

	public Dictionary(int Capacity) {
		keyArray = new String[Capacity];
		valueArray = new String[Capacity];

	}

	@Override
	String get(String key) {
		// 현재 배열에 저장된 원소의 개수만큼 반복하면 됨
		for (int i = 0; i < cnt; i++) {
			if (keyArray[i].equals(key))
				return valueArray[i];
		}
		return null; // key값이 없을 떄 null을 리턴함.
	}

	@Override
	void put(String key, String value) {
		// 현재 배열에 저장된 개수만큼 반복한다.
		int i = 0;
		for (i = 0; i < cnt; i++) {
			if (keyArray[i].equals(key)) { 
				break;
			}
		}
		if (i == cnt) {// 키값을 찾지 못했을 경우
			if (i < keyArray.length) {// 배열이 차지 않았을 경우 저장함. 그리고 cnt증가
				keyArray[i] = key;
				valueArray[i] = value;
				cnt++;
			}
		} else {// 키값을 발견했으나 값이 수정된 경우이므로 cnt는 증가하지 않음.(=덮어쓰기)
			keyArray[i] = key;
			valueArray[i] = value;
		}
	}

	@Override
	String delete(String key) {
		int i = 0;
		for (i = 0; i < cnt; i++) {
			if (keyArray[i].equals(key)) {
				break;
			}
		}
		if (i == cnt) // 발견이 안되었을 경우
			return null;

		String value = valueArray[i]; 
		int last = cnt-1; // 앞의 자리로 이동한다(즉, 감소)
		
		for(int j =0; j<last;j++) {
			keyArray[j] = keyArray[j+1];
			valueArray[j] = valueArray[j+1];
		}
		cnt--;
		return value;
	}

	@Override
	int length() {
		// TODO Auto-generated method stub
		return cnt;
	}

}
