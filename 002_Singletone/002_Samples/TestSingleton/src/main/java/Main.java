/**
 * Created by Zigzagger on 01.05.2017.
 */
public class Main {
    public static void main(String[] args){
        //Обьект создался.
        TestSingleton.getInstance().print();
        //Береться ссылка на обьект, сам же новый обьект не создаеться
        TestSingleton.getInstance().print();
    }
}
