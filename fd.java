/*create table transaction(transactionid number(10) not null primary key, accountnumber number(10),accountto number(10), accountfrom number(10),amount number(10), transactiontype varchar2(10),transactiondate Date);
CREATE SEQUENCE seq_accountID
MINVALUE 1
START WITH 1101
INCREMENT BY 1
CACHE 10000
create table fixeddeposit(accountnumber number(10) not null primary key, amount number(10),time number(2), accounttype varchar2(10), accountnumbercust varchar2(10));
drop table fixeddeposit;*/
	@Override
	public ResultSet fixedDeposit(int accountID, int tenure, int amount) {
		// TODO Auto-generated method stub
		Connection con = null;// Interface
		PreparedStatement ps = null;// Interface
		ResultSet rs = null;// Interface
		PreparedStatement ps1 = null;// Interface
		PreparedStatement ps2 = null;// Interface
		PreparedStatement ps3 = null;// Interface
		PreparedStatement ps4 = null;// Interface
		PreparedStatement ps5 = null;// Interface
		ResultSet rs1 = null;
		boolean result=false;
		Date d=new Date();
		try {
			con = ConnectionProvider.getConnection();
			ps = con.prepareStatement("select balance from account where accountnumber= ?");			
			ps.setInt(1, accountID);
			//ps.setString(2, login.getPassword());
			rs = ps.executeQuery();

			if (rs.next()) {
				if(rs.getInt(1)>=amount){
					
					ps1 = con.prepareStatement("update account set balance=? where accountnumber=?");			
					ps1.setInt(1, (rs.getInt(1)-amount));	
					ps1.setInt(2,accountID );	
					System.out.println(ps1.executeUpdate());
					ps2 = con.prepareStatement("insert into  transaction values(seq_transaction_id.nextval,?,seq_accountId.nextval,?,?,?)");
					ps2.setInt(1,accountID);
					ps2.setInt(2,accountID);
					ps2.setInt(3,amount);
					ps2.setString(3, "debit");
					ps2.setDate(4,new java.sql.Date( d.getTime()));
					System.out.println(ps2.executeUpdate());
					ps3=con.prepareStatement("select accountto from transaction where accountnumber=?");
					ps3.setInt(1,accountID);
					rs1=ps3.executeQuery();
					if(rs1.next()){
						ps4=con.prepareStatement("insert into  fixeddeposit values(?,?,?,'fixed deposit',?)");
						ps4.setInt(1, rs1.getInt(1));
						ps4.setInt(2,amount);
						ps4.setInt(3,tenure);
						ps4.setInt(4,accountID);
				result=ps4.execute();
					}
					
				}
				if(result){
					ps5=ps4=con.prepareStatement("select * from fixeddeposit where accountnumber=?");
					ps5.setInt(1,rs1.getInt(1));
					
					return(ps5.executeQuery());
				}
				
			} else {
				return null;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
		}
	//	return false;
		

		return null;
	}
