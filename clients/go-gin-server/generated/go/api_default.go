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
	"github.com/gin-gonic/gin"
)

type DefaultAPI struct {
}

// Get /api/all.json
// All Products 
func (api *DefaultAPI) GetApiAllJson(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/:product/:cycle.json
// Single cycle details 
func (api *DefaultAPI) GetApiProductCycleJson(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/:product.json
// Get All Details 
func (api *DefaultAPI) GetApiProductJson(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

