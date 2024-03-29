package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/remote.properties",
        "classpath:config/credentials.properties"
})

public interface ProjectConfig extends Config {

    @DefaultValue("https://www.okeydostavka.ru/")
    String baseUrl();
    @DefaultValue("chrome")
    String browser();
    @DefaultValue("1920x1080")
    String browserSize();

    @DefaultValue("121.0")
    default String remoteDriverUrl() {
        return null;
    }
    //String userEmail();
    //String userPassword();
}
