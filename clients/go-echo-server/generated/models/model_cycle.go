package models

// Cycle - Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
type Cycle struct {

	Cycle CycleCycle `json:"cycle,omitempty"`

	// Release date for the first release in this cycle.
	ReleaseDate string `json:"releaseDate,omitempty"`

	Eol CycleEol `json:"eol,omitempty"`

	// Latest release in this cycle.
	Latest string `json:"latest,omitempty"`

	// Link to changelog for the latest release in this cycle, or null if unavailable.
	Link *string `json:"link,omitempty"`

	Lts CycleLts `json:"lts,omitempty"`

	Support CycleSupport `json:"support,omitempty"`

	Discontinued CycleDiscontinued `json:"discontinued,omitempty"`
}
