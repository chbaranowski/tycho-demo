package com.seitenbau.demo.tycho.core.internal;

import static org.junit.Assert.*;

import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.equinox.http.jetty.JettyConfigurator;
import org.eclipse.equinox.http.jetty.JettyConstants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.http.HttpService;
import org.osgi.util.tracker.ServiceTracker;

public class ActivatorTest {
	
	@Before
	public void setup() throws Exception {
		Dictionary<String, Object> settings = new Hashtable<String, Object>();
		settings.put(JettyConstants.HTTP_PORT, 8080);
		JettyConfigurator.startServer("test.http.server", settings);
	}
	
	@After
	public void tearDown() throws Exception {
		JettyConfigurator.stopServer("test.http.server");
	}

	@Test
	public void testOSGiContext() throws Exception {
		BundleContext bundleContext = FrameworkUtil.getBundle(getClass()).getBundleContext();
		assertNotNull(bundleContext);
		String symbolicName = bundleContext.getBundle().getSymbolicName();
		assertEquals("com.seitenbau.demo.tycho.core", symbolicName);
	}
	
	@Test
	public void testHttpService() throws Exception {
		BundleContext bundleContext = FrameworkUtil.getBundle(getClass()).getBundleContext();
		ServiceTracker<HttpService, HttpService> httpServiceTracker = new ServiceTracker<HttpService, HttpService>(bundleContext, HttpService.class, null);
		httpServiceTracker.open();
		httpServiceTracker.waitForService(3000);
		HttpService httpService = httpServiceTracker.getService();
		assertNotNull(httpService);
		httpServiceTracker.close();
	}
	
}
