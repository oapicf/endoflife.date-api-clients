# Cycle

Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cycle** | [**CycleCycle**](CycleCycle.md) |  | [optional] 
**release_date** | **date** | Release date for the first release in this cycle. | [optional] 
**eol** | [**CycleEol**](CycleEol.md) |  | [optional] 
**latest** | **str** | Latest release in this cycle. | [optional] 
**link** | **str** | Link to changelog for the latest release in this cycle, or null if unavailable. | [optional] 
**lts** | [**CycleLts**](CycleLts.md) |  | [optional] 
**support** | [**CycleSupport**](CycleSupport.md) |  | [optional] 
**discontinued** | [**CycleDiscontinued**](CycleDiscontinued.md) |  | [optional] 

## Example

```python
from openapi_client.models.cycle import Cycle

# TODO update the JSON string below
json = "{}"
# create an instance of Cycle from a JSON string
cycle_instance = Cycle.from_json(json)
# print the JSON string representation of the object
print Cycle.to_json()

# convert the object into a dict
cycle_dict = cycle_instance.to_dict()
# create an instance of Cycle from a dict
cycle_from_dict = Cycle.from_dict(cycle_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


