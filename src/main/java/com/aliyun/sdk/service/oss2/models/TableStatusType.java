package com.aliyun.sdk.service.oss2.models;

/**
 * The creation state of a metadata table.
 */
public enum TableStatusType {

    CREATING("CREATING"),
    BACKFILLING("BACKFILLING"),
    ACTIVE("ACTIVE"),
    FAILED("FAILED"),
    UNKNOWN("UNKNOWN");

    /**
     * The actual serialized value for a TableStatusType instance.
     */
    private final String value;

    TableStatusType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TableStatusType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TableStatusType object, or UNKNOWN if unable to parse.
     */
    public static TableStatusType fromString(String value) {
        if (value == null) {
            return UNKNOWN;
        }
        TableStatusType[] items = TableStatusType.values();
        for (TableStatusType item : items) {
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
