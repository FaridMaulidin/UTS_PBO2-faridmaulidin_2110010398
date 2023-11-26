-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 26 Nov 2023 pada 12.08
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `faridmaulidin_2110010398`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `package`
--

CREATE TABLE `package` (
  `packageid` int(11) NOT NULL,
  `categoryid` int(11) NOT NULL,
  `package_nama` varchar(50) NOT NULL,
  `description` varchar(100) NOT NULL,
  `package_price` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `package`
--

INSERT INTO `package` (`packageid`, `categoryid`, `package_nama`, `description`, `package_price`) VALUES
(1, 1, 'Nike black white', 'Baru', '15000'),
(2, 2, 'Adiddas', 'baru', '17000'),
(3, 3, 'Erigo', 'Baru', '20000'),
(5, 5, 'Celana Erigo', 'Baru', '30000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `package_category`
--

CREATE TABLE `package_category` (
  `katagori_id` int(11) NOT NULL,
  `nama_katagori` varchar(50) NOT NULL,
  `stok` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `package_category`
--

INSERT INTO `package_category` (`katagori_id`, `nama_katagori`, `stok`) VALUES
(1, 'sendal', '50'),
(2, 'sepatu', '100'),
(3, 'Tas', '88'),
(4, 'kaos', '77'),
(5, 'Celana', '55');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `package`
--
ALTER TABLE `package`
  ADD PRIMARY KEY (`packageid`);

--
-- Indeks untuk tabel `package_category`
--
ALTER TABLE `package_category`
  ADD PRIMARY KEY (`katagori_id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `package`
--
ALTER TABLE `package`
  MODIFY `packageid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `package_category`
--
ALTER TABLE `package_category`
  MODIFY `katagori_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
