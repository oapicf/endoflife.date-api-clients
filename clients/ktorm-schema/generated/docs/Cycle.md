
# Table `cycle`
(mapped from: Cycle)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**cycle** | cycle | long |  | [**CycleCycle**](CycleCycle.md) |  |  [optional] [foreignkey]
**releaseDate** | releaseDate | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Release date for the first release in this cycle. |  [optional]
**eol** | eol | long |  | [**CycleEol**](CycleEol.md) |  |  [optional] [foreignkey]
**latest** | latest | text |  | **kotlin.String** | Latest release in this cycle. |  [optional]
**link** | link | text |  | **kotlin.String** | Link to changelog for the latest release in this cycle, or null if unavailable. |  [optional]
**lts** | lts | long |  | [**CycleLts**](CycleLts.md) |  |  [optional] [foreignkey]
**support** | support | long |  | [**CycleSupport**](CycleSupport.md) |  |  [optional] [foreignkey]
**discontinued** | discontinued | long |  | [**CycleDiscontinued**](CycleDiscontinued.md) |  |  [optional] [foreignkey]










