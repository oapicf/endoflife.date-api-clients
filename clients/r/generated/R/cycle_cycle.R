#' @docType class
#' @title CycleCycle
#'
#' @description CycleCycle Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CycleCycle <- R6::R6Class(
  "CycleCycle",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field any_of  a list of object types defined in the anyOf schema.
    any_of = list("character", "numeric"),
    #' Initialize a new CycleCycle.
    #'
    #' @description
    #' Initialize a new CycleCycle.
    #'
    #' @param instance an instance of the object defined in the anyOf schemas: "character", "numeric"
    #' @export
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "character") {
        self$actual_instance <- instance
        self$actual_type <- "character"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "numeric") {
        self$actual_instance <- instance
        self$actual_type <- "numeric"
      } else {
        stop(paste("Failed to initialize CycleCycle with anyOf schemas character, numeric. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },
    #' Deserialize JSON string into an instance of CycleCycle.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CycleCycle.
    #' An alias to the method `fromJSON`.
    #'
    #' @param input The input JSON.
    #' @return An instance of CycleCycle.
    #' @export
    fromJSONString = function(input) {
      self$fromJSON(input)
    },
    #' Deserialize JSON string into an instance of CycleCycle.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CycleCycle.
    #'
    #' @param input The input JSON.
    #' @return An instance of CycleCycle.
    #' @export
    fromJSON = function(input) {
      error_messages <- list()

      `numeric_result` <- tryCatch({
          instance <- jsonlite::fromJSON(input, simplifyVector = FALSE)
          if (typeof(instance) != "numeric") {
            stop(sprintf("Data type doesn't match. Expected: %s. Actual: %s.", "numeric", typeof(instance)))
          }
          self$actual_instance <- `numeric_instance`$fromJSON(input)
          self$actual_type <- "numeric"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`numeric_result`["error"])) {
        error_messages <- append(error_messages, `numeric_result`["message"])
      }

      `character_result` <- tryCatch({
          instance <- jsonlite::fromJSON(input, simplifyVector = FALSE)
          if (typeof(instance) != "character") {
            stop(sprintf("Data type doesn't match. Expected: %s. Actual: %s.", "character", typeof(instance)))
          }
          self$actual_instance <- `character_instance`$fromJSON(input)
          self$actual_type <- "character"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`character_result`["error"])) {
        error_messages <- append(error_messages, `character_result`["message"])
      }

      # no match
      stop(paste("No match found when deserializing the input into CycleCycle with anyOf schemas character, numeric. Details: >>",
                 paste(error_messages, collapse = " >> ")))
    },
    #' Serialize CycleCycle to JSON string.
    #'
    #' @description
    #' Serialize CycleCycle to JSON string.
    #'
    #' @return JSON string representation of the CycleCycle.
    #' @export
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify((self$actual_instance$toJSONString())))
      } else {
        NULL
      }
    },
    #' Serialize CycleCycle to JSON.
    #'
    #' @description
    #' Serialize CycleCycle to JSON.
    #'
    #' @return JSON representation of the CycleCycle.
    #' @export
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },
    #' Validate the input JSON with respect to CycleCycle.
    #'
    #' @description
    #' Validate the input JSON with respect to CycleCycle and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    #' @export
    validateJSON = function(input) {
      # backup current values
      actual_instance_bak <- self$actual_instance
      actual_type_bak <- self$actual_type

      # if it's not valid, an error will be thrown
      self$fromJSON(input)

      # no error thrown, restore old values
      self$actual_instance <- actual_instance_bak
      self$actual_type <- actual_type_bak
    },
    #' Returns the string representation of the instance.
    #'
    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    #' @export
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"any_of": "%s"', paste(unlist(self$any_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
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
#CycleCycle$unlock()
#
## Below is an example to define the print function
#CycleCycle$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CycleCycle$lock()

