package application.config;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.filter.CorsFilter;

public class TestCorsConfig {

    @Test
    public void GetSettings() {
        CorsConfig corsConfig = new CorsConfig();
        Assert.assertNotNull(corsConfig);

        CorsFilter filter = corsConfig.corsFilter();
        Assert.assertNotNull(filter);
    }
}
