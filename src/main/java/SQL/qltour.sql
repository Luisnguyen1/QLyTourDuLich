-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 16, 2023 lúc 04:44 AM
-- Phiên bản máy phục vụ: 10.4.28-MariaDB
-- Phiên bản PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qltour`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitiettour`
--

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
-- Cấu trúc bảng cho bảng `cthd`
--

CREATE TABLE `cthd` (
  `MaHD` text NOT NULL,
  `MaVe` text NOT NULL,
  `SoLuongVe` int(11) NOT NULL,
  `TienVe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `diadiem`
--

CREATE TABLE `diadiem` (
  `MaDD` int(11) NOT NULL,
  `TenDD` text NOT NULL,
  `ThuocTinh` text NOT NULL,
  `KhuVuc` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `diadiemvuichoi`
--

CREATE TABLE `diadiemvuichoi` (
  `MaDDVC` int(11) NOT NULL,
  `TenDDVC` text NOT NULL,
  `ThuocDiaDiemTour` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
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
-- Cấu trúc bảng cho bảng `huongdanvien`
--

CREATE TABLE `huongdanvien` (
  `MaNV` text NOT NULL,
  `MaTour` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
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
-- Cấu trúc bảng cho bảng `khachsan`
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
-- Cấu trúc bảng cho bảng `khuyenmai`
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
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` text NOT NULL,
  `LoaiNV` text NOT NULL,
  `TenNV` text NOT NULL,
  `DiaChi` text NOT NULL,
  `ChucVu` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `LoaiNV`, `TenNV`, `DiaChi`, `ChucVu`) VALUES
('Mã Nhân Viên', 'Loại Nhân Viên', 'Tên Nhân Viên', 'Địa chỉ', 'Chức vụ'),
('asd ád', 'Nhân Viên Bán Hàng', 'asd ád', 'asd asd a', 'asd asd a'),
('asd ád', 'Nhân Viên Bán Hàng', 'asda sd', 'asd ád', 'asd ád'),
('ádasd', 'Quản Lý Kho', 'ấdasd', 'ádasdasdasdasd', 'ádasdasdasdasd');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phuongtien`
--

CREATE TABLE `phuongtien` (
  `MaPT` text NOT NULL,
  `LoaiPT` text NOT NULL,
  `TenPT` text NOT NULL,
  `SoChoTrong` int(11) NOT NULL,
  `SoChoConDu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phuongtien`
--

INSERT INTO `phuongtien` (`MaPT`, `LoaiPT`, `TenPT`, `SoChoTrong`, `SoChoConDu`) VALUES
('123', 'Máy Bay', 'áda', 123, 123);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

CREATE TABLE `taikhoan` (
  `tentaikhoan` text NOT NULL,
  `matkhau` text NOT NULL,
  `manv` text NOT NULL,
  `loaitk` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`tentaikhoan`, `matkhau`, `manv`, `loaitk`) VALUES
('admin', '123456', '1121', 'admin');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tour`
--

CREATE TABLE `tour` (
  `MaTour` text CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
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

--
-- Đang đổ dữ liệu cho bảng `tour`
--

INSERT INTO `tour` (`MaTour`, `TongSoCho`, `SoChoConTrong`, `TenTour`, `Diadiemtour`, `DiaDiemDi`, `DiaDiemDen`, `LoaiTour`, `SoNgay`, `NgayKhoiHanh`, `GiaTour`, `NgayKetThuc`, `GhiChu`) VALUES
('123123', 123, 23, 'manh123', '23', '23', '23', 'Quản Lý Kho', 23, '2023-02-01', 23, '2023-02-01', 'null'),
('123', 123, 123, '123', '123', '123', '123', 'Quản Lý Kho', 123, '2023-03-02', 12, '2023-05-01', 'null'),
('123323', 23, 232323, '11111111111111111111', '23', '32', '23', 'Nhân Viên Bán Hàng', 23, '2023-03-02', 23, '2023-05-01', 'null');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ve`
--

CREATE TABLE `ve` (
  `MaVe` text NOT NULL,
  `NgayTaoVe` date NOT NULL,
  `HanSuDung` date NOT NULL,
  `MaTour` text NOT NULL,
  `tiengiam` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `ve`
--

INSERT INTO `ve` (`MaVe`, `NgayTaoVe`, `HanSuDung`, `MaTour`, `tiengiam`) VALUES
('123123123', '2023-05-04', '2023-03-02', '123123', 123123),
('manh123', '2023-02-01', '2023-02-01', '123', 123123);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `cthd`
--
ALTER TABLE `cthd`
  ADD KEY `FK_MaHD` (`MaHD`(768));

--
-- Chỉ mục cho bảng `diadiem`
--
ALTER TABLE `diadiem`
  ADD PRIMARY KEY (`MaDD`);

--
-- Chỉ mục cho bảng `diadiemvuichoi`
--
ALTER TABLE `diadiemvuichoi`
  ADD PRIMARY KEY (`MaDDVC`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
