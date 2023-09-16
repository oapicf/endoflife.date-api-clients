# Cycle

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cycle** | [***serde_json::Value**](.md) | Release Cycle | [optional] [default to None]
**release_date** | [***serde_json::Value**](.md) | Release Date for the first release in this cycle | [optional] [default to None]
**eol** | [***serde_json::Value**](.md) | End of Life Date for this release cycle | [optional] [default to None]
**latest** | [***serde_json::Value**](.md) | Latest release in this cycle | [optional] [default to None]
**link** | [***serde_json::Value**](.md) | Link to changelog for the latest release, if available | [optional] [default to None]
**lts** | [***serde_json::Value**](.md) | Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  | [optional] [default to None]
**support** | [***serde_json::Value**](.md) | Whether this release cycle has active support | [optional] [default to None]
**discontinued** | [***serde_json::Value**](.md) | Whether this cycle is now discontinued. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


