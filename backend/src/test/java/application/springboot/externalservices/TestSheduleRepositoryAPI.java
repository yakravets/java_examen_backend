package application.springboot.externalservices;

import application.springboot.externalservices.SheduleRepositoryAPI;
import org.junit.Assert;
import org.junit.Test;

public class TestSheduleRepositoryAPI {
    @Test
    public void CreateObject() {
        SheduleRepositoryAPI api = new SheduleRepositoryAPI();
        Assert.assertNotNull(api);
    }
}