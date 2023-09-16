
# Table `cycle`
(mapped from: Cycle)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**cycle** | cycle | blob |  | [**kotlin.Any**](.md) | Release Cycle |  [optional]
**releaseDate** | releaseDate | blob |  | [**kotlin.Any**](.md) | Release Date for the first release in this cycle |  [optional]
**eol** | eol | blob |  | [**kotlin.Any**](.md) | End of Life Date for this release cycle |  [optional]
**latest** | latest | blob |  | [**kotlin.Any**](.md) | Latest release in this cycle |  [optional]
**link** | link | blob |  | [**kotlin.Any**](.md) | Link to changelog for the latest release, if available |  [optional]
**lts** | lts | blob |  | [**kotlin.Any**](.md) | Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  |  [optional]
**support** | support | blob |  | [**kotlin.Any**](.md) | Whether this release cycle has active support |  [optional]
**discontinued** | discontinued | blob |  | [**kotlin.Any**](.md) | Whether this cycle is now discontinued. |  [optional]










