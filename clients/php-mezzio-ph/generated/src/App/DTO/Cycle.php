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
     * @DTA\Data(field="cycle", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CycleCycle::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CycleCycle::class})
     * @var \App\DTO\CycleCycle|null
     */
    public $cycle;

    /**
     * Release date for the first release in this cycle.
     * @DTA\Data(field="releaseDate", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @DTA\Validator(name="StringLength", options={"min":10, "max":10})
     * @var \DateTime|null
     */
    public $release_date;

    /**
     * @DTA\Data(field="eol", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CycleEol::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CycleEol::class})
     * @var \App\DTO\CycleEol|null
     */
    public $eol;

    /**
     * Latest release in this cycle.
     * @DTA\Data(field="latest", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":1})
     * @var string|null
     */
    public $latest;

    /**
     * Link to changelog for the latest release in this cycle, or null if unavailable.
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":1})
     * @var string|null
     */
    public $link;

    /**
     * @DTA\Data(field="lts", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CycleLts::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CycleLts::class})
     * @var \App\DTO\CycleLts|null
     */
    public $lts;

    /**
     * @DTA\Data(field="support", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CycleSupport::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CycleSupport::class})
     * @var \App\DTO\CycleSupport|null
     */
    public $support;

    /**
     * @DTA\Data(field="discontinued", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CycleDiscontinued::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CycleDiscontinued::class})
     * @var \App\DTO\CycleDiscontinued|null
     */
    public $discontinued;

}
