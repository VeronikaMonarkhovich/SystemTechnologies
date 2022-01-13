package by.st.tests.ui.configs;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/config.properties"
})
public interface AppConfig extends Config {

    String webUrl();
    String remoteUrl();
}
