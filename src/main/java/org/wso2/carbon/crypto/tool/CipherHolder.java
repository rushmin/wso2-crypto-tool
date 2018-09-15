package org.wso2.carbon.crypto.tool;

import com.google.gson.Gson;
import org.apache.axiom.om.util.Base64;

public class CipherHolder {

    private String c;
    private String t = "RSA";
    private String tp;
    private String tpd;

    public CipherHolder() {
    }

    public String getTransformation() {
        return this.t;
    }

    public void setTransformation(String transformation) {
        this.t = transformation;
    }

    public String getCipherText() {
        return this.c;
    }

    public byte[] getCipherBase64Decoded() {
        return Base64.decode(this.c);
    }

    public void setCipherText(String cipher) {
        this.c = cipher;
    }

    public String getThumbPrint() {
        return this.tp;
    }

    public void setThumbPrint(String tp) {
        this.tp = tp;
    }

    public String getThumbprintDigest() {
        return this.tpd;
    }

    public void setThumbprintDigest(String digest) {
        this.tpd = digest;
    }

    public void setCipherBase64Encoded(byte[] cipher) {
        this.c = Base64.encode(cipher);
    }

    public void setThumbPrint(String tp, String digest) {
        this.tp = tp;
        this.tpd = digest;
    }

    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

}
