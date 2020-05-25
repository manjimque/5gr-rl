package com.rl.extinterface.nbi.swagger.api;
//TO BE REMOVED

import com.rl.extinterface.nbi.swagger.model.Filter;
import com.rl.extinterface.nbi.swagger.model.VirtualNetworkResourceInformation;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import javax.validation.Valid;

@Path("/information")
@Api(description = "the information API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-04-17T12:21:14.657Z")
public class InformationApi {

    @GET
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = VirtualNetworkResourceInformation.class, responseContainer = "List", tags={ "VIMNetworkResourcesInformation" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Virtualised network resource information in the VIM that satisfies the query condition.", response = VirtualNetworkResourceInformation.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad request", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class)
    })
    public Response queryNetworkInformation(@Valid Filter informationQueryFilter) {
        return Response.ok().entity("magic!").build();
    }
}
