package model;

import java.util.ArrayList;

public class QLTS10 {
private ArrayList<hocsinh> dsThiSinh;

public QLTS10() {
	this.dsThiSinh = dsThiSinh;
}

public ArrayList<hocsinh> getDsThiSinh() {
	return dsThiSinh;
}

public void setDsThiSinh(ArrayList<hocsinh> dsThiSinh) {
	this.dsThiSinh = dsThiSinh;
}
public void insert(hocsinh thiSinh) {
	this.dsThiSinh.add(thiSinh);
}
public void delete(hocsinh thiSinh) {
	this.dsThiSinh.remove(thiSinh);
}
public void update(hocsinh thiSinh) {
	this.dsThiSinh.remove(thiSinh);
	this.dsThiSinh.add(thiSinh);
}
}
