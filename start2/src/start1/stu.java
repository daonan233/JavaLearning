package start1;

public class stu {
    private  String name;
    private int age;

    public stu() {
    }

    public stu(String name ,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    @Override
    public String toString() {
        return "stu{" +
                "name='" + name + '\'' +
                '}';
    }//右键->生成->name:String

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        stu stu = (stu) o;

        if (age != stu.age) return false;
        return name != null ? name.equals(stu.name) : stu.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }//右键->生成->equals and hashcode
}
