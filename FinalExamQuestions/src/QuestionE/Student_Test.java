package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("A", "", "", new Date(), "", "", "", "");
		Student stu3 = new Student("A", "", "", new Date(), "", "", "", "");
		Student stu4 = new Student("A", "", "", new Date(), "", "", "", "");
		Student stu5 = new Student("A", "", "", new Date(), "", "", "", "");
		
		HashMap hm = new HashMap();
		hm.add(stu1);
		hm.add(stu2);
		hm.add(stu3);
		hm.add(stu4);
		hm.add(stu5);
		
		AssertEquals(hm.size(), 5);
	}

}
