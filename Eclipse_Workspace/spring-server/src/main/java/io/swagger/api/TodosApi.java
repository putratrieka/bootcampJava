/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.6).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-09T04:26:37.916Z")

@Api(value = "todos", description = "the todos API")
public interface TodosApi {

    @ApiOperation(value = "Get all todo list", nickname = "todosGet", notes = "API to retrieve all to-do list", tags={ "To-do", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/todos",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> todosGet();


    @ApiOperation(value = "Get by id", nickname = "todosIdGet", notes = "Retrive todo detail based on provided ID", tags={ "To-do", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/todos/{id}",
        method = RequestMethod.GET)
    ResponseEntity<Void> todosIdGet(@ApiParam(value = "",required=true) @PathVariable("id") Integer id);

}
