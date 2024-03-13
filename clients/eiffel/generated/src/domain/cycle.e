note
 description:"[
		endoflife.date
 		Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
  		The version of the OpenAPI document: 0.0.1
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class CYCLE




feature --Access

    cycle: detachable CYCLE_CYCLE
      
    release_date: detachable DATE
      -- Release Date for the first release in this cycle
    eol: detachable CYCLE_EOL
      
    latest: detachable STRING_32
      -- Latest release in this cycle
    link: detachable STRING_32
      -- Link to changelog for the latest release, if available
    lts: detachable CYCLE_LTS
      
    support: detachable CYCLE_SUPPORT
      
    discontinued: detachable CYCLE_DISCONTINUED
      

feature -- Change Element

    set_cycle (a_name: like cycle)
        -- Set 'cycle' with 'a_name'.
      do
        cycle := a_name
      ensure
        cycle_set: cycle = a_name
      end

    set_release_date (a_name: like release_date)
        -- Set 'release_date' with 'a_name'.
      do
        release_date := a_name
      ensure
        release_date_set: release_date = a_name
      end

    set_eol (a_name: like eol)
        -- Set 'eol' with 'a_name'.
      do
        eol := a_name
      ensure
        eol_set: eol = a_name
      end

    set_latest (a_name: like latest)
        -- Set 'latest' with 'a_name'.
      do
        latest := a_name
      ensure
        latest_set: latest = a_name
      end

    set_link (a_name: like link)
        -- Set 'link' with 'a_name'.
      do
        link := a_name
      ensure
        link_set: link = a_name
      end

    set_lts (a_name: like lts)
        -- Set 'lts' with 'a_name'.
      do
        lts := a_name
      ensure
        lts_set: lts = a_name
      end

    set_support (a_name: like support)
        -- Set 'support' with 'a_name'.
      do
        support := a_name
      ensure
        support_set: support = a_name
      end

    set_discontinued (a_name: like discontinued)
        -- Set 'discontinued' with 'a_name'.
      do
        discontinued := a_name
      ensure
        discontinued_set: discontinued = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CYCLE%N")
        if attached cycle as l_cycle then
          Result.append ("%Ncycle:")
          Result.append (l_cycle.out)
          Result.append ("%N")
        end
        if attached release_date as l_release_date then
          Result.append ("%Nrelease_date:")
          Result.append (l_release_date.out)
          Result.append ("%N")
        end
        if attached eol as l_eol then
          Result.append ("%Neol:")
          Result.append (l_eol.out)
          Result.append ("%N")
        end
        if attached latest as l_latest then
          Result.append ("%Nlatest:")
          Result.append (l_latest.out)
          Result.append ("%N")
        end
        if attached link as l_link then
          Result.append ("%Nlink:")
          Result.append (l_link.out)
          Result.append ("%N")
        end
        if attached lts as l_lts then
          Result.append ("%Nlts:")
          Result.append (l_lts.out)
          Result.append ("%N")
        end
        if attached support as l_support then
          Result.append ("%Nsupport:")
          Result.append (l_support.out)
          Result.append ("%N")
        end
        if attached discontinued as l_discontinued then
          Result.append ("%Ndiscontinued:")
          Result.append (l_discontinued.out)
          Result.append ("%N")
        end
      end
end

