/*
 * Alfresco Content Services REST API
 * **Core API**  Provides access to the core features of Alfresco Content Services. 
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.alfresco.repository.remote.client.api;

import org.alfresco.repository.remote.client.ApiException;
import org.alfresco.repository.remote.client.model.Error;
import org.threeten.bp.OffsetDateTime;
import org.alfresco.repository.remote.client.model.RenditionEntry;
import org.alfresco.repository.remote.client.model.RenditionPaging;
import org.alfresco.repository.remote.client.model.SharedLinkBodyCreate;
import org.alfresco.repository.remote.client.model.SharedLinkBodyEmail;
import org.alfresco.repository.remote.client.model.SharedLinkEntry;
import org.alfresco.repository.remote.client.model.SharedLinkPaging;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SharedLinksApi
 */
@Ignore
public class SharedLinksApiTest {

    private final SharedLinksApi api = new SharedLinksApi();

    
    /**
     * Create a shared link to a file
     *
     * **Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Create a shared link to the file **nodeId** in the request body. Also, an optional expiry date could be set, so the shared link would become invalid when the expiry date is reached. For example:  &#x60;&#x60;&#x60;JSON   {     \&quot;nodeId\&quot;: \&quot;1ff9da1a-ee2f-4b9c-8c34-3333333333\&quot;,     \&quot;expiresAt\&quot;: \&quot;2017-03-23T23:00:00.000+0000\&quot;   } &#x60;&#x60;&#x60;  **Note:** You can create shared links to more than one file  specifying a list of **nodeId**s in the JSON body like this:  &#x60;&#x60;&#x60;JSON [   {     \&quot;nodeId\&quot;: \&quot;1ff9da1a-ee2f-4b9c-8c34-4444444444\&quot;   },   {                 \&quot;nodeId\&quot;: \&quot;1ff9da1a-ee2f-4b9c-8c34-5555555555\&quot;   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSharedLinkTest() throws ApiException {
        SharedLinkBodyCreate sharedLinkBodyCreate = null;
        List<String> include = null;
        List<String> fields = null;
        SharedLinkEntry response = api.createSharedLink(sharedLinkBodyCreate, include, fields);

        // TODO: test validations
    }
    
    /**
     * Deletes a shared link
     *
     * **Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Deletes the shared link with identifier **sharedId**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSharedLinkTest() throws ApiException {
        String sharedId = null;
        api.deleteSharedLink(sharedId);

        // TODO: test validations
    }
    
    /**
     * Email shared link
     *
     * **Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Sends email with app-specific url including identifier **sharedId**.  The client and recipientEmails properties are mandatory in the request body. For example, to email a shared link with minimum info: &#x60;&#x60;&#x60;JSON {     \&quot;client\&quot;: \&quot;myClient\&quot;,     \&quot;recipientEmails\&quot;: [\&quot;john.doe@acme.com\&quot;, \&quot;joe.bloggs@acme.com\&quot;] } &#x60;&#x60;&#x60; A plain text message property can be optionally provided in the request body to customise the sent email. Also, a locale property can be optionally provided in the request body to send the emails in a particular language (if the locale is supported by Alfresco). For example, to email a shared link with a messages and a locale: &#x60;&#x60;&#x60;JSON {     \&quot;client\&quot;: \&quot;myClient\&quot;,     \&quot;recipientEmails\&quot;: [\&quot;john.doe@acme.com\&quot;, \&quot;joe.bloggs@acme.com\&quot;],     \&quot;message\&quot;: \&quot;myMessage\&quot;,     \&quot;locale\&quot;:\&quot;en-GB\&quot; } &#x60;&#x60;&#x60; **Note:** The client must be registered before you can send a shared link email. See [server documentation]. However, out-of-the-box  share is registered as a default client, so you could pass **share** as the client name: &#x60;&#x60;&#x60;JSON {     \&quot;client\&quot;: \&quot;share\&quot;,     \&quot;recipientEmails\&quot;: [\&quot;john.doe@acme.com\&quot;] } &#x60;&#x60;&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailSharedLinkTest() throws ApiException {
        String sharedId = null;
        SharedLinkBodyEmail sharedLinkBodyEmail = null;
        api.emailSharedLink(sharedId, sharedLinkBodyEmail);

        // TODO: test validations
    }
    
    /**
     * Get a shared link
     *
     * **Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets minimal information for the file with shared link identifier **sharedId**.  **Note:** No authentication is required to call this endpoint. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSharedLinkTest() throws ApiException {
        String sharedId = null;
        List<String> fields = null;
        SharedLinkEntry response = api.getSharedLink(sharedId, fields);

        // TODO: test validations
    }
    
    /**
     * Get shared link content
     *
     * **Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the content of the file with shared link identifier **sharedId**.  **Note:** No authentication is required to call this endpoint. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSharedLinkContentTest() throws ApiException {
        String sharedId = null;
        Boolean attachment = null;
        OffsetDateTime ifModifiedSince = null;
        api.getSharedLinkContent(sharedId, attachment, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * Get shared link rendition information
     *
     * **Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets rendition information for the file with shared link identifier **sharedId**.  This API method returns rendition information where the rendition status is CREATED,  which means the rendition is available to view/download.  **Note:** No authentication is required to call this endpoint.       
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSharedLinkRenditionTest() throws ApiException {
        String sharedId = null;
        String renditionId = null;
        RenditionEntry response = api.getSharedLinkRendition(sharedId, renditionId);

        // TODO: test validations
    }
    
    /**
     * Get shared link rendition content
     *
     * **Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the rendition content for file with shared link identifier **sharedId**.  **Note:** No authentication is required to call this endpoint. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSharedLinkRenditionContentTest() throws ApiException {
        String sharedId = null;
        String renditionId = null;
        Boolean attachment = null;
        OffsetDateTime ifModifiedSince = null;
        api.getSharedLinkRenditionContent(sharedId, renditionId, attachment, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * List renditions for a shared link
     *
     * **Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of the rendition information for the file with shared link identifier **sharedId**.  This API method returns rendition information, including the rendition id, for each rendition where the rendition status is CREATED, which means the rendition is available to view/download.  **Note:** No authentication is required to call this endpoint.       
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSharedLinkRenditionsTest() throws ApiException {
        String sharedId = null;
        RenditionPaging response = api.listSharedLinkRenditions(sharedId);

        // TODO: test validations
    }
    
    /**
     * List shared links
     *
     * **Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Get a list of links that the current user has read permission on source node.  The list is ordered in descending modified order.  **Note:** The list of links is eventually consistent so newly created shared links may not appear immediately. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSharedLinksTest() throws ApiException {
        Integer skipCount = null;
        Integer maxItems = null;
        String where = null;
        List<String> include = null;
        List<String> fields = null;
        SharedLinkPaging response = api.listSharedLinks(skipCount, maxItems, where, include, fields);

        // TODO: test validations
    }
    
}