/*
 * MTP Manager API
 * MTP Manager API
 *
 * OpenAPI spec version: 2.0
 * 
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
import com.rl.extinterface.nbi.swagger.model.AllocateNetworkRequest;
import com.rl.extinterface.nbi.swagger.model.AllocateNetworkResult;
import com.rl.extinterface.nbi.swagger.model.CapacityInformation;
import com.rl.extinterface.nbi.swagger.model.Filter;
import com.rl.extinterface.nbi.swagger.model.NfviPop;
import com.rl.extinterface.nbi.swagger.model.QueryNetworkCapacityRequest;
import com.rl.extinterface.nbi.swagger.model.VirtualNetwork;

import java.io.IOException;




import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VimNetworkResourcesApi {
    private ApiClient apiClient;

    public VimNetworkResourcesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VimNetworkResourcesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for freeVlan
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call freeVlanCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/network_resources/free_vlan";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private com.squareup.okhttp.Call freeVlanValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = freeVlanCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve free vlan tag from VIM domain
     * Retrieve free vlan tag from VIM domain
     * @return List&lt;BigDecimal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<BigDecimal> freeVlan() throws ApiException {
        ApiResponse<List<BigDecimal>> resp = freeVlanWithHttpInfo();
        return resp.getData();
    }

    /**
     * Retrieve free vlan tag from VIM domain
     * Retrieve free vlan tag from VIM domain
     * @return ApiResponse&lt;List&lt;BigDecimal&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<BigDecimal>> freeVlanWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = freeVlanValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<BigDecimal>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve free vlan tag from VIM domain (asynchronously)
     * Retrieve free vlan tag from VIM domain
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call freeVlanAsync(final ApiCallback<List<BigDecimal>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = freeVlanValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<BigDecimal>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for queryNFVIPoPNetworkInformation
     * @param nfviPopNetworkInformationRequest Input filter for selecting information to query. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryNFVIPoPNetworkInformationCall(Filter nfviPopNetworkInformationRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = nfviPopNetworkInformationRequest;

        // create path and map variables
        String localVarPath = "/network_resources/nfvi-pop-network-information";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
    private com.squareup.okhttp.Call queryNFVIPoPNetworkInformationValidateBeforeCall(Filter nfviPopNetworkInformationRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'nfviPopNetworkInformationRequest' is set
        if (nfviPopNetworkInformationRequest == null) {
            throw new ApiException("Missing the required parameter 'nfviPopNetworkInformationRequest' when calling queryNFVIPoPNetworkInformation(Async)");
        }
        

        com.squareup.okhttp.Call call = queryNFVIPoPNetworkInformationCall(nfviPopNetworkInformationRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param nfviPopNetworkInformationRequest Input filter for selecting information to query. (required)
     * @return List&lt;NfviPop&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<NfviPop> queryNFVIPoPNetworkInformation(Filter nfviPopNetworkInformationRequest) throws ApiException {
        ApiResponse<List<NfviPop>> resp = queryNFVIPoPNetworkInformationWithHttpInfo(nfviPopNetworkInformationRequest);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param nfviPopNetworkInformationRequest Input filter for selecting information to query. (required)
     * @return ApiResponse&lt;List&lt;NfviPop&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<NfviPop>> queryNFVIPoPNetworkInformationWithHttpInfo(Filter nfviPopNetworkInformationRequest) throws ApiException {
        com.squareup.okhttp.Call call = queryNFVIPoPNetworkInformationValidateBeforeCall(nfviPopNetworkInformationRequest, null, null);
        Type localVarReturnType = new TypeToken<List<NfviPop>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param nfviPopNetworkInformationRequest Input filter for selecting information to query. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryNFVIPoPNetworkInformationAsync(Filter nfviPopNetworkInformationRequest, final ApiCallback<List<NfviPop>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = queryNFVIPoPNetworkInformationValidateBeforeCall(nfviPopNetworkInformationRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<NfviPop>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for queryNetworkCapacity
     * @param queryNetworkCapacityRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryNetworkCapacityCall(QueryNetworkCapacityRequest queryNetworkCapacityRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = queryNetworkCapacityRequest;

        // create path and map variables
        String localVarPath = "/network_resources/capacities";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
    private com.squareup.okhttp.Call queryNetworkCapacityValidateBeforeCall(QueryNetworkCapacityRequest queryNetworkCapacityRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'queryNetworkCapacityRequest' is set
        if (queryNetworkCapacityRequest == null) {
            throw new ApiException("Missing the required parameter 'queryNetworkCapacityRequest' when calling queryNetworkCapacity(Async)");
        }
        

        com.squareup.okhttp.Call call = queryNetworkCapacityCall(queryNetworkCapacityRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param queryNetworkCapacityRequest  (required)
     * @return CapacityInformation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CapacityInformation queryNetworkCapacity(QueryNetworkCapacityRequest queryNetworkCapacityRequest) throws ApiException {
        ApiResponse<CapacityInformation> resp = queryNetworkCapacityWithHttpInfo(queryNetworkCapacityRequest);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param queryNetworkCapacityRequest  (required)
     * @return ApiResponse&lt;CapacityInformation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CapacityInformation> queryNetworkCapacityWithHttpInfo(QueryNetworkCapacityRequest queryNetworkCapacityRequest) throws ApiException {
        com.squareup.okhttp.Call call = queryNetworkCapacityValidateBeforeCall(queryNetworkCapacityRequest, null, null);
        Type localVarReturnType = new TypeToken<CapacityInformation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param queryNetworkCapacityRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryNetworkCapacityAsync(QueryNetworkCapacityRequest queryNetworkCapacityRequest, final ApiCallback<CapacityInformation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = queryNetworkCapacityValidateBeforeCall(queryNetworkCapacityRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CapacityInformation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for vIMallocateNetwork
     * @param params  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call vIMallocateNetworkCall(AllocateNetworkRequest params, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = params;

        // create path and map variables
        String localVarPath = "/network_resources";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
    private com.squareup.okhttp.Call vIMallocateNetworkValidateBeforeCall(AllocateNetworkRequest params, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'params' is set
        if (params == null) {
            throw new ApiException("Missing the required parameter 'params' when calling vIMallocateNetwork(Async)");
        }
        

        com.squareup.okhttp.Call call = vIMallocateNetworkCall(params, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param params  (required)
     * @return AllocateNetworkResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AllocateNetworkResult vIMallocateNetwork(AllocateNetworkRequest params) throws ApiException {
        ApiResponse<AllocateNetworkResult> resp = vIMallocateNetworkWithHttpInfo(params);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param params  (required)
     * @return ApiResponse&lt;AllocateNetworkResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AllocateNetworkResult> vIMallocateNetworkWithHttpInfo(AllocateNetworkRequest params) throws ApiException {
        com.squareup.okhttp.Call call = vIMallocateNetworkValidateBeforeCall(params, null, null);
        Type localVarReturnType = new TypeToken<AllocateNetworkResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param params  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call vIMallocateNetworkAsync(AllocateNetworkRequest params, final ApiCallback<AllocateNetworkResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = vIMallocateNetworkValidateBeforeCall(params, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AllocateNetworkResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for vIMqueryNetworks
     * @param networkQueryFilter Query filter based on e.g. name, identifier, meta-data information or status information, expressing the type of information to be retrieved. It can also be used to specify one or more resources to be queried by providing their identifiers. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call vIMqueryNetworksCall(Filter networkQueryFilter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = networkQueryFilter;

        // create path and map variables
        String localVarPath = "/network_resources";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
    private com.squareup.okhttp.Call vIMqueryNetworksValidateBeforeCall(Filter networkQueryFilter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'networkQueryFilter' is set
        if (networkQueryFilter == null) {
            throw new ApiException("Missing the required parameter 'networkQueryFilter' when calling vIMqueryNetworks(Async)");
        }
        

        com.squareup.okhttp.Call call = vIMqueryNetworksCall(networkQueryFilter, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param networkQueryFilter Query filter based on e.g. name, identifier, meta-data information or status information, expressing the type of information to be retrieved. It can also be used to specify one or more resources to be queried by providing their identifiers. (required)
     * @return List&lt;VirtualNetwork&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<VirtualNetwork> vIMqueryNetworks(Filter networkQueryFilter) throws ApiException {
        ApiResponse<List<VirtualNetwork>> resp = vIMqueryNetworksWithHttpInfo(networkQueryFilter);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param networkQueryFilter Query filter based on e.g. name, identifier, meta-data information or status information, expressing the type of information to be retrieved. It can also be used to specify one or more resources to be queried by providing their identifiers. (required)
     * @return ApiResponse&lt;List&lt;VirtualNetwork&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<VirtualNetwork>> vIMqueryNetworksWithHttpInfo(Filter networkQueryFilter) throws ApiException {
        com.squareup.okhttp.Call call = vIMqueryNetworksValidateBeforeCall(networkQueryFilter, null, null);
        Type localVarReturnType = new TypeToken<List<VirtualNetwork>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param networkQueryFilter Query filter based on e.g. name, identifier, meta-data information or status information, expressing the type of information to be retrieved. It can also be used to specify one or more resources to be queried by providing their identifiers. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call vIMqueryNetworksAsync(Filter networkQueryFilter, final ApiCallback<List<VirtualNetwork>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = vIMqueryNetworksValidateBeforeCall(networkQueryFilter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<VirtualNetwork>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for vIMterminateNetworks
     * @param networkResourceId Identifier of the virtualised network resource(s) to be terminated. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call vIMterminateNetworksCall(List<String> networkResourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/network_resources";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (networkResourceId != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "networkResourceId", networkResourceId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
    private com.squareup.okhttp.Call vIMterminateNetworksValidateBeforeCall(List<String> networkResourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'networkResourceId' is set
        if (networkResourceId == null) {
            throw new ApiException("Missing the required parameter 'networkResourceId' when calling vIMterminateNetworks(Async)");
        }
        

        com.squareup.okhttp.Call call = vIMterminateNetworksCall(networkResourceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param networkResourceId Identifier of the virtualised network resource(s) to be terminated. (required)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> vIMterminateNetworks(List<String> networkResourceId) throws ApiException {
        ApiResponse<List<String>> resp = vIMterminateNetworksWithHttpInfo(networkResourceId);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param networkResourceId Identifier of the virtualised network resource(s) to be terminated. (required)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> vIMterminateNetworksWithHttpInfo(List<String> networkResourceId) throws ApiException {
        com.squareup.okhttp.Call call = vIMterminateNetworksValidateBeforeCall(networkResourceId, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param networkResourceId Identifier of the virtualised network resource(s) to be terminated. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call vIMterminateNetworksAsync(List<String> networkResourceId, final ApiCallback<List<String>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = vIMterminateNetworksValidateBeforeCall(networkResourceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
