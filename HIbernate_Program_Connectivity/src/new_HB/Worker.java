
package new_HB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Worker {
	@Id
	@GeneratedValue
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWname() {
		return Wname;
	}

	public void setWname(String wname) {
		Wname = wname;
	}

	public long getWsalary() {
		return Wsalary;
	}

	public void setWsalary(long wsalary) {
		Wsalary = wsalary;
	}

	private String Wname;
	private long Wsalary;

}
