package io.github.josealmir.designpatterns.structural.decorator;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncryptionDecorator extends DatasourceDecorator {
    public EncryptionDecorator(Datasource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        String encryptedData = encrypt(data);
        wrappee.writeData(encryptedData);
    }

    @Override
    public String readData() {
        return decrypt(wrappee.readData());
    }

    private String encrypt(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes(StandardCharsets.UTF_8));
    }

    private String decrypt(String data) {
        return new String(Base64.getDecoder().decode(data), StandardCharsets.UTF_8);
    }
}
