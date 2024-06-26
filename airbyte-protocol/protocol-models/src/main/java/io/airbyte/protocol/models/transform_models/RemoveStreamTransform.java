/*
 * Copyright (c) 2023 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.protocol.models.transform_models;

import io.airbyte.protocol.models.StreamDescriptor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Represents the removal of an {@link io.airbyte.protocol.models.AirbyteStream} to a
 * {@link io.airbyte.protocol.models.AirbyteCatalog}.
 */
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RemoveStreamTransform {

  private final StreamDescriptor streamDescriptor;

  public StreamDescriptor getStreamDescriptor() {
    return streamDescriptor;
  }

}
