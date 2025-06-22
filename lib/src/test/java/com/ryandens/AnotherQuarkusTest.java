package com.ryandens;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

@QuarkusTest
public class AnotherQuarkusTest {

  @Inject S3Client s3Client;

  @Test
  void foo() {
    log.severe(s3Client.serviceClientConfiguration().endpointOverride().get().toString());
    s3Client.putObject(
        PutObjectRequest.builder().bucket("test-bucket").key("AnotherQuarkusTest").build(),
        RequestBody.fromBytes("Hello".getBytes()));
  }

  private static final Logger log = Logger.getLogger(AnotherQuarkusTest.class.getName());
}
