/*
 * Copyright (c) 2023 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.persistence.job.factory;

import java.util.UUID;

public interface SyncJobFactory {

  Long create(UUID connectionId);

}
