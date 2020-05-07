CREATE SCHEMA `project_joyeux` ;

CREATE TABLE `project_joyeux`.`client` (
  `id_client` VARCHAR(45) NOT NULL,
  `nom_client` VARCHAR(45) NOT NULL,
  `adresse` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_client`));
  
INSERT INTO `project_joyeux`.`client` (`id_client`, `nom_client`, `adresse`) VALUES ('cl01', 'Célia', '3 rue ferdinand guepratte, ancy sur moselle 57130');
INSERT INTO `project_joyeux`.`client` (`id_client`, `nom_client`, `adresse`) VALUES ('cl02', 'Mael', '3 rue ferdinand guepratte, ancy sur moselle 57130');
INSERT INTO `project_joyeux`.`client` (`id_client`, `nom_client`, `adresse`) VALUES ('cl03', 'Freya', '5 rue saint félix, maizière les mets 57280');

  CREATE TABLE `project_joyeux`.`compte` (
  `id_compte` VARCHAR(45) NOT NULL,
  `id_client` VARCHAR(45) NOT NULL,
  `solde_actuel` DOUBLE NOT NULL,
  `decouvert` DOUBLE NOT NULL,
  PRIMARY KEY (`id_compte`));

INSERT INTO `project_joyeux`.`compte` (`id_compte`, `id_client`, `solde_actuel`, `decouvert`) VALUES ('C01', 'cl01', '254.24', '50');
INSERT INTO `project_joyeux`.`compte` (`id_compte`, `id_client`, `solde_actuel`, `decouvert`) VALUES ('C02', 'cl02', '148.56', '0');
INSERT INTO `project_joyeux`.`compte` (`id_compte`, `id_client`, `solde_actuel`, `decouvert`) VALUES ('C03', 'cl03', '9452.28', '250');
INSERT INTO `project_joyeux`.`compte` (`id_compte`, `id_client`, `solde_actuel`, `decouvert`) VALUES ('C04', 'cl01', '1600', '0');
INSERT INTO `project_joyeux`.`compte` (`id_compte`, `id_client`, `solde_actuel`, `decouvert`) VALUES ('C05', 'cl02', '1254.63', '0');
INSERT INTO `project_joyeux`.`compte` (`id_compte`, `id_client`, `solde_actuel`, `decouvert`) VALUES ('C06', 'cl01', '3000', '0');
INSERT INTO `project_joyeux`.`compte` (`id_compte`, `id_client`, `solde_actuel`, `decouvert`) VALUES ('C07', 'cl01', '4000', '0');
