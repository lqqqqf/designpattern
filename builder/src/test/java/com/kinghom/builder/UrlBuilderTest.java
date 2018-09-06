package com.kinghom.builder;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UrlBuilderTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void should_throw_exception_protocol_null() throws BuildException {
        UrlBuilder urlBuilder = new UrlBuilder();
        expectedException.expect(BuildException.class);
        expectedException.expectMessage("protocol为空");
        urlBuilder.build();
    }

    @Test
    public void should_throw_exception_host_null() throws BuildException {
        UrlBuilder urlBuilder = new UrlBuilder();
        urlBuilder.protocol(UrlBuilder.Protocol.http);
        expectedException.expect(BuildException.class);
        expectedException.expectMessage("host为空");
        urlBuilder.build();
    }

    @Test
    public void testBuild() throws BuildException {
        UrlBuilder urlBuilder = new UrlBuilder();
        String url = urlBuilder.protocol(UrlBuilder.Protocol.http).host("www.baidu.com").build();
        Assert.assertEquals("http://www.baidu.com", url);
        urlBuilder.param("i", "24");
        Assert.assertEquals("http://www.baidu.com?i=24", urlBuilder.build());
        urlBuilder.path("/education").param("j", "30");
        Assert.assertEquals("http://www.baidu.com/education?i=24&j=30", urlBuilder.build());
    }
}
