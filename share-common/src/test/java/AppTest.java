import org.andot.share.common.utils.ClassConvertUtil;

public class AppTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("ISO打防结合");
        Class user1 = ClassConvertUtil.beanConvert(user, User.class);
    }
}
