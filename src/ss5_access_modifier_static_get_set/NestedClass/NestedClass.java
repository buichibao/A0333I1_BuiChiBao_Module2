package ss5_access_modifier_static_get_set.NestedClass;

public class NestedClass {
    private int nonStactic;

    class InnerClass {
        public InnerClass() {
            System.out.println("Constructor inner class");
        }
    }

    private static boolean isStatic;

    static class StaticNestedClass{
        public StaticNestedClass() {
            System.out.println("Contructor Static Nested Class");
        }
    }

    public static void main(String[] args) {
        //khởi tạo đối tượng mới sử dụng được
        NestedClass nestedClass = new NestedClass();
        nestedClass.nonStactic=10;
        InnerClass innerClass =  nestedClass.new InnerClass();

        //Không cần khởi tạo đối tượng
        isStatic = true;
        StaticNestedClass staticNestedClass = new StaticNestedClass();

    }
}
