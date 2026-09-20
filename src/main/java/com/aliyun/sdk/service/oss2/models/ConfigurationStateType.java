package com.aliyun.sdk.service.oss2.models;

/**
 * The state of the inventory metadata table.
 */
public enum ConfigurationStateType {

    ENABLED("ENABLED"),
    DISABLED("DISABLED"),
    UNKNOWN("UNKNOWN");

    /**
     * The actual serialized value for a ConfigurationStateType instance.
     */
    private final String value;

    ConfigurationStateType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ConfigurationStateType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ConfigurationStateType object, or UNKNOWN if unable to parse.
     */
    public static ConfigurationStateType fromString(String value) {
        if (value == null) {
            return UNKNOWN;
        }
        ConfigurationStateType[] items = ConfigurationStateType.values();
        for (ConfigurationStateType item : items) {
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
