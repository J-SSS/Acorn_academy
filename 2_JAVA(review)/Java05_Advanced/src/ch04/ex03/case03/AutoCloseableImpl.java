package ch04.ex03.case03;

public class AutoCloseableImpl implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 해제되었습니다.");
	}
}
