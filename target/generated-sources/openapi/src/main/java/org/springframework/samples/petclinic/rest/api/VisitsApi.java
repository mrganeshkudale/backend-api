/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.springframework.samples.petclinic.rest.api;

import org.springframework.samples.petclinic.rest.dto.RestErrorDto;
import org.springframework.samples.petclinic.rest.dto.VisitDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-11T15:33:08.613541700+05:30[Asia/Calcutta]")
@Validated
@Api(value = "visits", description = "the visits API")
public interface VisitsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /visits : Create a visit
     * Creates a visit.
     *
     * @param visitDto The visit (required)
     * @return visit created successfully. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or Visit not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @ApiOperation(value = "Create a visit", nickname = "addVisit", notes = "Creates a visit.", response = VisitDto.class, tags={ "visit", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "visit created successfully.", response = VisitDto.class),
        @ApiResponse(code = 304, message = "Not modified."),
        @ApiResponse(code = 400, message = "Bad request.", response = RestErrorDto.class),
        @ApiResponse(code = 404, message = "Visit not found.", response = RestErrorDto.class),
        @ApiResponse(code = 500, message = "Server error.", response = RestErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/visits",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<VisitDto> addVisit(@ApiParam(value = "The visit" ,required=true )  @Valid @RequestBody VisitDto visitDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /visits/{visitId} : Delete a visit by ID
     * Returns the visit or a 404 error.
     *
     * @param visitId The ID of the visit. (required)
     * @return Visit details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or Visit not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @ApiOperation(value = "Delete a visit by ID", nickname = "deleteVisit", notes = "Returns the visit or a 404 error.", response = VisitDto.class, tags={ "visit", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Visit details found and returned.", response = VisitDto.class),
        @ApiResponse(code = 304, message = "Not modified."),
        @ApiResponse(code = 400, message = "Bad request.", response = RestErrorDto.class),
        @ApiResponse(code = 404, message = "Visit not found.", response = RestErrorDto.class),
        @ApiResponse(code = 500, message = "Server error.", response = RestErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/visits/{visitId}",
        produces = { "application/json" }
    )
    default ResponseEntity<VisitDto> deleteVisit(@Min(0)@ApiParam(value = "The ID of the visit.",required=true) @PathVariable("visitId") Integer visitId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /visits/{visitId} : Get a visit by ID
     * Returns the visit or a 404 error.
     *
     * @param visitId The ID of the visit. (required)
     * @return Visit details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or Visit not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @ApiOperation(value = "Get a visit by ID", nickname = "getVisit", notes = "Returns the visit or a 404 error.", response = VisitDto.class, tags={ "visit", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Visit details found and returned.", response = VisitDto.class),
        @ApiResponse(code = 304, message = "Not modified."),
        @ApiResponse(code = 400, message = "Bad request.", response = RestErrorDto.class),
        @ApiResponse(code = 404, message = "Visit not found.", response = RestErrorDto.class),
        @ApiResponse(code = 500, message = "Server error.", response = RestErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/visits/{visitId}",
        produces = { "application/json" }
    )
    default ResponseEntity<VisitDto> getVisit(@Min(0)@ApiParam(value = "The ID of the visit.",required=true) @PathVariable("visitId") Integer visitId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /visits : Lists visits
     * Returns an array of visit .
     *
     * @return visits found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Server error. (status code 500)
     */
    @ApiOperation(value = "Lists visits", nickname = "listVisits", notes = "Returns an array of visit .", response = VisitDto.class, responseContainer = "List", tags={ "visit", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "visits found and returned.", response = VisitDto.class, responseContainer = "List"),
        @ApiResponse(code = 304, message = "Not modified."),
        @ApiResponse(code = 500, message = "Server error.", response = RestErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/visits",
        produces = { "application/json" }
    )
    default ResponseEntity<List<VisitDto>> listVisits() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /visits/{visitId} : Update a visit by ID
     * Returns the visit or a 404 error.
     *
     * @param visitId The ID of the visit. (required)
     * @param visitDto The visit (required)
     * @return Visit details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or Visit not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @ApiOperation(value = "Update a visit by ID", nickname = "updateVisit", notes = "Returns the visit or a 404 error.", response = VisitDto.class, tags={ "visit", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Visit details found and returned.", response = VisitDto.class),
        @ApiResponse(code = 304, message = "Not modified."),
        @ApiResponse(code = 400, message = "Bad request.", response = RestErrorDto.class),
        @ApiResponse(code = 404, message = "Visit not found.", response = RestErrorDto.class),
        @ApiResponse(code = 500, message = "Server error.", response = RestErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/visits/{visitId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<VisitDto> updateVisit(@Min(0)@ApiParam(value = "The ID of the visit.",required=true) @PathVariable("visitId") Integer visitId,@ApiParam(value = "The visit" ,required=true )  @Valid @RequestBody VisitDto visitDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
