public interface DB {
	public void connect();
	public void insert(String sql);
	public void update(String sql);
	public void delete(String sql);
	public String find(String sql);
	public void disconnect();
}

class Oracle implements {
	public void connect(){
		System.out.println("Connect to Oracle Database");
	}
	public void insert(String sql){
		System.out.println("insert" + sql + " to Oracle Database");
	}
	public void update(String sql){
		System.out.println("update" + sql + "to Oracle Database");
	}
	public void delete(String sql){
		System.out.println("delete " + sql + " Oracle Database");
	}
	public String find(String sql){
		System.out.println("find " + sql + " Oracle Database");
	}
	public void disconnect(){
		System.out.println("disconnect Oracle Database");
	}
}

class MySQL implements {
	public void connect(){
		System.out.println("Connect to MySQL Database");
	}
	public void insert(String sql){
		System.out.println("insert" + sql +" to MySQL Database");
	}
	public void update(String sql){
		System.out.println("update" + sql + "to MySQL Database");
	}
	public void delete(String sql){
		System.out.println("delete " + sql + " MySQL Database");
	}
	public String find(String sql){
		System.out.println("find " + sql + " MySQL Database");
	}
	public void disconnect(){
		System.out.println("disconnect MySQL Database");
	}
}


class DBFactory {
	public DB getDB(String dbName) {
		
		if (dbName.equalsIgnoreCase("oracle") ) {
			return new Oracle();
		} else if (dbName.equalsIgnoreCase("mysql")) {
			return new MySQL();
		} else {
			return null;
		}
		
	}
}

public class Factory {
	
	public static void main(String args[]) {
		DBFactory factory = new DBFactory();
		
		DB db = factory.getDB("mysql");
		
		db.connect();
		db.insert("insert into table xx();");
		db.update("update table xxx");
		db.delete("delete from table xxx");
		db.find("select * from xxx where xx_id = 11222");
		db.disconnect();
		
	}
	
}







