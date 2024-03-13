/*
 * endoflife.date
 *
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * API version: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// DefaultAPIController binds http requests to an api service and writes the service results to the http response
type DefaultAPIController struct {
	service DefaultAPIServicer
	errorHandler ErrorHandler
}

// DefaultAPIOption for how the controller is set up.
type DefaultAPIOption func(*DefaultAPIController)

// WithDefaultAPIErrorHandler inject ErrorHandler into controller
func WithDefaultAPIErrorHandler(h ErrorHandler) DefaultAPIOption {
	return func(c *DefaultAPIController) {
		c.errorHandler = h
	}
}

// NewDefaultAPIController creates a default api controller
func NewDefaultAPIController(s DefaultAPIServicer, opts ...DefaultAPIOption) Router {
	controller := &DefaultAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the DefaultAPIController
func (c *DefaultAPIController) Routes() Routes {
	return Routes{
		"GetApiAllJson": Route{
			strings.ToUpper("Get"),
			"/api/all.json",
			c.GetApiAllJson,
		},
		"GetApiProductCycleJson": Route{
			strings.ToUpper("Get"),
			"/api/{product}/{cycle}.json",
			c.GetApiProductCycleJson,
		},
		"GetApiProductJson": Route{
			strings.ToUpper("Get"),
			"/api/{product}.json",
			c.GetApiProductJson,
		},
	}
}

// GetApiAllJson - All Products
func (c *DefaultAPIController) GetApiAllJson(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetApiAllJson(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetApiProductCycleJson - Single cycle details
func (c *DefaultAPIController) GetApiProductCycleJson(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	productParam := params["product"]
	cycleParam := params["cycle"]
	result, err := c.service.GetApiProductCycleJson(r.Context(), productParam, cycleParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetApiProductJson - Get All Details
func (c *DefaultAPIController) GetApiProductJson(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	productParam := params["product"]
	result, err := c.service.GetApiProductJson(r.Context(), productParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
