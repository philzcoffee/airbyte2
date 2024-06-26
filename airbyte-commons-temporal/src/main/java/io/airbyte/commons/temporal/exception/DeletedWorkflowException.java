/*
 * Copyright (c) 2023 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.commons.temporal.exception;

public class DeletedWorkflowException extends Exception {

  public DeletedWorkflowException(final String message) {
    super(message);
  }

}
