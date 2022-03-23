import java.util.ArrayList;
import java.util.List;

class Employee {
    protected long employeeId;
    protected String firstName;
    protected String lastName;

    Employee() {
    }

    Employee(long employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    boolean isEqual(Employee e1, Employee e2) {
        if (e1 == null || e2 == null)
            return false;
        if ((!(e1 instanceof Employee)) || (!(e2 instanceof Employee)))
            return false;
        return e1.hashCode() == e2.hashCode();
    }

    int compareTo(Employee e1, Employee e2) {
        if (e1.employeeId == e2.employeeId) {
            return 0;
        } else if (e1.employeeId < e2.employeeId) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

}

public class ArrayListEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        Employee e = new Employee();
        employees.add(new Employee(7, "Sruthi", "Boddu"));
        employees.add(new Employee(2, "Indu", "Malladi"));
        // employees.add(new Employee(1, "Sruthi", "Boddu"));
        employees.add(new Employee(9, "Shravani", "Rathod"));
        employees.forEach(System.out::println);
        System.out.println(e.isEqual(employees.get(0), employees.get(0)));
        // System.out.println(e.isEqual(employees.get(0), employees.get(2)));
        System.out.println(e.compareTo(employees.get(0), employees.get(0)));
        System.out.println(e.compareTo(employees.get(1), employees.get(0)));
        System.out.println(e.compareTo(employees.get(0), employees.get(1)));
        int[] arr = new int[3];
        for (int i = 0; i < employees.size(); i++) {
            arr[i] = (int) employees.get(i).employeeId;
            System.out.println(arr[i]);
        }
        int temp = 0;
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < employees.size() - 1; j++) {
                if (e.compareTo(employees.get(j), employees.get(0)) == 1) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            arr[i] = (int) employees.get(i).employeeId;
            System.out.println(arr[i]);
        }
    }
}
