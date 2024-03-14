<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for get-api-:product.json
 */
class GetApiProductJsonParameterData
{
    /**
     * Product URL as per the canonical URL on the endofife.date website
     * @DTA\Data(subset="path", field="product")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $product = null;

}
