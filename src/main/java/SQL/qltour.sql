-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 07, 2023 at 06:23 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `testtour`
--

-- --------------------------------------------------------

--
-- Table structure for table `chitiettour`
--
CREATE TABLE `taikhoan` (
  `tentaikhoan` text NOT NULL,
  `matkhau` text NOT NULL,
  `manv` text NOT NULL,
  `loaitk` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

CREATE TABLE `chitiettour` (
  `DiaDiemTour` text NOT NULL,
  `MaTour` text NOT NULL,
  `MaKh` text NOT NULL,
  `DiaDiemDen` text NOT NULL,
  `DiaDiemKhoiHanh` text NOT NULL,
  `ThuTuNgay` int(11) NOT NULL,
  `TienAn` int(11) NOT NULL,
  `TienPhong` int(11) NOT NULL,
  `TienDichVu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `cthd`
--

CREATE TABLE `cthd` (
  `MaHD` text NOT NULL,
  `MaVe` text NOT NULL,
  `SoLuongVe` int(11) NOT NULL,
  `TienVe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `diadiem`
--

CREATE TABLE `diadiem` (
  `MaDD` int(11) NOT NULL,
  `TenDD` text NOT NULL,
  `ThuocTinh` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `diadiemvuichoi`
--

CREATE TABLE `diadiemvuichoi` (
  `MaDDVC` int(11) NOT NULL,
  `TenDDVC` text NOT NULL,
  `ThuocDiaDiemTour` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE `hoadon` (
  `MaHD` text NOT NULL,
  `MaKh` text NOT NULL,
  `TongTien` int(11) NOT NULL,
  `NgayXuatHoaDon` date NOT NULL,
  `MaNV` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `huongdanvien`
--

CREATE TABLE `huongdanvien` (
  `MaNV` text NOT NULL,
  `MaTour` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `MaKh` text NOT NULL,
  `TenKh` text NOT NULL,
  `DiaChi` text NOT NULL,
  `SDT` int(11) NOT NULL,
  `email` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `khachsan`
--

CREATE TABLE `khachsan` (
  `MaKS` text NOT NULL,
  `TenKS` text NOT NULL,
  `TienKS` int(11) NOT NULL,
  `SDT` int(11) NOT NULL,
  `TienPhong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `khuyenmai`
--

CREATE TABLE `khuyenmai` (
  `MaKhuyenMai` text NOT NULL,
  `TenKM` text NOT NULL,
  `NgayKM` date NOT NULL,
  `HanSuDung` date NOT NULL,
  `TienGiam` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` text NOT NULL,
  `LoaiNV` text NOT NULL,
  `TenNV` text NOT NULL,
  `DiaChi` text NOT NULL,
  `ChucVu` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `phuongtien`
--

CREATE TABLE `phuongtien` (
  `MaPT` text NOT NULL,
  `LoaiPT` text NOT NULL,
  `TenPT` text NOT NULL,
  `SoChoTrong` int(11) NOT NULL,
  `SoChoConDu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tour`
--

CREATE TABLE `tour` (
  `MaTour` text NOT NULL,
  `TongSoCho` int(11) NOT NULL,
  `SoChoConTrong` int(11) NOT NULL,
  `TenTour` text NOT NULL,
  `Diadiemtour` text NOT NULL,
  `DiaDiemDi` text NOT NULL,
  `DiaDiemDen` text NOT NULL,
  `LoaiTour` text NOT NULL,
  `SoNgay` int(11) NOT NULL,
  `NgayKhoiHanh` date NOT NULL,
  `GiaTour` int(11) NOT NULL,
  `NgayKetThuc` date NOT NULL,
  `GhiChu` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `ve`
--

CREATE TABLE `ve` (
  `MaVe` text NOT NULL,
  `NgayTaoVe` date NOT NULL,
  `HanSuDung` date NOT NULL,
  `MaTour` text NOT NULL,
  `MaKH` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `qltour`.`feedback` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `hoten` VARCHAR(45) NULL,
  `sdt` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `diachi` VARCHAR(100) NULL,
  `noidung` VARCHAR(400) NULL,
  PRIMARY KEY (`id`));
--
-- Indexes for dumped tables
--

--
-- Indexes for table `cthd`
--
ALTER TABLE `cthd`
  ADD KEY `FK_MaHD` (`MaHD`);

--
-- Indexes for table `diadiem`
--
ALTER TABLE `diadiem`
  ADD PRIMARY KEY (`MaDD`);

--
-- Indexes for table `diadiemvuichoi`
--
ALTER TABLE `diadiemvuichoi`
  ADD PRIMARY KEY (`MaDDVC`);

--
-- Indexes for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`MaHD`),
  ADD KEY `fk_MaNV` (`MaNV`);

--
-- Indexes for table `huongdanvien`
--
ALTER TABLE `huongdanvien`
  ADD KEY `FK_MaTour` (`MaTour`),
  ADD KEY `FK_IDNV_MaNV` (`MaNV`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MaKh`);

--
-- Indexes for table `khuyenmai`
--
ALTER TABLE `khuyenmai`
  ADD PRIMARY KEY (`MaKhuyenMai`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`);

--
-- Indexes for table `phuongtien`
--
ALTER TABLE `phuongtien`
  ADD PRIMARY KEY (`MaPT`);

--
-- Indexes for table `tour`
--
ALTER TABLE `tour`
  ADD PRIMARY KEY (`MaTour`);

--
-- Indexes for table `ve`
--
ALTER TABLE `ve`
  ADD PRIMARY KEY (`MaVe`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cthd`
--
ALTER TABLE `cthd`
  ADD CONSTRAINT `FK_MaHD` FOREIGN KEY (`MaHD`) REFERENCES `hoadon` (`MaHD`);

--
-- Constraints for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `fk_MaNV` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`);

--
-- Constraints for table `huongdanvien`
--
ALTER TABLE `huongdanvien`
  ADD CONSTRAINT `FK_MaTour` FOREIGN KEY (`MaTour`) REFERENCES `tour` (`MaTour`);

INSERT INTO `taikhoan` (`tentaikhoan`, `matkhau`, `manv`, `loaitk`) VALUES
('admin', '123456', 1, 'admin');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
