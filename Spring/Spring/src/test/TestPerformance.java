package test;

import org.junit.Test;

import service.cityService;

public class TestPerformance {
	@Test
	public void test() {
		long start = System.currentTimeMillis();
		new cityService().outputCity();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
