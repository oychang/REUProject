package io.swagger.client.api;

import io.swagger.client.ApiExceptionAndroid;
import io.swagger.client.ApiInvokerAndroid;
import io.swagger.client.PairAndroid;

import java.util.*;

import io.swagger.client.model.AccessPoint;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;


public class AccessPointApi {
  String basePath = "http://192.168.1.123:8080/v1";
  ApiInvokerAndroid apiInvoker = ApiInvokerAndroid.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvokerAndroid getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }


  /**
   * Get a listing of all available access points for a map
   *
   * @return List<AccessPoint>
   */
  public List<AccessPoint>  accessPointsGet () throws ApiExceptionAndroid {
    Object localVarPostBody = null;


    // create path and map variables
    String localVarPath = "/access_points".replaceAll("\\{format\\}","json");

    // query params
    List<PairAndroid> localVarQueryParams = new ArrayList<PairAndroid>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<String, String>();





    String[] localVarContentTypes = {

    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();


      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params

    }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (List<AccessPoint>) ApiInvokerAndroid.deserialize(localVarResponse, "array", AccessPoint.class);
      }
      else {
        return null;
      }
    } catch (ApiExceptionAndroid ex) {
      throw ex;
    }
  }

}
