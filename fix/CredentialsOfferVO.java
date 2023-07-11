package org.fiware.keycloak.oidcvc.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.fiware.keycloak.oidcvc.model.PreAuthorizedGrantVO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CredentialsOffer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-07-11T17:09:13.601300760+02:00[Europe/Paris]")
public class CredentialsOfferVO   {
  private @Valid String credentialIssuer;
  private @Valid List<Object> credentials = null;
  private @Valid org.fiware.keycloak.oidcvc.model.PreAuthorizedVO grants;

  /**
   **/
  public CredentialsOfferVO credentialIssuer(String credentialIssuer) {
    this.credentialIssuer = credentialIssuer;
    return this;
  }

  
  @ApiModelProperty(example = "https://kc-one.batterypass.fiware.dev/realms/fiware-server", required = true, value = "")
  @JsonProperty("credential_issuer")
  @NotNull
  public String getCredentialIssuer() {
    return credentialIssuer;
  }

  @JsonProperty("credential_issuer")
  public void setCredentialIssuer(String credentialIssuer) {
    this.credentialIssuer = credentialIssuer;
  }

  /**
   **/
  public CredentialsOfferVO credentials(List<Object> credentials) {
    this.credentials = credentials;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("credentials")
  @NotNull
  public List<Object> getCredentials() {
    return credentials;
  }

  @JsonProperty("credentials")
  public void setCredentials(List<Object> credentials) {
    this.credentials = credentials;
  }

  public CredentialsOfferVO addCredentialsItem(Object credentialsItem) {
    if (this.credentials == null) {
      this.credentials = null;
    }

    this.credentials.add(credentialsItem);
    return this;
  }

  public CredentialsOfferVO removeCredentialsItem(Object credentialsItem) {
    if (credentialsItem != null && this.credentials != null) {
      this.credentials.remove(credentialsItem);
    }

    return this;
  }
  /**
   **/
  public CredentialsOfferVO grants(org.fiware.keycloak.oidcvc.model.PreAuthorizedVO grants) {
    this.grants = grants;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("grants")
  public org.fiware.keycloak.oidcvc.model.PreAuthorizedVO getGrants() {
    return grants;
  }

  @JsonProperty("grants")
  public void setGrants(org.fiware.keycloak.oidcvc.model.PreAuthorizedVO grants) {
    this.grants = grants;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialsOfferVO credentialsOffer = (CredentialsOfferVO) o;
    return Objects.equals(this.credentialIssuer, credentialsOffer.credentialIssuer) &&
        Objects.equals(this.credentials, credentialsOffer.credentials) &&
        Objects.equals(this.grants, credentialsOffer.grants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialIssuer, credentials, grants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialsOfferVO {\n");
    
    sb.append("    credentialIssuer: ").append(toIndentedString(credentialIssuer)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

