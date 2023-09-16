

-- --------------------------------------------------------------------------
-- Table structure for table `cycle` generated from model 'cycle'
-- Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
--

CREATE TABLE IF NOT EXISTS `cycle` (
  `cycle` blob /*Release Cycle*/,
  `releaseDate` blob /*Release Date for the first release in this cycle*/,
  `eol` blob /*End of Life Date for this release cycle*/,
  `latest` blob /*Latest release in this cycle*/,
  `link` blob /*Link to changelog for the latest release, if available*/,
  `lts` blob /*Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. */,
  `support` blob /*Whether this release cycle has active support*/,
  `discontinued` blob /*Whether this cycle is now discontinued.*/
);  /*Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.*/



--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
