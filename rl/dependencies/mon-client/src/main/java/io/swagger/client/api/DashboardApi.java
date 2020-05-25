/*
 * Prometheus Manager API
 * The API of the Prometheus Manager.
 *
 * OpenAPI spec version: 0.1
 * Contact: m.capitani@nextworks.it
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.rl.extinterface.mon.swagger.client.model.Dashboard;
import com.rl.extinterface.mon.swagger.client.model.DashboardDescription;
import com.rl.extinterface.mon.swagger.client.model.DashboardQueryResult;
import com.rl.extinterface.mon.swagger.client.model.InlineResponse2002;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DashboardApi {
    private ApiClient apiClient;

    public DashboardApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DashboardApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteDashboard
     * @param dashboardId the ID of the dashboard (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteDashboardCall(String dashboardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dashboard/{dashboardId}"
            .replaceAll("\\{" + "dashboardId" + "\\}", apiClient.escapeString(dashboardId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/x-yaml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteDashboardValidateBeforeCall(String dashboardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dashboardId' is set
        if (dashboardId == null) {
            throw new ApiException("Missing the required parameter 'dashboardId' when calling deleteDashboard(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteDashboardCall(dashboardId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete dashboard
     * 
     * @param dashboardId the ID of the dashboard (required)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2002 deleteDashboard(String dashboardId) throws ApiException {
        ApiResponse<InlineResponse2002> resp = deleteDashboardWithHttpInfo(dashboardId);
        return resp.getData();
    }

    /**
     * Delete dashboard
     * 
     * @param dashboardId the ID of the dashboard (required)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2002> deleteDashboardWithHttpInfo(String dashboardId) throws ApiException {
        com.squareup.okhttp.Call call = deleteDashboardValidateBeforeCall(dashboardId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete dashboard (asynchronously)
     * 
     * @param dashboardId the ID of the dashboard (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDashboardAsync(String dashboardId, final ApiCallback<InlineResponse2002> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteDashboardValidateBeforeCall(dashboardId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllDashboards
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllDashboardsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dashboard";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/x-yaml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAllDashboardsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllDashboardsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all dashboards
     * 
     * @return DashboardQueryResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DashboardQueryResult getAllDashboards() throws ApiException {
        ApiResponse<DashboardQueryResult> resp = getAllDashboardsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get all dashboards
     * 
     * @return ApiResponse&lt;DashboardQueryResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DashboardQueryResult> getAllDashboardsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAllDashboardsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<DashboardQueryResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all dashboards (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllDashboardsAsync(final ApiCallback<DashboardQueryResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAllDashboardsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DashboardQueryResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDashboard
     * @param dashboardId the ID of the dashboard (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDashboardCall(String dashboardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dashboard/{dashboardId}"
            .replaceAll("\\{" + "dashboardId" + "\\}", apiClient.escapeString(dashboardId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/x-yaml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDashboardValidateBeforeCall(String dashboardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dashboardId' is set
        if (dashboardId == null) {
            throw new ApiException("Missing the required parameter 'dashboardId' when calling getDashboard(Async)");
        }
        

        com.squareup.okhttp.Call call = getDashboardCall(dashboardId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get dashboard details
     * 
     * @param dashboardId the ID of the dashboard (required)
     * @return Dashboard
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Dashboard getDashboard(String dashboardId) throws ApiException {
        ApiResponse<Dashboard> resp = getDashboardWithHttpInfo(dashboardId);
        return resp.getData();
    }

    /**
     * Get dashboard details
     * 
     * @param dashboardId the ID of the dashboard (required)
     * @return ApiResponse&lt;Dashboard&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Dashboard> getDashboardWithHttpInfo(String dashboardId) throws ApiException {
        com.squareup.okhttp.Call call = getDashboardValidateBeforeCall(dashboardId, null, null);
        Type localVarReturnType = new TypeToken<Dashboard>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get dashboard details (asynchronously)
     * 
     * @param dashboardId the ID of the dashboard (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDashboardAsync(String dashboardId, final ApiCallback<Dashboard> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDashboardValidateBeforeCall(dashboardId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Dashboard>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDashboard
     * @param dashboard the dashboard to be created (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postDashboardCall(DashboardDescription dashboard, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = dashboard;

        // create path and map variables
        String localVarPath = "/dashboard";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/x-yaml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/x-yaml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDashboardValidateBeforeCall(DashboardDescription dashboard, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dashboard' is set
        if (dashboard == null) {
            throw new ApiException("Missing the required parameter 'dashboard' when calling postDashboard(Async)");
        }
        

        com.squareup.okhttp.Call call = postDashboardCall(dashboard, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create new dashboard
     * 
     * @param dashboard the dashboard to be created (required)
     * @return Dashboard
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Dashboard postDashboard(DashboardDescription dashboard) throws ApiException {
        ApiResponse<Dashboard> resp = postDashboardWithHttpInfo(dashboard);
        return resp.getData();
    }

    /**
     * Create new dashboard
     * 
     * @param dashboard the dashboard to be created (required)
     * @return ApiResponse&lt;Dashboard&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Dashboard> postDashboardWithHttpInfo(DashboardDescription dashboard) throws ApiException {
        com.squareup.okhttp.Call call = postDashboardValidateBeforeCall(dashboard, null, null);
        Type localVarReturnType = new TypeToken<Dashboard>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create new dashboard (asynchronously)
     * 
     * @param dashboard the dashboard to be created (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDashboardAsync(DashboardDescription dashboard, final ApiCallback<Dashboard> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postDashboardValidateBeforeCall(dashboard, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Dashboard>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putDashboard
     * @param dashboardId the ID of the dashboard (required)
     * @param dashboard the dashboard properties to be updated (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putDashboardCall(String dashboardId, Dashboard dashboard, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = dashboard;

        // create path and map variables
        String localVarPath = "/dashboard/{dashboardId}"
            .replaceAll("\\{" + "dashboardId" + "\\}", apiClient.escapeString(dashboardId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/x-yaml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/x-yaml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putDashboardValidateBeforeCall(String dashboardId, Dashboard dashboard, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dashboardId' is set
        if (dashboardId == null) {
            throw new ApiException("Missing the required parameter 'dashboardId' when calling putDashboard(Async)");
        }
        
        // verify the required parameter 'dashboard' is set
        if (dashboard == null) {
            throw new ApiException("Missing the required parameter 'dashboard' when calling putDashboard(Async)");
        }
        

        com.squareup.okhttp.Call call = putDashboardCall(dashboardId, dashboard, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update dashboard
     * 
     * @param dashboardId the ID of the dashboard (required)
     * @param dashboard the dashboard properties to be updated (required)
     * @return Dashboard
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Dashboard putDashboard(String dashboardId, Dashboard dashboard) throws ApiException {
        ApiResponse<Dashboard> resp = putDashboardWithHttpInfo(dashboardId, dashboard);
        return resp.getData();
    }

    /**
     * Update dashboard
     * 
     * @param dashboardId the ID of the dashboard (required)
     * @param dashboard the dashboard properties to be updated (required)
     * @return ApiResponse&lt;Dashboard&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Dashboard> putDashboardWithHttpInfo(String dashboardId, Dashboard dashboard) throws ApiException {
        com.squareup.okhttp.Call call = putDashboardValidateBeforeCall(dashboardId, dashboard, null, null);
        Type localVarReturnType = new TypeToken<Dashboard>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update dashboard (asynchronously)
     * 
     * @param dashboardId the ID of the dashboard (required)
     * @param dashboard the dashboard properties to be updated (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putDashboardAsync(String dashboardId, Dashboard dashboard, final ApiCallback<Dashboard> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putDashboardValidateBeforeCall(dashboardId, dashboard, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Dashboard>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
