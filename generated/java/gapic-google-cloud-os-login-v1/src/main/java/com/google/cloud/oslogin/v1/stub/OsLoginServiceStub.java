/*
 * Copyright 2018 Google LLC
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
package com.google.cloud.oslogin.v1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey;
import com.google.cloud.oslogin.v1.DeletePosixAccountRequest;
import com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest;
import com.google.cloud.oslogin.v1.GetLoginProfileRequest;
import com.google.cloud.oslogin.v1.GetSshPublicKeyRequest;
import com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest;
import com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse;
import com.google.cloud.oslogin.v1.LoginProfile;
import com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Google Cloud OS Login API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class OsLoginServiceStub implements BackgroundResource {

  public UnaryCallable<DeletePosixAccountRequest, Empty> deletePosixAccountCallable() {
    throw new UnsupportedOperationException("Not implemented: deletePosixAccountCallable()");
  }

  public UnaryCallable<DeleteSshPublicKeyRequest, Empty> deleteSshPublicKeyCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteSshPublicKeyCallable()");
  }

  public UnaryCallable<GetLoginProfileRequest, LoginProfile> getLoginProfileCallable() {
    throw new UnsupportedOperationException("Not implemented: getLoginProfileCallable()");
  }

  public UnaryCallable<GetSshPublicKeyRequest, SshPublicKey> getSshPublicKeyCallable() {
    throw new UnsupportedOperationException("Not implemented: getSshPublicKeyCallable()");
  }

  public UnaryCallable<ImportSshPublicKeyRequest, ImportSshPublicKeyResponse>
      importSshPublicKeyCallable() {
    throw new UnsupportedOperationException("Not implemented: importSshPublicKeyCallable()");
  }

  public UnaryCallable<UpdateSshPublicKeyRequest, SshPublicKey> updateSshPublicKeyCallable() {
    throw new UnsupportedOperationException("Not implemented: updateSshPublicKeyCallable()");
  }
}
