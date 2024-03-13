# openapi::Cycle

Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cycle** | [**CycleCycle**](cycle_cycle.md) |  | [optional] 
**releaseDate** | **character** | Release Date for the first release in this cycle | [optional] [Max. length: 10] [Min. length: 10] 
**eol** | [**CycleEol**](cycle_eol.md) |  | [optional] 
**latest** | **character** | Latest release in this cycle | [optional] [Min. length: 1] 
**link** | **character** | Link to changelog for the latest release, if available | [optional] [Min. length: 1] 
**lts** | [**CycleLts**](cycle_lts.md) |  | [optional] 
**support** | [**CycleSupport**](cycle_support.md) |  | [optional] 
**discontinued** | [**CycleDiscontinued**](cycle_discontinued.md) |  | [optional] 


