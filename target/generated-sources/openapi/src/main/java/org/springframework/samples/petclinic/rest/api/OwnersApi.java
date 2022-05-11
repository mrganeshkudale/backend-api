/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.springframework.samples.petclinic.rest.api;

import org.springframework.samples.petclinic.rest.dto.OwnerDto;
import org.springframework.samples.petclinic.rest.dto.OwnerFieldsDto;
import org.springframework.samples.petclinic.rest.dto.PetDto;
import org.springframework.samples.petclinic.rest.dto.PetFieldsDto;
import org.springframework.samples.petclinic.rest.dto.RestErrorDto;
import org.springframework.samples.petclinic.rest.dto.VisitDto;
import org.springframework.samples.petclinic.rest.dto.VisitFieldsDto;
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
@Api(value = "owners", description = "the owners API")
public interface OwnersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /owners : Adds a pet owner
     * Records the details of a new pet owner.
     *
     * @param ownerFieldsDto The pet owner (required)
     * @return The pet owner was sucessfully added. (status code 201)
     *         or Bad request. (status code 400)
     *         or Server error. (status code 500)
     */
    @ApiOperation(value = "Adds a pet owner", nickname = "addOwner", notes = "Records the details of a new pet owner.", response = OwnerDto.class, tags={ "owner", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "The pet owner was sucessfully added.", response = OwnerDto.class),
        @ApiResponse(code = 400, message = "Bad request.", response = RestErrorDto.class),
        @ApiResponse(code = 500, message = "Server error.", response = RestErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/owners",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<OwnerDto> addOwner(@ApiParam(value = "The pet owner" ,required=true )  @Valid @RequestBody OwnerFieldsDto ownerFieldsDto) {
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
     * POST /owners/{ownerId}/pets : Adds a pet to an owner
     * Records the details of a new pet.
     *
     * @param ownerId The ID of the pet owner. (required)
     * @param petFieldsDto The details of the new pet. (required)
     * @return The pet was sucessfully added. (status code 201)
     *         or Bad request. (status code 400)
     *         or Pet not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @ApiOperation(value = "Adds a pet to an owner", nickname = "addPetToOwner", notes = "Records the details of a new pet.", response = PetDto.class, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "The pet was sucessfully added.", response = PetDto.class),
        @ApiResponse(code = 400, message = "Bad request.", response = RestErrorDto.class),
        @ApiResponse(code = 404, message = "Pet not found.", response = RestErrorDto.class),
        @ApiResponse(code = 500, message = "Server error.", response = RestErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/owners/{ownerId}/pets",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PetDto> addPetToOwner(@Min(0)@ApiParam(value = "The ID of the pet owner.",required=true) @PathVariable("ownerId") Integer ownerId,@ApiParam(value = "The details of the new pet." ,required=true )  @Valid @RequestBody PetFieldsDto petFieldsDto) {
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
     * POST /owners/{ownerId}/pets/{petId}/visits : Adds a vet visit
     * Records the details of a new vet visit.
     *
     * @param ownerId The ID of the pet owner. (required)
     * @param petId The ID of the pet. (required)
     * @param visitFieldsDto The details of the new vet visit. (required)
     * @return The vet visit was sucessfully added. (status code 201)
     *         or Bad request. (status code 400)
     *         or Pet not found for this owner. (status code 404)
     *         or Server error. (status code 500)
     */
    @ApiOperation(value = "Adds a vet visit", nickname = "addVisitToOwner", notes = "Records the details of a new vet visit.", response = VisitDto.class, tags={ "visit", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "The vet visit was sucessfully added.", response = VisitDto.class),
        @ApiResponse(code = 400, message = "Bad request.", response = RestErrorDto.class),
        @ApiResponse(code = 404, message = "Pet not found for this owner.", response = RestErrorDto.class),
        @ApiResponse(code = 500, message = "Server error.", response = RestErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/owners/{ownerId}/pets/{petId}/visits",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<VisitDto> addVisitToOwner(@Min(0)@ApiParam(value = "The ID of the pet owner.",required=true) @PathVariable("ownerId") Integer ownerId,@Min(0)@ApiParam(value = "The ID of the pet.",required=true) @PathVariable("petId") Integer petId,@ApiParam(value = "The details of the new vet visit." ,required=true )  @Valid @RequestBody VisitFieldsDto visitFieldsDto) {
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
     * DELETE /owners/{ownerId} : Delete an owner by ID
     * Returns the owner or a 404 error.
     *
     * @param ownerId The ID of the owner. (required)
     * @return Owner details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or Owner  not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @ApiOperation(value = "Delete an owner by ID", nickname = "deleteOwner", notes = "Returns the owner or a 404 error.", response = OwnerDto.class, tags={ "owner", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Owner details found and returned.", response = OwnerDto.class),
        @ApiResponse(code = 304, message = "Not modified."),
        @ApiResponse(code = 400, message = "Bad request.", response = RestErrorDto.class),
        @ApiResponse(code = 404, message = "Owner  not found.", response = RestErrorDto.class),
        @ApiResponse(code = 500, message = "Server error.", response = RestErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/owners/{ownerId}",
        produces = { "application/json" }
    )
    default ResponseEntity<OwnerDto> deleteOwner(@Min(0)@ApiParam(value = "The ID of the owner.",required=true) @PathVariable("ownerId") Integer ownerId) {
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
     * GET /owners/{ownerId} : Get a pet owner by ID
     * Returns the pet owner or a 404 error.
     *
     * @param ownerId The ID of the pet owner. (required)
     * @return Owner details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or Owner not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @ApiOperation(value = "Get a pet owner by ID", nickname = "getOwner", notes = "Returns the pet owner or a 404 error.", response = OwnerDto.class, tags={ "owner", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Owner details found and returned.", response = OwnerDto.class),
        @ApiResponse(code = 304, message = "Not modified."),
        @ApiResponse(code = 400, message = "Bad request.", response = RestErrorDto.class),
        @ApiResponse(code = 404, message = "Owner not found.", response = RestErrorDto.class),
        @ApiResponse(code = 500, message = "Server error.", response = RestErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/owners/{ownerId}",
        produces = { "application/json" }
    )
    default ResponseEntity<OwnerDto> getOwner(@Min(0)@ApiParam(value = "The ID of the pet owner.",required=true) @PathVariable("ownerId") Integer ownerId) {
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
     * GET /owners/{ownerId}/pets/{petId} : Get a pet by ID
     * Returns the pet or a 404 error.
     *
     * @param ownerId The ID of the pet owner. (required)
     * @param petId The ID of the pet. (required)
     * @return Pet details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or Pet not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @ApiOperation(value = "Get a pet by ID", nickname = "getOwnersPet", notes = "Returns the pet or a 404 error.", response = PetDto.class, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Pet details found and returned.", response = PetDto.class),
        @ApiResponse(code = 304, message = "Not modified."),
        @ApiResponse(code = 400, message = "Bad request.", response = RestErrorDto.class),
        @ApiResponse(code = 404, message = "Pet not found.", response = RestErrorDto.class),
        @ApiResponse(code = 500, message = "Server error.", response = RestErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/owners/{ownerId}/pets/{petId}",
        produces = { "application/json" }
    )
    default ResponseEntity<PetDto> getOwnersPet(@Min(0)@ApiParam(value = "The ID of the pet owner.",required=true) @PathVariable("ownerId") Integer ownerId,@Min(0)@ApiParam(value = "The ID of the pet.",required=true) @PathVariable("petId") Integer petId) {
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
     * GET /owners : Lists pet owners
     * Returns an array of pet owners.
     *
     * @param lastName Last name. (optional)
     * @return Owner details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Server error. (status code 500)
     */
    @ApiOperation(value = "Lists pet owners", nickname = "listOwners", notes = "Returns an array of pet owners.", response = OwnerDto.class, responseContainer = "List", tags={ "owner", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Owner details found and returned.", response = OwnerDto.class, responseContainer = "List"),
        @ApiResponse(code = 304, message = "Not modified."),
        @ApiResponse(code = 500, message = "Server error.", response = RestErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/owners",
        produces = { "application/json" }
    )
    default ResponseEntity<List<OwnerDto>> listOwners(@ApiParam(value = "Last name.") @Valid @RequestParam(value = "lastName", required = false) String lastName) {
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
     * PUT /owners/{ownerId} : Update a pet owner&#39;s details
     * Updates the pet owner record with the specified details.
     *
     * @param ownerId The ID of the pet owner. (required)
     * @param ownerFieldsDto The pet owner details to use for the update. (required)
     * @return Update successful. (status code 200)
     *         or Bad request. (status code 400)
     *         or Owner not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @ApiOperation(value = "Update a pet owner's details", nickname = "updateOwner", notes = "Updates the pet owner record with the specified details.", response = OwnerDto.class, tags={ "owner", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Update successful.", response = OwnerDto.class),
        @ApiResponse(code = 400, message = "Bad request.", response = RestErrorDto.class),
        @ApiResponse(code = 404, message = "Owner not found.", response = RestErrorDto.class),
        @ApiResponse(code = 500, message = "Server error.", response = RestErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/owners/{ownerId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<OwnerDto> updateOwner(@Min(0)@ApiParam(value = "The ID of the pet owner.",required=true) @PathVariable("ownerId") Integer ownerId,@ApiParam(value = "The pet owner details to use for the update." ,required=true )  @Valid @RequestBody OwnerFieldsDto ownerFieldsDto) {
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
     * PUT /owners/{ownerId}/pets/{petId} : Update a pet&#39;s details
     * Updates the pet record with the specified details.
     *
     * @param ownerId The ID of the pet owner. (required)
     * @param petId The ID of the pet. (required)
     * @param petFieldsDto The pet details to use for the update. (required)
     * @return Update successful. (status code 204)
     *         or Bad request. (status code 400)
     *         or Pet not found for this owner. (status code 404)
     *         or Server error. (status code 500)
     */
    @ApiOperation(value = "Update a pet's details", nickname = "updateOwnersPet", notes = "Updates the pet record with the specified details.", tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Update successful."),
        @ApiResponse(code = 400, message = "Bad request.", response = RestErrorDto.class),
        @ApiResponse(code = 404, message = "Pet not found for this owner.", response = RestErrorDto.class),
        @ApiResponse(code = 500, message = "Server error.", response = RestErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/owners/{ownerId}/pets/{petId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> updateOwnersPet(@Min(0)@ApiParam(value = "The ID of the pet owner.",required=true) @PathVariable("ownerId") Integer ownerId,@Min(0)@ApiParam(value = "The ID of the pet.",required=true) @PathVariable("petId") Integer petId,@ApiParam(value = "The pet details to use for the update." ,required=true )  @Valid @RequestBody PetFieldsDto petFieldsDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
