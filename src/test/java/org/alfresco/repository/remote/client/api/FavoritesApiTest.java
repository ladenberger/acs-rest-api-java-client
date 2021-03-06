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
import org.alfresco.repository.remote.client.model.FavoriteBodyCreate;
import org.alfresco.repository.remote.client.model.FavoriteEntry;
import org.alfresco.repository.remote.client.model.FavoritePaging;
import org.alfresco.repository.remote.client.model.FavoriteSiteBodyCreate;
import org.alfresco.repository.remote.client.model.FavoriteSiteEntry;
import org.alfresco.repository.remote.client.model.SiteEntry;
import org.alfresco.repository.remote.client.model.SitePaging;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FavoritesApi
 */
@Ignore
public class FavoritesApiTest {

    private final FavoritesApi api = new FavoritesApi();

    
    /**
     * Create a favorite
     *
     * Favorite a **site**, **file**, or **folder** in the repository.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user.  **Note:** You can favorite more than one entity by  specifying a list of objects in the JSON body like this:  &#x60;&#x60;&#x60;JSON [   {        \&quot;target\&quot;: {           \&quot;file\&quot;: {              \&quot;guid\&quot;: \&quot;abcde-01234-....\&quot;           }        }    },    {        \&quot;target\&quot;: {           \&quot;file\&quot;: {              \&quot;guid\&quot;: \&quot;abcde-09863-....\&quot;           }        }    }, ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFavoriteTest() throws ApiException {
        String personId = null;
        FavoriteBodyCreate favoriteBodyCreate = null;
        List<String> include = null;
        List<String> fields = null;
        FavoriteEntry response = api.createFavorite(personId, favoriteBodyCreate, include, fields);

        // TODO: test validations
    }
    
    /**
     * Create a site favorite
     *
     * **Note:** this endpoint is deprecated as of Alfresco 4.2, and will be removed in the future. Use &#x60;/people/{personId}/favorites&#x60; instead.  Create a site favorite for person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user.   **Note:** You can favorite more than one site by  specifying a list of sites in the JSON body like this:  &#x60;&#x60;&#x60;JSON [   {     \&quot;id\&quot;: \&quot;test-site-1\&quot;   },   {     \&quot;id\&quot;: \&quot;test-site-2\&quot;   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSiteFavoriteTest() throws ApiException {
        String personId = null;
        FavoriteSiteBodyCreate favoriteSiteBodyCreate = null;
        List<String> fields = null;
        FavoriteSiteEntry response = api.createSiteFavorite(personId, favoriteSiteBodyCreate, fields);

        // TODO: test validations
    }
    
    /**
     * Delete a favorite
     *
     * Deletes **favoriteId** as a favorite of person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFavoriteTest() throws ApiException {
        String personId = null;
        String favoriteId = null;
        api.deleteFavorite(personId, favoriteId);

        // TODO: test validations
    }
    
    /**
     * Delete a site favorite
     *
     * **Note:** this endpoint is deprecated as of Alfresco 4.2, and will be removed in the future. Use &#x60;/people/{personId}/favorites/{favoriteId}&#x60; instead.  Deletes site **siteId** from the favorite site list of person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSiteFavoriteTest() throws ApiException {
        String personId = null;
        String siteId = null;
        api.deleteSiteFavorite(personId, siteId);

        // TODO: test validations
    }
    
    /**
     * Get a favorite
     *
     * Gets favorite **favoriteId** for person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFavoriteTest() throws ApiException {
        String personId = null;
        String favoriteId = null;
        List<String> include = null;
        List<String> fields = null;
        FavoriteEntry response = api.getFavorite(personId, favoriteId, include, fields);

        // TODO: test validations
    }
    
    /**
     * Get a favorite site
     *
     * **Note:** this endpoint is deprecated as of Alfresco 4.2, and will be removed in the future. Use &#x60;/people/{personId}/favorites/{favoriteId}&#x60; instead.  Gets information on favorite site **siteId** of person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFavoriteSiteTest() throws ApiException {
        String personId = null;
        String siteId = null;
        List<String> fields = null;
        SiteEntry response = api.getFavoriteSite(personId, siteId, fields);

        // TODO: test validations
    }
    
    /**
     * List favorite sites
     *
     * **Note:** this endpoint is deprecated as of Alfresco 4.2, and will be removed in the future. Use &#x60;/people/{personId}/favorites&#x60; instead.  Gets a list of a person&#39;s favorite sites.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFavoriteSitesForPersonTest() throws ApiException {
        String personId = null;
        Integer skipCount = null;
        Integer maxItems = null;
        List<String> fields = null;
        SitePaging response = api.listFavoriteSitesForPerson(personId, skipCount, maxItems, fields);

        // TODO: test validations
    }
    
    /**
     * List favorites
     *
     * Gets a list of favorites for person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user.  You can use the **where** parameter to restrict the list in the response to entries of a specific kind. The **where** parameter takes a value. The value is a single predicate that can include one or more **EXISTS** conditions. The **EXISTS** condition uses a single operand to limit the list to include entries that include that one property. The property values are:  *   &#x60;target/file&#x60; *   &#x60;target/folder&#x60; *   &#x60;target/site&#x60;  For example, the following **where** parameter restricts the returned list to the file favorites for a person:  &#x60;&#x60;&#x60;SQL (EXISTS(target/file)) &#x60;&#x60;&#x60; You can specify more than one condition using **OR**. The predicate must be enclosed in parentheses.   For example, the following **where** parameter restricts the returned list to the file and folder favorites for a person:  &#x60;&#x60;&#x60;SQL (EXISTS(target/file) OR EXISTS(target/folder)) &#x60;&#x60;&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFavoritesTest() throws ApiException {
        String personId = null;
        Integer skipCount = null;
        Integer maxItems = null;
        String where = null;
        List<String> include = null;
        List<String> fields = null;
        FavoritePaging response = api.listFavorites(personId, skipCount, maxItems, where, include, fields);

        // TODO: test validations
    }
    
}
