import java.util.ArrayList;
import java.util.List;

public class College implements EducationalUnit {
    private String name;
    private List<EducationalUnit> units = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void addUnit(EducationalUnit unit) {
        units.add(unit);
    }

    @Override
    public void displayDetails() {
        System.out.println("College: " + name);
        for (EducationalUnit unit : units) {
            unit.displayDetails();
        }
    }

    @Override
    public int getStudentCount() {
        int count = 0;
        for (EducationalUnit unit : units) {
            count += unit.getStudentCount();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double totalBudget = 0;
        for (EducationalUnit unit : units) {
            totalBudget += unit.getBudget();
        }
        return totalBudget;
    }
}