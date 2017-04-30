package User;

/**
 * Created by Anna on 30.04.2017.
 */
public class UserFactory {

    public  static User getValidUser(){
        return new User("mytest_test", "337774a", "mytest_test.mail.ru");
    }

    public static User getNotValidUser(){
        return new User("mmm", "mmm", "mmm.mail.ru");
    }
}
