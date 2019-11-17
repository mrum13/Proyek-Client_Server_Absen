-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 17, 2019 at 01:43 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `proyek-fix`
--

-- --------------------------------------------------------

--
-- Table structure for table `absen`
--

CREATE TABLE `absen` (
  `id_absen` varchar(100) NOT NULL,
  `tanggal_absen` date NOT NULL,
  `jam_absen` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `absen`
--

INSERT INTO `absen` (`id_absen`, `tanggal_absen`, `jam_absen`) VALUES
('2019APBO01L40301', '2019-11-13', '13:07:44'),
('2019APBO01L40302', '2019-11-13', '14:45:46'),
('2019APBO01L40303', '2019-11-17', '16:55:36'),
('2019APBO01L40304', '0000-00-00', '00:00:00'),
('2019APBO01L40305', '0000-00-00', '00:00:00'),
('2019APBO01L40306', '0000-00-00', '00:00:00'),
('2019APBO01L40307', '0000-00-00', '00:00:00'),
('2019APBO01L40308', '0000-00-00', '00:00:00'),
('2019APBO01L40309', '0000-00-00', '00:00:00'),
('2019APBO01L40310', '0000-00-00', '00:00:00'),
('2019APBO01L40311', '0000-00-00', '00:00:00'),
('2019APBO01L40312', '0000-00-00', '00:00:00'),
('2019APBO01L40313', '0000-00-00', '00:00:00'),
('2019APBO01L40314', '0000-00-00', '00:00:00'),
('2019APBO01L40315', '0000-00-00', '00:00:00'),
('2019APBO01L40316', '0000-00-00', '00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `absen_detail`
--

CREATE TABLE `absen_detail` (
  `id_absen` varchar(100) NOT NULL,
  `nim_mhs` bigint(20) NOT NULL,
  `tanggal_absen` date NOT NULL,
  `jam_absen` time NOT NULL,
  `ket` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `absen_detail`
--

INSERT INTO `absen_detail` (`id_absen`, `nim_mhs`, `tanggal_absen`, `jam_absen`, `ket`) VALUES
('2019APBO01L40301', 60200118001, '2019-11-17', '19:57:01', 'Alfa'),
('2019APBO01L40302', 60200118001, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118001, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118001, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118001, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118001, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118001, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118001, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118001, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118001, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118001, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118001, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118001, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118001, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118001, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118001, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118002, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118002, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118002, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118002, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118002, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118002, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118002, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118002, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118002, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118002, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118002, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118002, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118002, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118002, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118002, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118002, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118003, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118003, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118003, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118003, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118003, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118003, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118003, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118003, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118003, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118003, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118003, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118003, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118003, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118003, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118003, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118003, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118004, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118004, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118004, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118004, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118004, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118004, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118004, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118004, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118004, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118004, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118004, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118004, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118004, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118004, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118004, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118004, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118005, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118005, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118005, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118005, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118005, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118005, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118005, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118005, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118005, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118005, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118005, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118005, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118005, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118005, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118005, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118005, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118006, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118006, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118006, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118006, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118006, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118006, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118006, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118006, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118006, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118006, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118006, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118006, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118006, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118006, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118006, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118006, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118007, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118007, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118007, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118007, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118007, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118007, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118007, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118007, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118007, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118007, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118007, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118007, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118007, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118007, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118007, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118007, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118008, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118008, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118008, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118008, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118008, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118008, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118008, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118008, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118008, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118008, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118008, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118008, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118008, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118008, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118008, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118008, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118009, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118009, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118009, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118009, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118009, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118009, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118009, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118009, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118009, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118009, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118009, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118009, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118009, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118009, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118009, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118009, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118010, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118010, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118010, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118010, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118010, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118010, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118010, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118010, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118010, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118010, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118010, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118010, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118010, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118010, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118010, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118010, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118011, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118011, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118011, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118011, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118011, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118011, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118011, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118011, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118011, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118011, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118011, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118011, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118011, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118011, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118011, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118011, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118012, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118012, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118012, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118012, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118012, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118012, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118012, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118012, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118012, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118012, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118012, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118012, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118012, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118012, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118012, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118012, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118013, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118013, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118013, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118013, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118013, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118013, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118013, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118013, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118013, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118013, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118013, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118013, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118013, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118013, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118013, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118013, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118014, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118014, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118014, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118014, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118014, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118014, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118014, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118014, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118014, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118014, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118014, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118014, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118014, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118014, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118014, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118014, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118015, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118015, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118015, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118015, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118015, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118015, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118015, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118015, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118015, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118015, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118015, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118015, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118015, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118015, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118015, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118015, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118016, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118016, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118016, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118016, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118016, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118016, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118016, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118016, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118016, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118016, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118016, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118016, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118016, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118016, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118016, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118016, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118017, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118017, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118017, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118017, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118017, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118017, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118017, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118017, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118017, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118017, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118017, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118017, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118017, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118017, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118017, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118017, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118018, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118018, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118018, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118018, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118018, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118018, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118018, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118018, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118018, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118018, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118018, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118018, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118018, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118018, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118018, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118018, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118019, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118019, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118019, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118019, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118019, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118019, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118019, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118019, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118019, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118019, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118019, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118019, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118019, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118019, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118019, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118019, '0000-00-00', '00:00:00', ''),
('2019APBO01L40301', 60200118020, '2019-11-13', '14:16:41', ''),
('2019APBO01L40302', 60200118020, '0000-00-00', '00:00:00', ''),
('2019APBO01L40303', 60200118020, '0000-00-00', '00:00:00', ''),
('2019APBO01L40304', 60200118020, '0000-00-00', '00:00:00', ''),
('2019APBO01L40305', 60200118020, '0000-00-00', '00:00:00', ''),
('2019APBO01L40306', 60200118020, '0000-00-00', '00:00:00', ''),
('2019APBO01L40307', 60200118020, '0000-00-00', '00:00:00', ''),
('2019APBO01L40308', 60200118020, '0000-00-00', '00:00:00', ''),
('2019APBO01L40309', 60200118020, '0000-00-00', '00:00:00', ''),
('2019APBO01L40310', 60200118020, '0000-00-00', '00:00:00', ''),
('2019APBO01L40311', 60200118020, '0000-00-00', '00:00:00', ''),
('2019APBO01L40312', 60200118020, '0000-00-00', '00:00:00', ''),
('2019APBO01L40313', 60200118020, '0000-00-00', '00:00:00', ''),
('2019APBO01L40314', 60200118020, '0000-00-00', '00:00:00', ''),
('2019APBO01L40315', 60200118020, '0000-00-00', '00:00:00', ''),
('2019APBO01L40316', 60200118020, '0000-00-00', '00:00:00', '');

-- --------------------------------------------------------

--
-- Table structure for table `absen_mhs`
--

CREATE TABLE `absen_mhs` (
  `nim_mhs` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `absen_mhs`
--

INSERT INTO `absen_mhs` (`nim_mhs`) VALUES
(60200118001);

-- --------------------------------------------------------

--
-- Table structure for table `akses_db`
--

CREATE TABLE `akses_db` (
  `akses_mhs` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `akses_db`
--

INSERT INTO `akses_db` (`akses_mhs`) VALUES
('online');

-- --------------------------------------------------------

--
-- Table structure for table `data_mhs`
--

CREATE TABLE `data_mhs` (
  `no_mhs` int(11) NOT NULL,
  `nim_mhs` bigint(20) NOT NULL,
  `nama_mhs` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_mhs`
--

INSERT INTO `data_mhs` (`no_mhs`, `nim_mhs`, `nama_mhs`) VALUES
(1, 60900118001, 'LAKSMITA INDRA DEWY'),
(2, 60900118002, 'FITRAH'),
(3, 60900118004, 'RINDI ANTIKA'),
(1, 60900118001, 'LAKSMITA INDRA DEWY'),
(2, 60900118002, 'FITRAH'),
(3, 60900118004, 'RINDI ANTIKA');

-- --------------------------------------------------------

--
-- Table structure for table `matkul`
--

CREATE TABLE `matkul` (
  `id_matkul` varchar(5) NOT NULL,
  `nama_matkul` varchar(100) NOT NULL,
  `ruang_matkul` varchar(10) NOT NULL,
  `nim_mhs` bigint(20) NOT NULL,
  `nama_mhs` text NOT NULL,
  `nim_asdos` bigint(20) NOT NULL,
  `nama_asdos` text NOT NULL,
  `kelas_matkul` varchar(5) NOT NULL,
  `tahun_matkul` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `matkul`
--

INSERT INTO `matkul` (`id_matkul`, `nama_matkul`, `ruang_matkul`, `nim_mhs`, `nama_mhs`, `nim_asdos`, `nama_asdos`, `kelas_matkul`, `tahun_matkul`) VALUES
('PBO_A', 'PBO', 'L-405', 60200118001, 'LAKSMITA INDRA DEWY', 60200117001, 'BUNG', 'A', 2019),
('PBO_A', 'PBO', 'L-405', 60200118002, 'FITRAH', 60200117002, 'SUARMIN', 'A', 2019);

-- --------------------------------------------------------

--
-- Table structure for table `matkul_jarkom`
--

CREATE TABLE `matkul_jarkom` (
  `no` int(11) NOT NULL,
  `nim_mhs` bigint(20) NOT NULL,
  `nama_mhs` text NOT NULL,
  `kelas_mhs` varchar(2) NOT NULL,
  `jurusan_mhs` text NOT NULL,
  `hari_1` int(11) NOT NULL,
  `hari_2` int(11) NOT NULL,
  `hari_3` int(11) NOT NULL,
  `hari_4` int(11) NOT NULL,
  `hari_5` int(11) NOT NULL,
  `hari_6` int(11) NOT NULL,
  `hari_7` int(11) NOT NULL,
  `hari_8` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `matkul_mobile`
--

CREATE TABLE `matkul_mobile` (
  `nim_mhs` bigint(20) NOT NULL,
  `nama_mhs` text NOT NULL,
  `kelas_mhs` varchar(2) NOT NULL,
  `jurusan_mhs` text NOT NULL,
  `hari_1` int(11) NOT NULL,
  `hari_2` int(11) NOT NULL,
  `hari_3` int(11) NOT NULL,
  `hari_4` int(11) NOT NULL,
  `hari_5` int(11) NOT NULL,
  `hari_6` int(11) NOT NULL,
  `hari_7` int(11) NOT NULL,
  `hari_8` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `matkul_web`
--

CREATE TABLE `matkul_web` (
  `no` int(11) NOT NULL,
  `nim_mhs` bigint(20) NOT NULL,
  `nama_mhs` text NOT NULL,
  `kelas_mhs` varchar(2) NOT NULL,
  `jurusan_mhs` text NOT NULL,
  `hari_1` int(11) NOT NULL,
  `hari_2` int(11) NOT NULL,
  `hari_3` int(11) NOT NULL,
  `hari_4` int(11) NOT NULL,
  `hari_5` int(11) NOT NULL,
  `hari_6` int(11) NOT NULL,
  `hari_7` int(11) NOT NULL,
  `hari_8` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `profil_asdos`
--

CREATE TABLE `profil_asdos` (
  `username_asdos` bigint(20) NOT NULL,
  `password_asdos` varchar(100) NOT NULL,
  `nama_asdos` text NOT NULL,
  `jurusan_asdos` text NOT NULL,
  `jabatan_asdos` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profil_asdos`
--

INSERT INTO `profil_asdos` (`username_asdos`, `password_asdos`, `nama_asdos`, `jurusan_asdos`, `jabatan_asdos`) VALUES
(60200115001, '60200115001', ' Fajrul Hidayat', 'Teknik Informatika', 'Asisten PBO 1'),
(60200115002, '60200115002', 'Kurniawan', 'Teknik Informatika', 'Asisten PBO 2');

-- --------------------------------------------------------

--
-- Table structure for table `profil_laboran`
--

CREATE TABLE `profil_laboran` (
  `no` int(11) NOT NULL,
  `username_laboran` varchar(100) NOT NULL,
  `password_laboran` varchar(100) NOT NULL,
  `nama_laboran` text NOT NULL,
  `jabatan_laboran` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profil_laboran`
--

INSERT INTO `profil_laboran` (`no`, `username_laboran`, `password_laboran`, `nama_laboran`, `jabatan_laboran`) VALUES
(1, 'admin1', 'admin1', 'Kak Ushi', 'Kepala Laboran FST');

-- --------------------------------------------------------

--
-- Table structure for table `profil_mahasiswa`
--

CREATE TABLE `profil_mahasiswa` (
  `username_mhs` bigint(20) NOT NULL,
  `password_mhs` varchar(100) NOT NULL,
  `nama_mhs` text NOT NULL,
  `kelas_mhs` varchar(2) NOT NULL,
  `jurusan_mhs` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profil_mahasiswa`
--

INSERT INTO `profil_mahasiswa` (`username_mhs`, `password_mhs`, `nama_mhs`, `kelas_mhs`, `jurusan_mhs`) VALUES
(60200118001, 'admin1', 'Laksmita Indra Dewi', 'A', 'Teknik Informatika');

-- --------------------------------------------------------

--
-- Table structure for table `profil_operator`
--

CREATE TABLE `profil_operator` (
  `no` int(11) NOT NULL,
  `username_opt` varchar(100) NOT NULL,
  `password_opt` varchar(100) NOT NULL,
  `nama_opt` text NOT NULL,
  `jabatan_opt` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profil_operator`
--

INSERT INTO `profil_operator` (`no`, `username_opt`, `password_opt`, `nama_opt`, `jabatan_opt`) VALUES
(1, 'admin1', 'admin1', 'Kak Uppi', 'Operator Teknik Informatika');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `absen`
--
ALTER TABLE `absen`
  ADD PRIMARY KEY (`id_absen`);

--
-- Indexes for table `absen_mhs`
--
ALTER TABLE `absen_mhs`
  ADD PRIMARY KEY (`nim_mhs`),
  ADD KEY `nim_mhs` (`nim_mhs`);

--
-- Indexes for table `matkul`
--
ALTER TABLE `matkul`
  ADD PRIMARY KEY (`nim_mhs`);

--
-- Indexes for table `matkul_jarkom`
--
ALTER TABLE `matkul_jarkom`
  ADD PRIMARY KEY (`nim_mhs`);

--
-- Indexes for table `matkul_mobile`
--
ALTER TABLE `matkul_mobile`
  ADD PRIMARY KEY (`nim_mhs`);

--
-- Indexes for table `matkul_web`
--
ALTER TABLE `matkul_web`
  ADD PRIMARY KEY (`nim_mhs`);

--
-- Indexes for table `profil_asdos`
--
ALTER TABLE `profil_asdos`
  ADD PRIMARY KEY (`username_asdos`);

--
-- Indexes for table `profil_mahasiswa`
--
ALTER TABLE `profil_mahasiswa`
  ADD PRIMARY KEY (`username_mhs`);

--
-- Indexes for table `profil_operator`
--
ALTER TABLE `profil_operator`
  ADD PRIMARY KEY (`username_opt`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;