package ss7_acstract_interface.demo.person.model;

public interface  Peson {
    //public static final
    int MAX = 2;
    //public abstract
    void run() ;

    default void eat(){
        System.out.println("Person eat()");
    }
    static void drink(){
        System.out.println("Person eat()");
    }

}
