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
	"context"
	"net/http"
	"errors"
)

// DefaultAPIService is a service that implements the logic for the DefaultAPIServicer
// This service should implement the business logic for every endpoint for the DefaultAPI API.
// Include any external packages or services that will be required by this service.
type DefaultAPIService struct {
}

// NewDefaultAPIService creates a default api service
func NewDefaultAPIService() DefaultAPIServicer {
	return &DefaultAPIService{}
}

// GetApiAllJson - All Products
func (s *DefaultAPIService) GetApiAllJson(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetApiAllJson with the required logic for this service method.
	// Add api_default_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, interface{}{}) or use other options such as http.Ok ...
	// return Response(200, interface{}{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetApiAllJson method not implemented")
}

// GetApiProductCycleJson - Single cycle details
func (s *DefaultAPIService) GetApiProductCycleJson(ctx context.Context, product interface{}, cycle interface{}) (ImplResponse, error) {
	// TODO - update GetApiProductCycleJson with the required logic for this service method.
	// Add api_default_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Cycle{}) or use other options such as http.Ok ...
	// return Response(200, Cycle{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetApiProductCycleJson method not implemented")
}

// GetApiProductJson - Get All Details
func (s *DefaultAPIService) GetApiProductJson(ctx context.Context, product interface{}) (ImplResponse, error) {
	// TODO - update GetApiProductJson with the required logic for this service method.
	// Add api_default_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, interface{}{}) or use other options such as http.Ok ...
	// return Response(200, interface{}{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetApiProductJson method not implemented")
}
