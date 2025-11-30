
# Cycle

Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.

## Properties

Name | Type
------------ | -------------
`cycle` | [CycleCycle](CycleCycle.md)
`releaseDate` | Date
`eol` | [CycleEol](CycleEol.md)
`latest` | string
`link` | string
`lts` | [CycleLts](CycleLts.md)
`support` | [CycleSupport](CycleSupport.md)
`discontinued` | [CycleDiscontinued](CycleDiscontinued.md)

## Example

```typescript
import type { Cycle } from ''

// TODO: Update the object below with actual values
const example = {
  "cycle": null,
  "releaseDate": null,
  "eol": null,
  "latest": null,
  "link": null,
  "lts": null,
  "support": null,
  "discontinued": null,
} satisfies Cycle

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Cycle
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


