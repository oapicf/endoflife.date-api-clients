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
     */
    public ?\App\DTO\CycleCycle $cycle = null;

    /**
     * Release date for the first release in this cycle.
     * @DTA\Data(field="releaseDate", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @DTA\Validator(name="Length", options={"min":10, "max":10})
     */
    public ?\DateTimeInterface $release_date = null;

    /**
     * @DTA\Data(field="eol", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CycleEol::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CycleEol::class})
     */
    public ?\App\DTO\CycleEol $eol = null;

    /**
     * Latest release in this cycle.
     * @DTA\Data(field="latest", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"min":1})
     */
    public ?string $latest = null;

    /**
     * Link to changelog for the latest release in this cycle, or null if unavailable.
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"min":1})
     */
    public ?string $link = null;

    /**
     * @DTA\Data(field="lts", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CycleLts::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CycleLts::class})
     */
    public ?\App\DTO\CycleLts $lts = null;

    /**
     * @DTA\Data(field="support", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CycleSupport::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CycleSupport::class})
     */
    public ?\App\DTO\CycleSupport $support = null;

    /**
     * @DTA\Data(field="discontinued", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CycleDiscontinued::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CycleDiscontinued::class})
     */
    public ?\App\DTO\CycleDiscontinued $discontinued = null;

}
