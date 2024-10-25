package Int;

import java.util.HashMap;
import java.util.Map;

public class HighestAverageMarks {
    public static void main(String[] args) {
        String[][] studentMarks = {
                {"Charles", "84"},
                {"John", "100"},
                {"Andy", "37"},
                {"John", "23"},
                {"Charles", "20"}
        };

        System.out.println("Highest Average Marks: " + getHighestAverageMarks(studentMarks));
    }

    public static double getHighestAverageMarks(String[][] studentMarks) {
        Map<String, int[]> studentData = new HashMap<>();

        for (String[] entry : studentMarks) {
            String name = entry[0];
            int mark = Integer.parseInt(entry[1]);

            if (!studentData.containsKey(name)) {
                studentData.put(name, new int[]{0, 0}); // {totalMarks, count}
            }

            studentData.get(name)[0] += mark;
            studentData.get(name)[1] += 1;
        }

        double highestAverage = Double.NEGATIVE_INFINITY;
        String topStudent = "";

        for (Map.Entry<String, int[]> entry : studentData.entrySet()) {
            String name = entry.getKey();
            int[] data = entry.getValue();
            double average = (double) data[0] / data[1];

            if (average > highestAverage) {
                highestAverage = average;
                topStudent = name;
            }
        }

        System.out.println("Top Student: " + topStudent);
        return highestAverage;
    }
}
