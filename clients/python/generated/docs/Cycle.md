# Cycle

Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cycle** | **object** | Release Cycle | [optional] 
**release_date** | **object** | Release Date for the first release in this cycle | [optional] 
**eol** | **object** | End of Life Date for this release cycle | [optional] 
**latest** | **object** | Latest release in this cycle | [optional] 
**link** | **object** | Link to changelog for the latest release, if available | [optional] 
**lts** | **object** | Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  | [optional] 
**support** | **object** | Whether this release cycle has active support | [optional] 
**discontinued** | **object** | Whether this cycle is now discontinued. | [optional] 

## Example

```python
from endoflifedate.models.cycle import Cycle

# TODO update the JSON string below
json = "{}"
# create an instance of Cycle from a JSON string
cycle_instance = Cycle.from_json(json)
# print the JSON string representation of the object
print Cycle.to_json()

# convert the object into a dict
cycle_dict = cycle_instance.to_dict()
# create an instance of Cycle from a dict
cycle_form_dict = cycle.from_dict(cycle_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


