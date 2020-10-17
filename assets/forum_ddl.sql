-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema forum
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema forum
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `forum` DEFAULT CHARACTER SET utf8 ;
USE `forum` ;

-- -----------------------------------------------------
-- Table `forum`.`forum`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `forum`.`forum` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `forum`.`sujet`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `forum`.`sujet` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL,
  `nickname` VARCHAR(45) NOT NULL,
  `language` VARCHAR(45) NOT NULL,
  `description` VARCHAR(255) NOT NULL,
  `code` VARCHAR(255) NOT NULL,
  `forum_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_forum_contient_index` (`forum_id` ASC) VISIBLE,
  CONSTRAINT `fk_sujet_forum`
    FOREIGN KEY (`forum_id`)
    REFERENCES `forum`.`forum` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `forum`.`reponse`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `forum`.`reponse` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nickname` VARCHAR(45) NOT NULL,
  `description` VARCHAR(255) NOT NULL,
  `code` VARCHAR(255) NOT NULL,
  `sujet_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_sujet_contient_index` (`sujet_id` ASC) VISIBLE,
  CONSTRAINT `fk_reponse_sujet`
    FOREIGN KEY (`sujet_id`)
    REFERENCES `forum`.`sujet` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
