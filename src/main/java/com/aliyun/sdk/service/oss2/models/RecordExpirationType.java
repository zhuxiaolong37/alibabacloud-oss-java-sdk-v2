package com.aliyun.sdk.service.oss2.models;

/**
 * The expiration state of journal table records.
 */
public enum RecordExpirationType {

    ENABLED("ENABLED"),
    DISABLED("DISABLED"),
    UNKNOWN("UNKNOWN");

    /**
     * The actual serialized value for a RecordExpirationType instance.
     */
    private final String value;

    RecordExpirationType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RecordExpirationType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RecordExpirationType object, or UNKNOWN if unable to parse.
     */
    public static RecordExpirationType fromString(String value) {
        if (value == null) {
            return UNKNOWN;
        }
        RecordExpirationType[] items = RecordExpirationType.values();
        for (RecordExpirationType item : items) {
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
