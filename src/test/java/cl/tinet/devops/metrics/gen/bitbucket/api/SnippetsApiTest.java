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
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedSnippets;
import cl.tinet.devops.metrics.gen.bitbucket.model.Error;
import cl.tinet.devops.metrics.gen.bitbucket.model.Snippet;
import cl.tinet.devops.metrics.gen.bitbucket.model.SnippetComment;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedSnippetComments;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedSnippetCommit;
import cl.tinet.devops.metrics.gen.bitbucket.model.SnippetCommit;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedUsers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SnippetsApi
 */
public class SnippetsApiTest {

    private final SnippetsApi api = new SnippetsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void snippetsGetTest() throws ApiException {
        String role = null;
        // PaginatedSnippets response = api.snippetsGet(role);

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
    public void snippetsPostTest() throws ApiException {
        Snippet body = null;
        // Snippet response = api.snippetsPost(body);

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
    public void snippetsUsernameEncodedIdCommentsCommentIdDeleteTest() throws ApiException {
        String username = null;
        String commentId = null;
        String encodedId = null;
        // api.snippetsUsernameEncodedIdCommentsCommentIdDelete(username, commentId, encodedId);

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
    public void snippetsUsernameEncodedIdCommentsCommentIdGetTest() throws ApiException {
        String username = null;
        String commentId = null;
        String encodedId = null;
        // SnippetComment response = api.snippetsUsernameEncodedIdCommentsCommentIdGet(username, commentId, encodedId);

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
    public void snippetsUsernameEncodedIdCommentsCommentIdPutTest() throws ApiException {
        String username = null;
        String commentId = null;
        String encodedId = null;
        // api.snippetsUsernameEncodedIdCommentsCommentIdPut(username, commentId, encodedId);

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
    public void snippetsUsernameEncodedIdCommentsGetTest() throws ApiException {
        String username = null;
        String encodedId = null;
        // PaginatedSnippetComments response = api.snippetsUsernameEncodedIdCommentsGet(username, encodedId);

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
    public void snippetsUsernameEncodedIdCommentsPostTest() throws ApiException {
        String username = null;
        String encodedId = null;
        Snippet body = null;
        // Snippet response = api.snippetsUsernameEncodedIdCommentsPost(username, encodedId, body);

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
    public void snippetsUsernameEncodedIdCommitsGetTest() throws ApiException {
        String username = null;
        String encodedId = null;
        // PaginatedSnippetCommit response = api.snippetsUsernameEncodedIdCommitsGet(username, encodedId);

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
    public void snippetsUsernameEncodedIdCommitsRevisionGetTest() throws ApiException {
        String username = null;
        String encodedId = null;
        String revision = null;
        // SnippetCommit response = api.snippetsUsernameEncodedIdCommitsRevisionGet(username, encodedId, revision);

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
    public void snippetsUsernameEncodedIdDeleteTest() throws ApiException {
        String username = null;
        String encodedId = null;
        String encodedId2 = null;
        // api.snippetsUsernameEncodedIdDelete(username, encodedId, encodedId2);

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
    public void snippetsUsernameEncodedIdGetTest() throws ApiException {
        String username = null;
        String encodedId = null;
        String encodedId2 = null;
        // Snippet response = api.snippetsUsernameEncodedIdGet(username, encodedId, encodedId2);

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
    public void snippetsUsernameEncodedIdNodeIdDeleteTest() throws ApiException {
        String username = null;
        String nodeId = null;
        String encodedId = null;
        String encodedId2 = null;
        // api.snippetsUsernameEncodedIdNodeIdDelete(username, nodeId, encodedId, encodedId2);

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
    public void snippetsUsernameEncodedIdNodeIdFilesPathGetTest() throws ApiException {
        String username = null;
        String path = null;
        String nodeId = null;
        String encodedId = null;
        // api.snippetsUsernameEncodedIdNodeIdFilesPathGet(username, path, nodeId, encodedId);

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
    public void snippetsUsernameEncodedIdNodeIdGetTest() throws ApiException {
        String username = null;
        String nodeId = null;
        String encodedId = null;
        String encodedId2 = null;
        String nodeId2 = null;
        // Snippet response = api.snippetsUsernameEncodedIdNodeIdGet(username, nodeId, encodedId, encodedId2, nodeId2);

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
    public void snippetsUsernameEncodedIdNodeIdPutTest() throws ApiException {
        String username = null;
        String nodeId = null;
        String encodedId = null;
        String encodedId2 = null;
        String nodeId2 = null;
        // Snippet response = api.snippetsUsernameEncodedIdNodeIdPut(username, nodeId, encodedId, encodedId2, nodeId2);

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
    public void snippetsUsernameEncodedIdPutTest() throws ApiException {
        String username = null;
        String encodedId = null;
        String encodedId2 = null;
        // Snippet response = api.snippetsUsernameEncodedIdPut(username, encodedId, encodedId2);

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
    public void snippetsUsernameEncodedIdRevisionDiffGetTest() throws ApiException {
        String username = null;
        String encodedId = null;
        String revision = null;
        String encodedId2 = null;
        String revision2 = null;
        String path = null;
        // api.snippetsUsernameEncodedIdRevisionDiffGet(username, encodedId, revision, encodedId2, revision2, path);

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
    public void snippetsUsernameEncodedIdRevisionPatchGetTest() throws ApiException {
        String username = null;
        String encodedId = null;
        String revision = null;
        String encodedId2 = null;
        String revision2 = null;
        // api.snippetsUsernameEncodedIdRevisionPatchGet(username, encodedId, revision, encodedId2, revision2);

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
    public void snippetsUsernameEncodedIdWatchDeleteTest() throws ApiException {
        String username = null;
        String encodedId = null;
        String encodedId2 = null;
        // PaginatedUsers response = api.snippetsUsernameEncodedIdWatchDelete(username, encodedId, encodedId2);

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
    public void snippetsUsernameEncodedIdWatchGetTest() throws ApiException {
        String username = null;
        String encodedId = null;
        String encodedId2 = null;
        // PaginatedUsers response = api.snippetsUsernameEncodedIdWatchGet(username, encodedId, encodedId2);

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
    public void snippetsUsernameEncodedIdWatchPutTest() throws ApiException {
        String username = null;
        String encodedId = null;
        String encodedId2 = null;
        // PaginatedUsers response = api.snippetsUsernameEncodedIdWatchPut(username, encodedId, encodedId2);

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
    public void snippetsUsernameEncodedIdWatchersGetTest() throws ApiException {
        String username = null;
        String encodedId = null;
        String encodedId2 = null;
        // PaginatedUsers response = api.snippetsUsernameEncodedIdWatchersGet(username, encodedId, encodedId2);

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
    public void snippetsUsernameGetTest() throws ApiException {
        String username = null;
        String username2 = null;
        String role = null;
        // PaginatedSnippets response = api.snippetsUsernameGet(username, username2, role);

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
    public void snippetsUsernamePostTest() throws ApiException {
        String username = null;
        Snippet body = null;
        // Snippet response = api.snippetsUsernamePost(username, body);

        // TODO: test validations
    }
    
}
