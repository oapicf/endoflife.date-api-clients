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
#' @field releaseDate Release Date for the first release in this cycle character [optional]
#' @field eol  \link{CycleEol} [optional]
#' @field latest Latest release in this cycle character [optional]
#' @field link Link to changelog for the latest release, if available character [optional]
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
    #' @param releaseDate Release Date for the first release in this cycle
    #' @param eol eol
    #' @param latest Latest release in this cycle
    #' @param link Link to changelog for the latest release, if available
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
    #' To JSON String
    #'
    #' @return Cycle in JSON format
    toJSON = function() {
      CycleObject <- list()
      if (!is.null(self$`cycle`)) {
        CycleObject[["cycle"]] <-
          self$`cycle`$toJSON()
      }
      if (!is.null(self$`releaseDate`)) {
        CycleObject[["releaseDate"]] <-
          self$`releaseDate`
      }
      if (!is.null(self$`eol`)) {
        CycleObject[["eol"]] <-
          self$`eol`$toJSON()
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
    #' @return Cycle in JSON format
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
            "%s"
                    ',
          self$`releaseDate`
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
            "%s"
                    ',
          self$`latest`
          )
        },
        if (!is.null(self$`link`)) {
          sprintf(
          '"link":
            "%s"
                    ',
          self$`link`
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

