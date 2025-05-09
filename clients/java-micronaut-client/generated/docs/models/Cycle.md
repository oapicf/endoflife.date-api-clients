

# Cycle

Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.

The class is defined in **[Cycle.java](../../src/main/java/org/openapitools/model/Cycle.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cycle** | [`CycleCycle`](CycleCycle.md) |  |  [optional property]
**releaseDate** | `LocalDate` | Release date for the first release in this cycle. |  [optional property]
**eol** | [`CycleEol`](CycleEol.md) |  |  [optional property]
**latest** | `String` | Latest release in this cycle. |  [optional property]
**link** | `String` | Link to changelog for the latest release in this cycle, or null if unavailable. |  [optional property]
**lts** | [`CycleLts`](CycleLts.md) |  |  [optional property]
**support** | [`CycleSupport`](CycleSupport.md) |  |  [optional property]
**discontinued** | [`CycleDiscontinued`](CycleDiscontinued.md) |  |  [optional property]










