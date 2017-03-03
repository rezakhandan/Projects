package Models;

public class Hospital {
	
	private int code;
	private String HospitalName;
	private String AdminName;
	private String PhoneNumber;
	private String KindHospital;
	private String Address;
	
	public String getHospitalName() {
		return HospitalName;
	}
	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getKindHospital() {
		return KindHospital;
	}
	public void setKindHospital(String kindHospital) {
		KindHospital = kindHospital;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}
