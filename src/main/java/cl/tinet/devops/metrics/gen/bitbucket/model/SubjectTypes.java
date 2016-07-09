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
import cl.tinet.devops.metrics.gen.bitbucket.model.SubjectTypesUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * The mapping of resource/subject types pointing to their individual event types.
 */
@ApiModel(description = "The mapping of resource/subject types pointing to their individual event types.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T23:42:53.141-04:00")
public class SubjectTypes   {
  @JsonProperty("user")
  private SubjectTypesUser user = null;

  @JsonProperty("repository")
  private SubjectTypesUser repository = null;

  @JsonProperty("team")
  private SubjectTypesUser team = null;

  public SubjectTypes user(SubjectTypesUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "")
  public SubjectTypesUser getUser() {
    return user;
  }

  public void setUser(SubjectTypesUser user) {
    this.user = user;
  }

  public SubjectTypes repository(SubjectTypesUser repository) {
    this.repository = repository;
    return this;
  }

   /**
   * Get repository
   * @return repository
  **/
  @ApiModelProperty(example = "null", value = "")
  public SubjectTypesUser getRepository() {
    return repository;
  }

  public void setRepository(SubjectTypesUser repository) {
    this.repository = repository;
  }

  public SubjectTypes team(SubjectTypesUser team) {
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @ApiModelProperty(example = "null", value = "")
  public SubjectTypesUser getTeam() {
    return team;
  }

  public void setTeam(SubjectTypesUser team) {
    this.team = team;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubjectTypes subjectTypes = (SubjectTypes) o;
    return Objects.equals(this.user, subjectTypes.user) &&
        Objects.equals(this.repository, subjectTypes.repository) &&
        Objects.equals(this.team, subjectTypes.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, repository, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectTypes {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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
