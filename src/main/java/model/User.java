package model;
public class User {  
private String uid,utype,uname;  
  
public String getUid() {  
    return uid;  
}  
  
public void setUid(String uid) {  
    this.uid = uid;  
}  
  
public String getUtype() {  
    return utype;  
}  
  
public void setUtype(String utype) {  
    this.utype = utype;  
}  
  
public String getUname() {  
    return uname;  
}  
  
public void setUname(String uname) {  
    this.uname = uname;  
}

@Override
public String toString() {
	return "User [uid=" + uid + ", utype=" + utype + ", uname=" + uname + "]";
}  
  
}  
