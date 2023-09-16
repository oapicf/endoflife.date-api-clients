# openapi::Cycle

Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cycle** | [**AnyType**](.md) | Release Cycle | [optional] 
**releaseDate** | [**AnyType**](.md) | Release Date for the first release in this cycle | [optional] [Max. length: 10] [Min. length: 10] 
**eol** | [**AnyType**](.md) | End of Life Date for this release cycle | [optional] [Min. length: 1] 
**latest** | [**AnyType**](.md) | Latest release in this cycle | [optional] [Min. length: 1] 
**link** | [**AnyType**](.md) | Link to changelog for the latest release, if available | [optional] [Min. length: 1] 
**lts** | [**AnyType**](.md) | Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  | [optional] 
**support** | [**AnyType**](.md) | Whether this release cycle has active support | [optional] [Max. length: 10] [Min. length: 10] 
**discontinued** | [**AnyType**](.md) | Whether this cycle is now discontinued. | [optional] [Max. length: 10] [Min. length: 10] 


