/**
 * Created by bear6 on 2/11/2018.
 */

public class test {
    private static final test ourInstance = new test();

    public static test getInstance() {
        return ourInstance;
    }

    private test() {
    }
}
