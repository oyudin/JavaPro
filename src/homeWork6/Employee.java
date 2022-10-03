package homeWork6;

public class Employee {
    private String fName;
    private String mName;
    private String lName;
    private String position;
    private String email;
    private String phone;
    private int age;

    public Employee(String fName, String mName, String lName, String position, String email, String phone, int age) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getfName() {
        return this.fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return this.mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return this.lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", mName='" + mName + '\'' +
                ", lName='" + lName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
