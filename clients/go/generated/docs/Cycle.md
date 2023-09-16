# Cycle

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cycle** | Pointer to **interface{}** | Release Cycle | [optional] 
**ReleaseDate** | Pointer to **interface{}** | Release Date for the first release in this cycle | [optional] 
**Eol** | Pointer to **interface{}** | End of Life Date for this release cycle | [optional] 
**Latest** | Pointer to **interface{}** | Latest release in this cycle | [optional] 
**Link** | Pointer to **interface{}** | Link to changelog for the latest release, if available | [optional] 
**Lts** | Pointer to **interface{}** | Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  | [optional] 
**Support** | Pointer to **interface{}** | Whether this release cycle has active support | [optional] 
**Discontinued** | Pointer to **interface{}** | Whether this cycle is now discontinued. | [optional] 

## Methods

### NewCycle

`func NewCycle() *Cycle`

NewCycle instantiates a new Cycle object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCycleWithDefaults

`func NewCycleWithDefaults() *Cycle`

NewCycleWithDefaults instantiates a new Cycle object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCycle

`func (o *Cycle) GetCycle() interface{}`

GetCycle returns the Cycle field if non-nil, zero value otherwise.

### GetCycleOk

`func (o *Cycle) GetCycleOk() (*interface{}, bool)`

GetCycleOk returns a tuple with the Cycle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCycle

`func (o *Cycle) SetCycle(v interface{})`

SetCycle sets Cycle field to given value.

### HasCycle

`func (o *Cycle) HasCycle() bool`

HasCycle returns a boolean if a field has been set.

### SetCycleNil

`func (o *Cycle) SetCycleNil(b bool)`

 SetCycleNil sets the value for Cycle to be an explicit nil

### UnsetCycle
`func (o *Cycle) UnsetCycle()`

UnsetCycle ensures that no value is present for Cycle, not even an explicit nil
### GetReleaseDate

`func (o *Cycle) GetReleaseDate() interface{}`

GetReleaseDate returns the ReleaseDate field if non-nil, zero value otherwise.

### GetReleaseDateOk

`func (o *Cycle) GetReleaseDateOk() (*interface{}, bool)`

GetReleaseDateOk returns a tuple with the ReleaseDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReleaseDate

`func (o *Cycle) SetReleaseDate(v interface{})`

SetReleaseDate sets ReleaseDate field to given value.

### HasReleaseDate

`func (o *Cycle) HasReleaseDate() bool`

HasReleaseDate returns a boolean if a field has been set.

### SetReleaseDateNil

`func (o *Cycle) SetReleaseDateNil(b bool)`

 SetReleaseDateNil sets the value for ReleaseDate to be an explicit nil

### UnsetReleaseDate
`func (o *Cycle) UnsetReleaseDate()`

UnsetReleaseDate ensures that no value is present for ReleaseDate, not even an explicit nil
### GetEol

`func (o *Cycle) GetEol() interface{}`

GetEol returns the Eol field if non-nil, zero value otherwise.

### GetEolOk

`func (o *Cycle) GetEolOk() (*interface{}, bool)`

GetEolOk returns a tuple with the Eol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEol

`func (o *Cycle) SetEol(v interface{})`

SetEol sets Eol field to given value.

### HasEol

`func (o *Cycle) HasEol() bool`

HasEol returns a boolean if a field has been set.

### SetEolNil

`func (o *Cycle) SetEolNil(b bool)`

 SetEolNil sets the value for Eol to be an explicit nil

### UnsetEol
`func (o *Cycle) UnsetEol()`

UnsetEol ensures that no value is present for Eol, not even an explicit nil
### GetLatest

`func (o *Cycle) GetLatest() interface{}`

GetLatest returns the Latest field if non-nil, zero value otherwise.

### GetLatestOk

`func (o *Cycle) GetLatestOk() (*interface{}, bool)`

GetLatestOk returns a tuple with the Latest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatest

`func (o *Cycle) SetLatest(v interface{})`

SetLatest sets Latest field to given value.

### HasLatest

`func (o *Cycle) HasLatest() bool`

HasLatest returns a boolean if a field has been set.

### SetLatestNil

`func (o *Cycle) SetLatestNil(b bool)`

 SetLatestNil sets the value for Latest to be an explicit nil

### UnsetLatest
`func (o *Cycle) UnsetLatest()`

UnsetLatest ensures that no value is present for Latest, not even an explicit nil
### GetLink

`func (o *Cycle) GetLink() interface{}`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *Cycle) GetLinkOk() (*interface{}, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *Cycle) SetLink(v interface{})`

SetLink sets Link field to given value.

### HasLink

`func (o *Cycle) HasLink() bool`

HasLink returns a boolean if a field has been set.

### SetLinkNil

`func (o *Cycle) SetLinkNil(b bool)`

 SetLinkNil sets the value for Link to be an explicit nil

### UnsetLink
`func (o *Cycle) UnsetLink()`

UnsetLink ensures that no value is present for Link, not even an explicit nil
### GetLts

`func (o *Cycle) GetLts() interface{}`

GetLts returns the Lts field if non-nil, zero value otherwise.

### GetLtsOk

`func (o *Cycle) GetLtsOk() (*interface{}, bool)`

GetLtsOk returns a tuple with the Lts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLts

`func (o *Cycle) SetLts(v interface{})`

SetLts sets Lts field to given value.

### HasLts

`func (o *Cycle) HasLts() bool`

HasLts returns a boolean if a field has been set.

### SetLtsNil

`func (o *Cycle) SetLtsNil(b bool)`

 SetLtsNil sets the value for Lts to be an explicit nil

### UnsetLts
`func (o *Cycle) UnsetLts()`

UnsetLts ensures that no value is present for Lts, not even an explicit nil
### GetSupport

`func (o *Cycle) GetSupport() interface{}`

GetSupport returns the Support field if non-nil, zero value otherwise.

### GetSupportOk

`func (o *Cycle) GetSupportOk() (*interface{}, bool)`

GetSupportOk returns a tuple with the Support field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupport

`func (o *Cycle) SetSupport(v interface{})`

SetSupport sets Support field to given value.

### HasSupport

`func (o *Cycle) HasSupport() bool`

HasSupport returns a boolean if a field has been set.

### SetSupportNil

`func (o *Cycle) SetSupportNil(b bool)`

 SetSupportNil sets the value for Support to be an explicit nil

### UnsetSupport
`func (o *Cycle) UnsetSupport()`

UnsetSupport ensures that no value is present for Support, not even an explicit nil
### GetDiscontinued

`func (o *Cycle) GetDiscontinued() interface{}`

GetDiscontinued returns the Discontinued field if non-nil, zero value otherwise.

### GetDiscontinuedOk

`func (o *Cycle) GetDiscontinuedOk() (*interface{}, bool)`

GetDiscontinuedOk returns a tuple with the Discontinued field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscontinued

`func (o *Cycle) SetDiscontinued(v interface{})`

SetDiscontinued sets Discontinued field to given value.

### HasDiscontinued

`func (o *Cycle) HasDiscontinued() bool`

HasDiscontinued returns a boolean if a field has been set.

### SetDiscontinuedNil

`func (o *Cycle) SetDiscontinuedNil(b bool)`

 SetDiscontinuedNil sets the value for Discontinued to be an explicit nil

### UnsetDiscontinued
`func (o *Cycle) UnsetDiscontinued()`

UnsetDiscontinued ensures that no value is present for Discontinued, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


