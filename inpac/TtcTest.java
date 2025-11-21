package pac;

import pac.school.Ttc;
import pac.school.student.*;

public class TtcTest{

    public static void main(String[] args){
        Ttc ttc = new Ttc();

        ttc.addStudent(new Hayashi("林 佑真"));
        ttc.addStudent(new Ichikawa("市川 大翔"));
        ttc.addStudent(new Koshigumo("越雲 秀人"));

        ttc.studentprof();
    }
}