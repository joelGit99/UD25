DROP TABLE IF EXISTS articulos;
DROP TABLE IF EXISTS fabricantes;

CREATE TABLE fabricantes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre NVARCHAR(100)
);

CREATE TABLE articulos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre NVARCHAR(100),
    precio INT,
    fabricante int,
    FOREIGN KEY (fabricante) REFERENCES fabricantes (id)
);

INSERT INTO fabricantes (nombre) VALUES ('LG');
INSERT INTO fabricantes (nombre) VALUES ('Samsung');
INSERT INTO fabricantes (nombre) VALUES ('Panasonic');
INSERT INTO fabricantes (nombre) VALUES ('HP');
INSERT INTO fabricantes (nombre) VALUES ('Huawei');

INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Nevera', 500, 1);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Móvil', 400, 2);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Televisión', 1000, 3);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Portátil', 500, 4);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Teléfono', 300, 5);