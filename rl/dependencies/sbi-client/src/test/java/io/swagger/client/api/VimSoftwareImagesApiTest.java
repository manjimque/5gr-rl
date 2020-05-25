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


import com.rl.extinterface.nbi.swagger.model.SoftwareImageAddQuery;
import com.rl.extinterface.nbi.swagger.model.SoftwareImageInformation;
import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for VimSoftwareImagesApi
 */
@Ignore
public class VimSoftwareImagesApiTest {

    private final VimSoftwareImagesApi api = new VimSoftwareImagesApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSoftwareImageTest() throws ApiException {
        SoftwareImageAddQuery body = null;
        SoftwareImageInformation response = api.addSoftwareImage(body);

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
    public void deleteSoftwareImageTest() throws ApiException {
        String id = null;
        String response = api.deleteSoftwareImage(id);

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
    public void querySoftwareImageTest() throws ApiException {
        String id = null;
        SoftwareImageInformation response = api.querySoftwareImage(id);

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
    public void querySoftwareImagesTest() throws ApiException {
        List<SoftwareImageInformation> response = api.querySoftwareImages();

        // TODO: test validations
    }
    
}
