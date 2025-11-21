package pac.school;

import java.util.ArrayList;
import java.util.Iterator;
import pac.school.student.AbstractStudent;

public class WarSoSchool{
    ArrayList<AbstractStudent> cage =new ArrayList<AbstractStudent>();

    public void addStudent(AbstractStudent student){
        cage.add(student);
    }

    public void artist(){
        Iterator <AbstractStudent> iterator = cage.iterator();
        while (iterator.hasNext()){
            AbstractStudent student =iterator.next();
            student.art();
        }
    }
}