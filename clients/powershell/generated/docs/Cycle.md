# Cycle
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cycle** | [**AnyType**](.md) | Release Cycle | [optional] 
**ReleaseDate** | [**AnyType**](.md) | Release Date for the first release in this cycle | [optional] 
**Eol** | [**AnyType**](.md) | End of Life Date for this release cycle | [optional] 
**Latest** | [**AnyType**](.md) | Latest release in this cycle | [optional] 
**Link** | [**AnyType**](.md) | Link to changelog for the latest release, if available | [optional] 
**Lts** | [**AnyType**](.md) | Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  | [optional] 
**Support** | [**AnyType**](.md) | Whether this release cycle has active support | [optional] 
**Discontinued** | [**AnyType**](.md) | Whether this cycle is now discontinued. | [optional] 

## Examples

- Prepare the resource
```powershell
$Cycle = Initialize-PSOpenAPIToolsCycle  -Cycle null `
 -ReleaseDate null `
 -Eol null `
 -Latest null `
 -Link null `
 -Lts null `
 -Support null `
 -Discontinued null
```

- Convert the resource to JSON
```powershell
$Cycle | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

