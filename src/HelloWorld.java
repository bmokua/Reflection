import java.lang.reflect.Field;

public class HelloWorld {

    // annotations do nothing by themselves. they just markup your code
    Default;
    public static String greeting;

    public static void main(String[] args){

        setUp();
        System.out.println(greeting);
    }

    public static void setUp(){
        try {
            Field field = HelloWorld.class.getField("greeting");
            field.set(null, "Hello with a basic greeting");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
