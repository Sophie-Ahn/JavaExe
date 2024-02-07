package ch12.object01.ch12.sec03.exam01;

// java의 모든 클래스는 object가 된다
public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) { //어떠한 클래스든 받을 수 있음
		if(obj instanceof Member target) {
			if(id.equals(target.id)) {
				return true;
			}
		}
		
		return false;
	}
}
