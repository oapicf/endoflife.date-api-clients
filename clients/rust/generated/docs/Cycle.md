# Cycle

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cycle** | Option<[**serde_json::Value**](.md)> | Release Cycle | [optional]
**release_date** | Option<[**serde_json::Value**](.md)> | Release Date for the first release in this cycle | [optional]
**eol** | Option<[**serde_json::Value**](.md)> | End of Life Date for this release cycle | [optional]
**latest** | Option<[**serde_json::Value**](.md)> | Latest release in this cycle | [optional]
**link** | Option<[**serde_json::Value**](.md)> | Link to changelog for the latest release, if available | [optional]
**lts** | Option<[**serde_json::Value**](.md)> | Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  | [optional]
**support** | Option<[**serde_json::Value**](.md)> | Whether this release cycle has active support | [optional]
**discontinued** | Option<[**serde_json::Value**](.md)> | Whether this cycle is now discontinued. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


