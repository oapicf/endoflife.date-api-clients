# EndOfLifeDateApiClient::Cycle

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cycle** | **Object** | Release Cycle | [optional] |
| **release_date** | **Object** | Release Date for the first release in this cycle | [optional] |
| **eol** | **Object** | End of Life Date for this release cycle | [optional] |
| **latest** | **Object** | Latest release in this cycle | [optional] |
| **link** | **Object** | Link to changelog for the latest release, if available | [optional] |
| **lts** | **Object** | Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  | [optional] |
| **support** | **Object** | Whether this release cycle has active support | [optional] |
| **discontinued** | **Object** | Whether this cycle is now discontinued. | [optional] |

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

