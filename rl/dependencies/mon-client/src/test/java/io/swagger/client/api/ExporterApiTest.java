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

import io.swagger.client.ApiException;
import com.rl.extinterface.mon.swagger.client.model.Exporter;
import com.rl.extinterface.mon.swagger.client.model.ExporterDescription;
import com.rl.extinterface.mon.swagger.client.model.ExporterQueryResult;
import com.rl.extinterface.mon.swagger.client.model.InlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExporterApi
 */
@Ignore
public class ExporterApiTest {

    private final ExporterApi api = new ExporterApi();

    
    /**
     * Delete exporter
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteExporterTest() throws ApiException {
        String exporterId = null;
        InlineResponse200 response = api.deleteExporter(exporterId);

        // TODO: test validations
    }
    
    /**
     * Get exporter details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExporterTest() throws ApiException {
        String exporterId = null;
        Exporter response = api.getExporter(exporterId);

        // TODO: test validations
    }
    
    /**
     * Get all exporters
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExportersTest() throws ApiException {
        ExporterQueryResult response = api.getExporters();

        // TODO: test validations
    }
    
    /**
     * Create new exporter
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postExporterTest() throws ApiException {
        ExporterDescription exporter = null;
        Exporter response = api.postExporter(exporter);

        // TODO: test validations
    }
    
    /**
     * Update exporter
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putExporterTest() throws ApiException {
        String exporterId = null;
        Exporter exporter = null;
        Exporter response = api.putExporter(exporterId, exporter);

        // TODO: test validations
    }
    
}
