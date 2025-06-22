package com.ryandens;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

@QuarkusTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
final class ExampleServiceQuarkusTest {

  @Inject S3Client s3Client;

  @Test
  void name() {
    s3Client.putObject(
        PutObjectRequest.builder().bucket("test-bucket").key("ExampleServiceQuarkusTest").build(),
        RequestBody.fromBytes("Hello".getBytes()));
  }
}
