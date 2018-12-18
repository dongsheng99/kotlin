// TARGET_BACKEND: JVM
// IGNORE_BACKEND: JVM_IR

// FILE: J.java
public abstract class J implements I<String> {
    public String foo(String x) { return x; }
}

// FILE: main.kt

interface I<T> {
    fun foo(x: T): T = throw RuntimeException("fail 1")
}

class K : J()

fun box(): String {
    return K().foo("OK")
}

