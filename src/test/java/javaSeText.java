import org.junit.Test;

public class javaSeText {

    @Test
    public void test() {


        try {
            if ("wo".equals("wo")) {
                throw new Exception("我是跑得异常");
            }
            System.out.println("我在异常之外1111111111111111");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("我是最后的");
        }

        System.out.println("我在异常之外2222222222222222");


    }
}
