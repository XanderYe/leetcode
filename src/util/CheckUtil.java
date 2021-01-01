package util;

/**
 * @author XanderYe
 * @description:
 * @date 2021/1/1 10:58
 */
public class CheckUtil {
    public static void check(boolean bool) {
        if (!bool) {
            throw new RuntimeException("ERROR");
        }
    }
}
