public class Main {

    public static void main(String[] args) {

        Task a;

//        for (int i=0; i<1000000; i++) {
//            a = foo(String.valueOf(i));
//        }
//        Task t = new Task();
//        t.setTitle("Foo");
//        t = new Task();
//        t.setTitle("Bar");
//
//        System.out.println(t.getTitle());
    }

    public static Task foo(String t) {
        Task task = new Task(t);
        return task;
    }

}
