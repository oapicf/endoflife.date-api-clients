goog.provide('API.Client.cycle');

/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 * @record
 */
API.Client.Cycle = function() {}

/**
 * Release Cycle
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Cycle.prototype.cycle;

/**
 * Release Date for the first release in this cycle
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Cycle.prototype.releaseDate;

/**
 * End of Life Date for this release cycle
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Cycle.prototype.eol;

/**
 * Latest release in this cycle
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Cycle.prototype.latest;

/**
 * Link to changelog for the latest release, if available
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Cycle.prototype.link;

/**
 * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Cycle.prototype.lts;

/**
 * Whether this release cycle has active support
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Cycle.prototype.support;

/**
 * Whether this cycle is now discontinued.
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Cycle.prototype.discontinued;

