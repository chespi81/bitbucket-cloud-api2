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


package cl.tinet.devops.metrics.gen.bitbucket.api;

import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedProjects;
import cl.tinet.devops.metrics.gen.bitbucket.model.Error;
import cl.tinet.devops.metrics.gen.bitbucket.model.Project;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsApi
 */
public class ProjectsApiTest {

    private final ProjectsApi api = new ProjectsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamsOwnerProjectsGetTest() throws ApiException {
        String owner = null;
        // PaginatedProjects response = api.teamsOwnerProjectsGet(owner);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamsOwnerProjectsPostTest() throws ApiException {
        String owner = null;
        Project body = null;
        // Project response = api.teamsOwnerProjectsPost(owner, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamsOwnerProjectsProjectKeyDeleteTest() throws ApiException {
        String owner = null;
        String projectKey = null;
        // api.teamsOwnerProjectsProjectKeyDelete(owner, projectKey);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamsOwnerProjectsProjectKeyGetTest() throws ApiException {
        String owner = null;
        String projectKey = null;
        // Project response = api.teamsOwnerProjectsProjectKeyGet(owner, projectKey);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamsOwnerProjectsProjectKeyPutTest() throws ApiException {
        String owner = null;
        String projectKey = null;
        Project body = null;
        // Project response = api.teamsOwnerProjectsProjectKeyPut(owner, projectKey, body);

        // TODO: test validations
    }
    
}
