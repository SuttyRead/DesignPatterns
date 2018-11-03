/**
 * Created by Zigzagger on 01.05.2017.
 */
public class TestSingleton {

    public static TestSingleton instance;

    public static TestSingleton getInstance(){
        if (instance == null){
            instance = new TestSingleton();
        }
        return instance;
    }
    //Обьязательно приватный конструктор!!!
    private TestSingleton(){
    }
    //Метод для примера
    public void print(){
        System.out.println(this);
    }
}
