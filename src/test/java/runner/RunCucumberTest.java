package runner;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@IncludeTags("smoke")
@SelectClasspathResource("features")
@ConfigurationParameters({@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepDefs")
        , @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")})
public class RunCucumberTest {
}
