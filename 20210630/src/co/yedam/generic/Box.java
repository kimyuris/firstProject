package co.yedam.generic;

public class Box<T> { //<T> 적어놓고 다음에 바꾸면됨. 
	// 어떤클래스인지 몰라서 임의로 필드를 지정해놓은것.BoxExample(사용 클래스)에서 정의해서 사용가능.
	private T obj; // 모든 유형의 클래스들을 사용 할 수 있음

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}
