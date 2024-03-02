package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;

public class Project {

    public static ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());
}