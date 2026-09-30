package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * J18 / P1 — Class identity and loading without requested initialization.
 * Illustrative class-loading lab. loadWithoutInitialization must use the supplied loader
 * and request loading without initialization. loadsShareIdentity loads the same binary name
 * twice through that loader and compares the returned Class objects by identity.
 * isBootstrapLoaded checks whether a successfully loaded class has a null defining loader.
 * Propagate ClassNotFoundException for an absent class. No initializer-order output,
 * vendor loader names or timing is prescribed. Follow-up: build a separate initialization
 * trace and explain load versus initialize, parent delegation and deployment classpaths.
 */
public final class J18ClassLoadingLab {
    public static Class<?> loadWithoutInitialization(String binaryName, ClassLoader loader)
            throws ClassNotFoundException {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static boolean loadsShareIdentity(String binaryName, ClassLoader loader)
            throws ClassNotFoundException {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static boolean isBootstrapLoaded(String binaryName, ClassLoader initiatingLoader)
            throws ClassNotFoundException {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        String name = "java.lang.String";
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        ExampleRunner.run("J18 load by binary name", "java.lang.String through system loader",
                "Class object whose name is java.lang.String", () -> loadWithoutInitialization(name, loader));
        ExampleRunner.run("J18 class identity", "same binary name, same loader, two loads", "true",
                () -> loadsShareIdentity(name, loader));
        ExampleRunner.run("J18 defining versus initiating loader", "java.lang.String initiated by system loader",
                "true; its defining loader is the bootstrap loader", () -> isBootstrapLoaded(name, loader));
    }
}
