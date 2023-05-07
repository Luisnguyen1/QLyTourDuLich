CREATE TABLE `NHANVIEN`(
	`MaNV` int(11) PRIMARY KEY,
	`LoaiNV` text NOT NULL,
	`TenNV` text NOT NULL,
	`DiaChi` text NOT NULL,
	`ChucVu` text NOT NULL
)
CREATE TABLE `VE`(
	`MaVe` int(11) PRIMARY KEY,
	`NgayTaoVe` DATE NOT NULL,
	`HanSuDung` DATE NOT NULL,
	`MaTour` int(11) NOT NULL,
	`MaKH` int(11) NOT NULL
)

CREATE TABLE `KHUYENMAI`(
	`MaKhuyenMai` int(11) PRIMARY KEY,
	`TenKM` text NOT NULL,
	`NgayKM` DATE NOT NULL,
	`HanSuDung` DATE NOT NULL,
	`TienGiam` int(11) NOT NULL
)

CREATE TABLE `CTHD`(
	`MaHD` int(11) NOT NULL,
	`MaVe` int(11) NOT NULL,
	`SoLuongVe` int(11) NOT NULL,
	`TienVe` int(11) NOT NULL
	CONSTRAINT FK_MaHD
	FOREIGN KEY (MaHD)
	REFERENCES HOADON(MaHD)
)

CREATE TABLE `HOADON`(
	`MaHD` int(11) PRIMARY KEY,
	`MaKh` int(11) NOT NULL,
	`TongTien` int(11) NOT NULL,
	`NgayXuatHoaDon` DATE NOT NULL,
	`MaNV` int(11) NOT NULL
	CONSTRAINT FK_MaNV
	FOREIGN KEY (MaNV)
	REFERENCES NHANVIEN(MaNV)
)

CREATE TABLE `HUONGDANVIEN`(
	`MaNV` int(11) NOT NULL,
	`MaTour` int(11) NOT NULL,
	CONSTRAINT FK_MaNV
	FOREIGN KEY (MaNV)
	REFERENCES NHANVIEN(MaNV)
	
	CONSTRAINT FK_MaTour
	FOREIGN KEY (MaTour)
	REFERENCES TOUR(MaTour)
)

CREATE TABLE `PHUONGTIEN`(
	`MaPT` int(11) PRIMARY KEY,
	`LoaiPT` text NOT NULL,
	`TenPT` text NOT NULL,
	`SoChoTrong` int(11) NOT NULL,
	`SoChoConDu` int(11) NOT NULL
)

CREATE TABLE `CHITIETTOUR`(
	`DiaDiemTour` text NOT NULL,
	`MaTour` int(11) NOT NULL,
	`MaKh` int(11) NOT NULL,
	`DiaDiemDen` text NOT NULL,
	`DiaDiemKhoiHanh` text NOT NULL,
	`ThuTuNgay` int(11) NOT NULL,
	`TienAn` int(11) NOT NULL,
	`TienPhong` int(11) NOT NULL,
	`TienDichVu` int (11) NOT NULL
)

CREATE TABLE `DIADIEMVUICHOI`(
	`MaDDVC` int(11) PRIMARY KEY,
	`TenDDVC` text NOT NULL,
	`ThuocDiaDiemTour` text NOT NULL
)

CREATE TABLE`TOUR`(
	`MaTour` int(11) PRIMARY KEY,
	`TongSoCho` int(11) NOT NULL,
	`SoChoConTrong` int(11) NOT NULL,
	`TenTour` text NOT NULL,
	`LoaiTour` text NOT NULL,
	`SoNgay` int(11) NOT NULL,
	`NgayKhoiHanh` DATE NOT NULL,
	`GiaTour` int(11) NOT NULL,
	`NgayKetThuc` DATE NOT NULL,
	`GhiChu` text NOT NULL
)

CREATE TABLE `DIADIEM`(
	`MaDD` int(11) PRIMARY KEY,
	`TenDD` text NOT NULL,
	`ThuocTinh` text NOT NULL
)
CREATE TABLE `KHACHSAN`(
	`MaKS` int(11) NOT NULL,
	`TenKS` text NOT NULL,
	`TienKS` int(11) NOT NULL,
	`SDT` int(11) NOT NULL,
	`TienPhong` int(11) NOT NULL
)