package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Cycle;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2023-09-16T14:43:23.018220Z[Etc/UTC]")
@Controller
public class DefaultApiController implements DefaultApi {
    private final ObjectMapper objectMapper;
@Autowired
    public DefaultApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Object> getApiAllJson(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Cycle> getApiProductCycleJson(@ApiParam(value = "Product URL as per the canonical URL on the endofife.date website",required=true ) @PathVariable("product") Object product,
        @ApiParam(value = "Release Cycle for which the details must be fetched",required=true ) @PathVariable("cycle") Object cycle,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Cycle>(objectMapper.readValue("", Cycle.class), HttpStatus.OK);
        }

        return new ResponseEntity<Cycle>(HttpStatus.OK);
    }

    public ResponseEntity<Object> getApiProductJson(@ApiParam(value = "Product URL as per the canonical URL on the endofife.date website",required=true ) @PathVariable("product") Object product,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}
