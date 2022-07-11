package ss7_acstract_interface.demo.animal.model;

public abstract class Animal {
    private  int id ;
    private  String name;

    public Animal() {
    }

    public abstract  void run();

    public  void eat (){
        System.out.println("Animal eat ");
    }
    public int getId (){
        return this.id;
    }
    public  void setId(int id){
        this.id=id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

}
