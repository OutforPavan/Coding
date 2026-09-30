package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

/**
 * J23 / P2 — Selective reflection and a trusted serialization round trip.
 * Illustrative lab. exportedFields returns only public String fields annotated Exported,
 * in ascending field-name order; do not bypass access checks or expose the secret.
 * trustedRoundTripSummary must serialize and deserialize ONLY the locally created fixture,
 * returning sorted fields id,name,secret. Before implementing it, make the secret field
 * transient so the deserialized secret is null. It is intentionally not transient yet.
 * Do not add an API that accepts untrusted serialized bytes; discuss native serialization
 * risks, explicit data formats, serialVersionUID, and reflection costs/encapsulation.
 */
public final class J23SerializationReflectionLab {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface Exported { }

    public static final class Profile implements Serializable {
        private static final long serialVersionUID = 1L;
        @Exported public final String id;
        @Exported public final String name;
        // TODO: make this field transient as required by the serialization exercise.
        public String secret;
        public Profile(String id, String name, String secret) {
            this.id = id;
            this.name = name;
            this.secret = secret;
        }
    }

    public static Map<String, String> exportedFields(Object fixture) throws ReflectiveOperationException {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static Map<String, String> trustedRoundTripSummary(Profile profile) throws Exception {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        Profile profile = new Profile("u1", "Ada", "test-only-token");
        ExampleRunner.run("J23 annotation-guided reflection", "Profile(u1,Ada,test-only-token)",
                "{id=u1, name=Ada}; secret is excluded", () -> exportedFields(profile));
        ExampleRunner.run("J23 transient data", "trusted local Profile fixture; implement transient contract first",
                "{id=u1, name=Ada, secret=null}", () -> trustedRoundTripSummary(profile));
    }
}
