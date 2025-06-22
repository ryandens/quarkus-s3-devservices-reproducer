package com.ryandens;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import java.util.Map;

public class ExampleTestResource implements QuarkusTestResourceLifecycleManager {

  @Override
  public Map<String, String> start() {
    return Map.of("com.ryandens.strategy", "TWO");
  }

  @Override
  public void stop() {}
}
