import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("홍성훈",33));
        list.add(new Person("홍성충",31));
        list.add(new Person("헤헤헤",43));
        list.add(new Person("가나다",53));
        list.add(new Person("홍가나",23));


        System.out.println(list);
        list.sort((p1,p2)->p1.getName().compareTo(p2.getName()));
        System.out.println(list);
        list.sort((p1,p2)->Integer.compare(p1.getAge(),p2.getAge()));
        System.out.println(list);
    }
}
