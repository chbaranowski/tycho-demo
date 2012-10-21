package com.seitenbau.demo.tycho.core.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Start");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop");
	}

}
