#' Create a new Cycle
#'
#' @description
#' Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
#'
#' @docType class
#' @title Cycle
#' @description Cycle Class
#' @format An \code{R6Class} generator object
#' @field cycle Release Cycle \link{AnyType} [optional]
#' @field releaseDate Release Date for the first release in this cycle \link{AnyType} [optional]
#' @field eol End of Life Date for this release cycle \link{AnyType} [optional]
#' @field latest Latest release in this cycle \link{AnyType} [optional]
#' @field link Link to changelog for the latest release, if available \link{AnyType} [optional]
#' @field lts Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. \link{AnyType} [optional]
#' @field support Whether this release cycle has active support \link{AnyType} [optional]
#' @field discontinued Whether this cycle is now discontinued. \link{AnyType} [optional]
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
    #' Initialize a new Cycle class.
    #'
    #' @description
    #' Initialize a new Cycle class.
    #'
    #' @param cycle Release Cycle
    #' @param releaseDate Release Date for the first release in this cycle
    #' @param eol End of Life Date for this release cycle
    #' @param latest Latest release in this cycle
    #' @param link Link to changelog for the latest release, if available
    #' @param lts Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.
    #' @param support Whether this release cycle has active support
    #' @param discontinued Whether this cycle is now discontinued.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`cycle` = NULL, `releaseDate` = NULL, `eol` = NULL, `latest` = NULL, `link` = NULL, `lts` = NULL, `support` = NULL, `discontinued` = NULL, ...) {
      if (!is.null(`cycle`)) {
        stopifnot(R6::is.R6(`cycle`))
        self$`cycle` <- `cycle`
      }
      if (!is.null(`releaseDate`)) {
        stopifnot(R6::is.R6(`releaseDate`))
        self$`releaseDate` <- `releaseDate`
      }
      if (!is.null(`eol`)) {
        stopifnot(R6::is.R6(`eol`))
        self$`eol` <- `eol`
      }
      if (!is.null(`latest`)) {
        stopifnot(R6::is.R6(`latest`))
        self$`latest` <- `latest`
      }
      if (!is.null(`link`)) {
        stopifnot(R6::is.R6(`link`))
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Cycle in JSON format
    #' @export
    toJSON = function() {
      CycleObject <- list()
      if (!is.null(self$`cycle`)) {
        CycleObject[["cycle"]] <-
          self$`cycle`$toJSON()
      }
      if (!is.null(self$`releaseDate`)) {
        CycleObject[["releaseDate"]] <-
          self$`releaseDate`$toJSON()
      }
      if (!is.null(self$`eol`)) {
        CycleObject[["eol"]] <-
          self$`eol`$toJSON()
      }
      if (!is.null(self$`latest`)) {
        CycleObject[["latest"]] <-
          self$`latest`$toJSON()
      }
      if (!is.null(self$`link`)) {
        CycleObject[["link"]] <-
          self$`link`$toJSON()
      }
      if (!is.null(self$`lts`)) {
        CycleObject[["lts"]] <-
          self$`lts`$toJSON()
      }
      if (!is.null(self$`support`)) {
        CycleObject[["support"]] <-
          self$`support`$toJSON()
      }
      if (!is.null(self$`discontinued`)) {
        CycleObject[["discontinued"]] <-
          self$`discontinued`$toJSON()
      }
      CycleObject
    },
    #' Deserialize JSON string into an instance of Cycle
    #'
    #' @description
    #' Deserialize JSON string into an instance of Cycle
    #'
    #' @param input_json the JSON input
    #' @return the instance of Cycle
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`cycle`)) {
        `cycle_object` <- AnyType$new()
        `cycle_object`$fromJSON(jsonlite::toJSON(this_object$`cycle`, auto_unbox = TRUE, digits = NA))
        self$`cycle` <- `cycle_object`
      }
      if (!is.null(this_object$`releaseDate`)) {
        `releasedate_object` <- AnyType$new()
        `releasedate_object`$fromJSON(jsonlite::toJSON(this_object$`releaseDate`, auto_unbox = TRUE, digits = NA))
        self$`releaseDate` <- `releasedate_object`
      }
      if (!is.null(this_object$`eol`)) {
        `eol_object` <- AnyType$new()
        `eol_object`$fromJSON(jsonlite::toJSON(this_object$`eol`, auto_unbox = TRUE, digits = NA))
        self$`eol` <- `eol_object`
      }
      if (!is.null(this_object$`latest`)) {
        `latest_object` <- AnyType$new()
        `latest_object`$fromJSON(jsonlite::toJSON(this_object$`latest`, auto_unbox = TRUE, digits = NA))
        self$`latest` <- `latest_object`
      }
      if (!is.null(this_object$`link`)) {
        `link_object` <- AnyType$new()
        `link_object`$fromJSON(jsonlite::toJSON(this_object$`link`, auto_unbox = TRUE, digits = NA))
        self$`link` <- `link_object`
      }
      if (!is.null(this_object$`lts`)) {
        `lts_object` <- AnyType$new()
        `lts_object`$fromJSON(jsonlite::toJSON(this_object$`lts`, auto_unbox = TRUE, digits = NA))
        self$`lts` <- `lts_object`
      }
      if (!is.null(this_object$`support`)) {
        `support_object` <- AnyType$new()
        `support_object`$fromJSON(jsonlite::toJSON(this_object$`support`, auto_unbox = TRUE, digits = NA))
        self$`support` <- `support_object`
      }
      if (!is.null(this_object$`discontinued`)) {
        `discontinued_object` <- AnyType$new()
        `discontinued_object`$fromJSON(jsonlite::toJSON(this_object$`discontinued`, auto_unbox = TRUE, digits = NA))
        self$`discontinued` <- `discontinued_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Cycle in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`cycle`)) {
          sprintf(
          '"cycle":
          %s
          ',
          jsonlite::toJSON(self$`cycle`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`releaseDate`)) {
          sprintf(
          '"releaseDate":
          %s
          ',
          jsonlite::toJSON(self$`releaseDate`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`eol`)) {
          sprintf(
          '"eol":
          %s
          ',
          jsonlite::toJSON(self$`eol`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`latest`)) {
          sprintf(
          '"latest":
          %s
          ',
          jsonlite::toJSON(self$`latest`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`link`)) {
          sprintf(
          '"link":
          %s
          ',
          jsonlite::toJSON(self$`link`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`lts`)) {
          sprintf(
          '"lts":
          %s
          ',
          jsonlite::toJSON(self$`lts`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`support`)) {
          sprintf(
          '"support":
          %s
          ',
          jsonlite::toJSON(self$`support`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`discontinued`)) {
          sprintf(
          '"discontinued":
          %s
          ',
          jsonlite::toJSON(self$`discontinued`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of Cycle
    #'
    #' @description
    #' Deserialize JSON string into an instance of Cycle
    #'
    #' @param input_json the JSON input
    #' @return the instance of Cycle
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`cycle` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$`cycle`, auto_unbox = TRUE, digits = NA))
      self$`releaseDate` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$`releaseDate`, auto_unbox = TRUE, digits = NA))
      self$`eol` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$`eol`, auto_unbox = TRUE, digits = NA))
      self$`latest` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$`latest`, auto_unbox = TRUE, digits = NA))
      self$`link` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$`link`, auto_unbox = TRUE, digits = NA))
      self$`lts` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$`lts`, auto_unbox = TRUE, digits = NA))
      self$`support` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$`support`, auto_unbox = TRUE, digits = NA))
      self$`discontinued` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$`discontinued`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to Cycle
    #'
    #' @description
    #' Validate JSON input with respect to Cycle and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Cycle
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      if (nchar(self$`releaseDate`) > 10) {
        return(FALSE)
      }
      if (nchar(self$`releaseDate`) < 10) {
        return(FALSE)
      }

      if (nchar(self$`eol`) < 1) {
        return(FALSE)
      }

      if (nchar(self$`latest`) < 1) {
        return(FALSE)
      }

      if (nchar(self$`link`) < 1) {
        return(FALSE)
      }

      if (nchar(self$`support`) > 10) {
        return(FALSE)
      }
      if (nchar(self$`support`) < 10) {
        return(FALSE)
      }

      if (nchar(self$`discontinued`) > 10) {
        return(FALSE)
      }
      if (nchar(self$`discontinued`) < 10) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      if (nchar(self$`releaseDate`) > 10) {
        invalid_fields["releaseDate"] <- "Invalid length for `releaseDate`, must be smaller than or equal to 10."
      }
      if (nchar(self$`releaseDate`) < 10) {
        invalid_fields["releaseDate"] <- "Invalid length for `releaseDate`, must be bigger than or equal to 10."
      }

      if (nchar(self$`eol`) < 1) {
        invalid_fields["eol"] <- "Invalid length for `eol`, must be bigger than or equal to 1."
      }

      if (nchar(self$`latest`) < 1) {
        invalid_fields["latest"] <- "Invalid length for `latest`, must be bigger than or equal to 1."
      }

      if (nchar(self$`link`) < 1) {
        invalid_fields["link"] <- "Invalid length for `link`, must be bigger than or equal to 1."
      }

      if (nchar(self$`support`) > 10) {
        invalid_fields["support"] <- "Invalid length for `support`, must be smaller than or equal to 10."
      }
      if (nchar(self$`support`) < 10) {
        invalid_fields["support"] <- "Invalid length for `support`, must be bigger than or equal to 10."
      }

      if (nchar(self$`discontinued`) > 10) {
        invalid_fields["discontinued"] <- "Invalid length for `discontinued`, must be smaller than or equal to 10."
      }
      if (nchar(self$`discontinued`) < 10) {
        invalid_fields["discontinued"] <- "Invalid length for `discontinued`, must be bigger than or equal to 10."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
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

