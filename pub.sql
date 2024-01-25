DROP DATABASE IF EXISTS diakde_pub;
CREATE DATABASE diakde_pub;
USE diakde_pub;

CREATE TABLE types(
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	type varchar(20)
);

CREATE TABLE quantites(
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	quantity VARCHAR(20)
);

CREATE TABLE drinks(
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20),
	amount INTEGER,
	type_id INTEGER,
	quantity_id INTEGER,
	FOREIGN KEY ( type_id ) REFERENCES types( id ),
	FOREIGN KEY ( quantity_id ) REFERENCES  quantites ( id )
);

INSERT INTO types( type ) VALUES
("sörök"),
("borok"),
("rövid"),
("uditok");

INSERT INTO packages ( packages ) VALUES
("uveges"),
("dobozos"),
("hordos"),
("kimért");

INSERT INTO drinks ( drink, amount, types_id, packages_id ) VALUES
("egri bikavér", 22, 2, 1 ),
("dab", 135, 1 , 2),
("szilva pálinka ", 30, 3,4 ),
("fanta", 125, 4 , 2),
("kövidinka" , 3, 2, 3);
