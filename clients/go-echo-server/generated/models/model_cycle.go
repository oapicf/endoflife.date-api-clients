package models

// Cycle - Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
type Cycle struct {

	// Release Cycle
	Cycle *interface{} `json:"cycle,omitempty"`

	// Release Date for the first release in this cycle
	ReleaseDate *interface{} `json:"releaseDate,omitempty"`

	// End of Life Date for this release cycle
	Eol *interface{} `json:"eol,omitempty"`

	// Latest release in this cycle
	Latest *interface{} `json:"latest,omitempty"`

	// Link to changelog for the latest release, if available
	Link *interface{} `json:"link,omitempty"`

	// Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
	Lts *interface{} `json:"lts,omitempty"`

	// Whether this release cycle has active support
	Support *interface{} `json:"support,omitempty"`

	// Whether this cycle is now discontinued.
	Discontinued *interface{} `json:"discontinued,omitempty"`
}
