#
# endoflife.date
# Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
# Version: 0.0.1
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.Synopsis
    Helper function to format debug parameter output.
.Example
    $PSBoundParameters | Out-DebugParameter | Write-Debug
#>
function Out-DebugParameter {
    [CmdletBinding()]
    Param (
        [Parameter(ValueFromPipeline = $true, Mandatory = $true)]
        [AllowEmptyCollection()]
        $InputObject
    )

    Begin {
        $CommonParameters = Get-CommonParameters
    }

    Process {
        $InputObject.GetEnumerator() | Where-Object {
            $CommonParameters -notcontains $_.Key
        } | Format-Table -AutoSize -Property (
            @{
                Name = 'Parameter'
                Expression = {$_.Key}
            },
            @{
                Name = 'Value'
                Expression = {$_.Value}
            }
        ) | Out-String -Stream | ForEach-Object {
            if ($_.Trim()) {
                $_
            }
        }
    }
}