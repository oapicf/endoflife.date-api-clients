

-- --------------------------------------------------------------------------
-- Table structure for table `cycle` generated from model 'cycle'
-- Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
--

CREATE TABLE IF NOT EXISTS `cycle` (
  `cycle` long,
  `releaseDate` date /*Release date for the first release in this cycle.*/,
  `eol` long,
  `latest` text /*Latest release in this cycle.*/,
  `link` text /*Link to changelog for the latest release in this cycle, or null if unavailable.*/,
  `lts` long,
  `support` long,
  `discontinued` long
);  /*Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.*/



--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
