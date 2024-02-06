package ch10.collection01.ch15.sec04.exam1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		// Map컬렉션 셍성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체저장
		map.put("신용권", 85);
		map.put("신용", 90);
		map.put("신용권", 80); // 키가 같기 때문에 제일 마지막에 저장한 값만 저장
		map.put("용권", 58);
		map.put("신", 95);
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		
		// 키로 값얻기
		String key = "신용";
		int value = map.get(key);
		System.out.println(key + ": " + value);
		System.out.println();
		
		// 키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyInterator = keySet.iterator();
		while(keyInterator.hasNext()) {
			String k = keyInterator.next();
			Integer v = map.get(k);
			System.out.println(k + ": " + v);
		}
		System.out.println();
		
		// 엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + ": " + v);
		}
		System.out.println();
		
		// 키로 엔트리 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
	}
}