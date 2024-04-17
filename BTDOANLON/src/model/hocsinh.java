package model;
import java.util.Objects;
public class hocsinh {
		private String hovaten; 
		private String sbd;
		private String gioitinh;
		private String ngaysinh;
		private String noisinh;
		private String diachi;
		private String email;
		private String truongcap2;
		private String diemtb;
		private String hanhkiem;
		
		
		public hocsinh() {}


		public hocsinh(String hovaten, String sbd, String gioitinh, String ngaysinh, String noisinh, String diachi,
				String email, String truongcap2, String diemtb, String hanhkiem) {
			super();
			this.hovaten = hovaten;
			this.sbd = sbd;
			this.gioitinh = gioitinh;
			this.ngaysinh = ngaysinh;
			this.noisinh = noisinh;
			this.diachi = diachi;
			this.email = email;
			this.truongcap2 = truongcap2;
			this.diemtb = diemtb;
			this.hanhkiem = hanhkiem;
		}


		public String getHovaten() {
			return hovaten;
		}


		public void setHovaten(String hovaten) {
			this.hovaten = hovaten;
		}


		public String getSbd() {
			return sbd;
		}


		public void setSbd(String sbd) {
			this.sbd = sbd;
		}


		public String getGioitinh() {
			return gioitinh;
		}


		public void setGioitinh(String gioitinh) {
			this.gioitinh = gioitinh;
		}


		public String getNgaysinh() {
			return ngaysinh;
		}


		public void setNgaysinh(String ngaysinh) {
			this.ngaysinh = ngaysinh;
		}


		public String getNoisinh() {
			return noisinh;
		}


		public void setNoisinh(String noisinh) {
			this.noisinh = noisinh;
		}


		public String getDiachi() {
			return diachi;
		}


		public void setDiachi(String diachi) {
			this.diachi = diachi;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getTruongcap2() {
			return truongcap2;
		}


		public void setTruongcap2(String truongcap2) {
			this.truongcap2 = truongcap2;
		}


		public String getDiemtb() {
			return diemtb;
		}


		public void setDiemtb(String diemtb) {
			this.diemtb = diemtb;
		}


		public String getHanhkiem() {
			return hanhkiem;
		}


		public void setHanhkiem(String hanhkiem) {
			this.hanhkiem = hanhkiem;
		}


		@Override
		public int hashCode() {
			return Objects.hash(diachi, diemtb, email, gioitinh, hanhkiem, hovaten, ngaysinh, noisinh, sbd, truongcap2);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			hocsinh other = (hocsinh) obj;
			return Objects.equals(diachi, other.diachi) && Objects.equals(diemtb, other.diemtb)
					&& Objects.equals(email, other.email) && Objects.equals(gioitinh, other.gioitinh)
					&& Objects.equals(hanhkiem, other.hanhkiem) && Objects.equals(hovaten, other.hovaten)
					&& Objects.equals(ngaysinh, other.ngaysinh) && Objects.equals(noisinh, other.noisinh)
					&& Objects.equals(sbd, other.sbd) && Objects.equals(truongcap2, other.truongcap2);
		}


		@Override
		public String toString() {
			return "hocsinh [hovaten=" + hovaten + ", sbd=" + sbd + ", gioitinh=" + gioitinh + ", ngaysinh=" + ngaysinh
					+ ", noisinh=" + noisinh + ", diachi=" + diachi + ", email=" + email + ", truongcap2=" + truongcap2
					+ ", diemtb=" + diemtb + ", hanhkiem=" + hanhkiem + "]";
		}


	

}


