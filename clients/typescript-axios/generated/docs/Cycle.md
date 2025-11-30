# Cycle

Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cycle** | [**CycleCycle**](CycleCycle.md) |  | [optional] [default to undefined]
**releaseDate** | **string** | Release date for the first release in this cycle. | [optional] [default to undefined]
**eol** | [**CycleEol**](CycleEol.md) |  | [optional] [default to undefined]
**latest** | **string** | Latest release in this cycle. | [optional] [default to undefined]
**link** | **string** | Link to changelog for the latest release in this cycle, or null if unavailable. | [optional] [default to undefined]
**lts** | [**CycleLts**](CycleLts.md) |  | [optional] [default to undefined]
**support** | [**CycleSupport**](CycleSupport.md) |  | [optional] [default to undefined]
**discontinued** | [**CycleDiscontinued**](CycleDiscontinued.md) |  | [optional] [default to undefined]

## Example

```typescript
import { Cycle } from './api';

const instance: Cycle = {
    cycle,
    releaseDate,
    eol,
    latest,
    link,
    lts,
    support,
    discontinued,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
