package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * The metadata inventory table configuration returned by the service.
 */
public final class InventoryTableConfigurationResult {
    @JacksonXmlProperty(localName = "ConfigurationState")
    private String configurationState;

    @JacksonXmlProperty(localName = "TableStatus")
    private String tableStatus;

    @JacksonXmlProperty(localName = "TableName")
    private String tableName;

    @JacksonXmlProperty(localName = "TableArn")
    private String tableArn;

    @JacksonXmlProperty(localName = "EncryptionConfiguration")
    private MetadataTableEncryptionConfiguration encryptionConfiguration;

    @JacksonXmlProperty(localName = "Error")
    private MetadataTableError error;

    public InventoryTableConfigurationResult() {
    }

    public String configurationState() {
        return configurationState;
    }

    public String tableStatus() {
        return tableStatus;
    }

    public String tableName() {
        return tableName;
    }

    public String tableArn() {
        return tableArn;
    }

    public MetadataTableEncryptionConfiguration encryptionConfiguration() {
        return encryptionConfiguration;
    }

    public MetadataTableError error() {
        return error;
    }
}
