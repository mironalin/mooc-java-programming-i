import java.util.Scanner;

public class UserInterface {
    private PointTotals pointTotals;
    private Scanner scanner;

    public UserInterface(PointTotals pointTotals, Scanner scanner) {
        this.pointTotals = pointTotals;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int points = Integer.valueOf(scanner.nextLine());

            if (points == -1) {
                pointTotals.printAverageAll();
                pointTotals.printAveragePassing();
                pointTotals.printPassPercentage();
                pointTotals.createGradeDistribution();
                pointTotals.printGradeDistribution();
                break;
            }

            pointTotals.addPoint(points);

        }
    }
}
