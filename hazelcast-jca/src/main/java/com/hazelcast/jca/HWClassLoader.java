package com.hazelcast.jca;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Custom Hyperwallet ClassLoader
 */
public class HWClassLoader extends URLClassLoader {

    public HWClassLoader(ClassLoader parent) {
        super(new URL[0], parent);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        // this will give correct class loader i.e EarClassLoader
        return Thread.currentThread().getContextClassLoader().loadClass(name);
    }
}
