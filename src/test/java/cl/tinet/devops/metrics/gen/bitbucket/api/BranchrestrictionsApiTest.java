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
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedBranchrestrictions;
import cl.tinet.devops.metrics.gen.bitbucket.model.Error;
import cl.tinet.devops.metrics.gen.bitbucket.model.Branchrestriction;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BranchrestrictionsApi
 */
public class BranchrestrictionsApiTest {

    private final BranchrestrictionsApi api = new BranchrestrictionsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void repositoriesUsernameRepoSlugBranchRestrictionsGetTest() throws ApiException {
        String username = null;
        String repoSlug = null;
        // PaginatedBranchrestrictions response = api.repositoriesUsernameRepoSlugBranchRestrictionsGet(username, repoSlug);

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
    public void repositoriesUsernameRepoSlugBranchRestrictionsIdDeleteTest() throws ApiException {
        String username = null;
        String id = null;
        String repoSlug = null;
        String id2 = null;
        // api.repositoriesUsernameRepoSlugBranchRestrictionsIdDelete(username, id, repoSlug, id2);

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
    public void repositoriesUsernameRepoSlugBranchRestrictionsIdGetTest() throws ApiException {
        String username = null;
        String id = null;
        String repoSlug = null;
        String id2 = null;
        // Branchrestriction response = api.repositoriesUsernameRepoSlugBranchRestrictionsIdGet(username, id, repoSlug, id2);

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
    public void repositoriesUsernameRepoSlugBranchRestrictionsIdPutTest() throws ApiException {
        String username = null;
        String id = null;
        String repoSlug = null;
        String id2 = null;
        Branchrestriction body = null;
        // Branchrestriction response = api.repositoriesUsernameRepoSlugBranchRestrictionsIdPut(username, id, repoSlug, id2, body);

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
    public void repositoriesUsernameRepoSlugBranchRestrictionsPostTest() throws ApiException {
        String username = null;
        String repoSlug = null;
        Branchrestriction body = null;
        // Branchrestriction response = api.repositoriesUsernameRepoSlugBranchRestrictionsPost(username, repoSlug, body);

        // TODO: test validations
    }
    
}
