# Cycle
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cycle** | [**CycleCycle**](CycleCycle.md) |  | [optional] 
**ReleaseDate** | **System.DateTime** | Release date for the first release in this cycle. | [optional] 
**Eol** | [**CycleEol**](CycleEol.md) |  | [optional] 
**Latest** | **String** | Latest release in this cycle. | [optional] 
**Link** | **String** | Link to changelog for the latest release in this cycle, or null if unavailable. | [optional] 
**Lts** | [**CycleLts**](CycleLts.md) |  | [optional] 
**Support** | [**CycleSupport**](CycleSupport.md) |  | [optional] 
**Discontinued** | [**CycleDiscontinued**](CycleDiscontinued.md) |  | [optional] 

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

