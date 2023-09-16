package handlers
import (
    "github.com/cliffano/endoflife.date-api-clients/models"
    "github.com/labstack/echo/v4"
    "net/http"
)

// GetApiAllJson - All Products
func (c *Container) GetApiAllJson(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// GetApiProductCycleJson - Single cycle details
func (c *Container) GetApiProductCycleJson(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}


// GetApiProductJson - Get All Details
func (c *Container) GetApiProductJson(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}
