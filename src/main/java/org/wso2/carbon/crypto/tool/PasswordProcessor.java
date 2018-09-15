package org.wso2.carbon.crypto.tool;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordProcessor {

    public String getPassword(String filePath, String passwordPattern, int regexGroup) throws Exception{

        try (InputStream fileInputStream = new FileInputStream(new File(filePath))) {

            String fileContent = IOUtils.toString(fileInputStream, "UTF-8");

            Pattern pattern = Pattern.compile(passwordPattern);
            Matcher matcher = pattern.matcher(fileContent);

            String password = null;
            while (matcher.find()) {
                password = matcher.group(regexGroup);
            }

            return password;
        }
    }

    public void replacePassword(String filePath, String passwordPattern, String newPassword) throws Exception{

        try (InputStream fileInputStream = new FileInputStream(new File(filePath))) {

            String fileContent = IOUtils.toString(fileInputStream, "UTF-8");
            Pattern pattern = Pattern.compile(passwordPattern);
            Matcher matcher = pattern.matcher(fileContent);

            while (matcher.find()) {
                fileContent = matcher.replaceFirst("$1" + newPassword + "$2");
            }

            IOUtils.write(fileContent, new FileOutputStream(new File(filePath)), "UTF-8");
        }
    }


}
