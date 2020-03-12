package test;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import java.io.IOException;
import java.security.GeneralSecurityException;

/**
 * author: mmann created: 3/4/20
 */
public class Main {
  public static void main(String[] args) throws GeneralSecurityException, IOException {
    HttpTransport transport = GoogleNetHttpTransport.newTrustedTransport();
    JsonFactory jsonFactory = new JacksonFactory();
    try {
      GoogleCredential credential = GoogleCredential.getApplicationDefault(transport, jsonFactory);
      System.out.printf("success: %s\n", credential.getAccessToken());
    } catch (Exception e) {
      System.err.printf("fail: %s\n", e.getMessage());
    }
  }
}
