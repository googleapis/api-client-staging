/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.longrunning;

import static com.google.longrunning.OperationsClient.ListOperationsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.longrunning.stub.OperationsStubSettings;
import com.google.protobuf.Empty;
import java.io.IOException;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/** Settings class to configure an instance of {@link OperationsClient}. */
@Generated("by gapic-generator")
@BetaApi
public class OperationsSettings extends ClientSettings<OperationsSettings> {
  /** Returns the object with the settings used for calls to getOperation. */
  public UnaryCallSettings<GetOperationRequest, Operation> getOperationSettings() {
    return ((OperationsStubSettings) getStubSettings()).getOperationSettings();
  }

  /** Returns the object with the settings used for calls to listOperations. */
  public PagedCallSettings<
          ListOperationsRequest, ListOperationsResponse, ListOperationsPagedResponse>
      listOperationsSettings() {
    return ((OperationsStubSettings) getStubSettings()).listOperationsSettings();
  }

  /** Returns the object with the settings used for calls to cancelOperation. */
  public UnaryCallSettings<CancelOperationRequest, Empty> cancelOperationSettings() {
    return ((OperationsStubSettings) getStubSettings()).cancelOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteOperation. */
  public UnaryCallSettings<DeleteOperationRequest, Empty> deleteOperationSettings() {
    return ((OperationsStubSettings) getStubSettings()).deleteOperationSettings();
  }

  public static final OperationsSettings create(OperationsStubSettings stub) throws IOException {
    return new Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return OperationsStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return OperationsStubSettings.defaultCredentialsProviderBuilder();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return OperationsStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected OperationsSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for OperationsSettings. */
  public static class Builder extends ClientSettings.Builder<OperationsSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(OperationsStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(OperationsStubSettings.newBuilder());
    }

    protected Builder(OperationsSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(OperationsStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public OperationsStubSettings.Builder getStubSettingsBuilder() {
      return ((OperationsStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to getOperation. */
    public UnaryCallSettings.Builder<GetOperationRequest, Operation> getOperationSettings() {
      return getStubSettingsBuilder().getOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listOperations. */
    public PagedCallSettings.Builder<
            ListOperationsRequest, ListOperationsResponse, ListOperationsPagedResponse>
        listOperationsSettings() {
      return getStubSettingsBuilder().listOperationsSettings();
    }

    /** Returns the builder for the settings used for calls to cancelOperation. */
    public UnaryCallSettings.Builder<CancelOperationRequest, Empty> cancelOperationSettings() {
      return getStubSettingsBuilder().cancelOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteOperation. */
    public UnaryCallSettings.Builder<DeleteOperationRequest, Empty> deleteOperationSettings() {
      return getStubSettingsBuilder().deleteOperationSettings();
    }

    @Override
    public OperationsSettings build() throws IOException {
      return new OperationsSettings(this);
    }
  }
}
