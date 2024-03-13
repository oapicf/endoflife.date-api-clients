goog.provide('API.Client.cycle');

/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 * @record
 */
API.Client.Cycle = function() {}

/**
 * @type {!API.Client.cycle_cycle}
 * @export
 */
API.Client.Cycle.prototype.cycle;

/**
 * Release Date for the first release in this cycle
 * @type {!API.Client.date}
 * @export
 */
API.Client.Cycle.prototype.releaseDate;

/**
 * @type {!API.Client.cycle_eol}
 * @export
 */
API.Client.Cycle.prototype.eol;

/**
 * Latest release in this cycle
 * @type {!string}
 * @export
 */
API.Client.Cycle.prototype.latest;

/**
 * Link to changelog for the latest release, if available
 * @type {!string}
 * @export
 */
API.Client.Cycle.prototype.link;

/**
 * @type {!API.Client.cycle_lts}
 * @export
 */
API.Client.Cycle.prototype.lts;

/**
 * @type {!API.Client.cycle_support}
 * @export
 */
API.Client.Cycle.prototype.support;

/**
 * @type {!API.Client.cycle_discontinued}
 * @export
 */
API.Client.Cycle.prototype.discontinued;

