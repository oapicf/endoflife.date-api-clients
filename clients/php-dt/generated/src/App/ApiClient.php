<?php
declare(strict_types=1);

namespace App;

use Articus\DataTransfer as DT;
use OpenAPIGenerator\APIClient as OAGAC;
use Psr\Http\Client\ClientExceptionInterface;
use Psr\Http\Message\ResponseInterface;

/**
 * endoflife.date
 * The endoflife.date v0 API is currently deprecated, please [use the endoflife.date v1 API](https://endoflife.date/docs/api/v1/).
 * The version of the OpenAPI document: 0.0.1
 */
class ApiClient extends OAGAC\AbstractApiClient
{
    //region getApiAllJson
    /**
     * All Products
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getApiAllJsonRaw(
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/all.json', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * All Products
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getApiAllJson(
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getApiAllJsonRaw($responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\Collection1();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * All Products
     * @param string $responseMediaType
     * @return \App\DTO\Collection1
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getApiAllJsonResult(
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection1
    {
        return $this->getSuccessfulContent(...$this->getApiAllJson($responseMediaType));
    }
    //endregion

    //region getApiProductCycleJson
    /**
     * Single cycle details
     * @param \App\DTO\GetApiProductCycleJsonParameterData $parameters
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getApiProductCycleJsonRaw(
        \App\DTO\GetApiProductCycleJsonParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/{product}/{cycle}.json', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Single cycle details
     * @param \App\DTO\GetApiProductCycleJsonParameterData $parameters
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getApiProductCycleJson(
        \App\DTO\GetApiProductCycleJsonParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getApiProductCycleJsonRaw($parameters, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\Cycle();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Single cycle details
     * @param \App\DTO\GetApiProductCycleJsonParameterData $parameters
     * @param string $responseMediaType
     * @return \App\DTO\Cycle
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getApiProductCycleJsonResult(
        \App\DTO\GetApiProductCycleJsonParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): \App\DTO\Cycle
    {
        return $this->getSuccessfulContent(...$this->getApiProductCycleJson($parameters, $responseMediaType));
    }
    //endregion

    //region getApiProductJson
    /**
     * Get All Details
     * @param \App\DTO\GetApiProductJsonParameterData $parameters
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getApiProductJsonRaw(
        \App\DTO\GetApiProductJsonParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/{product}.json', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get All Details
     * @param \App\DTO\GetApiProductJsonParameterData $parameters
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getApiProductJson(
        \App\DTO\GetApiProductJsonParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getApiProductJsonRaw($parameters, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\Collection();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get All Details
     * @param \App\DTO\GetApiProductJsonParameterData $parameters
     * @param string $responseMediaType
     * @return \App\DTO\Collection
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getApiProductJsonResult(
        \App\DTO\GetApiProductJsonParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection
    {
        return $this->getSuccessfulContent(...$this->getApiProductJson($parameters, $responseMediaType));
    }
    //endregion
}

