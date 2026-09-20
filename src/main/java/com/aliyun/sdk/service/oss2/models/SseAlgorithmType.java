package com.aliyun.sdk.service.oss2.models;

/**
 * The server-side encryption algorithm of a metadata table.
 */
public enum SseAlgorithmType {

    AES256("AES256"),
    OSS_KMS("oss:kms"),
    UNKNOWN("UNKNOWN");

    /**
     * The actual serialized value for a SseAlgorithmType instance.
     */
    private final String value;

    SseAlgorithmType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SseAlgorithmType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SseAlgorithmType object, or UNKNOWN if unable to parse.
     */
    public static SseAlgorithmType fromString(String value) {
        if (value == null) {
            return UNKNOWN;
        }
        SseAlgorithmType[] items = SseAlgorithmType.values();
        for (SseAlgorithmType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return UNKNOWN;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
