public class Student {
    private String name;
    private String phoneNumber;
    private int age;

    public Student() {
    }

    public Student(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student(" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                ')';
    }
}
