import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by LaunchCode
 */
public class TestHelloWorld {a

    @Test
    public void testSayHello() {
        assertEquals("Hello, World!", HelloWorld.sayHello());
    }

}
