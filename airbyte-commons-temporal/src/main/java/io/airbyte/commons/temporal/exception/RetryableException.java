/*
 * Copyright (c) 2023 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.commons.temporal.exception;

public class RetryableException extends RuntimeException {

  public RetryableException(final Exception e) {
    super(e);
  }

}
