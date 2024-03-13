# EndOfLifeDateApiClient::Cycle

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cycle** | [**CycleCycle**](CycleCycle.md) |  | [optional] |
| **release_date** | **Date** | Release Date for the first release in this cycle | [optional] |
| **eol** | [**CycleEol**](CycleEol.md) |  | [optional] |
| **latest** | **String** | Latest release in this cycle | [optional] |
| **link** | **String** | Link to changelog for the latest release, if available | [optional] |
| **lts** | [**CycleLts**](CycleLts.md) |  | [optional] |
| **support** | [**CycleSupport**](CycleSupport.md) |  | [optional] |
| **discontinued** | [**CycleDiscontinued**](CycleDiscontinued.md) |  | [optional] |

## Example

```ruby
require 'endoflife_date'

instance = EndOfLifeDateApiClient::Cycle.new(
  cycle: null,
  release_date: null,
  eol: null,
  latest: null,
  link: null,
  lts: null,
  support: null,
  discontinued: null
)
```

