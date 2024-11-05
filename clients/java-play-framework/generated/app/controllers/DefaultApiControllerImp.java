package controllers;

import apimodels.Cycle;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-04T23:48:13.967501037Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DefaultApiControllerImp extends DefaultApiControllerImpInterface {
    @Override
    public List<String> getApiAllJson(Http.Request request) throws Exception {
        //Do your magic!!!
        return new ArrayList<String>();
    }

    @Override
    public Cycle getApiProductCycleJson(Http.Request request, String product, String cycle) throws Exception {
        //Do your magic!!!
        return new Cycle();
    }

    @Override
    public List<Cycle> getApiProductJson(Http.Request request, String product) throws Exception {
        //Do your magic!!!
        return new ArrayList<Cycle>();
    }

}
