package printer;

//creating a generic class(T)
public class Printer<T> {

    //creating a variable of generic type
    T thingtoprint;


    //creationg constructor
    public Printer(T thingtoprint) {
        this.thingtoprint = thingtoprint;
    }


    //creating method to print (thingtoprint)
    public void print() {
        System.out.println(thingtoprint);

    }

}
