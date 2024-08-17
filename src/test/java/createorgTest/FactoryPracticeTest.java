package createorgTest;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryPracticeTest {
	String name;
	public FactoryPracticeTest(String name) {
		this.name=name;
		
	}
	@Test
	public void sample() {
		System.out.println("sampleTest "+name);
	}
	@Factory
	public Object[] getFactory() {
		Object obj[]= {new FactoryPracticeTest("a"),
				new FactoryPracticeTest("b"),new FactoryPracticeTest("c"),new FactoryPracticeTest("d")};
		return obj;
		}
	}


