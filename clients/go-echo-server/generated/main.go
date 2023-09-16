package main

import (
	"github.com/cliffano/endoflife.date-api-clients/handlers"
	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
)

func main() {
	e := echo.New()

    //todo: handle the error!
	c, _ := handlers.NewContainer()

	// Middleware
	e.Use(middleware.Logger())
	e.Use(middleware.Recover())


	// GetApiAllJson - All Products
	e.GET("/api/all.json", c.GetApiAllJson)

	// GetApiProductCycleJson - Single cycle details
	e.GET("/api/:product/:cycle.json", c.GetApiProductCycleJson)

	// GetApiProductJson - Get All Details
	e.GET("/api/:product.json", c.GetApiProductJson)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}