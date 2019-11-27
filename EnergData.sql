BEGIN TRANSACTION;
CREATE TABLE `CONTRACTORS` (
	`company_id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	`companyName`	TEXT,
	`product_services`	TEXT,
	`contactName`	TEXT,
	`contactNumber`	TEXT,
	`email`	TEXT,
	`companyAddress`	TEXT,
	`dpr_cert`	TEXT,
	`companyRegNo`	TEXT,
	`tax_id`	TEXT
);
COMMIT;
