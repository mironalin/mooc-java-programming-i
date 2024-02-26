import java.util.ArrayList;

public class PointTotals {
    private ArrayList<Integer> points;
    private int[] gradeArray;

    public PointTotals() {
        points = new ArrayList<>();
        gradeArray = new int[]{0, 0, 0, 0, 0, 0};
    };
 
    public void addPoint(int point) {
        if (point >= 0 && point <= 100) {
            points.add(point);
        }
    } 

    public int getAll() {
        return points.size();
    }

    public int getPassing() {
        int count = 0;
        for (int i = 0; i < points.size(); i++) {
            if (points.get(i) >= 50) {
                count++;
            }
        }

        return count;
    }

    public double getAverageAll() {
        int sum = 0;
        for (int i = 0 ; i < points.size(); i++) {
            sum = sum + points.get(i);
        }
        
        return (1.0 * sum) / points.size();
    }

    public double getAveragePassing() {
        int sum = 0;
        int passingSize = 0;
        for (int i = 0; i < points.size(); i++) {
            if (points.get(i) >= 50) {
                sum = sum + points.get(i);
                ++passingSize;
            }
        }
        if (sum == 0) {
            return 0;
        } else {
            return (1.0 * sum) / passingSize;
        }
    }

    public double getPassPercentage() {
        if (getPassing() == 0) {
            return 0;
        } else {
            return 100.0 * getPassing() / getAll();
        }
    }

    public int gradeConvert(int point) {
        if(point < 50) {
            return 0;
        } else if (point < 60) {
            return 1;
        } else if (point < 70) {
            return 2;
        } else if (point < 80) {
            return 3;
        } else if (point < 90) {
            return 4;
        } else {
            return 5;
        }
    }

    public void printAverageAll() {

        System.out.println("Point average (all): " + getAverageAll());
    }

    public void printAveragePassing() {
        if (getAveragePassing() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + getAveragePassing());
        }
    }

    public void printPassPercentage() {
            System.out.println("Pass percentage: " + getPassPercentage());
    }

    public void createGradeDistribution() {
        for (int i = 0 ; i < points.size(); i++) {
            int grade = gradeConvert(points.get(i));
            gradeArray[grade]++;
        }
    }

    public void printGrade(int grade) {
        System.out.print(grade + ": ");
        for (int i = 0; i < gradeArray[grade]; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            printGrade(i);
        }
    }
}
