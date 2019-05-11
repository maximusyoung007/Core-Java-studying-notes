package aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/*
 * 面向切面编程，性能测试
 */
public class Performance {
	public Object testPerformance(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("start log no.2:" + joinPoint.getSignature().getName());
		Object object = joinPoint.proceed();
		System.out.println("end log no.2" + joinPoint.getSignature().getName());
		long endTime = System.currentTimeMillis();
		System.out.println("耗时：" + (endTime - startTime) + "毫秒");
		return object;
	} 
}
