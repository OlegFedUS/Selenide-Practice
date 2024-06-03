package runner;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class UtilsBase {

    @BeforeAll
    protected static void browserRes(){

        Configuration.browserSize = "1920x1080";

    }

}
