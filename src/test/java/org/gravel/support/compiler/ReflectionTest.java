package org.gravel.support.compiler;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.gravel.core.Symbol;
import org.gravel.support.compiler.testtools.ClassBuilder;
import org.gravel.support.jvm.runtime.ImageBootstrapper;
import org.junit.Before;
import org.junit.Test;

public class ReflectionTest {
	@Before
	public void setUp() {
		ImageBootstrapper.bootstrap();
	}
	@Test
	public void testReflect() throws InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		Class classA = new ClassBuilder("ClassA_testReflect")
				.method("reflect: anObject" +
						"	^Reflection reflect: anObject")
				.method("className: anObject" +
						"	^(self reflect: anObject) classMirror name")
				.method("metaclassName: anObject" +
						"	^(self reflect: anObject) classMirror meta name")
				.build();

		Object classAObj = classA.newInstance();
		Method className_ = classAObj.getClass().getMethod("className_", Object.class);
		Object result = className_.invoke(classAObj, new Object());
		assertEquals(Symbol.value("Object"), result);
		Method metaclassName_ = classAObj.getClass().getMethod("metaclassName_", Object.class);
		result = metaclassName_.invoke(classAObj, new Object());
		assertEquals("Object class", result);
	}


}