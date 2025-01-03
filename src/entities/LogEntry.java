package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry   {
	private String username;
	private Date moment;

	// Construtores

	public LogEntry() {

	}

	public LogEntry(String username, Date moment) {
		this.username = username;
		this.moment = moment;
	}

	// G
	public Date getDate() {
		return moment;
	}

	public void setDate(Date moment) {
		this.moment = moment;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public int hashCode() {
		return Objects.hash(moment, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(moment, other.moment) && Objects.equals(username, other.username);
	}

}
