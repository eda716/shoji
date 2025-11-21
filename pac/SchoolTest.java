package pac;

import pac.school.WarSoSchool;
import pac.school.student.*;

public class SchoolTest {
    public static void main(String[] args) {
        WarSoSchool school = new WarSoSchool();
        school.addStudent(new WarSoStudent("SAKURA"));
        school.addStudent(new MandalarStudent("kagura"));
        school.artist();
    }
}