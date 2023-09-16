<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */
class Cycle
{
    /**
     * Release Cycle
     * @DTA\Data(field="cycle", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"mixed"})
     * @var mixed|null
     */
    public $cycle;

    /**
     * Release Date for the first release in this cycle
     * @DTA\Data(field="releaseDate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"mixed"})
     * @DTA\Validator(name="StringLength", options={"min":10, "max":10})
     * @var mixed|null
     */
    public $release_date;

    /**
     * End of Life Date for this release cycle
     * @DTA\Data(field="eol", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"mixed"})
     * @DTA\Validator(name="StringLength", options={"min":1})
     * @var mixed|null
     */
    public $eol;

    /**
     * Latest release in this cycle
     * @DTA\Data(field="latest", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"mixed"})
     * @DTA\Validator(name="StringLength", options={"min":1})
     * @var mixed|null
     */
    public $latest;

    /**
     * Link to changelog for the latest release, if available
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"mixed"})
     * @DTA\Validator(name="StringLength", options={"min":1})
     * @var mixed|null
     */
    public $link;

    /**
     * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.
     * @DTA\Data(field="lts", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"mixed"})
     * @var mixed|null
     */
    public $lts;

    /**
     * Whether this release cycle has active support
     * @DTA\Data(field="support", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"mixed"})
     * @DTA\Validator(name="StringLength", options={"min":10, "max":10})
     * @var mixed|null
     */
    public $support;

    /**
     * Whether this cycle is now discontinued.
     * @DTA\Data(field="discontinued", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"mixed"})
     * @DTA\Validator(name="StringLength", options={"min":10, "max":10})
     * @var mixed|null
     */
    public $discontinued;

}
