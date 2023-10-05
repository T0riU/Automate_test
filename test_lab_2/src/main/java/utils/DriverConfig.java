package utils;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:DriverConfig.properties"})
public interface DriverConfig extends Config{
    String url();
    String searchProductUrl();
    String driver();
    String email();
    String password();

}
