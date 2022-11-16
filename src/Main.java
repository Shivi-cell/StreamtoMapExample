import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = DataSet.getAll();

        // I want to convert that list into map object then
        // we have to use toMap(keyMapper,valueMapper)
        Map<String, Student> toMap1 = studentList.stream().collect(Collectors.toMap(Student::getName, Function.identity()));
        // or can do like this
        //studentList.stream().collect(Collectors.toMap(Student::getName, fn -> fn));
        System.out.println(toMap1);


        // I want to protect the key clashes in the map
        // then we can use toMap(keyMapper,valueMapper,mergeFunction(BinaryOperator))
        Map<String, Student> toMap2 = studentList.stream().collect(Collectors.toMap(Student::getName, Function.identity(),(a,b)->b));
        System.out.println(toMap2);


        // If I want to specify the type of the map then we can go with
        // toMap(keyMapper,valueMapper,mergeFunction(BinaryOperator),supplier)
        LinkedHashMap<String, Student> toMap3 = studentList.stream().collect(Collectors.toMap(Student::getName, Function.identity(), (a, b) -> a, LinkedHashMap::new));
        System.out.println(toMap3);
    }
}