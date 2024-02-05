package ch09.resolve14.question01;

public class InkJetPrinter extends Printer {
	protected int inkRemainders;

	public InkJetPrinter(String modelName, String manufacturer, P_INTERFACE pInterface, int printCount,
			int paperRemain, int inkRemainders) {
		super(modelName, manufacturer, pInterface, printCount, paperRemain);
		this.inkRemainders = inkRemainders;
	}

	@Override
	public void print() {
		super.print(); // paperRemainder가 한장씩 줄어드는 메소드
		this.printCount++;
		this.inkRemainders--;
		System.out.println("잉크가 잘 분사되어 출력된다");
		System.out.println("품질이 양호하다");
	}

	@Override
	public String toString() {
		// 부모가 물려준 것과 자식이 가지고 있는 것을 동시에 보여줌
		return "InkJetPrinter [inkRemainders=" + inkRemainders + ", modelName=" + modelName + ", manufacturer="
				+ manufacturer + ", pInterface=" + pInterface + ", printCount=" + printCount + ", paperRemain="
				+ paperRemain + "]";
	}
	
}
