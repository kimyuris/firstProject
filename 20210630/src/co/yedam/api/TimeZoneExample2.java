package co.yedam.api;

import java.text.DecimalFormat;

public class TimeZoneExample2 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.###");
		df = new DecimalFormat("0000000000.000"); // 남은자리는 0으로 채워두겠다는 뜻
		df = new DecimalFormat("##########.###"); // 남은자리는 비워두겠다는 뜻

		double num = 123456.789;

		System.out.println(df.format(num));
	}
}
