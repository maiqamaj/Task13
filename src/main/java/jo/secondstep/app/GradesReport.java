package jo.secondstep.app;

import java.util.HashMap;

public class GradesReport {
	private static final int MAX_GRADE = 100;
	private static final int MIN_GRADE = 35;

	// throws Exception
	public static float calcuateStduentAverage(HashMap<String, Integer> grades) throws Exception {
		float sum = 0;
		if (!grades.isEmpty()) {
			for (String grade : grades.keySet()) {
				if (grade != null) {
					if (grades.get(grade) <= MAX_GRADE && grades.get(grade) >= MIN_GRADE) {
						if (grades.get(grade) != null)
							sum += grades.get(grade);
						else
							throw new NullPointerException();
					} else
						throw new Exception("Not Valid Grade");

				} else
					throw new Exception("Not Valid Subject");
			}

			return sum / (float) grades.size();
		}

		else
			throw new Exception("Empty Grades");

	}
}