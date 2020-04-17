package in.nilesh.spring.example.data.gridfs.Model;

public class ProfileDetails {
	private String fname;
	private String lname;
	private String uname;
	private String mobile;
	private String email;
	private String profile_pic_name;
	
	
	
	
	public ProfileDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProfileDetails(String fname, String lname, String uname, String mobile, String email,
			String profile_pic_name) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.uname = uname;
		this.mobile = mobile;
		this.email = email;
		this.profile_pic_name = profile_pic_name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfile_pic_name() {
		return profile_pic_name;
	}
	public void setProfile_pic_name(String profile_pic_name) {
		this.profile_pic_name = profile_pic_name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((profile_pic_name == null) ? 0 : profile_pic_name.hashCode());
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfileDetails other = (ProfileDetails) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (lname == null) {
			if (other.lname != null)
				return false;
		} else if (!lname.equals(other.lname))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (profile_pic_name == null) {
			if (other.profile_pic_name != null)
				return false;
		} else if (!profile_pic_name.equals(other.profile_pic_name))
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ProfileDetails [fname=" + fname + ", lname=" + lname + ", uname=" + uname + ", mobile=" + mobile
				+ ", email=" + email + ", profile_pic_name=" + profile_pic_name + "]";
	}
	
	
	
}
