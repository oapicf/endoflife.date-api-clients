#' Create a new Cycle
#'
#' @description
#' Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
#'
#' @docType class
#' @title Cycle
#' @description Cycle Class
#' @format An \code{R6Class} generator object
#' @field cycle  \link{CycleCycle} [optional]
#' @field releaseDate Release date for the first release in this cycle. character [optional]
#' @field eol  \link{CycleEol} [optional]
#' @field latest Latest release in this cycle. character [optional]
#' @field link Link to changelog for the latest release in this cycle, or null if unavailable. character [optional]
#' @field lts  \link{CycleLts} [optional]
#' @field support  \link{CycleSupport} [optional]
#' @field discontinued  \link{CycleDiscontinued} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Cycle <- R6::R6Class(
  "Cycle",
  public = list(
    `cycle` = NULL,
    `releaseDate` = NULL,
    `eol` = NULL,
    `latest` = NULL,
    `link` = NULL,
    `lts` = NULL,
    `support` = NULL,
    `discontinued` = NULL,

    #' @description
    #' Initialize a new Cycle class.
    #'
    #' @param cycle cycle
    #' @param releaseDate Release date for the first release in this cycle.
    #' @param eol eol
    #' @param latest Latest release in this cycle.
    #' @param link Link to changelog for the latest release in this cycle, or null if unavailable.
    #' @param lts lts
    #' @param support support
    #' @param discontinued discontinued
    #' @param ... Other optional arguments.
    initialize = function(`cycle` = NULL, `releaseDate` = NULL, `eol` = NULL, `latest` = NULL, `link` = NULL, `lts` = NULL, `support` = NULL, `discontinued` = NULL, ...) {
      if (!is.null(`cycle`)) {
        stopifnot(R6::is.R6(`cycle`))
        self$`cycle` <- `cycle`
      }
      if (!is.null(`releaseDate`)) {
        if (!is.character(`releaseDate`)) {
          stop(paste("Error! Invalid data for `releaseDate`. Must be a string:", `releaseDate`))
        }
        self$`releaseDate` <- `releaseDate`
      }
      if (!is.null(`eol`)) {
        stopifnot(R6::is.R6(`eol`))
        self$`eol` <- `eol`
      }
      if (!is.null(`latest`)) {
        if (!(is.character(`latest`) && length(`latest`) == 1)) {
          stop(paste("Error! Invalid data for `latest`. Must be a string:", `latest`))
        }
        self$`latest` <- `latest`
      }
      if (!is.null(`link`)) {
        if (!(is.character(`link`) && length(`link`) == 1)) {
          stop(paste("Error! Invalid data for `link`. Must be a string:", `link`))
        }
        self$`link` <- `link`
      }
      if (!is.null(`lts`)) {
        stopifnot(R6::is.R6(`lts`))
        self$`lts` <- `lts`
      }
      if (!is.null(`support`)) {
        stopifnot(R6::is.R6(`support`))
        self$`support` <- `support`
      }
      if (!is.null(`discontinued`)) {
        stopifnot(R6::is.R6(`discontinued`))
        self$`discontinued` <- `discontinued`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return Cycle as a base R list.
    #' @examples
    #' # convert array of Cycle (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert Cycle to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CycleObject <- list()
      if (!is.null(self$`cycle`)) {
        CycleObject[["cycle"]] <-
          self$`cycle`$toSimpleType()
      }
      if (!is.null(self$`releaseDate`)) {
        CycleObject[["releaseDate"]] <-
          self$`releaseDate`
      }
      if (!is.null(self$`eol`)) {
        CycleObject[["eol"]] <-
          self$`eol`$toSimpleType()
      }
      if (!is.null(self$`latest`)) {
        CycleObject[["latest"]] <-
          self$`latest`
      }
      if (!is.null(self$`link`)) {
        CycleObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`lts`)) {
        CycleObject[["lts"]] <-
          self$`lts`$toSimpleType()
      }
      if (!is.null(self$`support`)) {
        CycleObject[["support"]] <-
          self$`support`$toSimpleType()
      }
      if (!is.null(self$`discontinued`)) {
        CycleObject[["discontinued"]] <-
          self$`discontinued`$toSimpleType()
      }
      return(CycleObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of Cycle
    #'
    #' @param input_json the JSON input
    #' @return the instance of Cycle
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`cycle`)) {
        `cycle_object` <- CycleCycle$new()
        `cycle_object`$fromJSON(jsonlite::toJSON(this_object$`cycle`, auto_unbox = TRUE, digits = NA))
        self$`cycle` <- `cycle_object`
      }
      if (!is.null(this_object$`releaseDate`)) {
        self$`releaseDate` <- this_object$`releaseDate`
      }
      if (!is.null(this_object$`eol`)) {
        `eol_object` <- CycleEol$new()
        `eol_object`$fromJSON(jsonlite::toJSON(this_object$`eol`, auto_unbox = TRUE, digits = NA))
        self$`eol` <- `eol_object`
      }
      if (!is.null(this_object$`latest`)) {
        self$`latest` <- this_object$`latest`
      }
      if (!is.null(this_object$`link`)) {
        self$`link` <- this_object$`link`
      }
      if (!is.null(this_object$`lts`)) {
        `lts_object` <- CycleLts$new()
        `lts_object`$fromJSON(jsonlite::toJSON(this_object$`lts`, auto_unbox = TRUE, digits = NA))
        self$`lts` <- `lts_object`
      }
      if (!is.null(this_object$`support`)) {
        `support_object` <- CycleSupport$new()
        `support_object`$fromJSON(jsonlite::toJSON(this_object$`support`, auto_unbox = TRUE, digits = NA))
        self$`support` <- `support_object`
      }
      if (!is.null(this_object$`discontinued`)) {
        `discontinued_object` <- CycleDiscontinued$new()
        `discontinued_object`$fromJSON(jsonlite::toJSON(this_object$`discontinued`, auto_unbox = TRUE, digits = NA))
        self$`discontinued` <- `discontinued_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return Cycle in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Cycle
    #'
    #' @param input_json the JSON input
    #' @return the instance of Cycle
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`cycle` <- CycleCycle$new()$fromJSON(jsonlite::toJSON(this_object$`cycle`, auto_unbox = TRUE, digits = NA))
      self$`releaseDate` <- this_object$`releaseDate`
      self$`eol` <- CycleEol$new()$fromJSON(jsonlite::toJSON(this_object$`eol`, auto_unbox = TRUE, digits = NA))
      self$`latest` <- this_object$`latest`
      self$`link` <- this_object$`link`
      self$`lts` <- CycleLts$new()$fromJSON(jsonlite::toJSON(this_object$`lts`, auto_unbox = TRUE, digits = NA))
      self$`support` <- CycleSupport$new()$fromJSON(jsonlite::toJSON(this_object$`support`, auto_unbox = TRUE, digits = NA))
      self$`discontinued` <- CycleDiscontinued$new()$fromJSON(jsonlite::toJSON(this_object$`discontinued`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to Cycle and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Cycle
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (nchar(self$`releaseDate`) > 10) {
        return(FALSE)
      }
      if (nchar(self$`releaseDate`) < 10) {
        return(FALSE)
      }

      if (nchar(self$`latest`) < 1) {
        return(FALSE)
      }

      if (nchar(self$`link`) < 1) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      if (nchar(self$`releaseDate`) > 10) {
        invalid_fields["releaseDate"] <- "Invalid length for `releaseDate`, must be smaller than or equal to 10."
      }
      if (nchar(self$`releaseDate`) < 10) {
        invalid_fields["releaseDate"] <- "Invalid length for `releaseDate`, must be bigger than or equal to 10."
      }

      if (nchar(self$`latest`) < 1) {
        invalid_fields["latest"] <- "Invalid length for `latest`, must be bigger than or equal to 1."
      }

      if (nchar(self$`link`) < 1) {
        invalid_fields["link"] <- "Invalid length for `link`, must be bigger than or equal to 1."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# Cycle$unlock()
#
## Below is an example to define the print function
# Cycle$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Cycle$lock()

