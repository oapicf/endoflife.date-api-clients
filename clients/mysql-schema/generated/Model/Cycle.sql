--
-- endoflife.date.
-- Prepared SQL queries for 'cycle' definition.
--


--
-- SELECT template for table `cycle`
--
SELECT `cycle`, `releaseDate`, `eol`, `latest`, `link`, `lts`, `support`, `discontinued` FROM `cycle` WHERE 1;

--
-- INSERT template for table `cycle`
--
INSERT INTO `cycle`(`cycle`, `releaseDate`, `eol`, `latest`, `link`, `lts`, `support`, `discontinued`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `cycle`
--
UPDATE `cycle` SET `cycle` = ?, `releaseDate` = ?, `eol` = ?, `latest` = ?, `link` = ?, `lts` = ?, `support` = ?, `discontinued` = ? WHERE 1;

--
-- DELETE template for table `cycle`
--
DELETE FROM `cycle` WHERE 0;

