-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-06-2022 a las 11:21:23
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `test`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hipg`
--

CREATE TABLE `hipg` (
  `ID_PRODUCTO` bigint(20) UNSIGNED NOT NULL,
  `NOMBRE` varchar(150) NOT NULL,
  `FECHA_ENVASADO` varchar(100) NOT NULL,
  `UNIDADES` int(11) NOT NULL,
  `PRECIO` float NOT NULL,
  `DISPONIBLE` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `hipg`
--

INSERT INTO `hipg` (`ID_PRODUCTO`, `NOMBRE`, `FECHA_ENVASADO`, `UNIDADES`, `PRECIO`, `DISPONIBLE`) VALUES
(1, 'pepe', '02/02/2125', 5, 29, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `hipg`
--
ALTER TABLE `hipg`
  ADD PRIMARY KEY (`ID_PRODUCTO`),
  ADD UNIQUE KEY `ID_PRODUCTO` (`ID_PRODUCTO`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `hipg`
--
ALTER TABLE `hipg`
  MODIFY `ID_PRODUCTO` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
