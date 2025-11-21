package pac.school;

import java.util.ArrayList;
import java.util.Iterator;
import pac.school.student.AbstractStudent;

public class Ttc{
    ArrayList<AbstractStudent> classroom = new ArrayList<AbstractStudent>();

    public void addStudent(AbstractStudent student){
        classroom.add(student);
    }

    public void studentprof(){
        Iterator<AbstractStudent> iterator = classroom.iterator();
        while(iterator.hasNext()){
            AbstractStudent student = iterator.next();
            student.profile();
        }
    }
}