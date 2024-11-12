import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

abstract  class  OrganoxationCompapent
{
    public  String Name;
    public double Salary;


    public  abstract  void  Add(OrganoxationCompapent organoxationCompapent);
    public  abstract  void  Remove(OrganoxationCompapent organoxationCompapent);

}

class  Employee extends  OrganoxationCompapent
{

    @Override
    public void Add(OrganoxationCompapent organoxationCompapent) {

    }

    @Override
    public void Remove(OrganoxationCompapent organoxationCompapent) {

    }
}


class  Department extends  OrganoxationCompapent
{

    public List<OrganoxationCompapent> comenents;

    public Department() {
        comenents = new List<OrganoxationCompapent>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<OrganoxationCompapent> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(OrganoxationCompapent organoxationCompapent) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends OrganoxationCompapent> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends OrganoxationCompapent> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public OrganoxationCompapent get(int index) {
                return null;
            }

            @Override
            public OrganoxationCompapent set(int index, OrganoxationCompapent element) {
                return null;
            }

            @Override
            public void add(int index, OrganoxationCompapent element) {

            }

            @Override
            public OrganoxationCompapent remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<OrganoxationCompapent> listIterator() {
                return null;
            }

            @Override
            public ListIterator<OrganoxationCompapent> listIterator(int index) {
                return null;
            }

            @Override
            public List<OrganoxationCompapent> subList(int fromIndex, int toIndex) {
                return List.of();
            }
        };
    }



    @Override
    public void Add(OrganoxationCompapent organoxationCompapent) {
        comenents.add(organoxationCompapent);
    }

    @Override
    public void Remove(OrganoxationCompapent organoxationCompapent) {
        comenents.remove(organoxationCompapent);
    }
}




public class Composite {
    public static void main(String[] args) {
        Department department = new Department();
        department.Name = "RBK bank";

        Department department1 = new Department();
        department.Name = "Account DEpartment";

        Department department2 = new Department();
        department.Name = "Repost";


        Employee employee = new Employee();
        employee.Name = "Employee 1";
        employee.Salary = 1200;

        Employee employee2 = new Employee();
        employee.Name = "Employee 3";
        employee.Salary = 1200;

        Employee employee3 = new Employee();
        employee.Name = "Employee 3";
        employee.Salary = 1200;


        department.Add(employee);
        department1.Add(employee2);
        department2.Add(employee3);







    }
}
