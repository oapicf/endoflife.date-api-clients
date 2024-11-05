#
# endoflife.date
# Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
# Version: 0.0.1
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.

.PARAMETER Cycle
No description available.
.PARAMETER ReleaseDate
Release Date for the first release in this cycle
.PARAMETER Eol
No description available.
.PARAMETER Latest
Latest release in this cycle
.PARAMETER Link
Link to changelog for the latest release, if available
.PARAMETER Lts
No description available.
.PARAMETER Support
No description available.
.PARAMETER Discontinued
No description available.
.OUTPUTS

Cycle<PSCustomObject>
#>

function Initialize-Cycle {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Cycle},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${ReleaseDate},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Eol},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Latest},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Link},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Lts},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Support},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Discontinued}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => Cycle' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if (!$ReleaseDate -and $ReleaseDate.length -gt 10) {
            throw "invalid value for 'ReleaseDate', the character length must be smaller than or equal to 10."
        }

        if (!$ReleaseDate -and $ReleaseDate.length -lt 10) {
            throw "invalid value for 'ReleaseDate', the character length must be great than or equal to 10."
        }

        if (!$Latest -and $Latest.length -lt 1) {
            throw "invalid value for 'Latest', the character length must be great than or equal to 1."
        }

        if (!$Link -and $Link.length -lt 1) {
            throw "invalid value for 'Link', the character length must be great than or equal to 1."
        }


        $PSO = [PSCustomObject]@{
            "cycle" = ${Cycle}
            "releaseDate" = ${ReleaseDate}
            "eol" = ${Eol}
            "latest" = ${Latest}
            "link" = ${Link}
            "lts" = ${Lts}
            "support" = ${Support}
            "discontinued" = ${Discontinued}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to Cycle<PSCustomObject>

.DESCRIPTION

Convert from JSON to Cycle<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

Cycle<PSCustomObject>
#>
function ConvertFrom-JsonToCycle {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => Cycle' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in Cycle
        $AllProperties = ("cycle", "releaseDate", "eol", "latest", "link", "lts", "support", "discontinued")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "cycle"))) { #optional property not found
            $Cycle = $null
        } else {
            $Cycle = $JsonParameters.PSobject.Properties["cycle"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "releaseDate"))) { #optional property not found
            $ReleaseDate = $null
        } else {
            $ReleaseDate = $JsonParameters.PSobject.Properties["releaseDate"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "eol"))) { #optional property not found
            $Eol = $null
        } else {
            $Eol = $JsonParameters.PSobject.Properties["eol"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "latest"))) { #optional property not found
            $Latest = $null
        } else {
            $Latest = $JsonParameters.PSobject.Properties["latest"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "link"))) { #optional property not found
            $Link = $null
        } else {
            $Link = $JsonParameters.PSobject.Properties["link"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "lts"))) { #optional property not found
            $Lts = $null
        } else {
            $Lts = $JsonParameters.PSobject.Properties["lts"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "support"))) { #optional property not found
            $Support = $null
        } else {
            $Support = $JsonParameters.PSobject.Properties["support"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "discontinued"))) { #optional property not found
            $Discontinued = $null
        } else {
            $Discontinued = $JsonParameters.PSobject.Properties["discontinued"].value
        }

        $PSO = [PSCustomObject]@{
            "cycle" = ${Cycle}
            "releaseDate" = ${ReleaseDate}
            "eol" = ${Eol}
            "latest" = ${Latest}
            "link" = ${Link}
            "lts" = ${Lts}
            "support" = ${Support}
            "discontinued" = ${Discontinued}
        }

        return $PSO
    }

}
