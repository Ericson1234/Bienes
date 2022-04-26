Create database BienesRaices;
use BienesRaices;

CREATE TABLE `roles`(
    `id` varchar(3),
    `rol` varchar(15),
    PRIMARY KEY(`id`)
);

CREATE TABLE `usuarios`(
     `id_user` varchar(25),
     `nombre` varchar(50),
     `apellidos` varchar(50),
     `email` varchar(50),
     `telefono` varchar(50),
     `identificacion` varchar(50),
     `contrasena` varchar(20),
     `rol` varchar(3),
     PRIMARY KEY(`id_user`),
     FOREIGN KEY (`rol`) REFERENCES `roles` (`id`)
);

ALTER TABLE `usuarios` ADD `pais` varchar(10);
ALTER TABLE `usuarios` ADD FOREIGN KEY (`pais`) REFERENCES `paises` (`id`); 

CREATE TABLE `paises` (
  `id` varchar(10),
  `pais` varchar(50),
  PRIMARY KEY (`id`)
);

CREATE TABLE `clas_propie`(
   `id` varchar(10),
   `nombre` varchar(50),
	PRIMARY KEY (`id`)
);

CREATE TABLE `propiedades`(
    `id` varchar(10),
    `nombre` varchar(50),
    `ubicacion` varchar(50),
    `descripcion` varchar(50),
    `clasi_propiedad` varchar(50),
    `costo` decimal(18,2),
    `pais` varchar(50),
	PRIMARY KEY (`id`),
    FOREIGN KEY (`clasi_propiedad`) REFERENCES `clas_propie` (`id`),
    FOREIGN KEY (`pais`) REFERENCES paises (`id`)
);

CREATE TABLE `metodo_pago`(
    `id` varchar(10),
    `nombre` varchar(20),
    PRIMARY KEY (`id`)
);

ALTER TABLE `metodo_pago` ADD `mes` int(3);
ALTER TABLE `metodo_pago` ADD `ano` int(5);
ALTER TABLE `metodo_pago` ADD `ccv` int(5);

CREATE TABLE `comentarios`(
	`id` varchar(10),
    `nombre` varchar(50),
    `comentario` varchar(500),
     PRIMARY KEY (`id`)
);

CREATE TABLE `transacciones`(
     `id` int(11) NOT NULL AUTO_INCREMENT,
     `nomb_factu` varchar(50),
     `fecha` datetime(6),
     `usuario` varchar(25),
     `metodo` varchar(20),
     `propiedad` varchar(50),
     `pais` varchar(50),
     PRIMARY KEY (`id`),
     FOREIGN KEY (`usuario`) REFERENCES `usuarios` (`id_user`),
     FOREIGN KEY (`metodo`) REFERENCES `metodo_pago` (`id`),
     FOREIGN KEY (`propiedad`) REFERENCES `propiedades` (`id`),
     FOREIGN KEY (`pais`) REFERENCES `paises` (`id`)
);

--Insert roles
ALTER TABLE `roles`
INSERT INTO `roles` VALUES (1,'ADMIN'),(2,'USER');

--Insert usuarios
ALTER TABLE `usuarios`
INSERT INTO `usuarios` VALUES (1,'Marco','Torres Serrano','marco@gmail.com','7458-2356','3-0125-0315','$2a$12$v5.ELQKtSBd4mQQTkFMJuODbtkpnY9U16UJwful89eK2yhhvt0SNq','2');
INSERT INTO `usuarios` VALUES (2,'Carlos','Flores Salazar','carlos@gmail.com','6021-8514','5-0125-0365','$2a$12$4R/G2qakVVMAYPhP9SW6jelMqatTzgsUn01enNq8Pini17fUQVt.W','1');
INSERT INTO `usuarios` VALUES (3,'Marta','Duarte Quesada','marta@test.com','2451-7845','1-0452-0687','$2a$12$v5.ELQKtSBd4mQQTkFMJuODbtkpnY9U16UJwful89eK2yhhvt0SNq','2');

CREATE TABLE `usuarios`(
     `id_user` varchar(25),
     `nombre` varchar(50),
     `apellidos` varchar(50),
     `email` varchar(50),
     `telefono` varchar(50),
     `identificacion` varchar(50),
     `contrasena` varchar(20),
     `rol` varchar(3),
--Insert paises
ALTER TABLE `paises`
INSERT INTO `paises` VALUES (1,'Salvador'),(2,'Costa Rica'),(3,'Francia'),(4,'Argentina'),(5,'USA');

--Insert clas_propie
ALTER TABLE `clas_propie`
INSERT INTO `clas_propie` VALUES (1,'Alberca'),(2,'Terraza'),(3,'Una Planta'),(4,'Doble Planta');

--Insert propiedades 
ALTER TABLE `propiedades`
INSERT INTO `propiedades` VALUES (1,'Casa Lagunal','Moravia','Exclusivo para fiestas','2','$3,000,000','2');
INSERT INTO `propiedades` VALUES (2,'Casa de lujo','New York','Acabados impresionantes','1','$5,000,000','5');
INSERT INTO `propiedades` VALUES (3,'Casa con alberca','California','Las mejores vistas','1','$4,500,000','5');

--Insert metodo_pago
ALTER TABLE `metodo_pago`
INSERT INTO `metodo_pago` VALUES (1,'VISA'),(2,'MASTERCARD');

--Insert comentarios
ALTER TABLE `paises`
INSERT INTO `clas_propie` VALUES (1,'Luis Gamboa Gamboa','Demasiado bueno el trato, con precios accesible'),(2,'Mario Ruiz Lopez','La mejor experiencia en ventas y compras'),(3,'Luis Marín Ortega','El personal se comportó de una excelente forma, muy buena atención y la casa que me ofrecieron cumple con todas mis expectativas');

--Insert transacciones
ALTER TABLE `transacciones`
INSERT INTO `transacciones` VALUES (1,'Bienes Raices E&D','2022/10/03','2','1','2','5');
INSERT INTO `transacciones` VALUES (2,'Bienes Raices E&D','2022/15/04','1','1','3','2');
















