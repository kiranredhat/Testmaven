package MySQL;

public class Joins {
public void innerJoin()
	{
		mysql> select * from persons
	    -> inner join Orders
	    -> on persons.ID=Orders.OrderID;
	Empty set (0.07 sec)

	mysql> select * from persons;
	+----+----------+-----------+------+
	| ID | LastName | FirstName | Age  |
	+----+----------+-----------+------+
	|  1 | Gaikwad  | Kiran     |   30 |
	+----+----------+-----------+------+
	1 row in set (0.00 sec)

	mysql> select * from Orders;
	+---------+-------------+------+
	| OrderID | OrderNumber | ID   |
	+---------+-------------+------++98
	|     101 |        1001 |    1 |
	|     102 |        1002 | NULL |
	+---------+-------------+------+
	}
	
public void left join()
	{
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
