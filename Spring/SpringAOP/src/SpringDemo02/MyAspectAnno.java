package SpringDemo02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/*
 * 注解的切面类
 */
@Aspect
public class MyAspectAnno {
	//前置通知
	@Before(value="MyAspectAnno.pointCut4()")
	public void before() {
		System.out.println("前置增强2");
	}
	//后置通知
	@AfterReturning(value="MyAspectAnno.pointCut2()",returning="result")
	public void afterReturn(Object result) {
		System.out.println("后置增强2" + result);
	}
	//环绕通知
	@Around(value="MyAspectAnno.pointCut3()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("环绕前通知");
		Object obj = joinPoint.proceed();
		System.out.println("环绕后通知");
		return obj;
	}
	//异常通知
	@AfterThrowing(value="MyAspectAnno.pointCut1()",throwing="ex")
	public void throwException(Throwable ex) {
		System.out.println("异常抛出" + ex.getMessage());
	}
	//最终异常
	@After(value="MyAspectAnno.pointCut1()")
	public void after() {
		System.out.println("最终异常");
	}
	//切入点注解
	@Pointcut(value="execution(* SpringDemo02.OrderDao.find(..))")
	private void pointCut1() {}
	@Pointcut(value="execution(* SpringDemo02.OrderDao.delete(..))")
	private void pointCut2() {}
	@Pointcut(value="execution(* SpringDemo02.OrderDao.update(..))")
	private void pointCut3() {}
	@Pointcut(value="execution(* SpringDemo02.OrderDao.save(..))")
	private void pointCut4() {}
}
