<?php
/**
 * Cycle
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * endoflife.date
 *
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the Cycle model.
 *
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class Cycle 
{
        /**
     * @var CycleCycle|null
     * @SerializedName("cycle")
     * @Type("OpenAPI\Server\Model\CycleCycle")
    */
    #[Assert\Type("OpenAPI\Server\Model\CycleCycle")]
    protected ?CycleCycle $cycle = null;

    /**
     * Release Date for the first release in this cycle
     *
     * @var \DateTime|null
     * @SerializedName("releaseDate")
     * @Type("DateTime<'Y-m-d'>")
    */
    #[Assert\Type("\DateTime")]
    #[Assert\Length(max: 10)]
    #[Assert\Length(min: 10)]
    protected ?\DateTime $releaseDate = null;

    /**
     * @var CycleEol|null
     * @SerializedName("eol")
     * @Type("OpenAPI\Server\Model\CycleEol")
    */
    #[Assert\Type("OpenAPI\Server\Model\CycleEol")]
    protected ?CycleEol $eol = null;

    /**
     * Latest release in this cycle
     *
     * @var string|null
     * @SerializedName("latest")
     * @Type("string")
    */
    #[Assert\Type("string")]
    #[Assert\Length(min: 1)]
    protected ?string $latest = null;

    /**
     * Link to changelog for the latest release, if available
     *
     * @var string|null
     * @SerializedName("link")
     * @Type("string")
    */
    #[Assert\Type("string")]
    #[Assert\Length(min: 1)]
    protected ?string $link = null;

    /**
     * @var CycleLts|null
     * @SerializedName("lts")
     * @Type("OpenAPI\Server\Model\CycleLts")
    */
    #[Assert\Type("OpenAPI\Server\Model\CycleLts")]
    protected ?CycleLts $lts = null;

    /**
     * @var CycleSupport|null
     * @SerializedName("support")
     * @Type("OpenAPI\Server\Model\CycleSupport")
    */
    #[Assert\Type("OpenAPI\Server\Model\CycleSupport")]
    protected ?CycleSupport $support = null;

    /**
     * @var CycleDiscontinued|null
     * @SerializedName("discontinued")
     * @Type("OpenAPI\Server\Model\CycleDiscontinued")
    */
    #[Assert\Type("OpenAPI\Server\Model\CycleDiscontinued")]
    protected ?CycleDiscontinued $discontinued = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->cycle = array_key_exists('cycle', $data) ? $data['cycle'] : $this->cycle;
            $this->releaseDate = array_key_exists('releaseDate', $data) ? $data['releaseDate'] : $this->releaseDate;
            $this->eol = array_key_exists('eol', $data) ? $data['eol'] : $this->eol;
            $this->latest = array_key_exists('latest', $data) ? $data['latest'] : $this->latest;
            $this->link = array_key_exists('link', $data) ? $data['link'] : $this->link;
            $this->lts = array_key_exists('lts', $data) ? $data['lts'] : $this->lts;
            $this->support = array_key_exists('support', $data) ? $data['support'] : $this->support;
            $this->discontinued = array_key_exists('discontinued', $data) ? $data['discontinued'] : $this->discontinued;
        }
    }

    /**
     * Gets cycle.
     *
     * @return CycleCycle|null
     */
    public function getCycle(): ?CycleCycle
    {
        return $this->cycle;
    }

    /**
    * Sets cycle.
    *
    * @param CycleCycle|null $cycle
    *
    * @return $this
    */
    public function setCycle(?CycleCycle $cycle = null): self
    {
        $this->cycle = $cycle;

        return $this;
    }




    /**
     * Gets releaseDate.
     *
     * @return \DateTime|null
     */
    public function getReleaseDate(): ?\DateTime
    {
        return $this->releaseDate;
    }

    /**
    * Sets releaseDate.
    *
    * @param \DateTime|null $releaseDate  Release Date for the first release in this cycle
    *
    * @return $this
    */
    public function setReleaseDate(?\DateTime $releaseDate = null): self
    {
        $this->releaseDate = $releaseDate;

        return $this;
    }




    /**
     * Gets eol.
     *
     * @return CycleEol|null
     */
    public function getEol(): ?CycleEol
    {
        return $this->eol;
    }

    /**
    * Sets eol.
    *
    * @param CycleEol|null $eol
    *
    * @return $this
    */
    public function setEol(?CycleEol $eol = null): self
    {
        $this->eol = $eol;

        return $this;
    }




    /**
     * Gets latest.
     *
     * @return string|null
     */
    public function getLatest(): ?string
    {
        return $this->latest;
    }

    /**
    * Sets latest.
    *
    * @param string|null $latest  Latest release in this cycle
    *
    * @return $this
    */
    public function setLatest(?string $latest = null): self
    {
        $this->latest = $latest;

        return $this;
    }




    /**
     * Gets link.
     *
     * @return string|null
     */
    public function getLink(): ?string
    {
        return $this->link;
    }

    /**
    * Sets link.
    *
    * @param string|null $link  Link to changelog for the latest release, if available
    *
    * @return $this
    */
    public function setLink(?string $link = null): self
    {
        $this->link = $link;

        return $this;
    }




    /**
     * Gets lts.
     *
     * @return CycleLts|null
     */
    public function getLts(): ?CycleLts
    {
        return $this->lts;
    }

    /**
    * Sets lts.
    *
    * @param CycleLts|null $lts
    *
    * @return $this
    */
    public function setLts(?CycleLts $lts = null): self
    {
        $this->lts = $lts;

        return $this;
    }




    /**
     * Gets support.
     *
     * @return CycleSupport|null
     */
    public function getSupport(): ?CycleSupport
    {
        return $this->support;
    }

    /**
    * Sets support.
    *
    * @param CycleSupport|null $support
    *
    * @return $this
    */
    public function setSupport(?CycleSupport $support = null): self
    {
        $this->support = $support;

        return $this;
    }




    /**
     * Gets discontinued.
     *
     * @return CycleDiscontinued|null
     */
    public function getDiscontinued(): ?CycleDiscontinued
    {
        return $this->discontinued;
    }

    /**
    * Sets discontinued.
    *
    * @param CycleDiscontinued|null $discontinued
    *
    * @return $this
    */
    public function setDiscontinued(?CycleDiscontinued $discontinued = null): self
    {
        $this->discontinued = $discontinued;

        return $this;
    }



}


