CREATE DATABASE shop;
CREATE TABLE supplier(
id MEDIUMINT NOT NULL AUTO_INCREMENT,
supplier_name VARCHAR(255),
phone VARCHAR(15),
PRIMARY KEY (id)
);
ALTER TABLE supplier
   ADD CONSTRAINT myUniqueConstraint UNIQUE(supplier_name);

CREATE TABLE good(
id MEDIUMINT NOT NULL AUTO_INCREMENT,
good_name VARCHAR(255),
description VARCHAR(255),
price DECIMAL(38,2),
PRIMARY KEY (id)
);

CREATE TABLE warehouse(
 id MEDIUMINT NOT NULL AUTO_INCREMENT,
 supplier_id MEDIUMINT REFERENCES supplier(id),
 good_id MEDIUMINT REFERENCES good(id),
 good_qty MEDIUMINT,
 PRIMARY KEY (id)
);


CREATE TABLE client(
id MEDIUMINT NOT NULL AUTO_INCREMENT,
first_name VARCHAR(100) NOT NULL,
second_name VARCHAR(100) NOT NULL,
email VARCHAR(100),
PRIMARY KEY (id)
);

CREATE TABLE good_order(
id MEDIUMINT NOT NULL AUTO_INCREMENT,
client_id MEDIUMINT REFERENCES client(id),
good_id MEDIUMINT REFERENCES good(id),
good_qty MEDIUMINT,
PRIMARY KEY(id)
);

INSERT INTO supplier(supplier_name,phone) VALUES ('test','0442344533');
INSERT INTO good(good_name,description,price) VALUES('test_good','simple good', 1500.00);
SELECT * FROM supplier;



INSERT INTO warehouse (good_id,supplier_id, good_qty) VALUES
    ((SELECT id from good WHERE good_name='test_good')
    ,(SELECT id from supplier WHERE supplier_name='test'),6);
TRUNCATE warehouse;