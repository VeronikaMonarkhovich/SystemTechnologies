package by.st.config;

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
