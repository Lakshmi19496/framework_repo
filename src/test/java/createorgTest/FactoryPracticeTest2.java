package createorgTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryPracticeTest2 {
	String name;
	String age;
	@Factory(dataProvider = "hi")
	public FactoryPracticeTest2(String name,String age) {
		this.name=name;
		this.age=age;
		
	}
	@Test
	public void sample() {
		System.out.println("sampleTest "+name+" "+age);
	}
	@DataProvider(name="hi")
	public static Object[][] getFactory() {
		Object obj[][]= {{"a","12"},
				{"b","23"},{"c","56"},{"d","89"}};
		return obj;
		}

}
