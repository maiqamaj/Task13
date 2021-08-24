package jo.secondstep.app;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


public class GradesReportTest {
	@Test
	@DisplayName("Calculate Stduent Average ")
	public void calculateStduentAverageTest() throws Exception {
		HashMap<String, Integer> grades = new HashMap<String, Integer>();
		grades.put("Java", 60);
		grades.put("C++", 90);
		grades.put("C#", 75);
		assertEquals(75.0, GradesReport.calculateStduentAverage(grades));
	}

	@Test
	@DisplayName("Not Valid Grade")
	public void NotValidGradeTest() throws Exception {
		HashMap<String, Integer> grades = new HashMap<String, Integer>();
		grades.put("Java", 50);
		grades.put("C++", 30);
		grades.put("C#", 200);

		assertThrows(Exception.class, () -> {
			GradesReport.calculateStduentAverage(grades);
		});

	}

	@Test
	@DisplayName("Empty || No Grades")
	public void NaNAvargeTest() throws Exception {
		HashMap<String, Integer> grades = new HashMap<String, Integer>();
		grades.put("Java", 90);
		grades.put("C++", 50);
		grades.put("C#", 80);
		grades.clear();
		// assertEquals(Float.NaN, GradesReport.calcuateStduentAverage(grades));
		assertThrows(Exception.class, () -> {
			GradesReport.calculateStduentAverage(grades);
		});
	}

	@Test
	@DisplayName("NaN Grade")
	public void NaNGradeTest() {
		HashMap<String, Integer> grades = new HashMap<String, Integer>();
		grades.put("Java", 90);
		grades.put("C++", 50);
		grades.put("C#", null);

		assertThrows(NullPointerException.class, () -> {
			GradesReport.calculateStduentAverage(grades);
		});

	}

	@Test
	@DisplayName("NaN Subject")
	public void NaNSubjectTest() {
		HashMap<String, Integer> grades = new HashMap<String, Integer>();
		grades.put("Java", 90);
		grades.put(null, 30);
		grades.put("C++", 50);

		assertThrows(Exception.class, () -> {
			GradesReport.calculateStduentAverage(grades);
		});

	}
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	public void PerformaneTest() throws Exception {
		HashMap<String, Integer> grades = new HashMap<String, Integer>();
		grades.put("Java", 90);		
		grades.put("C++", 50);
		grades.put("C#", 90);		
		grades.put("Python", 50);
		grades.put("Android", 90);		
		grades.put("C", 50);
     //for (long j=0;j<10000000;j++)
     //{     GradesReport.calculateStduentAverage(grades); }
     GradesReport.calculateStduentAverage(grades);
	}
}
