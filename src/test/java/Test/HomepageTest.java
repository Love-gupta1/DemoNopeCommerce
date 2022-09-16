package Test;

import org.testng.annotations.Test;

import java.io.IOException;

import static Test.BaseClass.pageFactory;

public class HomepageTest {
    @Test
    public void homepageTest() throws InterruptedException, IOException {
        pageFactory.homepage().homepage();
    }
}
