/**
 * Bitbucket API
 * Code against the Bitbucket API to automate simple tasks, embed Bitbucket data into your own site, build mobile or desktop apps, or even add custom UI add-ons into Bitbucket itself using the Connect framework.
 *
 * OpenAPI spec version: 2.0
 * Contact: support@bitbucket.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package cl.tinet.devops.metrics.gen.bitbucket.model;

import java.util.Objects;
import cl.tinet.devops.metrics.gen.bitbucket.model.Account;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * Snippet
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T23:42:53.141-04:00")
public class Snippet extends Object  {
  @JsonProperty("type")
  private String type = null;

  /**
   * The DVCS used to store the snippet.
   */
  public enum ScmEnum {
    HG("hg"),
    
    GIT("git");

    private String value;

    ScmEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("scm")
  private ScmEnum scm = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("creator")
  private Account creator = null;

  @JsonProperty("created_on")
  private DateTime createdOn = null;

  @JsonProperty("owner")
  private Account owner = null;

  @JsonProperty("updated_on")
  private DateTime updatedOn = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("is_private")
  private Boolean isPrivate = null;

  public Snippet type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Snippet scm(ScmEnum scm) {
    this.scm = scm;
    return this;
  }

   /**
   * The DVCS used to store the snippet.
   * @return scm
  **/
  @ApiModelProperty(example = "null", value = "The DVCS used to store the snippet.")
  public ScmEnum getScm() {
    return scm;
  }

  public void setScm(ScmEnum scm) {
    this.scm = scm;
  }

  public Snippet title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Snippet creator(Account creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @ApiModelProperty(example = "null", value = "")
  public Account getCreator() {
    return creator;
  }

  public void setCreator(Account creator) {
    this.creator = creator;
  }

  public Snippet createdOn(DateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(DateTime createdOn) {
    this.createdOn = createdOn;
  }

  public Snippet owner(Account owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(example = "null", value = "")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Snippet updatedOn(DateTime updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * Get updatedOn
   * @return updatedOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(DateTime updatedOn) {
    this.updatedOn = updatedOn;
  }

  public Snippet id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * minimum: 0.0
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Snippet isPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
    return this;
  }

   /**
   * Get isPrivate
   * @return isPrivate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsPrivate() {
    return isPrivate;
  }

  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Snippet snippet = (Snippet) o;
    return Objects.equals(this.type, snippet.type) &&
        Objects.equals(this.scm, snippet.scm) &&
        Objects.equals(this.title, snippet.title) &&
        Objects.equals(this.creator, snippet.creator) &&
        Objects.equals(this.createdOn, snippet.createdOn) &&
        Objects.equals(this.owner, snippet.owner) &&
        Objects.equals(this.updatedOn, snippet.updatedOn) &&
        Objects.equals(this.id, snippet.id) &&
        Objects.equals(this.isPrivate, snippet.isPrivate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, scm, title, creator, createdOn, owner, updatedOn, id, isPrivate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Snippet {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scm: ").append(toIndentedString(scm)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
