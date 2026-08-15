//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class DefaultApi {
  DefaultApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// All Products
  ///
  /// Return a list of all products. Each of these can be used for the other API endpoints.
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> getApiAllJsonWithHttpInfo({ Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/api/all.json';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// All Products
  ///
  /// Return a list of all products. Each of these can be used for the other API endpoints.
  Future<List<String>?> getApiAllJson({ Future<void>? abortTrigger, }) async {
    final response = await getApiAllJsonWithHttpInfo(abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<String>') as List)
        .cast<String>()
        .toList(growable: false);

    }
    return null;
  }

  /// Single cycle details
  ///
  /// Gets details of a single cycle.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] product (required):
  ///   Product URL as per the canonical URL on the endofife.date website.
  ///
  /// * [String] cycle (required):
  ///   Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.
  Future<Response> getApiProductCycleJsonWithHttpInfo(String product, String cycle, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/api/{product}/{cycle}.json'
      .replaceAll('{product}', product)
      .replaceAll('{cycle}', cycle);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Single cycle details
  ///
  /// Gets details of a single cycle.
  ///
  /// Parameters:
  ///
  /// * [String] product (required):
  ///   Product URL as per the canonical URL on the endofife.date website.
  ///
  /// * [String] cycle (required):
  ///   Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.
  Future<Cycle?> getApiProductCycleJson(String product, String cycle, { Future<void>? abortTrigger, }) async {
    final response = await getApiProductCycleJsonWithHttpInfo(product, cycle, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Cycle',) as Cycle;
    
    }
    return null;
  }

  /// Get All Details
  ///
  /// Get EoL dates of all cycles of a given product.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] product (required):
  ///   Product URL as per the canonical URL on the endofife.date website.
  Future<Response> getApiProductJsonWithHttpInfo(String product, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/api/{product}.json'
      .replaceAll('{product}', product);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Get All Details
  ///
  /// Get EoL dates of all cycles of a given product.
  ///
  /// Parameters:
  ///
  /// * [String] product (required):
  ///   Product URL as per the canonical URL on the endofife.date website.
  Future<List<Cycle>?> getApiProductJson(String product, { Future<void>? abortTrigger, }) async {
    final response = await getApiProductJsonWithHttpInfo(product, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<Cycle>') as List)
        .cast<Cycle>()
        .toList(growable: false);

    }
    return null;
  }
}
