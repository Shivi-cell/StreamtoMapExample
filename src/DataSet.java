import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DataSet {
    public static List<Student> getAll()
    {
        List<Student> al = new ArrayList<>();

        al.add(new Student("Alisa","947646722",35));
        al.add(new Student("Eric","947646722",23));
        al.add(new Student("Smith","947646722",43));
        al.add(new Student("Watson","947646722",25));
        al.add(new Student("Faf du","947646722",22));
        al.add(new Student("King","947646722",31));
        al.add(new Student("Nehru","947646722",26));
        al.add(new Student("Sachin","947646722",35));
        //al.add(new Student("Sachin","947646722",32));

        return al;
    }
}
