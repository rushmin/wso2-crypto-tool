package org.wso2.carbon.crypto.tool;

public class CryptoContext {

    private String keyStorePath;
    private String keyStoreType;
    private String keyAlias;
    private String keyStorePassword;
    private String algorithm;

    public void setKeyStorePath(String keyStorePath) {

        this.keyStorePath = keyStorePath;
    }

    public String getKeyStorePath() {

        return keyStorePath;
    }

    public void setKeyStoreType(String keyStoreType) {

        this.keyStoreType = keyStoreType;
    }

    public String getKeyStoreType() {

        return keyStoreType;
    }

    public void setKeyAlias(String keyAlias) {

        this.keyAlias = keyAlias;
    }

    public String getKeyAlias() {

        return keyAlias;
    }

    public void setKeyStorePassword(String keyStorePassword) {

        this.keyStorePassword = keyStorePassword;
    }

    public String getKeyStorePassword() {

        return keyStorePassword;
    }

    public void setAlgorithm(String algorithm) {

        this.algorithm = algorithm;
    }

    public String getAlgorithm() {

        return algorithm;
    }

    @Override
    public String toString() {

        return "CryptoContext{" +
                "keyStorePath='" + keyStorePath + '\'' +
                ", keyStoreType='" + keyStoreType + '\'' +
                ", keyAlias='" + keyAlias + '\'' +
                ", keyStorePassword='" + keyStorePassword + '\'' +
                ", algorithm='" + algorithm + '\'' +
                '}';
    }
}
